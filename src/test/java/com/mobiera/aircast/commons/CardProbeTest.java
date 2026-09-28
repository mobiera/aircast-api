package com.mobiera.aircast.commons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mobiera.aircast.api.vo.RamInstallParametersVO;

/** Answers are the ones of a real card, read with a card reader. */
public class CardProbeTest {

	@Test
	public void oneReadPerPacket() {
		assertEquals(3, CardProbe.packetCount());
		assertEquals("FF21", CardProbe.tag(0));
		assertEquals("80CAFF2100", CardProbe.command(CardProbe.tag(0)));
		assertEquals("80CA00CF00", CardProbe.command(CardProbe.tag(1)));
		assertEquals("80CA00E000", CardProbe.command(CardProbe.tag(2)));
		assertNull(CardProbe.tag(3));
		assertNull(CardProbe.tag(-1));
	}

	@Test
	public void cardResources() {
		CardProbe.CardResources r = CardProbe.cardResources("FF210D81010B820400006EF883020924");
		assertEquals(Integer.valueOf(11), r.getInstalledApplications());
		assertEquals(Integer.valueOf(28408), r.getFreeNonVolatileMemory());
		assertEquals(Integer.valueOf(2340), r.getFreeVolatileMemory());
	}

	@Test
	public void cardResourcesWithMissingObjectsOrGarbage() {
		CardProbe.CardResources r = CardProbe.cardResources("FF2106820400006EF8");
		assertNull(r.getInstalledApplications());
		assertEquals(Integer.valueOf(28408), r.getFreeNonVolatileMemory());
		assertNull(r.getFreeVolatileMemory());
		// truncated object: what was decoded before is kept
		r = CardProbe.cardResources("FF210D81010B8204000");
		assertNull(r);
		r = CardProbe.cardResources("FF210D81010B82040000");
		assertEquals(Integer.valueOf(11), r.getInstalledApplications());
		assertNull(r.getFreeNonVolatileMemory());
		assertNull(CardProbe.cardResources(null));
		assertNull(CardProbe.cardResources(""));
		assertNull(CardProbe.cardResources("CF0AF0F1F0F2F0F0FFFFFFFF"));
	}

	@Test
	public void simpleObjects() {
		assertEquals("F0F1F0F2F0F0FFFFFFFF", CardProbe.value("CF0AF0F1F0F2F0F0FFFFFFFF", 0xCF));
		assertEquals("C00401018010C00402018010", CardProbe.value("E00CC00401018010C00402018010", 0xE0));
		assertEquals("AABB", CardProbe.value("E08102AABB", 0xE0));
		assertNull(CardProbe.value("CF0AF0F1F0F2F0F0FFFFFFFF", 0xE0));
		assertNull(CardProbe.value(null, 0xCF));
	}

	@Test
	public void freeMemoryBandOfAnInstallRow() {
		RamInstallParametersVO row = new RamInstallParametersVO();
		assertTrue("no condition: every sim, probed or not", row.acceptsFreeMemory(null));
		row.setMinFreeNonVolatileMemory(20000);
		assertFalse("not probed", row.acceptsFreeMemory(null));
		assertFalse(row.acceptsFreeMemory(19999));
		assertTrue(row.acceptsFreeMemory(20000));
		RamInstallParametersVO small = new RamInstallParametersVO();
		small.setMinFreeNonVolatileMemory(6000);
		small.setMaxFreeNonVolatileMemory(20000);
		assertTrue(small.acceptsFreeMemory(19999));
		assertFalse("the two rows never accept the same sim", small.acceptsFreeMemory(20000));
		assertFalse(small.acceptsFreeMemory(5999));
	}
}

package com.mobiera.aircast.commons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class RamDeleteTest {

	private static final String PACKAGE = "A0000000620001FF01";
	private static final String INSTANCE = "A0000000620001FF0101";

	@Test
	public void deleteCommandCarriesNoLe() {
		// 80 E4 00 00 | Lc 0B | 4F 09 | AID
		assertEquals("80E400000B4F09A0000000620001FF01", RamDelete.command(PACKAGE, false));
		assertEquals("80E400800B4F09A0000000620001FF01", RamDelete.command(PACKAGE, true));
		assertEquals("80E400000C4F0AA0000000620001FF0101", RamDelete.command("a0 00 00 00 62 00 01 ff 01 01", false));
	}

	@Test
	public void commandsOfARow() {
		assertEquals(Arrays.asList(RamDelete.command(INSTANCE, false), RamDelete.command(PACKAGE, false)),
				RamDelete.commands(INSTANCE, PACKAGE, false));
		assertEquals(Arrays.asList(RamDelete.command(INSTANCE, false), RamDelete.command(PACKAGE, false)),
				RamDelete.commands(INSTANCE, PACKAGE, null));
		// the card deletes the instances with the package
		assertEquals(Collections.singletonList(RamDelete.command(PACKAGE, true)), RamDelete.commands(INSTANCE, PACKAGE, true));
		assertEquals(Collections.singletonList(RamDelete.command(INSTANCE, false)), RamDelete.commands(INSTANCE, null, false));
		assertEquals(Collections.singletonList(RamDelete.command(INSTANCE, true)), RamDelete.commands(INSTANCE, " ", true));
		assertEquals(Collections.singletonList(RamDelete.command(PACKAGE, true)), RamDelete.commands(null, PACKAGE, true));
		assertTrue(RamDelete.commands(null, "", true).isEmpty());
	}

	@Test
	public void aids() {
		assertTrue(RamDelete.isValidAid(PACKAGE));
		assertTrue(RamDelete.isValidAid("A0:00:00:00:62"));
		assertTrue(RamDelete.isValidAid("A000000062000102030405060708090A"));
		assertFalse("4 bytes", RamDelete.isValidAid("A0000000"));
		assertFalse("17 bytes", RamDelete.isValidAid("A000000062000102030405060708090A0B"));
		assertFalse("odd", RamDelete.isValidAid("A00000006"));
		assertFalse(RamDelete.isValidAid("A00000006G"));
		assertFalse(RamDelete.isValidAid(null));
		assertNull(RamDelete.aid("  "));
	}

	@Test(expected = IllegalArgumentException.class)
	public void noCommandForAnInvalidAid() {
		RamDelete.command("A0", false);
	}

	@Test
	public void objectNotOnTheCard() {
		assertTrue(RamDelete.isNotFound(0x6A88));
		assertFalse(RamDelete.isNotFound(0x6985));
		assertFalse(RamDelete.isNotFound(0x9000));
	}
}

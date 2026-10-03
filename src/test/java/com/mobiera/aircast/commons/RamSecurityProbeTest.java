package com.mobiera.aircast.commons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import com.mobiera.aircast.api.vo.RamSecurityProbeParametersVO;

public class RamSecurityProbeTest {

	private static RamSecurityProbeParametersVO row(Long applet, Integer position) {
		RamSecurityProbeParametersVO r = new RamSecurityProbeParametersVO();
		r.setRamAppletFk(applet);
		r.setPosition(position);
		return r;
	}

	@Test
	public void candidatesFollowThePositions() {
		assertEquals(Arrays.asList(30l, 10l, 20l), RamSecurityProbe.candidates(Arrays.asList(row(10l, 2), row(20l, 3), row(30l, 1))));
	}

	@Test
	public void rowsWithoutPositionComeLastAndAppletsOnce() {
		assertEquals(Arrays.asList(10l, 20l, 30l), RamSecurityProbe.candidates(Arrays.asList(row(20l, null), row(30l, null), row(10l, 1), row(20l, 5), row(null, 0))));
	}

	@Test
	public void noRows() {
		assertTrue(RamSecurityProbe.candidates(null).isEmpty());
	}

	@Test
	public void candidatePacketReadsTheCardResources() {
		assertEquals("80CAFF2100", RamSecurityProbe.COMMAND);
	}
}

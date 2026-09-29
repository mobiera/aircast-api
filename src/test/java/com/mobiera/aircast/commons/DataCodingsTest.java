package com.mobiera.aircast.commons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.junit.Test;

public class DataCodingsTest {

	@Test
	public void emptyListDeclaresNothing() {
		assertTrue(DataCodings.parse(null).isEmpty());
		assertTrue(DataCodings.parse("  ").isEmpty());
		assertNull(DataCodings.normalize(""));
	}

	@Test
	public void listIsParsedInOrder() {
		assertEquals(Arrays.asList(2, 245), new ArrayList<Integer>(DataCodings.parse(" 2, 245 ,2")));
		assertEquals("2,245", DataCodings.normalize(" 2, 245 ,2"));
	}

	@Test
	public void invalidListsAreRefused() {
		assertTrue(DataCodings.isValid(null));
		assertTrue(DataCodings.isValid("0,255"));
		assertFalse(DataCodings.isValid("256"));
		assertFalse(DataCodings.isValid("-1"));
		assertFalse(DataCodings.isValid("0x02"));
		assertFalse(DataCodings.isValid("2,,4"));
		assertFalse(DataCodings.isValid("2;4"));
	}

	@Test
	public void flagIsEnoughWithoutDeclaration() {
		Set<Integer> none = DataCodings.parse(null);
		assertTrue(DataCodings.isBinary(0x04, none));
		assertTrue(DataCodings.isBinary(0xF6, none));
		// the value as a signed byte
		assertTrue(DataCodings.isBinary((byte) 0xF6, none));
		assertFalse(DataCodings.isBinary(0x02, none));
		assertFalse(DataCodings.isBinary(0x00, null));
	}

	@Test
	public void declaredValueIsBinary() {
		Set<Integer> declared = DataCodings.parse("2");
		assertTrue(DataCodings.isBinary(0x02, declared));
		assertFalse(DataCodings.isBinary(0x00, declared));
		assertFalse(DataCodings.isBinary(0x08, declared));
	}

	@Test
	public void effectiveValue() {
		Set<Integer> declared = DataCodings.parse("2");
		assertEquals(0x04, DataCodings.effective(0x02, declared));
		assertEquals(0xF6, DataCodings.effective(0xF6, declared));
		assertEquals(0x00, DataCodings.effective(0x00, declared));
		assertEquals(0x02, DataCodings.effective(0x02, DataCodings.parse(null)));
	}
}

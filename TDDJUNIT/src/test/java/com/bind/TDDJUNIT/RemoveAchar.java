package com.bind.TDDJUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bind.TDDJUNIT.RemovecharA;

class RemoveAchar {

	@Test
	void testCharA() {
		RemovecharA achar=new RemovecharA();
		String res=achar.Remove("ABCD");
		assertEquals("BCD",res);	
	}
	
	@Test
	void testCharA2() {
		RemovecharA achar=new RemovecharA();
		String res=achar.Remove("AACD");
		assertEquals("CD",res);	
	}
	@Test
	void testCharA3() {
		RemovecharA achar=new RemovecharA();
		String res=achar.Remove("BACD");
		assertEquals("BCD",res);	
	}
	@Test
	void testCharA4() {
		RemovecharA achar=new RemovecharA();
		String res=achar.Remove("BBAA");
		assertEquals("BBAA",res);	
	}
	@Test
	void testCharA5() {
		RemovecharA achar=new RemovecharA();
		String res=achar.Remove("AABAA");
		assertEquals("BAA",res);	
	}
	@Test
	void testCharA6() {
		RemovecharA achar=new RemovecharA();
		String res=achar.Remove("AA");
		assertEquals("",res);	
	}


}

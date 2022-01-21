package com.example.demoapp.controller;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NewControllerTests {

	@Test
	void contextLoads() {
		NewController n = new NewController();
		Assert.assertEquals(null, n.getWelcome(null));
		
	}
	
	@Test
	public void whenEmptyString_thenAccept() {
		NewController palindromeTester = new NewController();
		Assert.assertTrue(palindromeTester.isPalindrome(""));
	}

	@Test
	public void whenNull() {
		NewController palindromeTester = new NewController();
		Assert.assertFalse(palindromeTester.isPalindrome(null));
	}

	@Test
	public void whenIsPalindrome() {
		NewController palindromeTester = new NewController();
		Assert.assertTrue(palindromeTester.isPalindrome("AnnA"));
	}

	@Test
	public void whenIsPalindrome2() {
		NewController palindromeTester = new NewController();
		Assert.assertTrue(palindromeTester.isPalindrome("pippo"));
	}

}

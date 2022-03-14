package com.test.cg;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class Testemployee {
	
	@Test
	@BeforeAll
	public static void setuponce() {
		
		System.out.println("setup started");
	}
	@Test
	@BeforeEach
	public void setup() {
		
		System.out.println("Running each test");
	}
	@Test
	@Order(1)
	public void testsave() {
		
		System.out.println("HELLLO-save");
	}
	@Test
	@Order(3)
	public void testdelete() {
		
		System.out.println("HELLLO-delete");
	}
	@Test
	@Order(2)
	public void testupdate() {
		
		System.out.println("HELLLO-update");
	}
	@Test
	@AfterEach
	public void testaftereach() {
		
		System.out.println("Ran each test");
	}
		
	@Test
	@AfterAll
	public static void testclosed() {
		
		System.out.println("Closing Test");
	}


}

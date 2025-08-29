package com.example.bankapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankappApplicationTests {

  @Test
  void sampleTest() {
    int expected = 42;
    int actual = 40 + 2;
    assertEquals(expected, actual, "Simple addition should equal 42");
  }

  @Test
  void anotherSampleTest() {
    String message = "Hello, BankApp!";
    assertNotNull(message, "Message should not be null");
    assertTrue(message.contains("BankApp"), "Message should contain 'BankApp'");
  }
}

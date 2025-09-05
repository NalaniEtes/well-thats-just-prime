package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(0), new ArrayList<Integer>());
  }

   @Test
    void itReturnsAnEmptyListForOne() {
      Factorizer factorizer = new Factorizer();
      assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(1));
    }

    @Test
    void itReturnsCorrectFactorsForAPrimeNumber() {
      Factorizer factorizer = new Factorizer();
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(7);
      assertEquals(expected, factorizer.primeFactors(7));
    }

    @Test
    void itReturnsCorrectFactorsForANumberWithRepeatedPrimeFactors() {
      Factorizer factorizer = new Factorizer();
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(3);
      expected.add(3);
      assertEquals(expected, factorizer.primeFactors(9));
    }

    @Test
    void itReturnsCorrectFactorsForACompositeNumber() {
      Factorizer factorizer = new Factorizer();
      ArrayList<Integer> expected = new ArrayList<>();
      expected.add(2);
      expected.add(5);
      assertEquals(expected, factorizer.primeFactors(10));
    }
}

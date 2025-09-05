package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(int number) {
    ArrayList<Integer> factors = new ArrayList<>();

    if (number <= 1) {
            return factors;
        }

    while (number % 2 == 0) {
            factors.add(2);
            number = number / 2;
        }
    
    for (int i = 3; i <= number; i = i + 2) {
            while (number % i == 0) {
                factors.add(i);
                number = number / i;
            }
        }
      
      return factors;
  }
}

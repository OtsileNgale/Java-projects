package randomcombinations2;

import java.util.*;
import java.util.List;
import java.util.Random;

public class RandomCombinations2 {
   
      public static List<List<Integer>> generateRandomCombinations(int k, int numCombinations) {
        List<List<Integer>> combinations = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < numCombinations; i++) {
            List<Integer> combination = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                int number = random.nextInt(50) + 1;
                combination.add(number);
            }
            combinations.add(combination);
        }
        
        return combinations;
    }
    
    public static void main(String[] args) {
        int k = 5;  // Number of items to choose
        int numCombinations = 3;  // Number of combinations to generate
        
        List<List<Integer>> combinations = generateRandomCombinations(k, numCombinations);
        for (int i = 0; i < combinations.size(); i++) {
            System.out.println("Combination " + (i + 1) + ": " + combinations.get(i));
    }
    
}
}

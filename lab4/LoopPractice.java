/*
Programmer:
Date:
Purpose:
*/
public class LoopPractice {
    /**
     * Main method to test and run each practice problem.
     * Write your loop inside the given method and then call it from main.
     * Uncomment each method to test it out and when you submit it. 
     * Output a new line between each function call. 
     */
    public static void main(String[] args) {
        //zeroToOneHundred();
        //multsOfSeven();
        //backwardsFromThousand();
        //printEvens();
        //sumOfOneHundred();
        powersOfTwo();
        //powersOfTwov2();
    }

    // prints all integers from 0 to 100
    // following format: 0 1 2 3 4 5...
    public static void zeroToOneHundred() {
        
    }
    // prints the first 12 multiples of 7
    // following format: 
    // 7
    // 14
    // 21 ...
    public static void multsOfSeven() {
    }

    //prints all the numbers from 1000 to 1 backwards
    // following format: 1000 999 998 ...
    public static void backwardsFromThousand() {
    }

    // prints all the even numbers from 2 to 100
    // following format: 2 4 6 8 10...
    public static void printEvens() {
    }

    // prints just the sum of all numbers from 1 to 100
    public static void sumOfOneHundred() {
    }

    // prints the first ten powers of 2 from 1 to 512
    // following format: 
    // 1 (2^0)
    // 2 (2^1)
    // 4 (2^2)
    // 8...
    public static void powersOfTwo() {
      // Start with zero exponent rule; any number to the power of zero is always 1
      // 2^0 = 1
      int previous = 1;
      System.out.println(previous + " (2^0)");
      
      // Get the next nine powers of 2
      // e.g 2^1, 2^2, ....
      for(int i = 1; i<10; i++) {
         int current = previous * 2;
         System.out.println(current + " (2^" + i + ")");
         previous = previous * 2;
      }
    }
    
    public static void powersOfTwov2() {
      for(int i = 0; i<10; i++) {
         int res = 1;
         for(int j = 1; j <= i; j++) {
            res = res * 2;
         }
         System.out.println(res + " (2^" + i + ")");
      }
  
    }
}



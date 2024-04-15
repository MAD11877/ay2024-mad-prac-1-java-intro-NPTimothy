import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    // Scanner in = new Scanner(System.in);
          Scanner in = new Scanner(System.in);
      Integer count = in.nextInt();
      int[] numbers = new int[count];
      
      for (int i = 0; i < count; i++) {
          Integer number = in.nextInt();
          numbers[i] = number;
      }

      Integer highest = 0;
      Integer mode = 0;
    

      for (int j = 0; j < count; j++) {
          Integer counter = 0;
          for (int k = 0; k < count; k++) {
              if (numbers[j] == numbers[k]) {
                  counter++;
              }
          }
          if (counter > highest) {
              highest = counter;
              mode = numbers[j];
          }
      }

      System.out.println(mode);

      

      
      in.close();
    
  }
}

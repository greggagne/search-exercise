/**
 * Demonstration program comparing the sequential search to the
 * binary search. The size of the list is specified as SIZE (default is 10000)
 *
 * We pass the number of tests as a parameter to this program. This program
 * runs a number of tests (on both the sequential and binary searches) and
 * reports the time in milliseconds.
 *
 * @author Greg Gagne
 */

import java.util.Random;
import java.util.Arrays;

public class SearchExercise
{
  public static final int SIZE = 10000;
  
  /**
   * A sequential search
   *
   * @param list - the array to be searched through
   * @param key - the item being searched for
   *
   * @return the index where key occurs in list[] (>= 0) or -1 if unsuccessful
   */
   private static <T extends Comparable<? super T>> boolean sequentialSearchHelper(T[] list, T key)
   {
       // TO-DO Complete the sequential search algorithm

       return false;
   }

   public static <T extends Comparable<? super T>> boolean sequentialSearch(T[] list, T key) {
        return sequentialSearchHelper(list, key);
    }
  
   /**
    * A binary search
    * 
    * @param list - the array to be searched through
    * @param first - the position to begin searching from
    * @param last - the last index in the array to search
    * @param key - the item being searched for
    *
    * @return the index where key occurs in list[] (>= 0) or -1 if unsuccessful
    */
   private static <T extends Comparable<? super T>> boolean binarySearch(T[] list, int first, int last, T key)
   {
       // TO-DO Complete the recursive binary search algorithm

      return false;
   } 

    // invokes recursive binary search algorithm.
   public static <T extends Comparable<? super T>> boolean search(T[] list, T key)
   {
      return binarySearch(list, 0, list.length - 1, key);
   } 
   
   /**
    * This generates a test that times different searching algorithms.
    */
   public static void runTest(int occurrences) {
     Integer[] values = new Integer[SIZE];
     Integer[] searchKeys = new Integer[occurrences];
     
     Random r = new Random();
     
     // generate a list of random numbers
     for (int i = 0; i < SIZE; i++)
       values[i] = r.nextInt(SIZE*10);
     
     // now sort the list - required for binary search
     Arrays.sort(values);
     
     // now generate a series of random numbers from that list
     for (int i = 0; i < occurrences; i++)
       searchKeys[i] = values[r.nextInt(SIZE)];
    
    // used for recording the elapsed time 
     long startTime, endTime;
    
	// record the start time 
     startTime = System.currentTimeMillis();

	// perform the binary search
     for (int i = 0; i < occurrences; i++) {
       binarySearch(values,0,SIZE-1,searchKeys[i]);
     }

	// record the ending time
     endTime = System.currentTimeMillis();
     
     System.out.println("Binary search (in ms): " + (endTime - startTime));
    
	// repeat the process for sequential search 
     startTime = System.currentTimeMillis();
     for (int i = 0; i < occurrences; i++) {
       sequentialSearch(values,searchKeys[i]);
     }
      endTime = System.currentTimeMillis(); 
      
      System.out.println("Sequential search (in ms): " + (endTime - startTime));
   }
       
   
   public static void main(String[] args) {
     if (args.length != 1) {
       System.err.println("Usage: java SearchExercise [occurrences]");
       System.exit(0);
     }
     
     runTest(Integer.parseInt(args[0]));
   }
} 

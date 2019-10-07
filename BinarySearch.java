package BasicPrograms;

//Binary search requires a sorted collection. (if not sorted, we have to sort and then search)
//Every iteration eliminates half of the remaining possibilities. 
//This makes binary searches very efficient - even for large collections.

//Worst case performance: O(log n)
//Best case performance: O(1)
//http://java2novice.com/java-search-algorithms/binary-search/

public class BinarySearch {
	
	public static void main(String[] args) {
      
      BinarySearch mbs = new BinarySearch();
      int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
      System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
      int[] arr1 = {6,34,78,123,432,900};
      System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));
  }
	 
  public int binarySearch(int[] inputArr, int key) {
       
      int start = 0;
      int end = inputArr.length - 1;
      while (start <= end) {
          int mid = (start + end) / 2;
          if (key == inputArr[mid]) {
              return mid;
          }
          if (key < inputArr[mid]) {
              end = mid - 1;
          } else {
              start = mid + 1;
          }
      }
      return -1;
  }
}
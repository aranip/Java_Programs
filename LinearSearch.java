package BasicPrograms;

import java.util.Scanner;

//For Linear Search, the worst case happens when the element to be searched (x in the above code) is not present in the array. When x is not present, 
//the search() functions compares it with all the elements of arr[] one by one. Therefore, 
//the worst case time complexity of linear search would be O(n).


//Average Case also O(n)

//In the linear search problem, the best case occurs when x is present at the first location. The number of operations in the best case is constant (not dependent on n). 
//So time complexity in the best case would be O(1)

//http://www.geeksforgeeks.org/analysis-of-algorithms-set-2-asymptotic-analysis/
class LinearSearch 
{
public static void main(String args[])
{
  int c, n, search, array[];

  Scanner in = new Scanner(System.in);
  System.out.println("Enter number of elements");
  n = in.nextInt(); 
  array = new int[n];

  System.out.println("Enter " + n + " integers");

  for (c = 0; c < n; c++)
    array[c] = in.nextInt();

  System.out.println("Enter value to find");
  search = in.nextInt();

  for (c = 0; c < n; c++)
  {
    if (array[c] == search)     /* Searching element is present */
    {
       System.out.println(search + " is present at location " + (c + 1) + ".");
        break;
    }
 }
 if (c == n)  /* Searching element is absent */
    System.out.println(search + " is not present in array.");
}
}


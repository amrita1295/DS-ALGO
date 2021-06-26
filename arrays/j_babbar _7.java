//finding the pairs whose sum is equal to kth term
// Java implementation using Hashing
import java.io.*;
import java.util.HashSet;

class j_babbar_7 {
  static void printpairs(int arr[], int sum)
  {
    int count=0;
    HashSet<Integer> s = new HashSet<Integer>();
    for (int i = 0; i < arr.length; ++i)
    {
      int temp = sum - arr[i];

      // checking for condition
      if (s.contains(temp)) {
        System.out.println(
          "Pair with given sum "
          + sum + " is (" + arr[i]
          + ", " + temp + ")");
          count++;
      }
      s.add(arr[i]);

    }
    System.out.println(count);
  }

  // Driver Code
  public static void main(String[] args)
  {
    int A[] = { 1, 4, 45, 6, 10, 8,8 };
    int n = 16;
    
    printpairs(A, n);
    
  }
}

// This article is contributed by Aakash Hasija

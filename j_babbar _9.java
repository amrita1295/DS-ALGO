import java.io.*;
import java.util.*;
class j_babbar_9 {
    static void characterCount(int arr[])
    {
        // Creating a HashMap containing char
        // as a key and occurrences as  a value
        HashMap<Integer, Integer> charCountMap
            = new HashMap<Integer, Integer>();
  
        // Converting given string to char array
  
       // char[] strArray = inputString.toCharArray();
  
        // checking each char of strArray
        for (int i=0;i<arr.length;i++) {
            if (charCountMap.containsKey(arr[i])) {
  
                // If char is present in charCountMap,
                // incrementing it's count by 1
                charCountMap.put(arr[i], charCountMap.get(arr[i]) + 1);
            }
            else {
  
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                charCountMap.put(arr[i], 1);
            }
        }
        //Integer value=2;
          for(Map.Entry<Integer, Integer> entry: charCountMap.entrySet()) {

      // if give value is equal to value from entry
      // print the corresponding key
      if(entry.getValue() >1) {
        System.out.println("The key is " + entry.getKey());
        
      }
    }

    }



             
      
    

  
    // Driver Code
    public static void main(String[] args)
    {
        int arr[]={1,2,3,3,4,4};
        characterCount(arr);
    }
}
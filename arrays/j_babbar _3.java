import java.io.*;
import java.util.*;
class j_babbar_3 
{
	public static void main(String[] args) throws IOException {
    Scanner sc=new Scanner(System.in);
    int numbers[]={ 25,36,120,56,100,23,460 };
    int max=numbers[0];
    int min=numbers[0];
    for (int i=0;i<numbers.length;i++)
    {
    	if(max<numbers[i])
    	{
    		max=numbers[i];
    	}
    	else
    	{
    		min=numbers[i];
    	}
    }
    System.out.println("The maximum number is : "+max);
    System.out.println("The minimum number is  :"+min);

		
	}
}
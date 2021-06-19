import java.io.*;
import java.util.*;
class j_babbar_2
{
  public static void main(String[] args)throws IOException {
  	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  	String s ="amrita";
  	//converting string to char array 
  	char str[]=s.toCharArray();
  	
  	for(int i=str.length-1;i>=0;i--)
  	{
  		System.out.print(str[i]+" ");
  	}
  	
  }
}
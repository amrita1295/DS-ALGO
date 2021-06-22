import java.io.*;
import java.util.*;
class j_babbar_4 
{
	public static void main(String[] args) throws IOException {
    Scanner sc=new Scanner(System.in);
    int number[]={0,1,2,0,1 };
    for(int i=0;i<number.length-1;i++)
    {
         /*if the number is bigger than the next number than only the swaping would take place*/
         if(number[i]>number[i+1])
         {
            int temp=number[i];
            number[i]=number[i+1];
            number[i+1]=temp;
            /*updating the value so that it goes to the original value */
            i=-1;
         }
    }
    for(int j=0;j<number.length;j++)
    {
        System.out.println(number[j]);
    }
}
}
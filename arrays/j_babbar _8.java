import java .io.*;
import java.util.*;
class j_babbar_8
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int fac=1;
    int a[]=new int [n+1];
    for(int i=0;i<=n;i++)
    {
    	a[i]=i;
    }
    for(int i=0;i<=n;i++)
    {
    	if(a[i]==0)
    	{
    		continue;
    	}
    	fac*=a[i];
    }

    System.out.println(fac);
		
	}
}
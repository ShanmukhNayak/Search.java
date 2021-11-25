/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int[] a;
	    int key,n;
	    System.out.print("\nEnter the element to be search : ");
	    key=in.nextInt(); 
	    System.out.print("\nEnter the size of the array : ");
	    n=in.nextInt(); 
	    a=new int[n];
	    System.out.println("Enter elements of the array");
	    for(int i=0;i<n;++i)
	    {a[i]=in.nextInt();}
	    for(int j=0;j<n;j++)
	    { if(key==a[j])
	    {System.out.println("Element found at :" + j);
	     break;                
	    }
	      else if(j==n-1){System.out.println("Element not found");}
	}
} 
}

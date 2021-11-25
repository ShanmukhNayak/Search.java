/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] a;
		int n,key,c=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enetr the size of the array : ");
		n=in.nextInt();
		System.out.print("\nEnetr the element : ");
		key=in.nextInt();
		a=new int[n];
		System.out.println("Enetr the elements of array : ");
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		for(int j=0;j<n;j++)
		{
		    if(a[j]==key)
		    {
		        c+=1;
		    }
		}
		System.out.println("The count of the ele "+key+" in the array is: "+c);
	}
}

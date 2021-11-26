/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class binsearch
{
  public static void main(String[] args) {
      int[] a;
       System.out.println("Enter size of the array : ");
       Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    a=new int[n]; 
    System.out.println("Enter elements of the array in sorted form : ");
    for(int i=0;i<n;i++)
    {
        a[i]=in.nextInt();
    } 
    System.out.println("Enter element to be searched : ");
    int key=in.nextInt();
    int mid=n/2;
    while(a[mid]!=key)
    {
        if(a[mid]<key){mid=(mid+n)/2;}
        else if(a[mid]>key){mid=mid/2;}
        else{System.out.println("Element not found in the array : ");
            System.exit(0);
        }
    } 
    System.out.println("Element found at : "+mid);
  }
}
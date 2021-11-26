/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class GTKey {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the size of array : ");
     int n=in.nextInt();
  int flag=1;
     int[] a;
     System.out.println("Enter the key value : ");              
     int key = in.nextInt();
     a=new int[n]; 
     System.out.println("Enter elements of array : ");
     for(int j=0;j<n;j++)
     {a[j]=in.nextInt();}
     for(int i=0;i<n;i++)
     {
         if(a[i]>key)
         {System.out.print(i+" ");
          flag=0;
         }
     }
     if(flag==1)
     {System.out.println("elements not found");}
 }
}
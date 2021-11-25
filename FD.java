import java.util.Scanner;
public class FD
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int[] a;
		int flag=0;
		System.out.print("Enter size : ");
		int n=in.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=in.nextInt();
		}
		for(int j=0;j<n-1;j++)
		{
		    for(int i=j+1;i<n;i++)
		    {
		        if(a[i]==a[j])
		        {
		            flag+=1;
		            break;
		        }
		    }
		}
		if(flag!=0)
		{
		    System.out.println("Duplicates exists:");
		}
		else
		{
		    System.out.println("Duplicates doesn't exists:");
		}
	}
}

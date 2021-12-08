package quantler;

import java.util.Scanner;

class array
{
	void array()
	{
		
	}
}

public class Array_insertion {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Element you want");
	int n=sc.nextInt();
	 int arr[] = new int[n+1];
	 System.out.println("Enter "+n+" all the elements:");
	 for(int i=0;i<=n;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("Before Inserion:");
	 for(int i = 0; i <=n; i++)
     {
         System.out.print(arr[i]+",");
     }
     System.out.print("\n"+"Enter the position where you want to insert an element:");
     int pos=sc.nextInt();
     System.out.print("Enter the element which you want to insert:");
     int element = sc.nextInt();
     for(int i=n-1;i>=(pos-1);i--)
     {
    	 arr[i+1]=arr[i];
     }
    arr[pos-1]=element;
    System.out.println("After Inserion:");
	 for(int i = 0; i <=n; i++)
    {
        System.out.print(arr[i]+",");
    }
    
	}
	

}

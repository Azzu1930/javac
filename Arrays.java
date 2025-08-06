// a program t0 implement Arrays
import java.util.*;
public class Arrays
{
   public static void main(String[]args)
   {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the size of array:");
      int n=scan.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
      	System.out.println("enter"+(i+1)+"element:");
      }
      System.out.println("elements are:");
      for(int i=0;i<n;i++)
      {
      		System.out.println(arr[i]);
      }
    }
  }

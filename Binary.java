// a program to implement binary search
import java.util.Scanner;
public class Binary{
  public static void main(String[]args){
    int[] numbers=new int[5];
    Scanner scanner=new Scanner(System.in);
    for (int i=0;i<5;i++){
     	 numbers[i]=scanner.nextInt();
      }
      System.out.println("enter key to search");
      int key=scanner.nextInt();
      int result=Binary(numbers,key);
      if(result==-1){
        	System.out.println("keyb is not found");
        }
         else
        {
          	System.out.println("key is found");
         } 
       }
        public static int Binary(int[]a,int key){
          int low=0;
          int high=a.length-1;
          while(low<=high){
            	int mid=(low+high)/2;
            	if(a[mid]==key){
              		return mid;
             } 
              else if(a[mid]<low){
                low=mid+1;
             } 
                else{
                  	high=mid-1;
                  }
                 }
               		return-1;
              }
          }
                
                 
                                

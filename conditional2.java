import java.util.Scanner;
public class conditional2
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the marksof the student :");
    int marks = sc.nextInt();
    if(marks>100 || marks<0)
          System.out.println("invalid marks");
          else if(marks>=75 && marks<=100)
          {
                System.out.println("distinction");
          }
          else if(marks>=50 && marks<75)
          {
               System.out.println("average");
          }
          else if(marks>=35 && marks<50)
          { 
               System.out.println("pass");
          }
          else
          {
               System.out.println("fail");
          }
   }
}

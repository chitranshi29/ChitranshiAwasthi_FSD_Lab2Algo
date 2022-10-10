package Lab_2_Algo;
import java.util.Scanner;
class Transaction
{
   public static void main(String args[]) throws Exception 
   {
      Scanner s = new Scanner(System.in);
      System.out.println("enter the size of transaction array");
      int size = s.nextInt();  //Array Size Initialization
      int arr[] = new int[size]; //Array Declaration
      System.out.println("enter the values of array");
          for (int i = 0; i < size; i++) //Array Initialization
               arr[i] = s.nextInt();
      System.out.println("enter the total no of targets that needs to be achieved");
      int targetNo = s.nextInt();  
          while (targetNo-- != 0) 
          {
             int flag = 0;  //Temporary variable to store the element
             long target;
             System.out.println("enter the value of target");
             target = s.nextInt(); //variable to store the value  of target that you want to achieve
             long sum = 0;
                 for (int i = 0; i < size; i++) 
                   {
                      sum += arr[i];
                      if (sum >= target) 
                      {
                        System.out.println("Target achieved after "+(i + 1) + "transactions "+ "\n");
                        flag = 1;
                        break;
                      }
                   } 
                  if (flag == 0) 
                    {
                        System.out.println(" Given target is not achieved ");
                    }
           }
    }
}

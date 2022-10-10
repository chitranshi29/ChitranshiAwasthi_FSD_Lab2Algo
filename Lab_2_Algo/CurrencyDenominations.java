package Lab_2_Algo;
import java.util.Random;
import java.util.Scanner;
public class CurrencyDenominations {
		    public static void main(String argc[])
		    {
		        Scanner sc=new Scanner(System.in);
		        int n;    //Array Size Declaration
		        System.out.println("enter the size of currency denominations :");
		        n=sc.nextInt();    //Array Size Initialization
		        //Integer arr[]=new Integer[n];    //Array Declaration
		        Random rd = new Random();//creating an object of Random class 
		        System.out.println("enter the currency denominations value");  
		        int[] arr = new int[n];
		        for (int i = 0; i < arr.length; i++) 
		        {
		      	//Generates random integers 0 to 49 
		           arr[i] = rd.nextInt(10); // storing random integers in an array
		           System.out.println(arr[i]); // printing each array element
		        }
		          // for(int i=0;i<n;i++)     //Array Initialization
		          //    {
		          //  arr[i]=sc.nextInt();
		          //    } 
		              System.out.println("enter the amount you want to pay");
		        int amount=sc.nextInt();
		        int temp = 0;    //Temporary variable to store the element
		            for (int i = 0; i < arr.length; i++)   //Holds each Array element
		              {     
		                 for (int j = i+1; j < arr.length; j++)    //compares with remaining Array elements
		                        {     
		                               if(arr[i] < arr[j]) //Compare and swap
		                                   {    temp = arr[i];    
		                                        arr[i] = arr[j];    
		                                        arr[j] = temp;                   
		                                   }     
		                        }     
		              }      
		        System.out.println();        
		        //Elements of array sorted in descending order:    
		        int[] noteCounter = new int[n];
		        // count notes 
		            for (int i = 0; i < n; i++) 
		                       {
		                              if (amount >= arr[i]) 
		                                 {     try 
		                                       {
		                                	      noteCounter[i] = amount / arr[i];
		                                	      amount = amount % arr[i];
		                                       }catch (ArithmeticException ae) 
		                                       {
		                                           System.out.print("");
		                                       }
		                                         
		                                         
		                                 }
		                                    
		                       }
		            for (int i = 0; i <n ; i++)
		                 {
		                              if (amount >= arr[i]) 
		                                 {
		                            	  try 
	                                      {
		                            		  noteCounter[i] = amount / arr[i];
		                                         amount = amount % arr[i];
	                                      }catch (ArithmeticException ae) 
	                                      {
	                                          System.out.print("");
	                                      }
		                                         
		                                 }
		                 }
		        // Print notes
		        System.out.println("Your payment approach in order to give min no of notes will be ");
		               for (int i = 0; i < n; i++)
		                  {
		            	      if (noteCounter[i] != 0) 
		            	          {
		                             System.out.println(arr[i] + " : "+ noteCounter[i]);
		                          }
		                  } 
		      }
		}


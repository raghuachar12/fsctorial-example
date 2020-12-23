import java.util.Scanner;

class FactorialExample2{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1;  
  Scanner in = new Scanner (System.in);    //System.in is a standard input stream
  System.out.print("Enter the number : ");  
  int number= in.nextInt();    
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  
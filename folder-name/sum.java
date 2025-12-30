import java.util.Scanner;
public class sum{

    public static void main(String args[]){

     
    // Find the sum of the number from 1 to N 
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Number N till you need sum : ");
    int N =sc.nextInt();
    int sum =0;
    for(int i =1 ;i<=N ;i++)
    {
      sum +=i;
    };
    System.out.println( "The sum of numbers till ", N, "Is : ", sum);
    
};
    
};

import java.util.Scanner;
public class demo {
      
    public static void main(String args[])
        {
            Scanner sc =new Scanner(System.in);

            System.out.println("------------Addition------------");

            // addition 
              System.out.println("Enter the first Number : ");
              int a = sc.nextInt();

              System.out.println("Enter the second number : ");
              int b =sc.nextInt();

              System.out.println(a+b);
            

            // subtraction 
            System.out.println("--------------Subtraction--------");

              System.out.println("Entet the Num1 : ");
              int num1 =sc.nextInt();
              System.out.println("Enter the Second Number : ");
              int num2 =sc.nextInt();
              System.out.println("The output of {num1} - {num2} is : ", num1 - num2);
            // Division
            // Multiplication
              sc.close();

        }
    
}

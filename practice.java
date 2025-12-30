// checking whether digit is their or not 
import java.util.Scanner;
class practice{

    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        //checking for any digit 
        System.out.println("Enter digit you look for : ");
        int digit =sc.nextInt();
        int flag =0;
        while (num!=0){
            int remainder =num%10;
            if (remainder == digit){
                flag =1;
                break;
            }
            num =num/10;

        }
        if (flag ==1 ){
            System.out.println("The digit is found ");
        }
        else{
            System.out.println("The digit is not present! ");
        }; 
        sc.close();
    };
};
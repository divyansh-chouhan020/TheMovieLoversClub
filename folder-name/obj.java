
import java.util.Scanner;
public class obj {

   public static int countOfDigitAppearanceCounter(int num ){
             int count =0; 
             int original_num =num;
             int count_of_digits_appeared =0;

             //count the digits in the number 
             while (num!=0){
                 num =num/10;
                  count ++;
              }
             // now lets see how many times this count appeared in this num
    
            while (original_num != 0){
                    int last =original_num % 10;
                    if (last == count){ 
                        count_of_digits_appeared ++;
                    }
                    original_num = original_num / 10;
                 };

             System.out.println(count_of_digits_appeared);
             return 0;

    };

    
 public static void main(String args[]){

    
     
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int num =sc.nextInt();
    
    countOfDigitAppearanceCounter(num);

 };
};
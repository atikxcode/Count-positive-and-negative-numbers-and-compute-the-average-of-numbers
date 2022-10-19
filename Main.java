import java.security.Principal;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num, count = 0, total = 0, positive = 0, negative = 0;
        double average;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        while((num = input.nextInt()) != 0){
            total += num;
            count++;
            if(num > 0){
                positive++;
            }else if(num < 0){
                negative++;
            }
        }

        average = total/(double)count;
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);

        }
    }






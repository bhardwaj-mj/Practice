package Practice;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        if(x>0){
            System.out.println("Number is Positive");
        }
        else if(x == 0){
            System.out.println("Number is Zero");
        }
        else{
            System.out.println("Number is Negative");
        }
    }
}

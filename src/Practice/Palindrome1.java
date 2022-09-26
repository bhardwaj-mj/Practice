package Practice;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int number=sc.nextInt();
        int reverse=0;
        int temp=number;
        while(temp!=0){
            int remainder=temp%10;
            reverse=reverse*10+remainder;
            temp=temp/10;
        }
        if(reverse==number) {
            System.out.println("Palindrome of " + number + " is " + reverse);
        }
            else{
                System.out.println("Number is not palindrome");
            }
    }
}

package Practice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int number= sc.nextInt();
        int digit,cube,temp;
        temp=number;
        int armstrong=0;
        while(temp!=0){
            digit=temp%10;
            cube=digit*digit*digit;
            armstrong=armstrong+cube;
            temp=temp/10;
        }
        if(armstrong==number){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}

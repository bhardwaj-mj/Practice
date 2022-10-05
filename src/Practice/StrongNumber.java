package Practice;

import java.util.Scanner;

public class StrongNumber {
    static int factorialNumber(int number){
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    static void strongNum(int number){
        int sum=0;
        int temp=number;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+factorialNumber(digit);
            temp=temp/10;
        }
        if(sum==number){
            System.out.println(number+" is a strong number ");
        }
        else{
            System.out.println(number+" is not a strong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number= sc.nextInt();
        strongNum(number);
    }
}

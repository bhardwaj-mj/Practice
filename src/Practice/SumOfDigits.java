package Practice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int x=sc.nextInt();
        int sum=0;
        while(x!=0){
            sum=sum+x%10;
            x=x/10;
        }
        System.out.println("Sum of the digits is "+sum);
    }
}

package Practice;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number of the range ");
        int a=sc.nextInt();
        System.out.print("Enter the last number of the range ");
        int b=sc.nextInt();
        int i;
        int sum=0;
        for(i=a;i<=b;i++){
            sum=sum+i;
        }
        System.out.println("sum of given range of the numbers is " + sum);
    }
}

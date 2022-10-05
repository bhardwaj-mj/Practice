package Practice;

import java.util.Scanner;

public class PowerOfNumber {
    static void power(int number){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the power of the number = ");
        int power=sc.nextInt();
        int result=(int)Math.pow(number,power);
        System.out.println(number+"^"+power+" = "+result);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        power(number);
    }
}

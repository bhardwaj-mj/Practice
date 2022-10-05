package Practice;

import java.util.Scanner;

public class FactorialOfNumber {
    static long factorialNumber(long number){
        long factorial=1;
        for(long i=1;i<=number;i++){
            factorial=factorial*i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        long number=sc.nextLong();
        long factorial=factorialNumber(number);
        System.out.println("Factorial of "+number+" is => "+factorial);
    }
}

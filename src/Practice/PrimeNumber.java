package Practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        int x=sc.nextInt();
        for(int i=2;i<x;i++){
            if(x%i==0){
                System.out.println(x+" is not a prime number");
                break;
            }
        }
        System.out.println(x+" is a prime number");
    }
}

package Practice;

import java.util.Scanner;

public class FactorsOFNumber {
    static void factor(int number){
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.print(i+"  ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number=sc.nextInt();
        System.out.println();
        System.out.print("Factors of "+number+" are = ");
        factor(number);
    }
}

package Practice;

import java.util.Scanner;

public class PerfectSquare {
    static void perfectSquare(int number){
        int square=0;
        if(number>=0) {
            int squareRoot = (int) Math.sqrt(number);
            square = squareRoot * squareRoot;
        }
        if(square==number){
            System.out.println(number+" is a perfect square ");
        }
        else{
            System.out.println(number+" is not a perfect square ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number= sc.nextInt();
        perfectSquare(number);
    }
}
package Practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number ");
        int x = sc.nextInt();
        if(x%2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}

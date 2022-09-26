package Practice;

import java.util.Scanner;

public class GreatestofTwoNumbers{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first number ");
        int x=sc.nextInt();
        System.out.print("Enter the second number ");
        int y=sc.nextInt();
        if(x==y){
            System.out.println("Both numbers are equal");
        }
        else if(x>y){
            System.out.println(x+" is greater than "+y);
        }
        else{
            System.out.println(y+" is greater than "+x);
        }

    }
}

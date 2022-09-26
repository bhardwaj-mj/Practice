package Practice;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number ");
        int x=sc.nextInt();
        System.out.print("Enter the second number ");
        int y=sc.nextInt();
        System.out.print("Enter the third number ");
        int z=sc.nextInt();
        if(x==y && x==z){
            System.out.println("All the three numbers are equal");
        }
        else if(x>y && x>z){
            System.out.println(x+" is greater then both "+y+" and "+z);
        }
        else if(y>x && y>z){
            System.out.println(y+" is greater then both "+x+" and "+z);
        }
        else{
            System.out.println(z+" is greater then both "+x+" and "+y);
        }
    }
}

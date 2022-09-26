package Practice;

import java.util.Scanner;

public class ArmstrongNumberInRange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting value of range ");
        int start=sc.nextInt();
        System.out.print("Enter ending value of range ");
        int end= sc.nextInt();
        System.out.println("Armstrong numbers between "+start+" and "+end+" are ");
        for(int i=start;i<=end;i++) {
            int temp = i;
            int digit, cube;
            int armstrong = 0;
            while (temp != 0) {
                digit = temp % 10;
                cube = digit * digit * digit;
                armstrong = armstrong + cube;
                temp = temp / 10;
            }
            if(armstrong==i){
                System.out.print(i+" ");
            }
        }
    }
}

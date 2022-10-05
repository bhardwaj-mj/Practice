package Practice;

public class FibonacciSeries {
    static void fibSeries(){
        int firstNumber=0;
        int secondNumber=1;
        int n=10;
        int nextTerm=0;
        System.out.print("Fibonacci series is => ");
        System.out.print(firstNumber+"  "+secondNumber+"  ");
        for(int i=2;i<=n;i++){
            nextTerm=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=nextTerm;
            System.out.print(nextTerm+"  ");
        }
        System.out.println();
        System.out.println("nth term of the fibonacci series is :"+nextTerm);
    }

    public static void main(String[] args) {
        fibSeries();
    }
}

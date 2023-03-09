import java.util.Scanner;
public class Fibonacci_Series {
    public static int fibonacci(int n) {
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            sum = first + second;
            first = second;
            second = sum;
        }
          return first;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for N: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Series of " + n + " terms: ");
        System.out.println(fibonacci(n)+" ");
        }
        }


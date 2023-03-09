import java.util.Scanner;
public class ReverseNumber {
    public static int reverse(int n){
        int reverse=0;
        while(n!=0){
         int remainder=n%10;
         reverse = reverse*10+remainder;
         n =n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();

        int reversedNumber = reverse(n);

        System.out.println("The reverse of " + n + " is " + reversedNumber + ".");
        sc.close();
    }

}

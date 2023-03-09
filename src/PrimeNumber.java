import java.util.Scanner;
public class PrimeNumber {
    public static boolean prime(int n){
        if(n>1){
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n =sc.nextInt();
        if(prime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

    }

}

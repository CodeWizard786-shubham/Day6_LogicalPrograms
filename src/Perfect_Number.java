import java.util.Scanner;
public class Perfect_Number {
    public static int perfectNum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Positive Number: ");
        int n =sc.nextInt();
        int sum=perfectNum(n);
        if(sum==n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
     sc.close();
    }
}

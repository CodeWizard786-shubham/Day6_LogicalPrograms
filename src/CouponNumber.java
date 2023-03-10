import java.util.Scanner;
import java.util.Random;
public class CouponNumber {
    public static int[] coupon(int n) {
        Random rand = new Random();
        int randomArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            randomArr[i] = rand.nextInt((9999-100) + 1)+10;
        }
        return randomArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of coupons needed: ");
        int n = sc.nextInt();
        int[] randomArr = coupon(n);
        System.out.println("The array is: ");
        for (int i = 0; i < randomArr.length; i++) {
            System.out.print(randomArr[i] + " ");
        }
        for (int i = 0; i < randomArr.length; i++) {
            for (int j = i + 1; j < randomArr.length; j++) {
                if (randomArr[i] == randomArr[j]) {
                    System.out.println("coupon number are not unique");
                }
            }
        }
    }
}
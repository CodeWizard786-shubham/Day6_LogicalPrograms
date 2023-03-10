
import java.util.Scanner;
public class StopWatch {
    public static int startTime() {
        long startTime = System.currentTimeMillis();
        return (int)startTime;
    }
    public static int stopTime() {
        long endTime = System.currentTimeMillis();
        return (int)endTime;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press enter to start the stopwatch");
        input.nextLine();
        int startTime=startTime();
        System.out.println("Press enter to stop the stopwatch");
        input.nextLine();
        int stopTime=stopTime();
        long elapsedTime = stopTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }
}

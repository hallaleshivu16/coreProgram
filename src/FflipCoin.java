import java.util.Scanner;
import javax.swing.*;
public class FflipCoin {
    public static void main(String[] args) {
        // variables
        int headCount = 0;
        int tailCount = 0;
        int counter = 1;
        int flips = 0;
        double headPercentage, tailPercentage;
        System.out.println("How many times you want to flip the coin");
        Scanner sc = new Scanner(System.in);  // object created
        flips = sc.nextInt();        // inputing

        if (flips < 0) {
            System.out.println("Enter the correct number of flip Counts");
        } else {
            while (counter <= flips) {
                double randNum = Math.random(); //random function
                if (randNum < 0.5) {
                    headCount++;
                    System.out.println(counter + " " + randNum);
                } else {
                    tailCount++;
                    System.out.println(counter + " " + randNum);
                }
                counter++;
            }

            // OUTPUT
            headPercentage = (headCount * 100) / flips;                  // calculating heads count percentage
            System.out.println("Heads Percentage:" + headPercentage);     // display percentage of heads count
            tailPercentage = (tailCount * 100) / flips;                  // calculating tails count percentage
            System.out.println("Tails Percentage:" + tailPercentage);     // display percentage of tails count
        }
    }
}


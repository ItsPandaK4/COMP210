package assn02;
import java.util.Scanner;
import java.lang.String;
public class JavaWarmUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number of iterations: ");
        String[] iteration = new String[input.nextInt()];
        input.nextLine();
        for (int i = 0; i < iteration.length; i++) {
            iteration[i] = input.nextLine();
            String[] result = iteration[i].split(" ");
            for (String str: result) {
                System.out.println(result[1]);
                // figure out how to add directories and code it so that all the necessary information is kept
            }
        }
        System.out.println("\nYou have entered:");
        for (String str : iteration)
            System.out.println(str);
    }
}
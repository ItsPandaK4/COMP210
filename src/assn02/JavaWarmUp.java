package assn02;
import java.time.LocalDate;
import java.util.Scanner;
import java.lang.String;
public class JavaWarmUp {
    public static void main(String[] args) {
        int greatest_fee = 0;
        int lowest_fee = 0;
        Double phone_fee = 0.0;
        int phone_quantity = 0;
        Double phone_cost = 0.0;
        Double laptop_fee = 0.0;
        int laptop_quantity = 0;
        Double laptop_cost = 0.0;
        Double smart_watch_fee = 0.0;
        int smart_watch_quantity = 0;
        Double smart_watch_cost = 0.0;
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        scanner.nextLine();
        InputData[] current_data = new InputData[array_size];
        for (int i = 0; i < array_size; i++) {
            InputData new_data = new InputData();
            String user_input = scanner.nextLine();
            String[] array_of_input = user_input.split(" ", 0);
            new_data.date = array_of_input[0];
            new_data.time = array_of_input[1];
            new_data.category = array_of_input[2];
            new_data.fee = Double.parseDouble(array_of_input[3]);
            new_data.quantity = Integer.parseInt(array_of_input[4]);
            new_data.duration = Double.parseDouble(array_of_input[5]);
            new_data.cost = Double.parseDouble(array_of_input[6]);
            current_data[i] = new_data;
        }

        for (int i = 0; i < current_data.length; i++) {
            double fee = current_data[i].fee;
            if (fee <= current_data[lowest_fee].fee) {
                lowest_fee = i;
            }
            if (fee >= current_data[greatest_fee].fee) {
                greatest_fee = i;
            }
        }
        for (int x = 0; x < current_data.length; x++) {
            String category = current_data[x].category;
            if (category == (current_data[0].category) || category == current_data[2].category) {

                laptop_fee += current_data[x].fee * current_data[x].quantity;
                laptop_quantity += current_data[x].quantity;
                laptop_cost += current_data[x].cost + ((current_data[x].duration * 16));
            }
            if (category == (current_data[1].category) || category == current_data[3].category) {
                phone_fee += current_data[x].fee * current_data[x].quantity;
                phone_quantity += current_data[x].quantity;
                phone_cost += current_data[x].cost + ((current_data[x].duration * 16));
            }
            if (category == (current_data[4].category) || category == current_data[5].category) {

                smart_watch_fee += current_data[x].fee * current_data[x].quantity;
                smart_watch_quantity += current_data[x].quantity;
                smart_watch_cost += current_data[x].cost + ((current_data[x].duration * 16));
            }
        }
        System.out.println("Highest per unit assembling fee:");
        System.out.println("\tWhen: " + current_data[greatest_fee].date + " " + current_data[greatest_fee].time);
        System.out.println("\tCategory: " + current_data[greatest_fee].category);
        System.out.println("\tPrice: " + current_data[greatest_fee].fee);
        System.out.println("Lowest per unit assembling fee:");
        System.out.println("\tWhen: " + current_data[lowest_fee].date + " " + current_data[lowest_fee].time);
        System.out.println("\tCategory: " + current_data[lowest_fee].category);
        System.out.println("\tPrice: " + current_data[lowest_fee].fee);
        System.out.println("Statistic of phone");
        System.out.println("\tQuantity: " + phone_quantity);
        System.out.printf("\tAverage Assembling fee: %.2f\n", + phone_fee / phone_quantity);
        System.out.printf("\tAverage Net Profit: %.2f\n", + ((phone_fee - + phone_cost)) / phone_quantity);
        System.out.println("Statistic of laptop");
        System.out.println("\tQuantity: " + laptop_quantity);
        System.out.printf("\tAverage Assembling fee: %.2f\n", + laptop_fee / laptop_quantity);
        System.out.printf("\tAverage Net Profit: %.2f\n", + ((laptop_fee - + laptop_cost)) / laptop_quantity);
        System.out.println("Statistic of smart_watch");
        System.out.println("\tQuantity: " + smart_watch_quantity);
        System.out.printf("\tAverage Assembling fee: %.2f\n", + smart_watch_fee / smart_watch_quantity);
        System.out.printf("\tAverage Net Profit: %.2f\n", + ((smart_watch_fee - + smart_watch_cost)) / smart_watch_quantity);
    }
}
class InputData {
    String date;
    String time;
    String category;
    double fee;
    int quantity;
    double duration;
    double cost;
}
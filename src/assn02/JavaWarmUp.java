package assn02;
import java.util.Scanner;
import java.lang.String;
public class JavaWarmUp {
    public static String[] max_price(String[] current_high, String[] current_array) {
        double current = Double.parseDouble(current_array[3]);
        double current_largest = Double.parseDouble(current_high[3]);
        if (current >= current_largest) {
            return current_array;
        }
        return current_high;
    }

    public static String[] min_price(String[] current_low, String[] current_array) {
        double current = Double.parseDouble(current_array[3]);
        double current_smallest = Double.parseDouble(current_low[3]);
        if (current >= current_smallest) {
            return current_array;
        }
        return current_low;
    }

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int iteration = Integer.parseInt(user_input.nextLine());

        String[] array_of_largest = new String[7];
        String[] array_of_smallest = new String[7];
        Double[] array_of_laptop = new Double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        Double[] array_of_phone = new Double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        Double[] array_of_smart_watch = new Double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

        for (int i = 0; i < iteration; i++) {
            String interaction = user_input.nextLine();
            String[] array_of_input = interaction.split(" ", 0);
            if (i == 0) {
                array_of_largest = array_of_input;
                array_of_smallest = array_of_input;
            }
            array_of_largest = max_price(array_of_largest, array_of_input);
            array_of_smallest = min_price(array_of_smallest, array_of_input);

            Double current_date = Double.parseDouble(array_of_input[0]);
            Double current_time = Double.parseDouble(array_of_input[1]);
            Double current_fee = Double.parseDouble(array_of_input[3]);
            Double current_quantity = Double.parseDouble(array_of_input[4]);
            Double current_cost = Double.parseDouble(array_of_input[5]);

            Double[] current_array = new Double[]{current_date, current_time, current_fee, current_quantity, current_cost};

            if (array_of_input[2].equals("laptop")) {
                array_of_laptop[0] += current_array[0];
                array_of_laptop[1] += current_array[1];
                array_of_laptop[2] += current_array[2];
                array_of_laptop[3] += current_array[3];
                array_of_laptop[4] += current_array[4];
                array_of_laptop[5] += 1;
            }
            if (array_of_input[2].equals("phone")) {
                array_of_phone[0] += current_array[0];
                array_of_phone[1] += current_array[1];
                array_of_phone[2] += current_array[2];
                array_of_phone[3] += current_array[3];
                array_of_phone[4] += current_array[4];
                array_of_phone[5] += 1;
            }
            if (array_of_input[2].equals("smart_watch")) {
                array_of_smart_watch[0] += current_array[0];
                array_of_smart_watch[1] += current_array[1];
                array_of_smart_watch[2] += current_array[2];
                array_of_smart_watch[3] += current_array[3];
                array_of_smart_watch[4] += current_array[4];
                array_of_smart_watch[5] += 1;
            }
        }
        System.out.printf("Highest per unit assembling fee:\r");
    }
}
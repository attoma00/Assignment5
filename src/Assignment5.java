import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        System.out.println("Welcome to metric converter!");
        System.out.println("Please input your query. For example, 1 km = mile");
        System.out.println("Enter 'exit' or '-1' to exit the program");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("exit") || input.equals("-1")) {
                break;
            }

            try {
                String[] parts = input.split(" ");
                double value = Double.parseDouble(parts[0]);
                String unitFrom = parts[1];
                String unitTo = parts[3];

                double result = 0;
                switch (unitFrom) {
                    case "km":
                        switch (unitTo) {
                            case "mile":
                                result = value * 0.621371;
                                break;
                        }
                        break;
                    case "kg":
                        switch (unitTo) {
                            case "lb":
                                result = value * 2.20462;
                                break;
                        }
                        break;
                    case "g":
                        switch (unitTo) {
                            case "oz":
                                result = value * 0.0353;
                                break;
                        }
                        break;
                    case "mm":
                        switch (unitTo) {
                            case "inch":
                                result = value * 0.03937;
                                break;
                        }
                        break;
                    default: 
                        System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg = lb");
                }

                System.out.printf("%.2f %s = %.2f %s\n", value, unitFrom, result, unitTo);
            } catch (Exception e) {
                System.out.println("Your input is not currently handled by this app, please input another query, for example, 1 kg = lb");
            }
        }
        scanner.close();
    }
}
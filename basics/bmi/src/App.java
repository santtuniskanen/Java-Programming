import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height (m)");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight (kg)");
        int weight = scanner.nextInt();

        double bmi = (double)weight / Math.pow(height, 2);
        String round_bmi = String.format("%.1f", bmi); // Rounds the number to one decimal place

        System.out.println("Your BMI is " + round_bmi);
        
        scanner.close();
    }
}

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Anna ensimmäinen luku");
    int num1 = scanner.nextInt();
    System.out.println("Anna toinen luku");
    int num2 = scanner.nextInt();

    int sum = num1 + num2;
    int subtraction = num1 - num2;
    double division = (double)num1 / num2;

    System.out.println("Annoit luvut " + num1 + " ja " + num2);
    System.out.println("Lukujen summa on " + sum);
    System.out.println("Lukujen erotus on " + subtraction);
    System.out.println("Lukujen jako on " + division);
  }
}

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действие которое хотите совершить:");
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        if (inputs.length != 3) {
            throw new IOException("throws Exception //т.к. строка не является математической операцией.");
        }
        try {
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[2]);
            char op = inputs[1].charAt(0);
            if (a < 1 || a > 10 || b < 1 || b > 10) {
                throw new IOException("throws Exception // Ошибка: число должно быть от 1 до 10.");
            }

            int deistvie = 0;
            switch (op) {
                case '+':
                    deistvie = a + b;
                    System.out.println("Результат: " + deistvie);
                    break;
                case '-':
                    deistvie = a - b;
                    System.out.println("Результат: " + deistvie);
                    break;
                case '*':
                    deistvie = a * b;
                    System.out.println("Результат: " + deistvie);
                    break;
                case '/':
                    deistvie = a / b;
                    System.out.println("Результат: " + deistvie);
                    break;
                default:
                    throw new IOException("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *).");
            }
        } catch (Exception e) {
            throw new IOException("throws Exception");
        }
    }
}














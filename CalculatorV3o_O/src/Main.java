import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действие которое хотите совершить:");
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        if (inputs.length != 3) {
            System.out.println("throws Exception //т.к. строка не является математической операцией");
            return;
        }
        try {
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[2]);
            char op = inputs[1].charAt(0);
            if (1 <= a | a <= 10) {
            }
            if (a <= 10) {
            } else {
                System.out.println("Ошибка: число должно быть от 1 до 10");
                return;
            }
            if (1 <= b | b <= 10) {
            }
            if (b <= 10) {
            } else {
                System.out.println("Ошибка: число должно быть от 1 до 10");
                return;
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
                    System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                    return;
            }
        } catch (Exception e) {
            System.out.println("throws Exception");
        }
    }
}














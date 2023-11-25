import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действие которое хотите совершить");
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[2]);
        char op = inputs[1].charAt(0);
        if (1 <= a | a <= 10) {
        } if (a <= 10) {
        } else {
            System.out.println("Throw exception.");
            return;
        }

        if (1 <= b | b <= 10) {
        }
        if (b <= 10) {
        } else {
        System.out.println("Throw exception.");
            return;
        }

            int deistvie;
            switch (op) {
                case '+':
                    deistvie = (a+b);
                    System.out.println("Результат: " + deistvie);
                    break;
                case '-':
                    deistvie = (a-b);
                    System.out.println("Результат: " + deistvie);
                    break;
                case '*':
                    deistvie = (a*b);
                    System.out.println("Результат: " + deistvie);
                    break;
                case '/':
                    deistvie = (a/b);
                    System.out.println("Результат: " + deistvie);
                    break;
                default:
                    System.out.println("Throw exception.");
                    break;

            }
        }
    }














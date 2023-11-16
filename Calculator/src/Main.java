import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число (до 10)");
        int a = scanner.nextInt();
        if (a <= 10) {
        } else if (a > 10) {
            System.out.println("Введенное вами число не является верным.");
        }
        System.out.println("Введите второе число (до 10)");
        int b = scanner.nextInt();
        if (b <= 10) {
        } else if (b > 10) {
            System.out.println("Введенное вами число не является верным.");
        }
        System.out.println("Введите действие которое хотите совершить: +, -, *, /");{
            int deistvie = scanner.next().charAt(0);;
            switch (deistvie) {
                case '+':
                    deistvie = a+b;
                    System.out.println("Результат:"  +deistvie);
                    break;
                case '-':
                    deistvie = a-b;
                    System.out.println("Результат:"  +deistvie);
                    break;
                case '*':
                    deistvie = a*b;
                    System.out.println("Результат:"  +deistvie);
                    break;
                case '/':
                    deistvie = a/b;
                    System.out.println("Результат:"  +deistvie);
                    break;
                default:
                    System.out.println("Throw exception.");

        }

        }

    }

}













import  java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

            //Задание 1
            Scanner calc  = new Scanner(System.in);
            System.out.print("Введите число 1: ");
            int a = calc.nextInt();

            System.out.print("Введите число 2: ");
            int b = calc.nextInt();

            // Сравнение введенных чисел
            if (a>b) {
                System.out.println("Первое число больше второго");
            } else if (a==b) {
                System.out.println("Числа равны");
            } else {
                System.out.println("Второе число больше первого");
            };

            //Калькулятор
            int res;

            System.out.print("Действие: ");
            String action = calc.nextLine();
            action = calc.nextLine();
            switch (action) {


                case "+":
                    res = a + b;
                    System.out.println("Результат: " + res);
                    break;
                case "-":
                    res = a - b;
                    System.out.println("Результат: " + res);
                    break;
                case "*":
                    res = a * b;
                    System.out.println("Результат: " + res);
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Результат: на ноль делить нельзя");
                    } else {
                        res = a / b;
                        System.out.println("Результат: " + res);
                    }

                    break;
                default:
                    System.out.println("Не корректный ввод");
            }

            //Задание 2
            Scanner text = new Scanner(System.in);

            text.nextLine();
            System.out.print("Введите первый текст: ");
            String one = text.nextLine();

            System.out.print("Введите второй текст: ");
            String two = text.nextLine();

//         Сравнение введенных строк
            if (one.equals(two)) {
                System.out.println("Строки идентичны");
            }
            else {
                System.out.println("Строки неидентичны");
            }

        //Задание 3


    }
}


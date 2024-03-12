

import java.util.Scanner;

public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите вещественную часть первого аргумента: ");
            
            int secondArg = promptInt("Введите мнимую часть часть первого аргумента: ");
            calculator.sum(primaryArg,secondArg);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите вещественную часть второго аргумента: ");
                    int arg2 = promptInt("Введите мнимую часть часть второго аргумента: ");
                    calculator.multi(arg,arg2);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите вещественную часть второго аргумента: ");
                    int arg2 = promptInt("Введите мнимую часть часть второго аргумента: ");
                    calculator.sum(arg,arg2);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}

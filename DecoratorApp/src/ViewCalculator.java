import java.util.Scanner;

public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            double primaryReal = promptDouble("Введите вещественную часть первого аргумента: ");
            double primaryImaginary = promptDouble("Введите мнимую часть первого аргумента: ");
            ComplexNumber primaryArg = new ComplexNumber(primaryReal, primaryImaginary);
            
            calculator.sum(primaryArg);

            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    double argReal = promptDouble("Введите вещественную часть второго аргумента: ");
                    double argImaginary = promptDouble("Введите мнимую часть второго аргумента: ");
                    ComplexNumber arg = new ComplexNumber(argReal, argImaginary);
                    calculator.multiply(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double argReal = promptDouble("Введите вещественную часть второго аргумента: ");
                    double argImaginary = promptDouble("Введите мнимую часть второго аргумента: ");
                    ComplexNumber arg = new ComplexNumber(argReal, argImaginary);
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    double argReal = promptDouble("Введите вещественную часть второго аргумента: ");
                    double argImaginary = promptDouble("Введите мнимую часть второго аргумента: ");
                    ComplexNumber arg = new ComplexNumber(argReal, argImaginary);
                    calculator.divide(arg);
                    continue;
                    
                }
                if (cmd.equals("-")) {
                    double argReal = promptDouble("Введите вещественную часть второго аргумента: ");
                    double argImaginary = promptDouble("Введите мнимую часть второго аргумента: ");
                    ComplexNumber arg = new ComplexNumber(argReal, argImaginary);
                    calculator.subtract(arg);
                    continue;
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.println("Результат: " + result);
                    break;
                }
            }

            String cmd = prompt("Еще посчитать (Y/N)?");
            if (!cmd.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }
}
    

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}



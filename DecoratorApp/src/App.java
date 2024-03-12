public class App {
  public static void main(String[] args) throws Exception {
      iCalculable calculator = new CalculatorComplexNumber(new ComplexNumber(0, 0));
      Logger logger = new Logger();
      iCalculable decorator = new Decorator(calculator, logger);
      ViewCalculator view = new ViewCalculator(decorator);
      view.run();
  }
}

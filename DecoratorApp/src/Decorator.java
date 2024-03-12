public class Decorator implements iCalculable {
    private iCalculable calculator;
    private Logger logger;

    public Decorator(iCalculable calculator, Logger logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public iCalculable sum(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода sum с параметром %s", firstArg, arg));

        iCalculable result = calculator.sum(arg);

        logger.log("Вызов метода sum произошел");

        return result;
    }

    @Override
    public iCalculable multiply(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода multiply с параметром %s", firstArg, arg));

        iCalculable result = calculator.multiply(arg);

        logger.log("Вызов метода multiply произошел");

        return result;
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = calculator.getResult();
        logger.log(String.format("Получение результата %s", result));

        return result;
    }

    @Override
    public iCalculable subtract(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода subtract с параметром %s", firstArg, arg));

        iCalculable result = calculator.subtract(arg);

        logger.log("Вызов метода subtract произошел");

        return result;
    }

    @Override
    public iCalculable divide(ComplexNumber arg) {
        ComplexNumber firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода divide с параметром %s", firstArg, arg));

        iCalculable result = calculator.divide(arg);

        logger.log("Вызов метода divide произошел");

        return result;
    }
}

/**
 * @apiNote Класс математический операций
 */
public class CalculatorComplexNumber implements iCalculable {
    private ComplexNumber primaryArg;

    public CalculatorComplexNumber(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public iCalculable sum(ComplexNumber arg) {
        primaryArg = primaryArg.add(arg);
        return this;
    }

    @Override
    public iCalculable subtract(ComplexNumber arg) {
        primaryArg = primaryArg.subtract(arg);
        return this;
    }

    @Override
    public iCalculable multiply(ComplexNumber arg) {
        primaryArg = primaryArg.multiply(arg);
        return this;
    }

    @Override
    public iCalculable divide(ComplexNumber arg) {
        primaryArg = primaryArg.divide(arg);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
    
}



public interface iCalculable {
    iCalculable sum(ComplexNumber arg);
    iCalculable subtract(ComplexNumber arg);
    iCalculable multiply(ComplexNumber arg);
    iCalculable divide(ComplexNumber arg);
    ComplexNumber getResult();
}

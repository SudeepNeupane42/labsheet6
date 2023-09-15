package labsheet6;

public class Calculator {

    public <T extends Number> T sum(T a, T b) {
        double d = a.doubleValue() + b.doubleValue();
        return (T) (Double) d;
    }

    public <T extends Number> T subtract(T a, T b) {
        double d = a.doubleValue() - b.doubleValue();
        return (T) (Double) d;
    }

    public <T extends Number> T multply(T a, T b) {
        double d = a.doubleValue() * b.doubleValue();
        return (T) (Double) d;
    }

    public <T extends Number> T division(T a, T b) {
        double d = a.doubleValue() / b.doubleValue();
        return (T) (Double) d;
    }

}

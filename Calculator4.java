
package labsheet6;

public class Calculator4 implements GenericInterface{

    @Override
    public void sum(Number a, Number b) {
        double sum = a.doubleValue() + b.doubleValue();
        System.out.println("sum is "+sum);
 
    }

    @Override
    public void subtract(Number a, Number b) {
        double diff = a.doubleValue() - b.doubleValue();
        System.out.println("difference is "+diff);
    }

    @Override
    public void multiply(Number a, Number b) {
        double prod = a.doubleValue() * b.doubleValue();
        System.out.println("product is "+prod);
    }

    @Override
    public void division(Number a, Number b) {
        double div = a.doubleValue() / b.doubleValue();
        System.out.println("sum is "+div);
    }
    
}

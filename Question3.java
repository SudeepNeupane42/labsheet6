
package labsheet6;


public class Question3 {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("sum is "+c.sum(10.0, 20.0));
        System.out.println("difference is "+c.subtract(30.0, 20.0));
        System.out.println("product is "+c.multply(5.0, 6.0));
        System.out.println("Quotient is "+c.division(10.0, 2.0));
    }
}

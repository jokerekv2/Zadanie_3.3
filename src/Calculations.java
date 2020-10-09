import static java.lang.Math.*;

public class Calculations {
    public boolean isEven(int n) {
        return (n % 2) == 0;
    }

    public boolean isOdd(int n) {
        return (n % 2) != 0;
    }

    public double circleField(double r) {
        return PI * pow(r, 2);
    }

    public double power(int n) {
        return pow(n,2);
    }

}
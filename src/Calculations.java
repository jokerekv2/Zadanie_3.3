import static java.lang.Math.*;

public class Calculations {
    public boolean isEven(int n) {
        if ((n % 2) == 0) {
            return true;
        } else
            return false;
    }

    public boolean isOdd(int n) {
        if ((n % 2) != 0) {
            return true;
        } else
            return false;
    }

    public double circleField(double r) {
        return PI * pow(r, 2);
    }

    public double power(int n) {
        return pow(n,2);
    }

}
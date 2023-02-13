package Model;

public class SumModel extends Model {

    @Override
    public String result(double a, double b) {

        return String.format("%f + %f = %f", a, b, a + b);
    }

}

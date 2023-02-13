package Model;

public class SubModel extends Model {

    @Override
    public String result(double a, double b) {

        return String.format("%f - %f = %f", a, b, a - b);
    }

}

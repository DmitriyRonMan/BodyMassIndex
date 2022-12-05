public class BmiService {
    public double calculate(double mass, double height) {
        double bodyMassIn = mass / (height * height);
        return bodyMassIn;
    }
}

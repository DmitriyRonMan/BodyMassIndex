public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.88;
        double mass = 87.5;
        double bodyMassIn = service.calculate(mass, height);
        System.out.println(bodyMassIn);
    }
}
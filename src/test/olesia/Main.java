package test.olesia;

public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 50.3;
        double height = 1.53;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}

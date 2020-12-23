public class Numbers {
    public int number1;
    public int number2;
    private final String calculationMethod;

    public Numbers(int number1, int number2, String calculationMethod) {
        this.number1 = number1;
        this.number2 = number2;
        this.calculationMethod = calculationMethod;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getCalculationMethod() {
        return calculationMethod;
    }
}

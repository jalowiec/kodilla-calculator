public class Calculator {

    public int addingInt(int firstNumber, int secondNumber){
        return firstNumber +  secondNumber;
    }

    public int subtractionInt(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.addingInt(5, 6));
        System.out.println(calculator.subtractionInt(5, 10));
    }
}

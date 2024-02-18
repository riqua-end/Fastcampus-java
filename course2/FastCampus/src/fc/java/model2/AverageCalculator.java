package fc.java.model2;

public class AverageCalculator <T extends Number>{ // T가 number클래스 또는 Number클래스의 하위 클래스 타입만 사용할 수 있다.
    private T[] numbers;

    public AverageCalculator(T[] numbers){
        this.numbers=numbers;
    }

    public double calculateAverage(){
        double sum = 0.0;
//        for (T number :
//                numbers) {
//            sum+=number.doubleValue();
//        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }

        return sum / numbers.length;
    }
}

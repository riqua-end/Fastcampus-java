package fc.java.model;

public class CarUtility {
    // 매개 변수로 자동차의 정보를 입력 받아서 출력하는 메서드를 정의하세요.
    public void carPrint(CarDTO car){
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carYear+"\t"+car.carType+"\t"+car.carOwner);
    }
}

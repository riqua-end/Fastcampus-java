package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Q. Car 정보를 출력하는 동작을 가지고 있는 Utility클래스를 설계하세요.
        int carSn=1110;
        String carName="bmw";
        int carPrice=9000;
        String carOwner="java";
        int carYear=2015;
        String carType="G";
        //데이터를 하나로 묶는다(이동)
        CarDTO car=new CarDTO();
        car.carSn=carSn;
        car.carType=carType;
        car.carYear=carYear;
        car.carPrice=carPrice;
        car.carName=carName;
        car.carOwner=carOwner;
//        carPrint(car);
        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);
    }


}

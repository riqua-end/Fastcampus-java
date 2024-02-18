package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차의 정보를 키보드로부터 입력 받아서 다른 메서드로 이동 해야 되는 경우를 생각해보자.

        Scanner scan = new Scanner(System.in);
        System.out.println("자동차 일련번호 : ");
        int carSn = scan.nextInt();

        scan.nextLine(); // 버퍼 비우기

        System.out.println("자동차 이름 : ");
        String carName = scan.nextLine();

        System.out.println("자동차 가격 : ");
        int carPrice = scan.nextInt();

        scan.nextLine(); // 버퍼 비우기

        System.out.println("자동차 소유자 : ");
        String carOwner = scan.nextLine();

        System.out.println("자동차 연식 : ");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차 타입 : "); // G(휘발유), D(경유)
        String carType = scan.nextLine();


//        System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carYear+"\t"+carType+"\t"+carOwner);
        // 아래 방식으로 데이터를 담으려면 상당히 비효율적이다.
//        carInfoPrint(carSn,carName,carPrice,carYear,carType,carOwner);
        // 그래서 자동차 데이터를 이동하기 위한 바구니가 필요하다. ( DTO, VO )
        // 클래스로 CarDTO or CarVO 모델을 설계
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName=carName;
        car.carOwner=carOwner;
        car.carPrice=carPrice;
        car.carYear=carYear;
        car.carType=carType;
        carInfoPrint(car);  // Call By Reference
    }

    // Q. 매개변수로 자동차의 정보를 받아서 출력하는 메서드를 정의하세요.
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carYear+"\t"+car.carType+"\t"+car.carOwner);
    }
}

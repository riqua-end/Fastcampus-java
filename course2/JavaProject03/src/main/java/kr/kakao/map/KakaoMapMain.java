package kr.kakao.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * KakaoMapMain 클래스는 Kakao 지도 API를 활용하여 주소의 좌표를 입력받고 출력하는 기능
 */
public class KakaoMapMain {
    public static void main(String[] args) {

        try {
            // 사용자 입력을 위한 BufferedReader 객체 생성
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            // 사용자로부터 주소 입력 받기
            System.out.print("주소를 입력하세요 : ");
            String address = reader.readLine();

            // KakaoApi를 통해 입력받은 주소의 좌표 가져오기
            double[] coordinates = KakaoApi.getAddressCoordinate(address);

            // 좌표가 존재하는 경우
            if (coordinates != null) {
                System.out.println("주소 : " + address);
                System.out.println("위도 : " + coordinates[0]);
                System.out.println("경도 : " + coordinates[1]);
            }
            // 좌표가 존재하지 않는 경우
            else {
                System.out.println("주소를 찾을 수 없습니다.");
            }
        }
        // 입력 중 예외 발생 시 처리
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

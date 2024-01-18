package fc.java.part2;

public class SwitchCaseTest {

    public static void main(String[] args) {

        // Switch ~ case 문 , 주로 다중 선택에 사용하는데, 다중 if문 보다 간결
        // 대신 사용 영역이 if ~ else 문에 비해 제한적

        // Q. switch ~ case 문을 활용하여 요일에 해당하는 운동을 출력하세요.

        String day = "Sunday"; // 야구하기

        switch (day){
            case "Sunday" :
                System.out.println("야구하기");
                break;
            case "Monday" :
                System.out.println("농구하기");
                break;
            case "Tuesday" :
            case "Wednesday" :
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
        }
    }
}

public class ArithmaticOperTest {
    public static void main(String[] args) {

        //사칙 연산자 ( + , - , * , / )
        //나머지 연산자 ( % )


        // Q. 나누기와 나머지 연산자의 활용 (정수의 자릿수 구하기)
        int digit = 3625;
        System.out.println(digit%10); // 5
        System.out.println(digit/10%10); //2
        System.out.println(digit/100%10); //6
        System.out.println(digit/1000%10); //3

        // Q2. num의 자릿수를 구하여 더한 값을 구하시오.
        int num = 2579;
        System.out.println(num%10); //9
        System.out.println(num/10%10); //7
        System.out.println(num/100%10); //5
        System.out.println(num/1000%10); //2

//        9+7+5+2 = 23


        //대입 연산자 ( = )
        //복합 대입 연산자 ( += -= *= /= %=)
        //a += b    ---->  a = a+b
        //a -= b    ---->  a = a-b
        //a *= b    ---->  a = a*b
        //a /= b    ---->  a = a/b
        //a %= b    ---->  a = a%b


    }
}

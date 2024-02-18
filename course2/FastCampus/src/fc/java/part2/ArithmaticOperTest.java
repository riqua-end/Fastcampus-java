package fc.java.part2;

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




        //관계(비교) 연산자 ( == , != , < , > , <= , >= )
        //연산의 결과는 True or false

        // Q. 관계(비교)연산자의 결과 값을 쓰시오
        int a = 4;

        System.out.println(a>5); //false
        System.out.println(a<5); //true
        System.out.println(a==6); //false
        System.out.println(a!=4); //false
        System.out.println(3>=a); //false
        System.out.println(a<=a+1); //true

        // ( instanceof ) , 부모와 자식 간의 상속 관계인지 아닌지 확인할 때 사용 , true or false

        System.out.println("논리 연산자");

        // 논리 연산자 ( && , || , ! ) 결과는 true or false
        // && = and 연산, || = or 연산 , ! = not 연산
        // !a = a가 참이면 거짓 , 거짓이면 참
        // a && b = a,b가 둘 다 참이면 참,그렇지 않으면 거짓
        // a || b = a,b 중 하나라도 참이면 참 , 그렇지 않으면 거짓


        // Q. 논리 연산자의 결과 값을 쓰시오

        int x = 1 , y = 0;
        System.out.println(!(x>0)); // false
        System.out.println(x>0&&x<3); //true
        System.out.println(x>0&&y<0); //false
        System.out.println(x<0||y>=0); //true
        System.out.println(y<0&&y<-5); //false

        System.out.println();

        int c = 3, d = 5;
        System.out.println((c>=3)&&(d<6)); //true
        System.out.println((c!=3)&&(c>2)); //false
        System.out.println((c!=3)||(c>2)); // true
        System.out.println((d!=5)||(c==1)); //false
    }
}

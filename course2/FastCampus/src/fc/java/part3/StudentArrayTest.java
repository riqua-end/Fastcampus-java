package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        // Q. 객체 배열을 이용하여 4명의 학생 데이터를 저장하고 출력하세요.
        Student[] std = new Student[4];

        std[0]=new Student("홍길동","컴공",33,"bit@empas.com",2023110,"010-1234-1234");
        std[1]=new Student("나길동","전기",43,"bit@empas.com",2023111,"010-1234-1231");
        std[2]=new Student("다길동","건축",25,"bit@empas.com",2023112,"010-1234-1232");
        std[3]=new Student("라길동","통신",51,"bit@empas.com",2023113,"010-1234-1233");

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i].toString());
        }

        for (Student st :
                std) {
            System.out.println(st.toString());
        }
    }
}

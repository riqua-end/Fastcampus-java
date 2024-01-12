public class TwoDimArrayTest {
    public static void main(String[] args) {
        //Q.2행 4열의 정수형 배열을 생성하세요.
        int[][] a = new int[2][4];
        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;
        a[0][3] = 40;

        a[1][0] = 50;
        a[1][1] = 60;
        a[1][2] = 70;
        a[1][3] = 80;

        System.out.println(a[0][0]+"\t"+a[0][1]+"\t"+a[0][2]+"\t"+a[0][3]);
        System.out.println(a[1][0]+"\t"+a[1][1]+"\t"+a[1][2]+"\t"+a[1][3]);

        //Q.2차원 배열의 초기화(행 단위의 초기화)와 반복문을 활용한 원소 접근
        int[][] b = {
                {1,2,3,4},
                {5,6,7,8}
        };

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

        //가변 길이 형태의 다차원 배열
        int[][] c = new int[5][];
        c[0] = new int[1];
        c[1] = new int[2];
        c[2] = new int[3];
        c[3] = new int[4];
        c[4] = new int[5];

        //반복문을 이용해서 가변모양의 별 찍기
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length;j++){
                c[i][j]='☆';
                System.out.print((char) c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}


//Q.동일한 데이터를 연속적으로 여러 개 저장 할 수 있는 자료구조는? -- 배열
//Q.배열의 길이를 구하는 속성 -- length
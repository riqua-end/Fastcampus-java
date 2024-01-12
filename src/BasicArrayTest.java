

public class BasicArrayTest {
    public static void main(String[] args) {

        // Q.실수 3개를 저장 할 배열을 생성하고 값을 저장하고 출력(기본 배열)

        float[] f = {24.5f,45.5f,77.65f};
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);

        // Q.책 3권을 저장할 배열을 생성하고 책 3권의 데이터를 저장하고 출력하시오.
        Book[] b = new Book[3]; //객체 배열
        b[0]=new Book();
        b[0].title="java";
        b[0].price=20000;
        b[0].author="kj";
        b[0].company="java company";
        b[0].page=200;
        b[0].isbn="124124isbn";

        //System.out.println(b[0].title+"\t"+b[0].page+"\t"+b[0].company);


        b[1]=new Book();
        b[1].title="java1";
        b[1].price=30000;
        b[1].author="kj1";
        b[1].company="1java company";
        b[1].page=300;
        b[1].isbn="12isbn";
        b[2]=new Book();
        b[2].title="java2";
        b[2].price=40000;
        b[2].author="kj2";
        b[2].company="2java company";
        b[2].page=400;
        b[2].isbn="124isbn";

        // 향상된 for문
        for (Book book : b) {
            System.out.println(book.title + book.company + book.isbn + book.author + book.page + book.price);
        }

        // for문
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i].title+b[i].company+b[i].isbn+b[i].author+b[i].page+b[i].price);
        }
    }
}

package fc.java.course2.part2;

import fc.java.model2.Book;
import fc.java.model2.Movie;
import fc.java.model2.ObjectArr;

public class GenericTest {
    public static void main(String[] args) {
        /*ObjectArr<String> array = new ObjectArr<>(5);

        array.set(0,"Hello");
        array.set(1,"World");
        array.set(2,"Java");
        array.set(3,"Generic");
        array.set(4,"Hi");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

         */
        ObjectArr<Movie> bList = new ObjectArr<>(5);

        bList.set(0,new Movie("괴물","봉준호","2006","한국"));
        bList.set(1,new Movie("괴물1","봉준호1","2006","한국"));
        bList.set(2,new Movie("괴물2","봉준호2","2006","한국"));
        bList.set(3,new Movie("괴물3","봉준호3","2006","한국"));

        for (int i = 0; i < bList.size(); i++) {
            System.out.println(bList.get(i));
        }
    }
}

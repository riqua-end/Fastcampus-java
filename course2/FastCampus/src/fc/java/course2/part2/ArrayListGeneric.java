package fc.java.course2.part2;

import fc.java.model2.Movie;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>(); // Movie[]
        list.add(new Movie("괴물","봉준호","2006","한국"));
//        list.add("Hello"); // X ,제네릭을 사용 안하면 타입의 안정성을 보장 할 수 없다.
        list.add(new Movie("기생충","봉준호","2019","한국"));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}

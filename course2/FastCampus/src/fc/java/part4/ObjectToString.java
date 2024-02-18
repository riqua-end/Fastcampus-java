package fc.java.part4;

import fc.java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();

        b.setTitle("게시글 입니다.");

        System.out.println("b.getTitle() = " + b.getTitle());
        System.out.println(b.toString()); // fc.java.poly.Board@6cd8737 -> 재정의한 문자열 값 (게시글 입니다.)
        System.out.println(b); // fc.java.poly.Board@6cd8737 -> 재정의한 문자열 값 (게시글 입니다.)
    }
}

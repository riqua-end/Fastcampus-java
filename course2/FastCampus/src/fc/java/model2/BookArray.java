package fc.java.model2;

import java.util.Arrays;

public class BookArray {
    private static final int DEFAULT_CAPACITY=5; // 수정 불가(final) -> 상수
    private int size = 0;
    private Book[] elements;
    // 배열 생성 동작
    public BookArray(){
        elements = new Book[DEFAULT_CAPACITY]; // 5개 크기 배열
    }
    //배열 저장 동작
    public void add(Book element){
        // 크기체크
        if (size == elements.length){
            //크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        elements[size++]=element;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length*2;
        elements=Arrays.copyOf(elements, newCapacity);
    }

    // 얻는 동작
    public Book get(int index){ // -1,5이상
        //index 체크
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("범위초과");
        }
        return elements[index];
    }
    //원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }
}

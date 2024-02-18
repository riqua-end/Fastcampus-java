package fc.java.model2;

import java.util.Arrays;

public class ObjectArray {
    private static final int DEFAULT_CAPACITY=5; // 수정 불가(final) -> 상수
    private int size = 0;
    private Object[] elements;
    // 배열 생성 동작
//    public ObjectArray(){
//        elements = new Object[DEFAULT_CAPACITY]; // 5개 크기 배열
//    }

    public ObjectArray(){
        this(5); // this() : 생성자안에서 다른 생성자를 호출할때 사용
    }

    // 오버로딩을 해서 원하는 크기의 배열을 생성한다.
    public ObjectArray(int capacity){
        elements = new Object[capacity];
    }
    //배열 저장 동작
    public void add(Object element){ //다형성 인수
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
    public Object get(int index){ // -1,5이상
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

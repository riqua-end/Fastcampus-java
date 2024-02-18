package fc.java.model2;

public class ObjectArr<T> {
    private T[] array;
    private int size;
    public ObjectArr(int size){
        // 제네릭 배열을 생성하는 방법은 배열을 생성한 후 형변환을 해야 함
        array=(T[])new Object[size];
    }

    public void set(int index,T value){
        array[index]=value;
        size++;
    }

    public T get (int index){
        return array[index];
    }

    public int size(){
        return size;
    }
}

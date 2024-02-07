package fc.java.model2;

@FunctionalInterface //함수형 인터페이스,추상메서드는 단 한개만 가지고 있어야 함
public interface MathOperation {
    public int operation(int x, int y); // 추상 메서드
}

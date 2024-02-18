package fc.java.model2;

public class MinMaxFinder { // 직접 API 클래스를 만들어서 정수형 배열의 최소값,최대값 구하기

    private MinMaxFinder(){

    }
    public static int findMin(int[] arr){
        int min = arr[0]; // 초기값
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

public class ForLoopTest {
    public static void main(String[] args) {
        //Q. 반복문을 이용하여 알파벳 대문자와 아스키 코드 값을 출력하시오
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + ":" + (int) c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + ":" + (int) c);
        }

        //Q. int[] numbers={1,2,3,4,5,6,7,8,9,10}; 배열 원소를 향상된 for문으로 출력하세요
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        for (int su : numbers){
            System.out.println(su);
        }

        for (int i=1; i<numbers.length; i++){
            System.out.println(i);
        }
    }
}

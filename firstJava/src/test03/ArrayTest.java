package test03;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int arr2[] = new int[10];
        int[] numbers = new int[] {10,20,30}; // 개수 생략해야함
        int[] numbers2 = {10,20,30}; // new int[] 생략 가능

        int[] ids;
        ids = new int[] {10,20,30}; // 선언 후 배열을 생성하는 경우는 new int[] 생략할 수 없음

        int[] arr = new int[10];
        int total = 0;

        for(int i=0, num=1; i< arr.length; i++, num++) {
            arr[i] = num;
        }
        for( int i =0; i<arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);

        int count = 0;
        double[] dArr = new double[5];

        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;
        // int 배열은 - , double은 0.0 객체는 null이 초기값
        double mtotal = 1;
        for(int i = 0; i< dArr.length; i++) {
            mtotal *= dArr[i];
        }

        System.out.println(mtotal);

        char[] alpahbets = new char[26];
        char ch = 'A';

        for(int i = 0; i<alpahbets.length; i++) {

            alpahbets[i] = ch++;
        }
        // 향상된 for문 for(변수:배열)
        for(char alpha : alpahbets) {
            System.out.println(alpha +","+ (int)alpha);
        }
    }
}

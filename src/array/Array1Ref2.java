package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //배열 생성

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        for (int i = 0; i < students.length; i++) { //배열의 길이를 제곻하는 특별한 기능
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }

        System.out.println("구분선==============");
        System.out.println("i + 1 먼저 연산안하면 생기는 일");
        for (int i = 0; i < students.length; i++) { //배열의 길이를 제곻하는 특별한 기능
            // i + 1 먼저 연산안하면 생기는 일
            System.out.println("학생" + i + 1 + " 점수: " + students[i]);
        }
    }
}

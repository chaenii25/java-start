package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        // 밑의 경우엔 new int[] 빠지면 컴파일에러
        students = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}

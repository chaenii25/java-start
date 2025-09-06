package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생 왜? 명시 안 함
        intValue = (int) doubleValue; ///형변환 //반드시 명시 필요, 날라가는 값 (0.5)이 있기 때문임
        System.out.println(intValue);
    }
}

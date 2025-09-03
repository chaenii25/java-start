package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        //연산자 위치에 따라서 실행 시점이 달라지는 것 너무너무중요
        //전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; //a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);
        // 2, 2

        //후위 증감 연산자 사용 예
        a = 1; //a 값을 다시 1로 지정
        b = 0; //b 값을 다시 0으로 지정

        b = a++; //a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b); //결과: a = 2, b = 1
        //2, 1

        ++a;
        System.out.println("a = " + a );
        a++;
        System.out.println("a = " + a);
        //둘의 결과값 같다. 시점이 다를 뿐 이경우에는 증감 연산 하나이므로 결과 같음
    }
}

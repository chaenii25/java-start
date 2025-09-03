package operator;

public class Operator1 {

    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); //출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b; // -> 2.5x 2o 왜? 소숫점 날라감
        System.out.println("a / b = " + div);

        // 수학적으로 0으로 나눌 수가 없다..
        //int z = 10 / 0; //예외발생

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}

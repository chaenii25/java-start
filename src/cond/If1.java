package cond;

public class If1 {

    public static void main(String[] args) {
        int age = 20; //사용자 나이

        if (age >= 18) { // 괄호 안 조건문이 true인지 false인지에 따라 달라짐
            System.out.println("성인입니다.");
        }

        if (age < 18) {
            System.out.println("미성년자입니다.");
        }
    }
}

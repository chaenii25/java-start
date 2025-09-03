package cond;

public class If6 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        // 중복 할인이 안되는 경우
        if (price >= 10000) { //여기서 만족하면 그 다음으로 넘어가지 않음.
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        if(true)
            System.out.println("if문에서 실행됨");
            System.out.println("if문에서 실행안됨");
        //둘다 실행됨 코드블럭없이는 하나의 문장만 실행

        if(false) {
            System.out.println("if문에서 실행됨");
            System.out.println("if문에서 실행안됨");
        }
    }
}

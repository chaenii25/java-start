package cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 1;

        // switch는 단순히 값이 "같은지"만 비교 가능
        // if 처럼 어떠한 조건문 안됨.
        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}

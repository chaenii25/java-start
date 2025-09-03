package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        // 먼저 하고 "그 다음 조건 판단"
        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);
    }
}

package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        long maxIntOver2 = 2147483649L; //int 최고값 + 2(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intValue);

        intValue = (int) maxIntOver; //형변환 //-2147483648
        System.out.println("maxIntOver casting=" + intValue);

        intValue = (int) maxIntOver2; //형변환 //-2147483647
        System.out.println("maxIntOver casting=" + intValue);
    }
}

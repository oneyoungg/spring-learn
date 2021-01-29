package cn.oneyoung;

/**
 * Test
 *
 * @author oneyoung
 * @date 2021/1/29 19:10
 */
public class JavaLogic {
    public static void main(String[] args) {
        int a = -10;
        outBinaryString(a);

        outBinaryString(a >> 1);
        outBinaryString(a >>> 1);
    }

    public static void outBinaryString(int a) {
        System.out.printf("%20d --> ", a);
        print(a);
        System.out.println();
    }

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
    }
}

package binary;

public class BinaryDemo1 {
    public static void main(String[] args) {
        int i = -6;

        System.out.println(Integer.toBinaryString(i));

        System.out.println(Integer.toBinaryString(~i));

        // 3 6 3 6 A
        int n = 0b0011_0110_0011_0110_1010;

        System.out.println(n);

        int num = 0x3636A;

        System.out.println(num);

        System.out.println(Integer.parseInt("3636A",16));

        System.out.println(Integer.toString(222058,16));

        int m = 0xFF;
        System.out.println(Integer.toBinaryString(n&m));

        System.out.println(Integer.toBinaryString((n>>>8) & m ));

        n = 0b1011_0111;
        int k = 0b1001_0001;
        System.out.println(Integer.toBinaryString((n << 8) + (k & 0xFF)));


    }
}

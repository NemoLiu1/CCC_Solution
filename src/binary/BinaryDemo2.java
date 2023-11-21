package binary;

public class BinaryDemo2 {
    public static void main(String[] args) {
        System.out.println(toHexString(-100));
        System.out.println(Integer.toString(-100,8));

    }

    public static String toHexString (int n) {
        char[] digi = "0123456789ABCDEF".toCharArray();
        char[] chs = new char[33];
        boolean nagitive = false;
        if (n < 0) {
            nagitive = true;
            n = -n;
        }

        int i = chs.length;

        do {
            int num = n & 0x7;
            chs[--i] = digi[num];
            n >>>= 3;
        } while (n != 0);

        if (nagitive) {
            chs[--i] = '-';
        }
        return new String(chs,i,chs.length - i);
    }
}

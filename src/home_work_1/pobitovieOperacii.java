package home_work_1;

public class pobitovieOperacii {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c;
        c = ~a;
        System.out.println(c); //a = 42, 42 = 00101010, ответ 10101011 = -43
        c = ~b; //b = 15; 15 = 00001111, ответ 1010000 = -16
        System.out.println(c);
        c = b&a; //a = 42, 42 = 00101010,b = 15; 15 = 00001111, ответ 00001010 = 10
        System.out.println(c);
        b &= a; // a= 42, 42 = 00101010, ответ 00001010 = 10
        System.out.println(b);
        b = 15;
        System.out.println(a + " "  + b + " " + c + " " );
        c = a|b; // a = 42, 42 = 00101010,b = 15; 15 = 00001111,  ответ 00101111 = 47
        System.out.println(c);
        b |= a; // a = 42, 42 = 00101010,b = 15; 15 = 00001111,  ответ 00101111 = 47
        System.out.println(b);
        b = 15;
        c = a^b; // a = 42, 42 = 00101010,b = 15; 15 = 00001111,  ответ 00100101 = 37
        System.out.println(c);
        b ^= a; // a = 42, 42 = 00101010,b = 15; 15 = 00001111, ответ 00100101 = 37
        System.out.println(b);
        b = 15;
        c = b >> 2; // b = 15; 15 = 00001111, 2 = 00000010 ответ 00000011 = 3
        System.out.println(c);
        c = a >> 1; // a = 42, 42 = 00101010, 1 = 00000001 ответ 00010101 = 21
        System.out.println(c);
        b >>= 2; // b = 15; 15 = 00001111, 2 = 00000010 ответ 00000011  = 3
        System.out.println(b);
        b = 15;
        a >>=1; // a = 42, 42 = 00101010, 1 = 00000001 ответ 00010101 = 21
        System.out.println(a);
        a = 42;
        c = b >>> 2; // b = 15; 15 = 00001111, 2 = 00000010 ответ 00000011 =3
        System.out.println(c);
        c = a >>> 1; // a = 42, 42 = 00101010, 1 = 00000001 ответ 00010101 =21
        System.out.println(c);
        c = b << 2; // b = 15; 15 = 00001111, 2 = 00000010 ответ 00111100 = 60
        System.out.println(c);
        c = a << 1; // a = 42, 42 = 00101010, 1 = 00000001 ответ 01010100 = 84
        System.out.println(c);
        b <<= 2; // b = 15; 15 = 00001111, 2 = 00000010 ответ 00111100  = 3
        System.out.println(b);
        b = 15;
        a <<=1; // a = 42, 42 = 00101010, 1 = 00000001 ответ 01010100 = 21
        System.out.println(a);
        a = 42;
        b >>>= 2; // b = 15; 15 = 00001111, 2 = 00000010 ответ 00000011  = 3
        System.out.println(b);
        a >>>=1; // a = -42, 42 = -10101010, 1 = 00000001 ответ 00010101 = 21
        System.out.println(a);
        System.out.println("S minusom");
        a = -42;
        b = -15;
        c = ~a; // a = -42, 42 = -10101010, ответ 00101001 = 41
        System.out.println(c);
        c = ~b; //b = -15; -15 = 10001111, ответ 00001110 = 14
        System.out.println(c);
        c = b&a; // a = -42, 42 = -10101010; b = -15; -15 = 10001111, ответ 10110000 = -48
        System.out.println(c);
        b &= a; // a = -42, 42 = -10101010, ответ 10110000 = -48
        System.out.println(b);
        b = -15;
        c = a|b; // a = -42, 42 = -10101010,b = -15; -15 = 10001111,  ответ 10001001 = -9
        System.out.println(c);
        b |= a; // a = -42, 42 = -10101010,b = -15; -15 = 10001111,  ответ 10001001 = -9
        System.out.println(b);
        b = -15;
        c = a^b; // a = -42, 42 = -10101010,b = -15; -15 = 10001111,  ответ 00100111 = 39
        System.out.println(c);
        b ^= a; // a = -42, 42 = -10101010,b = -15; -15 = 10001111, ответ 00100111 = 39
        System.out.println(b);
        b = -15;
        c = b >> 2; // b = -15; -15 = 10001111, 2 = 00000010 ответ 10000100 = -4
        System.out.println(c);
        c = a >> 1; // a = -42, 42 = -10101010, 1 = 10010101 ответ  = -21
        System.out.println(c);
        b >>= 2; // b = -15; -15 = 10001111, 2 = 00000010 ответ 10000100  = -4
        System.out.println(b);
        b = -15;
        a >>= 1; // a = -42, 42 = -10101010, 1 = 10010101 ответ 00010101 = -21
        System.out.println(a);
        a = -42;
        c = b >>> 2; // b = -15; -15 = 10001111, 2 = 00000010 ответ 1073741820(слишком огромное)
        System.out.println(c);
        c = a >>> 1; // a = -42, 42 = -10101010, 1 = 00000001 ответ 2147483627(слишком огромное)
        System.out.println(c);
        c = b << 2; // b = -15; -15 = 10001111,н 2 = 00000010 ответ 10111100 = -60
        System.out.println(c);
        c = a << 1; // a = -42, 42 = -10101010, 1 = 00000001 ответ 11010100 = -84
        System.out.println(c);
        b <<= 2; // b = -15; -15 = 10001111, 2 = 00000010 ответ 10111100  = -60
        System.out.println(b);
        b = -15;
        a <<=1; // a = -42, 42 = -10101010, 1 = 00000001 ответ 11010100 = -84
        System.out.println(a);
        a = -42;
        b >>>= 2; // b = -15; -15 = 10001111, 2 = 00000010 ответ 00000011  = 1073741820(слишком огромное)
        System.out.println(b);
        a >>>=1; // a = -42, 42 = -10101010, 1 = 00000001 ответ 00010101 = 2147483627(слишком огромное)
        System.out.println(a);
        // double d = 42.5;
        // c = d >> 1; cannot be applied to double,естественно тк побитовые операции производятся над целыми числами.

    }
}

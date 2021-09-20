package a;


public class Ex9Scope {

    // scopul clasei : intr-o clasa pot sta variabile, metode, constructori
    static int q = 10;
    static int r = 20;

    public static int sum(int a, int b) {
        // a si b sunt in scopul metodei
        int c = 30; // este in scopul acestei metode
        return a + b + c + q + r;
    }
    public static void prod(int a, int b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
//        System.out.println(a);  a este doar in scopul metodei sum
        System.out.println(q);
        System.out.println(sum(2,3));
        prod(2, 3);
        int result = sum(2, 5);// imi face calculele , dar nu fac nimic cu ele  ==> scot intr-o variable
        System.out.println(result);
    }
}
class Test{
    static int x = 10; // static-> in scopul clasei
    public static void main(String[] args) {
        if (true) {
            x = 7;
        }
        System.out.println(x); //7

        if (true) {
            int y = 10 + x ;
            System.out.println(y); // 17
        }
    }

}

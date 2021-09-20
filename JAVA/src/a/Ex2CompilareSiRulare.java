package a;

public class Ex2CompilareSiRulare {
    //    Pot defini mai multe clase intr-un fisier: singura clasa publica din fisier este cea care da numele fisierului
    public static void main(String[] args) {
        System.out.println(1/0);
//        nu am probleme la compilare, dar la rulare imi arunca o exceptie ArithmeticException
    }


    class Test {
//        nu o pot face publica
    }

    class A {

    }
}

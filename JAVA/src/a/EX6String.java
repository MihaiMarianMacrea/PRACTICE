package a;

public class EX6String {
    /*
    Stringul nu mai este o primitiva , el e o clasa, nu creem obiecte din ea cu 'new'
     */
    public static void main(String[] args) {
        String firstText = "Hello"; // 1 loc in memorie in Poolul de Stringuri din Heap
        String blank = " ";//alt loc
        String secondText = "Mihai"; // alt loc
        System.out.println(firstText + blank + secondText); // alt loc in memorie

        // cum mai poate fi scris,dar tot nu e eficient
        String text = "Hello"; // 1 loc in memorie
        text += " "; //alt loc
        text += "Mihai"; // un alt loc in memorie
        int a = 10;
        int b = 20;
        int d = 20;
        String c = "salut";
        System.out.println(c + a + b); //"salut" + 10 +20 => salut1020
        System.out.println(a + b + c + d); //30salut20
        System.out.println(a + b +c); //30salut

        String m = "20";
        System.out.println(Integer.parseInt(m) +10);//30 ca numar




    }

}

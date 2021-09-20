package a;

public class Ex5TipuriDeDate {
    public static void main(String[] args) {
        /*
        javascript: -number var x =10.5 ; var t = 'ceva text' ; boolean var t =  true; undifined; NaN; arrayuri si obiecte

        in Java tipurile de date sunt impartite in doua mari categorii: primitive si clase (non-primitive)
        Cum gandim in viata reala : in sistem zecimal 243 = 2*10^2 + 4*10^1 + 3*10^0
        In programare gandim in sistem binar sau in baza 2, cu cifrele 0 si 1 : 0 in baza 2 = 0*2^0; 1 in baza 2 = 1*2^0;
            101 in baza 2 = 1*2^2 + 0*2^1 + 1*2^0;
            In baza 2 , acel 0 sau 1 reprezinta 1 bit;
            Unitatea de masura in Java este byte = 8 bit   Ex. 1byte = 11100101 (8 biti)
            Cel mai mare numar in biti este 11111111 : 2*2^0 + 2*2^1 + 2*2^2 +.....+2*2^7 = 127

            PRIMITIVE:
            boolean -> ocupa 1 bit : poate fi 0 sau 1 , unde 0 e false si 1 e true
            Numeric intreg:
            byte : 8 biti [-128, 127]  [-2^7, 2^7-1]
            short: 16 biti [-32000, 32000]:11111111 11111111
            int: 32 biti 11111111 11111111 11111111 11111111 : [-2mld si ceva, 2mld si ceva]
            long: 64 biti 11111111 11111111 11111111 1111111 111111111 11111111 11111111 11111111 [-2^63, 2^63-1]
            Numeric virgula:
            float : 32 biti
            double: 64 biti

            char : 16biti:[0, 65535]: tine un caracter  char c = 'A';  e singurul loc in care poti scrie cu gilimele simple '
         */

        int x; // Declararea: anunt ca voi avea nevoie de un loc in memorie care sa ocupe cat un int
        x = 5; // Asignare/ Initializare
        int y = 7; // declarare +initializare
        byte b = 100; // in dreapta egalului, cand se uita java, by default este vazut ca un integer
        // 100 este vazut ca integer, dar acel integer incape in marimea byteului
        short s = 1000;
        int c = 2_000_000_000; // 2mld itra in integer
//        long l =4_000_000_000; // tine cont de faptul ca in dreapa el se uita defaul sa fie int si atunci daca il vreau
        //long trebuie sa ii specific asta cu L sau l
        long l = 4_000_000_000L;
        // cum e cu virgula:  default  intre float si double este double
//        float f = 5.33; 5.33 este vazut ca un double care nu intra in float
        float f = 5.33F; //f sau F
        // care e diferenta intre double si float
        System.out.println(1F / 3); //0.33333334
        System.out.println(1D / 3); // precizie este mult mai mare, mai multe zecimale 0.3333333333333333
        char q = 'F';
//        char w = "FF"; nu pot
        char w = '\u03C0';
        System.out.println(w);

//        ALTE OBSERVATII:
//        O1: operatiunile matematice pe intregi fara virgula returneaza un intreg daca e implicata o variabila
        byte b1 = 100;
//        byte b2 = b1+2; // b1+2 => un int
        byte b2 = 3+2;
        byte b3 = (byte)(b1+2); //casting
        float f1 = 7F;
        float f2 = f1-3; // aici NU converteste la double in mod automat
    }
}

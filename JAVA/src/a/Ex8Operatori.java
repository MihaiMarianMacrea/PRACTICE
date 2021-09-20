package a;

public class Ex8Operatori {
    public static void main(String[] args) {
        //comparare  in javascript if(x===3) sau if (x!==3)
        //  in java if(x==3) sau if(x!=3)
        int x = 10;
        int y = 7;

        if (x >= 5 && y < 8) {  // ambele conditii trebuie sa fie indeplinite
            System.out.println("Ceva");
        }

        if (x >= 12 || y < 9) {  // una din cele doua conditii trebuie sa fie indeplinite
            System.out.println("Ceva");
        }
// !!!operatorii pe biti ^, <<, >>, <<<, >>>

        int a = 3;
        int b = 6;
        String text = b / a == 2 ? "Totul este ok" : "Nu e ok"; //ternary operator
        // User gigel = bd.getGigel(); -> pe Gigel poate l-am gasit sau poate nu in baza de date
        // String name =  gigel !null ? gigel.getName() : "Nu l-am gasti in BD";
        // anotherUser.setName(gigel != null ? gigel.getName() : " ");

        // if (gigel != null) {
        //anotherUser.setName(gigel.getName())
        //}else{ anotherUser.setName(" ");}


    }
}

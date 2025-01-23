import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;

        System.out.println("inserire grandezza del vettore");
        n = input.nextInt();
        int[] v = new int[n];

        for (i = 0; i <= n - 1; i++) {
            v[i] = 0;
        }
        System.out.println("ciao e benvenuto nel menù dove puoi gestire i vettori ecco le seguenti istruzioni");
        while (a != x) {
            System.out.println("inserire(in)/ elimina(el)/ ricerca(ri)/ elimina duplicati(ed)/ visualizza(vi)/ esci(x)");
            a = input.nextLine();
            if (a == "in") {
                inserisci();
                if (a == "el") {
                    elimina();
                    if (a == "ri") {
                        ricerca();
                        if (a == "ed") {
                            eliminaDuplicati();
                            if (a == "vi") {
                                Visualizza(v, n);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void elimina(int valore, int posizione) {
        System.out.println("funziona");
    }
    
    public static void eliminaDuplicati(int valore, int posizione) {
        System.out.println("funziona");
    }
    
    public static void inserisci(int valore, int posizione) {
        System.out.println("funzione");
    }
    
    public static void ricerca(int valore, int posizione) {
        System.out.println("funziona");
    }
    
    public static int trovaIlVettore(int[] v, int valore) {
        int i;

        System.out.println("vedere visualizzato");
        for (i = 0; i <= N - 1; i++) {
            System.out.println(v[i]);
        }
        
        return i;
    }
}

import java.util.Scanner;

public class EXO2 {
    public static void main(String[] args) {

        String verbe="";
        do {
            System.out.println("Entrer le verbe à conjuguer : ");
            verbe = EXO1.sc.next();
        }while(!verbe.endsWith("er"));
        String[] tab = {"e","es","e","ons","ez","ent"};
        String[] tab2 = {"je","tu","il/elle","nous","vous","ils/elles"};
        String verbe1 = verbe.substring(0,verbe.length()-2);
        for (int i=0;i<tab.length;i++) {
            System.out.println(tab2[i]+" "+verbe1+tab[i]);
                }

    }
}


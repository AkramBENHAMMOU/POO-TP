
import java.util.Arrays;
import java.util.Scanner;

public class EXO1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

         sc = new Scanner(System.in);

        System.out.println("entrer le nombre des etudiants");
        int nbrEtd = sc.nextInt();
        double[] notes = new double[nbrEtd];
        for (int i = 0; i < nbrEtd; i++) {
            System.out.println("entrer la note de l'etudiant "+(i+1));
            notes[i] = sc.nextDouble();
        }
        Arrays.sort(notes);
        System.out.println("La liste triée des notes est :");
        for (double n : notes){
            System.out.println(n);
        }
        double s=0;
        for (double n:notes ){
            s=s+n;
        }

        System.out.println("La moyenne de la classe est : "+s/nbrEtd);
        System.out.println("le min est "+notes[0] +" \nle max est "+notes[nbrEtd-1]);
        String reponse = "oui";
        while(reponse.equals("oui") || reponse.equals("yes")) {
            System.out.println("entrer la note recherchée : ");
            double noteRecherche = sc.nextDouble();
            int c = 0;
            for (int i = 0; i < nbrEtd; i++) {
                if (notes[i] == noteRecherche) {
                    c++;
                }

            }
            System.out.println("le nombre d'etudiants ayant la note : " + noteRecherche + " est : " + c);
            System.out.println("voulez vous rechercher une autre note : ");
            reponse = sc.next();
        }
        if(reponse.equals("Non")){
            System.out.println("Merci !");
        }

    }


}



public class EXO3 {
    private static  String chaine = "";
    public static void main(String[] args) {
        int choix;
      do {
          System.out.println("Veuillez saisire une option !");
          System.out.println("Saisir une chaîne : appuyez sur 1");
          System.out.println("Afficher la chaîne  : appuyez sur 2");
          System.out.println("Inverser la chaîne : appuyez sur 3");
          System.out.println("Compter le nombre de mots : appuyez sur 4");
          System.out.println("Quitter : appuyez sur 0");
           choix = EXO1.sc.nextInt();
           EXO1.sc.nextLine();
          switch (choix) {
              case 1:
                  saisir();
                  break;
              case 2:
                  afficher();
                  break;
              case 3:
                  inverser();
                  break;
              case 4:
                  compterNbrMots();
                  break;
              case 0:
                  System.out.println("Pas de choix");
                  break;
              default:
                  System.out.println("Réessayer !!");

          }
          if (choix!=0){
              System.out.println("Frappez une touche pour revenir au menu");
              EXO1.sc.nextLine();
          }

      }while(choix!=0);

    }
    public static void saisir(){
        chaine = EXO1.sc.nextLine();
    }
    public static void afficher(){
        if (chaine.length()==0){
            System.out.println("La chine est vide");

        }
        else   System.out.println(chaine);
    }
    public static void inverser(){
        String ch="";
        char[] chaine1 = chaine.toCharArray();
        if (chaine.length()==0) {
            System.out.println("La chaîne est vide");
        }
        for (int i=chaine.length()-1 ; i>=0; i--){
            ch+= chaine1[i];
        }
        System.out.println("La chaine inversée : "+ch);
    }

    public static void compterNbrMots() {
        if (chaine.length()==0) {
            System.out.println("La chaîne est vide");
        }
        int compteur = 0;
        boolean mot = false;
        for (int i = 0; i < chaine.length(); i++) {
            if (chaine.charAt(i) == ' ') {
                mot = false;
            } else {
                if (!mot) {
                    compteur++;
                    mot = true;
                }
            }
        }

        System.out.println("Il y a " + compteur + " mot(s) dans la chaîne");
    }

}


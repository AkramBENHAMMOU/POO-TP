
public class EXO4 {
    public static void main(String[] args) {
        System.out.println("Entrer une chaine :");
        String chaine = EXO1.sc.nextLine().toLowerCase();
        char[] ch = chaine.toCharArray();
        int[] nbr_occurence = new int[26];
        for (int i = 0; i < chaine.length(); i++) {
                if (ch[i]>='a' && ch[i]<='z'){
                    nbr_occurence[ch[i]-'a']++;
                }
            }
        System.out.println("la chaine "+chaine+" contient : ");
        for (int i = 0; i < nbr_occurence.length; i++) {
            if(nbr_occurence[i]==0){
                continue;
            }
            else {
            System.out.println(nbr_occurence[i]+" fois la lettre "+(char)('a'+i));
        }}
        }

    }


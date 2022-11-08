import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random= new Random();
int scorePlayer=0;
int scoreIA=0;


        while (scorePlayer!=3 && scoreIA!=3){
          switch (match(choixJoueur(),random.nextInt(3)+1))
            {
                case 1:
                    scorePlayer++;
                    break;
                case 2:
                    scoreIA++;
                    break;
            }
            System.out.println("Votre score est de"+" "+ scorePlayer + " " + "et le score de l'IA est de"+" " +scoreIA);
        }
        if (scorePlayer==3){
            System.out.println("tu as gagné la partie");
        }
        else {
            System.out.println("tu es un noob");
        }
    }
    public static int choixJoueur () {
        Scanner input = new Scanner(System.in);
        int choix;
        do {
            System.out.println("1 pour pierre");
            System.out.println("2 pour feuille");
            System.out.println("3 pour ciseaux");
            System.out.print("Ton choix :");
            choix= input.nextInt();
        }
        while ( choix>3 || choix<1 );
        return choix;
    }
    public static String selectionDuJoueur( int choix ){
        String objet=null;

        switch (choix){
            case 1:
                objet="pierre";
                break;
            case 2:
                    objet="feuille";
                break;
            case 3:
                    objet="ciseaux";
                break;
        }
        return objet;
    }
    public static int match(int choixJoueur , int choixIA){
        int result =0;

        if (choixJoueur==1 && choixIA==3 || choixJoueur==2 && choixIA==1 || choixJoueur==3 || choixIA==2){
            System.out.println("gagné !!!");
            result=1;
        } else if (choixJoueur == choixIA) {
            System.out.println("égalité");
            result=0;
        }
        else {
            System.out.println("perdu !");
            result=2;
        }
        return result;
    }
}
import java.util.Arrays;
import java.util.Random;

public class FullOccurrenceCount {
    public static void main(String[] args) {
        // Taille du tableau
        int tailleTableau = 20;

        // Création d'un tableau d'entiers et d'un tableau pour compter les occurrences
        int[] tableau = new int[tailleTableau];
        int[] occurrences = new int[tailleTableau];

        // Remplissage aléatoire du tableau
        remplirTableauAleatoirement(tableau);

        // Affichage du tableau original
        System.out.println("Tableau original : " + Arrays.toString(tableau));

        // Comptage des occurrences
        compterOccurrences(tableau, occurrences);

        // Affichage du nombre d'occurrences pour chaque élément
        for (int i = 0; i < tailleTableau; i++) {
            if (occurrences[i] > 0) {
                System.out.println("Occurrence de " + tableau[i] + " : " + occurrences[i]);
            }
        }
    }

    // Méthode pour remplir le tableau avec des entiers aléatoires
    private static void remplirTableauAleatoirement(int[] tableau) {
        Random random = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(10); // Vous pouvez ajuster la plage des entiers selon vos besoins
        }
    }

    // Méthode pour compter les occurrences de chaque élément dans le tableau
    private static void compterOccurrences(int[] tableau, int[] occurrences) {
        for (int i = 0; i < tableau.length; i++) {
            occurrences[tableau[i]]++;
        }
    }
}

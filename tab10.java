 // Méthode pour remplir le tableau avec des entiers aléatoires
    public static void remplirTableauAleatoirement(int[] tableau) {
        Random random = new Random();
        for (int i = 0; i < tableau.lengt; i++) {
            tableau[i] = random.nextInt(10); 
        }
    }

    // Méthode pour compter les occurrences de chaque élément dans le tableau
    public static void compterOccurrences(int[] tableau, int[] occurrences) {
        for (int i = 0; i < tableau.length; i++) {
            occurrences[tableau[i]]++;
        }
    }
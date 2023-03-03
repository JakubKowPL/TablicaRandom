package pl.jakubkow.nauka.dziedziczenie;

public class Sorter {
    void sortuj(int[] tablica) {
        int a, b, t;
        for (a = 1; a < tablica.length; a++)
            for (b = tablica.length - 1; b >= a; b--) {
                if (tablica[b - 1] > tablica[b]) { // If the elements are not sorted correctly, switches the elements
                    t = tablica[b - 1];
                    tablica[b - 1] = tablica[b];
                    tablica[b] = t;
                }
            }
    }
}

package pl.jakubkow.nauka.dziedziczenie;

class TablicaRandom {
    public static void main(String[] args) {
// 1. Creating table
        int size = 100; // Number of elements to sort
        int[] tablica = new int[size];
        for (int i = 0; i < tablica.length; i++)
            tablica[i] = (int) (Math.random() * 1001); //picks random values <0;1000>

// 2. Shows random table
        System.out.print("Unsorted table:");
        for(int i=0; i < tablica.length; i++)
            System.out.print(" " + tablica[i]);
        System.out.println();

// 3. sorting the table
        Sorter sorter = new Sorter();
        sorter.sortuj(tablica);
// 4. Shows sorted table
        System.out.print("Sorted table:");
        for(int i=0; i < size; i++)
            System.out.print(" " + tablica[i]);
        System.out.println();
    }
}
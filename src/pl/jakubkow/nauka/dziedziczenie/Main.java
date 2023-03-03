class TablicaRandom {
    public static void main(String args[]) {
        int tablica[] = new int[100];
        for (int i = 0; i < tablica.length; i++)
            tablica[i] = (int) (Math.random() * 1001); //picks random values <0;1000>
        int a, b, t;
        int size;
        size = 100; // Number of elements to sort
// Shows random table
        System.out.print("Unsorted table:");
        for(int i=0; i < size; i++)
            System.out.print(" " + tablica[i]);
        System.out.println();
// sorting the table
        for(a=1; a < size; a++)
            for(b=size-1; b >= a; b--) {
                if(tablica[b-1] > tablica[b]) { // If the elements are not sorted correctly, switches the elements
                    t = tablica[b-1];
                    tablica[b-1] = tablica[b];
                    tablica[b] = t;
                }
            }
// Shows sorted table
        System.out.print("Sorted table:");
        for(int i=0; i < size; i++)
            System.out.print(" " + tablica[i]);
        System.out.println();
    }
}
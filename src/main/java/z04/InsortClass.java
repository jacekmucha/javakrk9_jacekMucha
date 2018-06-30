package z04;

import java.util.List;

public class InsortClass {

    public static void insort(int[] tab) {
        int n = tab.length;
        //dla kazdego elementu z czesci nieposortowanej
        for (int i = 1; i < n; i++) {
            //wstawiamy ity element do czesci posortowanej
            for (int j = i; j > 0; j--) {  //na poczatku j jest indeksem wstawianego elemntu ale tez jest uzywany przy przesuwaniu
                if (tab[j - 1] > tab[j]) {  //tab[j] jednoczesnie wstawiany i przesuwany element
                    //zamiana elementow miejscami
                    int temp = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }

    public static <T extends Comparable> void insortGen(List<T> list) {

        int n = list.size();

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (list.get(j - 1).compareTo(list.get(j)) < 0) {

                    T temp = list.get(j - 1);
                    list.get(j - 1).equals(list.get(j));
                    list.get(j).equals(temp);
                }
            }
        }
    }

    private static <T extends Comparable> void qs(T[] tab, int b, int e) {

        int i = b, j = e;
        int s = (b+e)/2;

        T v; //wartość elementu dzielącego
        v = tab[s];


        while(i < j ) {
            //podział: elementy <= v > elementy
            //te elementy z lewej częśi tablicy, które są jako comparableTo <= od v zostawiamy
            while (tab[i].compareTo(v) < 0) {
                i++;
            }
            while (tab[j].compareTo(v) > 0) {
                j--;
            }

            //jeśli dojdzie do takiej sytuacji, ze i jest < j => natrafiamy na pare do zamiany
            if (i<j){ // upewniamy się, czy jest sens zamiany miejscami
                T temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;
                i++;
                j--;
            } else {
                return;
            }
        }

        //upewniamy sie, czy jest sens dalej sortowac - bo nie ma sensu sortowac zakresu 1-elementowego
        if(b<j)
            qs(tab, b, j); //lewa czesc sortowana rekurencyjnie
        if(i<e)
            qs(tab, i, e); //prawa czesc sortowana rekurencyjnie

    }

    public static <T extends Comparable> void quicksort(T[] tab) {
        qs(tab, 0, tab.length - 1);
    }


}



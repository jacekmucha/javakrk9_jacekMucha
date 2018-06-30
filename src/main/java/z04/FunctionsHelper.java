package z04;

public class FunctionsHelper {

    @FunctionalInterface
    public interface FunctionTemplate {

        public double f(double x); // schemat na postać funkcji lambda: h->h, h->2*h
    }


    /*
    zwraca indeks elementu w vals, jesli ten element jest miejscem zerowym funkcji f, w.p.w zwraca -1
    założenia: vals jest posortowana rosnąco, f jest rosnąca

    vals[-2,-1,0,1,2,3, f(x) = x -1;

    stosujemy technike "dziel i zwyciezaj"

     */

    public static  int zero (double[]vals, FunctionTemplate h){
    //wersja iteracyjna

    int i = 0;
    int j = vals.length-1;

    while(i<=j){
        int s = (i+j)/2;
        double value = vals[s];
        if(h.f(value)==0){
            return s;
        }
        if (value > 0){
            j = s-1;
        }
        if (value < 0) {
            i = s+1;
        }
    }
    return -1;
    }
}

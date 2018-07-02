package z06;

public class ArythmeticalHelper {

    private ArythmeticalHelper(){
        //prywatny konstruktor, na pewn nie bedzie mozna utworzyc obiektu tej klasy
    }

    public static Double sum(Double x, Double y){
        return x + y;
    }

    public static Double multiplication(Double x, Double y){
        return x * y;
    }

    public static Double difference (Double a, Double b){
        return a-b;
    }

    public static Double maxAbsValue (Double x, Double y){
        return Math.max(Math.abs(x), Math.abs(y));
    }

}

package z05;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaExamples {

    //[abc, xyz, abc, www] -> (abc, 2), (xyz, 1), (www, 1)
    private static Map<String, Long> counter(List<String> words){
        return words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
    }

    private static Map<Double, Double> reportWskaznikiNaFunkcje(List<Double> data) {
        return data.stream().collect(
                Collectors.groupingBy(
                        Double::doubleValue, Collectors.summingDouble(Double::doubleValue)
                )
        );
    }


    private static Map<Double, Double> reportLambda(List<Double> data) {
        return data.stream().collect(
                Collectors.groupingBy(
                       x->x.doubleValue(), Collectors.summingDouble(x->x.doubleValue())
                )
        );
    }



    private static void demo2(){
        System.out.println(counter(Arrays.asList("abc", "xyz", "abc", "www")));
    }

    private static void lambdaTestStandard(List<Integer> list){
        long timeBefore = System.currentTimeMillis();

        int result = list.stream().reduce((x,y) -> x+y).get();

        long timeAfter = System.currentTimeMillis();
        long timeResult = timeAfter - timeBefore;
        System.out.println(String.format("Wynik lambdaTestStandard = %d w czasie %d", result, timeResult));

    }

    private static void lambdaTestParallelStream(List<Integer> list){
        long timeBefore1 = System.currentTimeMillis();

        // przetwarzanie równoległe na wielu wątkach
        int result = list.parallelStream().reduce((x,y) -> x+y).get();

        long timeAfter1 = System.currentTimeMillis();
        long timeResult1 = timeAfter1 - timeBefore1;
        System.out.println(String.format("Wynik lambdaTestParallelStream = %d w czasie %d", result, timeResult1));

    }


    private static String concatAbs(List<Integer> list){

        StringBuilder sb = new StringBuilder();

        list.stream().map(x -> Math.abs(x)).forEach(x -> sb.append(x).append(" "));
        return sb.toString();
    }


    public static void main(String[] args) {
        List<String> words = Arrays.asList("test1", "materia", "wwwwww", "statek", "traktat");

        //wzorzec projektowy "fluent interface"
           words.stream()
                   .filter(x -> x.contains("te"))
                   .map(x -> x.substring(0, 3))
                   .map(x -> x.toUpperCase()) //ta funkcja "map" zmienia wartości
                   .sorted() //compareTo z klasy String
                   .forEach(x -> {System.out.println(x);}
                        );


        List<Integer> vals2 = Arrays.asList(-2, 30, 15, -8, 16);

        vals2.stream()
                .filter(x -> x < 0)
                .map(x -> x = Math.abs(x))
                .forEach(System.out::println);

        List<String> list = Arrays.asList("2.3", "1.2", "2.3");

        System.out.println(list.stream().map(x -> Double.parseDouble(x)).reduce((x, y) -> x + y).get());
        System.out.println(" ");
        System.out.println(concatAbs(Arrays.asList(2, -1, 0, 2, -3)));

//        List<Integer> listPar = new ArrayList<>();
//        final Random ran = new Random();
//        final int MAX = 90000000;
//        for(int i = 0; i<=MAX;i++){
//            listPar.add(ran.nextInt(1000));
//        }

//        lambdaTestStandard(listPar);
//        lambdaTestParallelStream(listPar);

        demo2();

        System.out.println(reportWskaznikiNaFunkcje(Arrays.asList(1.0, 1.0, 2.0, 9.0, 9.0, 9.0, 3.0, 5.5)));
        System.out.println(reportLambda(Arrays.asList(1.0, 1.0, 2.0, 9.0, 9.0, 9.0, 3.0, 5.5)));
    }


}

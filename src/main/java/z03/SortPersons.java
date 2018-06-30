package z03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortPersons {


    public static <T extends Comparable> T min(List<T> list) throws InvalidArgumentException {

        T min = list.get(0);

        if(list == null || list.size() == 0) {
            throw new InvalidArgumentException("invalid argument");

        }

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).compareTo(min) < 0){
                min = list.get(i);
            }
        }
        return min;
    }

public static void insert(int[]tab){
        int n =tab.length;
        for (int i = 1; i< n; i++){
            for(int j = i; j > 0; j--){
                if(tab[j-1] > tab[j]){
                    int temp = tab[j-1];
                    tab [j-1] = tab[j];
                    tab[j] = temp;
                }
            }
    }
}



    public static void main(String[] args) throws InvalidArgumentException {

        List<Person> persons = new LinkedList<>();
        persons.add(new Person(3L,"abc.super.pl"));
        persons.add(new Person(2L, "asda@dasd.pl"));
        persons.add(new Person(1L, "eee2@asdas.pl"));

        Collections.sort(persons);
        System.out.println(persons);

//        List<Person> listToCompare = new ArrayList<>();
//        listToCompare.add(new Person(9L,"aaa");
//        listToCompare.add(new Person(8L,"bbb");
//        listToCompare.add(new Person(7L,"ccc");
//        listToCompare.add(new Person(6L,"ddd");
//        listToCompare.add(new Person(5L,"eee");
//        listToCompare.add(new Person(4L,"fff");
//        listToCompare.add(new Person(3L,"ggg");
//        listToCompare.add(new Person(2L,"hhh");
//        listToCompare.add(new Person(1L,"iii");


//        System.out.println(min(listToCompare));

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("aaaa");
        list.add("bbbb");
        list.add("ello");
        Collections.sort(list, (x,y) -> {return -x.compareTo(y);});

        System.out.println(list);

    }



}

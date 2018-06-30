package z05.gc_singleNumber;

public class SingleNumber {

    private Integer id;

    public SingleNumber(Integer id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(String.format("Obiekt klasy SingleNumber o id = %d został zrobiony", id));
    }
}

package z05;

public class Box extends Object{

    private String value;

    public Box(String value){
        this.value = value;
    }

    @Override
    protected void finalize(){
        System.out.println(String.format("Box with value %s is removing now by GC", value));

    }
}

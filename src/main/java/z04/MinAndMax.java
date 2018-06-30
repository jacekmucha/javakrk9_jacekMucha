package z04;

public class MinAndMax <T> implements Comparable {

 public T min;
 public T max;

    public MinAndMax(T min, T max) {
        this.min = min;
        this.max = max;
    }

    public T getMin() {
        return min;
    }

    public void setMin(T min) {
        this.min = min;
    }

    public T getMax() {
        return max;
    }

    public void setMax(T max) {
        this.max = max;
    }

    @Override
    public int compareTo(Object o) {

        MinAndMax x = (MinAndMax)o;

        return (int)o;
    }


}

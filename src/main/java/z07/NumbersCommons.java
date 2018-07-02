package z07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersCommons {

    public static Double minPositive(List<Double> nums) throws IncorrectArgumentException {
        List<Double> positiveNumb = new ArrayList<>();

        if(Collections.max(nums) < 0){
            throw new IncorrectArgumentException();
        }

        for (Double el : nums) {
            if (el >= 0) {
                positiveNumb.add(el);
            }
        }
        return Collections.min(positiveNumb);
    }

    public static Double sum(List<Double> nums, int begin, int end) throws IncorrectArgumentException {

        Double counter = 0D;

        if(nums.size() == 0){
            throw new IncorrectArgumentException();
        }

        while(begin <= end){
            counter += nums.get(begin).doubleValue();
            begin++;
        }
        return counter;

    }
}

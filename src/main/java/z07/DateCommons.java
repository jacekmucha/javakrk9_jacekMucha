package z07;

public class DateCommons {

    public static boolean dateVer(int date){
         //trzeba użyć regexów i sprawdzac date na stringach a nie na liczbach...

        Integer dateInt = date;
        String dateString = dateInt.toString();

        String year = dateString.substring(0, 3);
        String month = dateString.substring(4,5);
        String day = dateString.substring(6,7);

        int yearInt = Integer.parseInt(year);
        int monthInt = Integer.parseInt(month);
        int dayInt = Integer.parseInt(day);


        if(dateString.length() == 8 && date > 0 && yearInt > 0 && monthInt > 0 && monthInt != 2 &&monthInt
                <= 12 && dayInt > 0 && dayInt <= 31){
            return true;

        }
        return false;
    }
}

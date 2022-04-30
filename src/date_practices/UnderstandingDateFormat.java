package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class UnderstandingDateFormat {
    public static void main(String[] args) {


        Date currentDate = new Date();

        System.out.println(currentDate); //Sat Apr 30 08:13:53 MST 2022

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Today's date " + sdf.format(currentDate));


        System.out.println(new SimpleDateFormat("EEEE hh:mm a").format(currentDate));//Saturday 08:31 AM


        System.out.println(new SimpleDateFormat("EEEE").format(currentDate)); // Saturday
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate)); // 2022
        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(currentDate)); //



    }
}

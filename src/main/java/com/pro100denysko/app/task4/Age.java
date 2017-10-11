package com.pro100denysko.app.task4;

import lombok.Data;
import org.joda.time.DateTime;
import org.joda.time.Days;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Data
public class Age {

    private String dateOfBirth;
    private int ageInDays;

    String localDate = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public void dateOfBirth() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Put your date of birth in dd.MM.yyyy");
            dateOfBirth = sc.nextLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public int ageInDays() {
        try {
            Date date1 = format.parse(dateOfBirth);
            Date date2 = format.parse(localDate);
            DateTime dt1 = new DateTime(date1);
            DateTime dt2 = new DateTime(date2);

            ageInDays = Days.daysBetween(dt1, dt2).getDays();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ageInDays;
    }

    public int ageInMonths() {
        int ageInMonths = ageInDays / 31;
        return ageInMonths;
    }

    public String dayOfWeekOfBirth() {
        String dayOfWeek = new String();
        try {
            Date date = format.parse(dateOfBirth);
            DateTime dt = new DateTime(date);
            int dayOfWeekOfBirth = dt.getDayOfWeek();

            List<String> listOfDays = new ArrayList<>();
            listOfDays.add("Monday");
            listOfDays.add("Tuesday");
            listOfDays.add("Wednesday");
            listOfDays.add("Thursday");
            listOfDays.add("Friday");
            listOfDays.add("Saturday");
            listOfDays.add("Sunday");

            dayOfWeek = listOfDays.get(dayOfWeekOfBirth - 1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dayOfWeek;
    }
}

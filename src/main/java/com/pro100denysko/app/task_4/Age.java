package com.pro100denysko.app.task_4;

import lombok.Data;
import org.joda.time.DateTime;
import org.joda.time.Days;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public
@Data
class Age {

    private String age;
    String dateOfBirth;
    int ageInDays = 0;

    String localDate = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    public void dateOfBirth() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Put your date of birth");
            dateOfBirth = sc.nextLine();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void ageInDays() {

        try {
            Date date1 = format.parse(dateOfBirth);
            Date date2 = format.parse(localDate);

            DateTime dt1 = new DateTime(date1);
            DateTime dt2 = new DateTime(date2);

            ageInDays = Days.daysBetween(dt1, dt2).getDays();
            System.out.println("Your age in days = " + ageInDays);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public void ageInMonths() {
        int ageInMonths = ageInDays / 31;
        System.out.println("Your age in months = " + ageInMonths);
    }
}

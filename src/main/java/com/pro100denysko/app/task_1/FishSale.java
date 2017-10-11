package com.pro100denysko.app.task_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.joda.time.DateTime;
import org.joda.time.Days;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@AllArgsConstructor
public class FishSale {

    private String nameOfFish;
    private double priceOfPurchase;
    private String dateOfPurchase;
    private double priceOfSale;
    private String dateOfSale;
    private double saleWeight;
    private double overhead;

    public double incomeStatement(FishSale fish) {
        double income = (fish.getPriceOfSale() - fish.priceOfPurchase - fish.storeDays(fish.getDateOfPurchase(), fish.getDateOfSale()) * fish.getOverhead())
                * fish.getSaleWeight();
        return income;
    }


    public int storeDays(String dateOfPurchase, String dateOfSale) {
        this.dateOfPurchase = dateOfPurchase;
        this.dateOfSale = dateOfSale;

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        int storeDays = 0;
        try {
            Date date1 = format.parse(dateOfPurchase);
            Date date2 = format.parse(dateOfSale);

            DateTime dt1 = new DateTime(date1);
            DateTime dt2 = new DateTime(date2);

            storeDays = Days.daysBetween(dt1, dt2).getDays();

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return storeDays;
    }
}
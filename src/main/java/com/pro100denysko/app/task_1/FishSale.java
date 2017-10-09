package com.pro100denysko.app.task_1;

import org.joda.time.DateTime;
import org.joda.time.Days;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FishSale {

    /*1.	Given an array of objects which contains information about one operation of fish sale
            (name of fish, price of purchase (PP), date of purchase, price of sale(PS), date of sale, sale weight (W))

    Create an Income Statement grouped by fish names. Income value is calculated as:
    Income = (PS – PP – store_days*const) * W
    Here const is some value that contains overheads*/

    private String nameOfFish;
    private double priceOfPurchase;
    // private GregorianCalendar dateOfPurchase;
    private String dateOfPurchase;
    private double priceOfSale;
    //private GregorianCalendar dateOfSale;
    private String dateOfSale;
    private double saleWeight;
    private double overhead;

    public FishSale(String nameOfFish, double priceOfPurchase, String dateOfPurchase, double priceOfSale, String dateOfSale, double saleWeight, double overhead) {
        this.nameOfFish = nameOfFish;
        this.priceOfPurchase = priceOfPurchase;
        this.dateOfPurchase = dateOfPurchase;
        this.priceOfSale = priceOfSale;
        this.dateOfSale = dateOfSale;
        this.saleWeight = saleWeight;
        this.overhead = overhead;
    }

    public double incomeStatement(FishSale fish) {
        double income = (fish.getPriceOfSale() - fish.priceOfPurchase - fish.storeDays(fish.getDateOfPurchase(), fish.getDateOfSale()) * fish.getOverhead()) * fish.getSaleWeight();
        return  income;
    }


    public int storeDays(String dateOfPurchase, String dateOfSale) {
        this.dateOfPurchase = dateOfPurchase;
        this.dateOfSale = dateOfSale;

        SimpleDateFormat format = new SimpleDateFormat("MM.dd.yyyy");
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


    public String getNameOfFish() {
        return nameOfFish;
    }

    public void setNameOfFish(String nameOfFish) {
        this.nameOfFish = nameOfFish;
    }

    public double getPriceOfPurchase() {
        return priceOfPurchase;
    }

    public void setPriceOfPurchase(double priceOfPurchase) {
        this.priceOfPurchase = priceOfPurchase;
    }


    public double getPriceOfSale() {
        return priceOfSale;
    }

    public void setPriceOfSale(double priceOfSale) {
        this.priceOfSale = priceOfSale;
    }


    public double getSaleWeight() {
        return saleWeight;
    }

    public void setSaleWeight(double saleWeight) {
        this.saleWeight = saleWeight;
    }

    public double getOverhead() {
        return overhead;
    }

    public void setOverhead(double overhead) {
        this.overhead = overhead;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(String dateOfSale) {
        this.dateOfSale = dateOfSale;
    }
}

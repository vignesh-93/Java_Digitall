/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.learn.jdbc;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author HP
 */
public class DateDemo {
    
    public static void main(String[] args) {
        DayOfWeek d1 = DayOfWeek.SUNDAY;
        System.out.println(d1);
        System.out.println(d1.getValue());
        DayOfWeek d2 = DayOfWeek.MONDAY;
        System.out.println(d2);
        System.out.println(d2.getValue());
    }
    
    public static void main7(String[] args) {
        Month m1 = Month.MARCH;
        System.out.println(m1.getValue());
        System.out.println(m1);
    }
    
    public static void main6(String[] args) {
        Year y1 = Year.now();
        Year y2 = Year.of(2020);
        Year y3 = Year.parse("1998");
        Year y4 = Year.parse("1999", DateTimeFormatter.ofPattern("yyyy"));
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y4);
    }
    
    public static void main5(String[] args) {
        MonthDay m1 = MonthDay.now();
        MonthDay m2 = m1.withMonth(4);
        MonthDay m3 = MonthDay.of(8, 1);
        MonthDay m4 = MonthDay.parse("--04-20");
        MonthDay m5 = MonthDay.parse("23/06", DateTimeFormatter.ofPattern("dd/MM"));
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
    }
    
    public static void main4(String[] args) {
        YearMonth e1 = YearMonth.now();
        YearMonth e2 = e1.withMonth(9);
        YearMonth e3 = YearMonth.of(2030, 12);
        
        YearMonth e5 = YearMonth.parse("2014-03");
        YearMonth e6 = YearMonth.parse("03/2024", DateTimeFormatter.ofPattern("MM/yyyy"));
       
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e5);
        System.out.println(e6);
    }
    
    public static void main3(String[] args) {
//        LocalDate d1 = new LocalDate();
          LocalDate d1 = LocalDate.now();
          System.out.println(d1);
          d1.withYear(2022);
          LocalDate d2 = d1.withYear(2022);
          System.out.println(d2);
          LocalDate d3 = d2.withDayOfYear(363);
          System.out.println(d3);
          LocalDate d4 = d3.withDayOfMonth(22);
          System.out.println(d4);
          LocalDate d5 = LocalDate.of(2022, 10,22);
          System.out.println(d5);
          LocalDate d6 = LocalDate.parse("2025-08-15");
          System.out.println(d6);
          LocalDate d7 = LocalDate.parse("26012025",DateTimeFormatter.ofPattern("ddMMyyyy"));
          System.out.println(d7);
          
    }
    
    public static void main2(String[] args) {
//        Calendar c1 = new Calendar();
        Calendar c1 =Calendar.getInstance();
//        System.out.println(c1);
//        System.out.println(c1.get(Calendar.HOUR));
//        System.out.println(c1.get(Calendar.HOUR_OF_DAY));
//        System.out.println(c1.get(Calendar.YEAR));
//        System.out.println(c1.get(Calendar.DAY_OF_MONTH));
//        System.out.println(c1.getTime());
        
        Date d1 = c1.getTime();
        System.out.println("*");
//        c1.set(Calendar.DAY_OF_YEAR, c1.get(Calendar.DAY_OF_YEAR)+100);
        c1.set(Calendar.MONTH, c1.get(Calendar.MONTH)+8);
//        System.out.println(d1 +" ,"+ c1);
//        System.out.println(c1);
        System.out.println(c1.getTime());
        System.out.println(d1);
    }
    
    public static void main1(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println(d1.getTime());
        Date d2 = new Date(0);
        System.out.println(d2);
        System.out.println(d1);
        
    }
    
}

//LocalTime
//LocalDateTime
//ZonedDateTime - Zoneid,ZoneOffset
//OffsetDateTime
//OffsetTime
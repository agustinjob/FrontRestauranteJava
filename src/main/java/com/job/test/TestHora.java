/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author agus_
 */
public class TestHora {

    public static void main(String[] Job) {
        TimeZone timeZone = TimeZone.getTimeZone("Europe/Amsterdam");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 06, 29, 8, 30);
        calendar.setTimeZone(timeZone);

        // get calendar using fields
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("The actual date is: " + formatter.format(calendar.getTime()));
        System.out.print("The date in " + timeZone.getID() + " is: ");
        System.out.print(" Day:" + dayOfMonth);
        System.out.print(" Month:" + (month + 1)); // base zero
        System.out.print(" Year:" + year);
        System.out.print(" Hour:" + hourOfDay);
        System.out.print(" Min:" + minute);
        System.out.print(" Sec:" + second);

        System.out.println();
        
        
      
      calendar.setTime(new Date()); // Configuramos la fecha que se recibe
      calendar.add(Calendar.HOUR, -6);  // numero de horas a añadir, o restar en caso de horas<0
	
      calendar.getTime();
    }
}

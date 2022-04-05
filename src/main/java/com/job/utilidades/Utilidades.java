/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.utilidades;

import com.job.dialogos.Alerta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author agus_
 */
public class Utilidades {

    static Alerta confirma = new Alerta();
    static DateFormat formatoCompleto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     static Calendar calendar = Calendar.getInstance();

    public static void mensajePorTiempo(String men) {
        confirma.setMensaje(men);
        confirma.setVisible(true);

        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirma.dispose();

            }

        });

        timer.setRepeats(false);
        timer.start();
    }

    public static String getFechaStringCompleto(Date date) {

        String fecha = formatoCompleto.format(date);
        System.out.println(fecha);
        return fecha;
    }

    public static Date getStringToDate(String d) {
        try {
            Date da = formatoCompleto.parse(d);
            return da;
        } catch (ParseException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Date convertirFecha(Date date) {
        String f = getFechaStringCompleto(date);
        return getStringToDate(f);
    }
    
       public static Date fechaRestada(){

        calendar.setTime(new Date()); // Configuramos la fecha que se recibe
        calendar.add(Calendar.HOUR, -6);  // numero de horas a añadir, o restar en caso de horas<0
        return calendar.getTime();
    }
       
          public static Date fechaRestadaFechaEspecifica(Date d){

        calendar.setTime(d); // Configuramos la fecha que se recibe
        calendar.add(Calendar.HOUR, -6);  // numero de horas a añadir, o restar en caso de horas<0
       String f=  getFechaStringCompleto(calendar.getTime());
       Date da= getStringToDate(f);
       return da;
    }
}

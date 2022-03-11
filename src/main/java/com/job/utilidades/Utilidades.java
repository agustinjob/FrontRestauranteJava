/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.utilidades;

import com.job.dialogos.Alerta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author agus_
 */
public class Utilidades {
  static Alerta confirma = new Alerta();
  
        public static void mensajePorTiempo(String men) {
        confirma.setMensaje(men);
        confirma.setVisible(true);

        Timer timer = new Timer(4000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirma.dispose();

            }

        });

        timer.setRepeats(false);
        timer.start();
    }
}

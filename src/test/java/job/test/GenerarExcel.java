/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package job.test;

import com.job.modelos.CorteModel;
import com.job.modelos.Datos;
import com.job.modelos.Gastos;
import com.job.response.ResponseDatos;
import com.job.rest.consumo.ConsumoApi;
import com.job.utilidades.GeneradorExcel;
import com.job.utilidades.Utilidades;
import java.util.List;

/**
 *
 * @author agus_
 */
public class GenerarExcel {
    public static void main(String [] Job){
   // ResponseDatos<CorteModel> res = ConsumoApi.corte("http://localhost:8082/v1/cuentas-corte-model/62452b17ae3d195440c0cc90", null, "GET");
    ResponseDatos<Gastos> res= ConsumoApi.gastos("http://localhost:8082/v1/gastos/62452b17ae3d195440c0cc90/Salidas", null, "GET");
      ResponseDatos<Gastos> res2= ConsumoApi.gastos("http://localhost:8082/v1/gastos/62452b17ae3d195440c0cc90/Entradas", null, "GET");
      
     List<Gastos> salidas= res.getDatos();
     List<Gastos> entradas= res2.getDatos();
     GeneradorExcel.writeExcelReporteMovimientos(entradas, salidas);
   //GeneradorExcel.writeExcel(res.getDatos().get(0));
    }
}


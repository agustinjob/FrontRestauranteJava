/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.utilidades;

import com.job.modelos.CorteModel;
import com.job.modelos.Gastos;
import com.job.modelos.Producto;
import com.job.modelos.ReporteCancelados;
import com.job.modelos.ReporteVendidos;
import com.job.modelos.ReporteCategoria;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

/**
 *
 * @author agus_
 */
public class GeneradorExcel {

    public static void writeExcel(CorteModel corte) {

        FileOutputStream file = null;
        Desktop dt = Desktop.getDesktop();

        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
            workbook.setSheetName(0, "Corte");
            CellStyle headerStyle = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setBold(true);
            headerStyle.setFont(font);
            CellStyle style = workbook.createCellStyle();
            style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            //Creamos fila
            HSSFRow dataRow = sheet.createRow(0);
            dataRow.createCell(6).setCellValue(corte.getNegocio());

            dataRow = sheet.createRow(2);
            dataRow.createCell(4).setCellValue("Dirección:");
            dataRow.createCell(5).setCellValue(corte.getDireccion());

            dataRow = sheet.createRow(4);
            dataRow.createCell(4).setCellValue("RFC:");
            dataRow.createCell(5).setCellValue(corte.getRfc());

            dataRow = sheet.createRow(6);
            dataRow.createCell(5).setCellValue("CORTE DE CAJA");

            dataRow = sheet.createRow(8);
            dataRow.createCell(3).setCellValue("DEL " + corte.getApertura());
            dataRow.createCell(6).setCellValue(corte.getCierre());

            dataRow = sheet.createRow(10);
            dataRow.createCell(6).setCellValue("CAJA");

            dataRow = sheet.createRow(12);
            dataRow.createCell(4).setCellValue("+ EFECTIVO INICIAL =");
            dataRow.createCell(7).setCellValue(corte.getFondoInicial());

            dataRow = sheet.createRow(13);
            dataRow.createCell(4).setCellValue("+ EFECTIVO =");
            dataRow.createCell(7).setCellValue(corte.getEfectivo());

            dataRow = sheet.createRow(14);
            dataRow.createCell(4).setCellValue("+ TARJETA =");
            dataRow.createCell(7).setCellValue(corte.getTarjeta());

            dataRow = sheet.createRow(15);
            dataRow.createCell(4).setCellValue("+ DEPOSITOS EN EFECTIVO =");
            dataRow.createCell(7).setCellValue(corte.getDepositoEfectivo());

            dataRow = sheet.createRow(16);
            dataRow.createCell(4).setCellValue("- RETIROS EN EFECTIVO =");
            dataRow.createCell(7).setCellValue(corte.getRetirosEfectivo());

            dataRow = sheet.createRow(17);
            dataRow.createCell(4).setCellValue("- PROPINAS PAGADAS =");
            dataRow.createCell(7).setCellValue(corte.getPropinasPagadas());

            dataRow = sheet.createRow(19);
            dataRow.createCell(4).setCellValue("EFECTIVO FINAL =");
            dataRow.createCell(7).setCellValue(corte.getEfectivoFinal());

            dataRow = sheet.createRow(21);
            dataRow.createCell(4).setCellValue("FORMA DE PAGO VENTAS");

            dataRow = sheet.createRow(23);
            dataRow.createCell(4).setCellValue("EFECTIVO =");
            dataRow.createCell(7).setCellValue(corte.getTipoPagoEfectivo());
            dataRow = sheet.createRow(24);
            dataRow.createCell(4).setCellValue("VISA =");
            dataRow.createCell(7).setCellValue(corte.getTipoPagoVisa());
            dataRow = sheet.createRow(25);
            dataRow.createCell(4).setCellValue("MASTER CARD =");
            dataRow.createCell(7).setCellValue(corte.getTipoPagoMasterCard());
            dataRow = sheet.createRow(26);
            dataRow.createCell(4).setCellValue("AMERICAN EXPRESS =");
            dataRow.createCell(7).setCellValue(corte.getTipoPagoAmerican());
            dataRow = sheet.createRow(28);
            dataRow.createCell(3).setCellValue("TOTAL FORMAS DE PAGO VENTAS =");
            dataRow.createCell(7).setCellValue(corte.getTotalTipoPago());

            dataRow = sheet.createRow(30);
            dataRow.createCell(4).setCellValue("FORMA DE PAGO PROPINA");

            dataRow = sheet.createRow(32);
            dataRow.createCell(4).setCellValue("EFECTIVO =");
            dataRow.createCell(7).setCellValue(corte.getPropinaEfectivo());
            dataRow = sheet.createRow(33);
            dataRow.createCell(4).setCellValue("VISA =");
            dataRow.createCell(7).setCellValue(corte.getPropinaVisa());
            dataRow = sheet.createRow(34);
            dataRow.createCell(4).setCellValue("MASTER CARD =");
            dataRow.createCell(7).setCellValue(corte.getPropinaMaster());
            dataRow = sheet.createRow(35);
            dataRow.createCell(4).setCellValue("AMERICAN EXPRESS =");
            dataRow.createCell(7).setCellValue(corte.getPropinaAmerican());
            dataRow = sheet.createRow(36);
            dataRow.createCell(3).setCellValue("TOTAL FORMAS DE PAGO PROPINA =");
            dataRow.createCell(7).setCellValue(corte.getTotalPropina());

            dataRow = sheet.createRow(38);
            dataRow.createCell(4).setCellValue("VENTA POR TIPO DE PRODUCTO");

            dataRow = sheet.createRow(40);
            dataRow.createCell(4).setCellValue("ALIMENTOS =");
            dataRow.createCell(7).setCellValue(corte.getVentasAlimentos());
            dataRow = sheet.createRow(41);
            dataRow.createCell(4).setCellValue("BEBIDAS =");
            dataRow.createCell(7).setCellValue(corte.getVentasBebidas());
            dataRow = sheet.createRow(42);
            dataRow.createCell(4).setCellValue("OTROS =");
            dataRow.createCell(7).setCellValue(corte.getVentasOtros());
            dataRow = sheet.createRow(44);
            dataRow.createCell(4).setCellValue("SUBTOTAL =");
            dataRow.createCell(7).setCellValue(corte.getSubTotal());
            dataRow = sheet.createRow(45);
            dataRow.createCell(4).setCellValue("- DESCUENTOS =");
            dataRow.createCell(7).setCellValue(corte.getDescuentos());
            dataRow = sheet.createRow(46);
            dataRow.createCell(4).setCellValue("- IMPUESTOS =");
            dataRow.createCell(7).setCellValue(corte.getImpuestos());
            dataRow = sheet.createRow(48);
            dataRow.createCell(4).setCellValue("VENTAS TOTAL =");
            dataRow.createCell(7).setCellValue(corte.getVentasTotal());

            File directorio = new File("C:\\sistema_restaurante\\reportes_excel\\");
            if (!directorio.exists()) {
                if (directorio.mkdirs()) {
                    System.out.println("Directorio creado");
                } else {

                    System.out.println("Error al crear directorio");
                }
            }
            Date actual = new Date();
            file = new FileOutputStream("C:\\sistema_restaurante\\reportes_excel\\" + Utilidades.getFechaStringCompleto(actual).replace(" ", "T").replace(":", "-") + "-corte.xls");
            workbook.write(file);
            file.close();

            File myFile = new File("C:\\sistema_restaurante\\reportes_excel\\" + Utilidades.getFechaStringCompleto(actual).replace(" ", "T").replace(":", "-") + "-corte.xls");
            myFile.createNewFile();
            dt.open(myFile);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
            Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
        } catch (IOException ex) {
            Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
            }
        }
    }

    public static void writeExcelReporteMovimientos(List<Gastos> entradas, List<Gastos> salidas) {

        FileOutputStream file = null;
        Desktop dt = Desktop.getDesktop();

        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
            workbook.setSheetName(0, "Corte");
            CellStyle headerStyle = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setBold(true);
            headerStyle.setFont(font);
            CellStyle style = workbook.createCellStyle();
            style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            //Creamos fila
            HSSFRow dataRow = sheet.createRow(0);
            dataRow.createCell(6).setCellValue("REPORTE DE MOVIMIENTOS");

            dataRow = sheet.createRow(2);
            dataRow.createCell(6).setCellValue("ENTRADAS");

            dataRow = sheet.createRow(4);
            dataRow.createCell(4).setCellValue("CONCEPTO");
            dataRow.createCell(7).setCellValue("MONTO");
            dataRow.createCell(9).setCellValue("FECHA");
            int i = 5;

            for (Gastos entrada : entradas) {
                dataRow = sheet.createRow(i);
                dataRow.createCell(4).setCellValue(entrada.getConcepto());
                dataRow.createCell(7).setCellValue(entrada.getMonto());
                dataRow.createCell(9).setCellValue(Utilidades.getFechaStringCompleto(entrada.getFecha()));
                i = i + 1;
            }
            ;
            dataRow = sheet.createRow(i += 2);
            dataRow.createCell(6).setCellValue("SALIDAS");

            dataRow = sheet.createRow(i += 2);
            dataRow.createCell(4).setCellValue("CONCEPTO");
            dataRow.createCell(7).setCellValue("MONTO");
            dataRow.createCell(9).setCellValue("FECHA");

            i += 1;

            for (Gastos salida : salidas) {
                dataRow = sheet.createRow(i);
                dataRow.createCell(4).setCellValue(salida.getConcepto());
                dataRow.createCell(7).setCellValue(salida.getMonto());
                dataRow.createCell(9).setCellValue(Utilidades.getFechaStringCompleto(salida.getFecha()));
                i = i + 1;
            }

            File directorio = new File("C:\\sistema_restaurante\\reportes_excel\\");
            if (!directorio.exists()) {
                if (directorio.mkdirs()) {
                    System.out.println("Directorio creado");
                } else {

                    System.out.println("Error al crear directorio");
                }
            }
            Date actual = new Date();
            file = new FileOutputStream("C:\\sistema_restaurante\\reportes_excel\\" + Utilidades.getFechaStringCompleto(actual).replace(" ", "T").replace(":", "-") + "-movimientos.xls");
            workbook.write(file);
            file.close();

            File myFile = new File("C:\\sistema_restaurante\\reportes_excel\\" + Utilidades.getFechaStringCompleto(actual).replace(" ", "T").replace(":", "-") + "-movimientos.xls");
            myFile.createNewFile();
            dt.open(myFile);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
            Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
        } catch (IOException ex) {
            Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
            }
        }
    }

    public static void writeExcelReporteProductos(List<Producto> productos) {

        FileOutputStream file = null;
        Desktop dt = Desktop.getDesktop();

        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
            workbook.setSheetName(0, "Productos");
            CellStyle headerStyle = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setBold(true);
            headerStyle.setFont(font);
            CellStyle style = workbook.createCellStyle();
            style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            String[] headers = new String[]{
                "Nombre",
                "Categoría General",
                "Categoría Especifica",
                "Precio"
            };

            HSSFRow headerRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; ++i) {
                String header = headers[i];
                HSSFCell cell = headerRow.createCell(i);
                cell.setCellStyle(headerStyle);
                cell.setCellValue(header);
            }

            //Creamos fila
            HSSFRow dataRow=null;
            int i = 1;

            for (Producto p : productos) {
                dataRow = sheet.createRow(i);
                dataRow.createCell(0).setCellValue(p.getNombre());
                dataRow.createCell(1).setCellValue(p.getCategoriaGeneral());
                dataRow.createCell(2).setCellValue(p.getCategoriaEspecifica());
                dataRow.createCell(3).setCellValue("$"+Utilidades.formatoDecimaDosDigitos((float)p.getPrecio()));
                i = i + 1;
            }
         
                 dataRow.getSheet().setColumnWidth(0, 10000);
        dataRow.getSheet().setColumnWidth(1, 5000);
        dataRow.getSheet().setColumnWidth(2, 7000);
        dataRow.getSheet().setColumnWidth(3, 2000);
            File directorio = new File("C:\\sistema_restaurante\\reportes_excel\\");
            if (!directorio.exists()) {
                if (directorio.mkdirs()) {
                    System.out.println("Directorio creado");
                } else {

                    System.out.println("Error al crear directorio");
                }
            }
            Date actual = new Date();
            file = new FileOutputStream("C:\\sistema_restaurante\\reportes_excel\\" + Utilidades.getFechaStringCompleto(actual).replace(" ", "T").replace(":", "-") + "-productos.xls");
            workbook.write(file);
            file.close();

            File myFile = new File("C:\\sistema_restaurante\\reportes_excel\\" + Utilidades.getFechaStringCompleto(actual).replace(" ", "T").replace(":", "-") + "-productos.xls");
            myFile.createNewFile();
            dt.open(myFile);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
            Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
        } catch (IOException ex) {
            Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
            }
        }
    }
    
     public static void writeExcelReporteProductosCancelados(List<ReporteCancelados> productos) {

        FileOutputStream file = null;
        Desktop dt = Desktop.getDesktop();

        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
            workbook.setSheetName(0, "Productos");
            CellStyle headerStyle = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setBold(true);
            headerStyle.setFont(font);
            CellStyle style = workbook.createCellStyle();
            style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            String[] headers = new String[]{
                "Mesero",
                "Cantidad",
                "Descripción",
                "Razón",
                "Fecha",
                "Supervisor"
            };

            HSSFRow headerRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; ++i) {
                String header = headers[i];
                HSSFCell cell = headerRow.createCell(i);
                cell.setCellStyle(headerStyle);
                cell.setCellValue(header);
            }

            //Creamos fila
            HSSFRow dataRow=null;
            int i = 1;

            for (ReporteCancelados p : productos) {
                dataRow = sheet.createRow(i);
                dataRow.createCell(0).setCellValue(p.getMesero());
                dataRow.createCell(1).setCellValue(p.getCantidad());
                dataRow.createCell(2).setCellValue(p.getDescripcion());
                dataRow.createCell(3).setCellValue(p.getRazon());
                dataRow.createCell(4).setCellValue(Utilidades.getFechaStringCompleto(p.getFecha()));
                dataRow.createCell(5).setCellValue(p.getNombreSupervisor());
              
                i = i + 1;
            }
         
        dataRow.getSheet().setColumnWidth(0, 10000);
        dataRow.getSheet().setColumnWidth(1, 5000);
        dataRow.getSheet().setColumnWidth(2, 7000);
        dataRow.getSheet().setColumnWidth(3, 7000);
        dataRow.getSheet().setColumnWidth(4, 5000);
        dataRow.getSheet().setColumnWidth(5, 7000);
            File directorio = new File("C:\\sistema_restaurante\\reportes_excel\\");
            if (!directorio.exists()) {
                if (directorio.mkdirs()) {
                    System.out.println("Directorio creado");
                } else {

                    System.out.println("Error al crear directorio");
                }
            }
            Date actual = new Date();
            file = new FileOutputStream("C:\\sistema_restaurante\\reportes_excel\\" + Utilidades.getFechaStringCompleto(actual).replace(" ", "T").replace(":", "-") + "-prodCancelados.xls");
            workbook.write(file);
            file.close();

            File myFile = new File("C:\\sistema_restaurante\\reportes_excel\\" + Utilidades.getFechaStringCompleto(actual).replace(" ", "T").replace(":", "-") + "-prodCancelados.xls");
            myFile.createNewFile();
            dt.open(myFile);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
            Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
        } catch (IOException ex) {
            Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
            }
        }
    }
     
      public static void writeExcelReporteProductosVendidos(List<ReporteVendidos> productos) {

        FileOutputStream file = null;
        Desktop dt = Desktop.getDesktop();

        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
            workbook.setSheetName(0, "Productos");
            CellStyle headerStyle = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setBold(true);
            headerStyle.setFont(font);
            CellStyle style = workbook.createCellStyle();
            style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            String[] headers = new String[]{
                "Nombre",
                "Categoría",
                "Precio",
                "Cantidad",
                "Venta"
            };

            HSSFRow headerRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; ++i) {
                String header = headers[i];
                HSSFCell cell = headerRow.createCell(i);
                cell.setCellStyle(headerStyle);
                cell.setCellValue(header);
            }

            //Creamos fila
            HSSFRow dataRow=null;
            int i = 1;

            for (ReporteVendidos p : productos) {
                dataRow = sheet.createRow(i);
                dataRow.createCell(0).setCellValue(p.getDescripcion());
                dataRow.createCell(1).setCellValue(p.getCategoria());
                dataRow.createCell(2).setCellValue("$"+Utilidades.formatoDecimaDosDigitos((float)p.getPrecio()));
                dataRow.createCell(3).setCellValue(p.getCantidad());
                dataRow.createCell(4).setCellValue("$"+Utilidades.formatoDecimaDosDigitos((float)p.getVentaTotal()));
                i = i + 1;
            }
         
                 dataRow.getSheet().setColumnWidth(0, 10000);
        dataRow.getSheet().setColumnWidth(1, 7000);
        dataRow.getSheet().setColumnWidth(2, 5000);
        dataRow.getSheet().setColumnWidth(3, 3000);
        dataRow.getSheet().setColumnWidth(4, 3000);
            File directorio = new File("C:\\sistema_restaurante\\reportes_excel\\");
            if (!directorio.exists()) {
                if (directorio.mkdirs()) {
                    System.out.println("Directorio creado");
                } else {

                    System.out.println("Error al crear directorio");
                }
            }
            Date actual = new Date();
            file = new FileOutputStream("C:\\sistema_restaurante\\reportes_excel\\" + Utilidades.getFechaStringCompleto(actual).replace(" ", "T").replace(":", "-") + "-prodventa.xls");
            workbook.write(file);
            file.close();

            File myFile = new File("C:\\sistema_restaurante\\reportes_excel\\" + Utilidades.getFechaStringCompleto(actual).replace(" ", "T").replace(":", "-") + "-prodventa.xls");
            myFile.createNewFile();
            dt.open(myFile);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
            Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
        } catch (IOException ex) {
            Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
            }
        }
    }
      
      public static void writeExcelReporteProductosCategoria(List<ReporteCategoria> productos) {

        FileOutputStream file = null;
        Desktop dt = Desktop.getDesktop();

        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
            workbook.setSheetName(0, "Productos");
            CellStyle headerStyle = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setBold(true);
            headerStyle.setFont(font);
            CellStyle style = workbook.createCellStyle();
            style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            String[] headers = new String[]{
                "Cantidad",
                "Importe",
                "Categoría",
            };

            HSSFRow headerRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; ++i) {
                String header = headers[i];
                HSSFCell cell = headerRow.createCell(i);
                cell.setCellStyle(headerStyle);
                cell.setCellValue(header);
            }

            //Creamos fila
            HSSFRow dataRow=null;
            int i = 1;

            for (ReporteCategoria p : productos) {
                dataRow = sheet.createRow(i);
                dataRow.createCell(0).setCellValue(p.getCantidadTotal()+"");
                dataRow.createCell(1).setCellValue("$"+Utilidades.formatoDecimaDosDigitos((float)p.getImporteTotal()));
                dataRow.createCell(2).setCellValue(p.getCategoria());
                i = i + 1;
            }
         
                 dataRow.getSheet().setColumnWidth(0, 4000);
        dataRow.getSheet().setColumnWidth(1, 5000);
        dataRow.getSheet().setColumnWidth(2, 9000);

            File directorio = new File("C:\\sistema_restaurante\\reportes_excel\\");
            if (!directorio.exists()) {
                if (directorio.mkdirs()) {
                    System.out.println("Directorio creado");
                } else {

                    System.out.println("Error al crear directorio");
                }
            }
            Date actual = new Date();
            file = new FileOutputStream("C:\\sistema_restaurante\\reportes_excel\\" + Utilidades.getFechaStringCompleto(actual).replace(" ", "T").replace(":", "-") + "-prodcat.xls");
            workbook.write(file);
            file.close();

            File myFile = new File("C:\\sistema_restaurante\\reportes_excel\\" + Utilidades.getFechaStringCompleto(actual).replace(" ", "T").replace(":", "-") + "-prodcat.xls");
            myFile.createNewFile();
            dt.open(myFile);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
            Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
        } catch (IOException ex) {
            Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Utilidades.mensajePorTiempo("Ocurrio un error con el reporte, vuelve a intentarlo por favor");
            }
        }
    }
}

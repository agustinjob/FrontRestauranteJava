/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.job.rest.consumo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.job.modelos.Categoria;
import com.job.modelos.Configuracion;
import com.job.modelos.CorteModel;
import com.job.modelos.Cuenta;
import com.job.modelos.Gastos;
import com.job.modelos.Mesa;
import com.job.modelos.Mesero;
import com.job.modelos.Producto;
import com.job.modelos.ReporteCancelados;
import com.job.modelos.ReporteCategoria;
import com.job.modelos.ReporteVendidos;
import com.job.modelos.Turno;
import com.job.modelos.Usuario;
import com.job.modelos.VentasResponse;
import com.job.response.ResponseDatos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author agus_
 */
public class ConsumoApi {

    public static ResponseDatos<Usuario> usuarios(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        ResponseDatos<Usuario> res = new ResponseDatos();
        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);
            System.out.println(gson.toJson(obj));
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Usuario>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Usuario>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Usuario>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Usuario>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }

    public static ResponseDatos<Turno> turnos(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        ResponseDatos<Turno> res = new ResponseDatos();
        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);
            System.out.println(gson.toJson(obj));
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Turno>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Turno>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Turno>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Turno>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }

    public static ResponseDatos<String> cadenas(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        ResponseDatos<String> res = new ResponseDatos();
        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);
            System.out.println(gson.toJson(obj));
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<String>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<String>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<String>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<String>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }

    public static ResponseDatos<CorteModel> corte(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        ResponseDatos<CorteModel> res = new ResponseDatos();
        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<CorteModel>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<CorteModel>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {
            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<CorteModel>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {
                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<CorteModel>>() {
                }.getType());
            } catch (IOException ex) {
            }
        }

        return res;
    }

    public static VentasResponse ventas(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        VentasResponse res = new VentasResponse();
        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {
                res = gson.fromJson(EntityUtils.toString(response.getEntity()), VentasResponse.class);
            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), VentasResponse.class);

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), VentasResponse.class);

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), VentasResponse.class);

            } catch (IOException ex) {
            }
        }

        return res;
    }

    public static ResponseDatos<Mesa> mesas(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        ResponseDatos<Mesa> res = new ResponseDatos();
        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);
            System.out.println(gson.toJson(obj));
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Mesa>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Mesa>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Mesa>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Mesa>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }

    public static ResponseDatos<Mesero> meseros(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        ResponseDatos<Mesero> res = new ResponseDatos();
        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);
            System.out.println(gson.toJson(obj));
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Mesero>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Mesero>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Mesero>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Mesero>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }

    public static ResponseDatos<Producto> productos(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        ResponseDatos<Producto> res = new ResponseDatos();
        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);
            System.out.println(gson.toJson(obj));
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Producto>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Producto>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Producto>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Producto>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }

    public static ResponseDatos<Categoria> categorias(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        ResponseDatos<Categoria> res = new ResponseDatos();
        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);
            System.out.println(gson.toJson(obj));
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Categoria>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Categoria>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Categoria>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Categoria>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }

    public static ResponseDatos<Configuracion> configuracion(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        ResponseDatos<Configuracion> res = new ResponseDatos();
        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);
            System.out.println(gson.toJson(obj));
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Configuracion>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Configuracion>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Configuracion>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Configuracion>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }

    public static ResponseDatos<Gastos> gastos(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        ResponseDatos<Gastos> res = new ResponseDatos();
        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);
            System.out.println(gson.toJson(obj));
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Gastos>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Gastos>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Gastos>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Gastos>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }

    public static ResponseDatos<Cuenta> cuentas(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        ResponseDatos<Cuenta> res = new ResponseDatos();
        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);

            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Cuenta>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Cuenta>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Cuenta>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<ResponseDatos<Cuenta>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }

    public static List<ReporteCancelados> reporteCancelados(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        List<ReporteCancelados> res = new ArrayList<ReporteCancelados>();

        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);
            System.out.println(gson.toJson(obj));
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<List<ReporteCancelados>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<List<ReporteCancelados>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<List<ReporteCancelados>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<List<ReporteCancelados>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }
    
    public static List<ReporteVendidos> reporteVendidos(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        List<ReporteVendidos> res = new ArrayList<ReporteVendidos>();

        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);
            System.out.println(gson.toJson(obj));
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<List<ReporteVendidos>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<List<ReporteVendidos>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<List<ReporteVendidos>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<List<ReporteVendidos>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }
    
    public static List<ReporteCategoria> reporteCategoria(String url, Object obj, String tipo) {
        ContentType contentType = ContentType.APPLICATION_JSON;
        List<ReporteCategoria> res = new ArrayList<ReporteCategoria>();

        if (tipo.equalsIgnoreCase("POST")) {
            HttpPost envio = new HttpPost(url);
            Gson gson = new Gson();
            // System.out.println(url);
            System.out.println(gson.toJson(obj));
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<List<ReporteCategoria>>() {
                }.getType());

            } catch (IOException ex) {

            }

        }
        if (tipo.equalsIgnoreCase("PUT")) {
            HttpPut envio = new HttpPut(url);
            Gson gson = new Gson();

            // StringBuilder json = new StringBuilder();
            envio.setEntity(new StringEntity(gson.toJson(obj), contentType));

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<List<ReporteCategoria>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("DELETE")) {

            HttpDelete envio = new HttpDelete(url);
            Gson gson = new Gson();
            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<List<ReporteCategoria>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }
        if (tipo.equalsIgnoreCase("GET")) {
            HttpGet envio = new HttpGet(url);
            Gson gson = new Gson();

            try ( CloseableHttpClient httpClient = HttpClients.createDefault();  CloseableHttpResponse response = httpClient.execute(envio)) {

                res = gson.fromJson(EntityUtils.toString(response.getEntity()), new TypeToken<List<ReporteCategoria>>() {
                }.getType());

            } catch (IOException ex) {
            }
        }

        return res;
    }
}

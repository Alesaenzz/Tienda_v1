/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Ayaka
 */
public interface ReporteService {
    public ResponseEntity<Resource>
            generaReporte(String reporte, //El nombre del archivo de Jasper que esta dentro de reportes
                    Map<String, Object> parametros, //Obtiene los parametros de reporte
                    String tipo)throws IOException; //Tipo de reporte que vamos a descargas en la applicacion cvs, pdf, excel o solo la visualizacion del reporte
}

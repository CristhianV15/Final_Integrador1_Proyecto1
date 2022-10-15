/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author VALLADOLID
 */
@ManagedBean
@ViewScoped
public class configuraciones {
    private DatosEntrada datosEntrada;

  public void setDatosEntrada(DatosEntrada datosEntrada) {
   this.datosEntrada = datosEntrada;
  }

  @PostConstruct
  public void initView(){
  }

  public void obtenerParametros() {
   // Usar los datos, ejemplo:
   datosEntrada.getIntentosExitosos();
  }
}


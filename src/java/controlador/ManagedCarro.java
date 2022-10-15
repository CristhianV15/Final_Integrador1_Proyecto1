/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import EJB.VentasFacadeLocal;
import entidad.Detalleventa;
import entidad.Ventas;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author VALLADOLID
 */
@ManagedBean
@SessionScoped
public class ManagedCarro {
    @EJB
    VentasFacadeLocal ventasFacadeLocal;
    private List<Ventas> listarventas;
    private List<Detalleventa> listardetalle;
    private Ventas ventas;
    private Detalleventa detalleventa;

    public List<Ventas> getListarventas() {
        return listarventas;
    }

    public void setListarventas(List<Ventas> listarventas) {
        this.listarventas = listarventas;
    }

    public List<Detalleventa> getListardetalle() {
        return listardetalle;
    }

    public void setListardetalle(List<Detalleventa> listardetalle) {
        this.listardetalle = listardetalle;
    }

    public Ventas getVentas() {
        return ventas;
    }

    public void setVentas(Ventas ventas) {
        this.ventas = ventas;
    }

    public Detalleventa getDetalleventa() {
        return detalleventa;
    }

    public void setDetalleventa(Detalleventa detalleventa) {
        this.detalleventa = detalleventa;
    }
    
    @PostConstruct
    public void init(){
        this.ventas= new Ventas();
        this.detalleventa= new Detalleventa();
    }
    
    //Metodos guardar
//    public void guardarVenta(){
//        this.alumno.setIdApoderado(apoderado);
//        this.alumno.setIdUsuarioCreado(usuario);
//        this.alumnoFacadeLocal.create(alumno);
//    }
//    public void guardarDetalleVenta(){
//       this.ventas.
//    }
}

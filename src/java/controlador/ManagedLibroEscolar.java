/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import EJB.LibroescolarFacadeLocal;
import entidad.Libroescolar;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author VALLADOLID
 */
@ManagedBean
@SessionScoped
public class ManagedLibroEscolar {
    @EJB
    LibroescolarFacadeLocal libroescolarFacadeLocal;
    private List<Libroescolar> listarLibros;
    private List<Libroescolar> listarMatematica;
    private List<Libroescolar> listarCategorias;
    private List<Libroescolar> listarBruno;
    private List<Libroescolar> listarLumbreras;
    private Libroescolar libroescolar;
    private int stock=-1; // para comparar !=0
    private String categoria="";
    String verPagina;

    @PostConstruct
    public void init() {
        libroescolar = new Libroescolar();
    }
    
    public List<Libroescolar> getListarLibros() {
        listarLibros= libroescolarFacadeLocal.findAll();
        return listarLibros;
    }

    public void setListarLibros(List<Libroescolar> listarLibros) {
        this.listarLibros = listarLibros;
    }

    public List<Libroescolar> getListarMatematica() {
        listarMatematica = libroescolarFacadeLocal.buscarMate(libroescolar);
        return listarMatematica;
    }

    public void setListarMatematica(List<Libroescolar> listarMatematica) {
        this.listarMatematica = listarMatematica;
    }

    public Libroescolar getLibroescolar() {
        return libroescolar;
    }

    public void setLibroescolar(Libroescolar libroescolar) {
        this.libroescolar = libroescolar;
    }
    
    

    public void encontrarLibros(Libroescolar le){
      
        this.libroescolar= le;
    }
    
    //Metodos
    public void cargarLibros(Libroescolar le) {
        this.libroescolar = le;
    }
    
    //Validar categoria
    
    public String validarCategoria(Libroescolar le){
        listarLibros= libroescolarFacadeLocal.buscarMate(libroescolar);
        return verPagina="/paginas/inicioLibros.xhtml";
    }
    //Validar stock
    public String validarStock(Libroescolar le){
        listarLibros = libroescolarFacadeLocal.buscarStockLibro(libroescolar);
        stock = listarLibros.get(0).getStock();
        if(stock!=0){
            //Hay stock disponible, ir a libro_vermas
            verPagina = "/paginas/libro_vermas.xhtml";
        }
        else{
            verPagina = "/paginas/libros_notifi_stock.xhtml";
        }
        return verPagina;
    }
    
    //Validar Categoria
    
    public String validarCategoria(){
        listarLibros = libroescolarFacadeLocal.buscarCategoria(libroescolar);
       this.libroescolar = (Libroescolar) listarMatematica;
            listarLibros = listarMatematica;
            verPagina = "/paginas/inicioLibros.xhtml";            
       

        return verPagina;
    }
     //Para mostrar el detalle del libro
    public void encontrarLibro(Libroescolar le){
        this.libroescolar= le;
        
    }

    public List<Libroescolar> getListarCategorias() {
        listarCategorias = libroescolarFacadeLocal.listarCategorias(libroescolar);
        return listarCategorias;
    }

    public void setListarCategorias(List<Libroescolar> listarCategorias) {
        this.listarCategorias = listarCategorias;
    }

    public List<Libroescolar> getListarBruno() {
        listarBruno = libroescolarFacadeLocal.buscarBruno(libroescolar);
        return listarBruno;
    }

    public void setListarBruno(List<Libroescolar> listarBruno) {
        this.listarBruno = listarBruno;
    }

    public List<Libroescolar> getListarLumbreras() {
        listarLumbreras = libroescolarFacadeLocal.buscarLumbreras(libroescolar);
        return listarLumbreras;
    }

    public void setListarLumbreras(List<Libroescolar> listarLumbreras) {
        this.listarLumbreras = listarLumbreras;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

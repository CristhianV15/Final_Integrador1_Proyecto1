/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entidad.Libroescolar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author VALLADOLID
 */
@Local
public interface LibroescolarFacadeLocal {

    void create(Libroescolar libroescolar);

    void edit(Libroescolar libroescolar);

    void remove(Libroescolar libroescolar);

    Libroescolar find(Object id);

    List<Libroescolar> findAll();

    List<Libroescolar> findRange(int[] range);

    int count();
    //Filtro Categoria
    List<Libroescolar> buscarMate(Libroescolar le);
    List<Libroescolar> buscarComunicacion(Libroescolar le);
    List<Libroescolar> buscarCiencia(Libroescolar le);
    List<Libroescolar> buscarPersonalSocial(Libroescolar le);
    
    //Validar si hay stock para mostrar pagina
    List<Libroescolar> buscarStockLibro(Libroescolar le);
    
    List<Libroescolar> listarCategorias(Libroescolar le);
    
    //Filtro editorial
    List<Libroescolar> buscarBruno(Libroescolar le);
    List<Libroescolar> buscarLumbreras(Libroescolar le);
     List<Libroescolar> buscarCategoria(Libroescolar le);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entidad.Notificacioncliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author VALLADOLID
 */
@Local
public interface NotificacionclienteFacadeLocal {

    void create(Notificacioncliente notificacioncliente);

    void edit(Notificacioncliente notificacioncliente);

    void remove(Notificacioncliente notificacioncliente);

    Notificacioncliente find(Object id);

    List<Notificacioncliente> findAll();

    List<Notificacioncliente> findRange(int[] range);

    int count();
    
}

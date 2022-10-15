/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entidad.Notificacioncliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author VALLADOLID
 */
@Stateless
public class NotificacionclienteFacade extends AbstractFacade<Notificacioncliente> implements NotificacionclienteFacadeLocal {

    @PersistenceContext(unitName = "FinalIntegradorUno_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NotificacionclienteFacade() {
        super(Notificacioncliente.class);
    }
    @Override
    public void enviarCorreo(Notificacioncliente nc){}
   
    
}

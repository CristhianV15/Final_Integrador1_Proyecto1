/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entidad.Detalleventa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author VALLADOLID
 */
@Stateless
public class DetalleventaFacade extends AbstractFacade<Detalleventa> implements DetalleventaFacadeLocal {

    @PersistenceContext(unitName = "FinalIntegradorUno_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetalleventaFacade() {
        super(Detalleventa.class);
    }
    
}

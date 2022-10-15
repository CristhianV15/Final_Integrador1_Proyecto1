/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import entidad.Libroescolar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author VALLADOLID
 */
public abstract class AbstractFacade<T> {

    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
    public List<Libroescolar> buscarCategoria(Libroescolar le){
        String jpql= "SELECT l FROM Libroescolar l WHERE l.nombreCategoria = :nombreCategoria";
        Query query = getEntityManager().createQuery(jpql);
        query.setParameter("nombreCategoria", le.getNombreCategoria());
        return query.getResultList();
    }
    
    
    //Buscar Matematica
    public List<Libroescolar> buscarMate(Libroescolar le){
       String jpql= "SELECT l FROM Libroescolar l WHERE l.nombreCategoria = :nombreCategoria";
        Query query = getEntityManager().createQuery(jpql);
        query.setParameter("nombreCategoria", "Matematica");
        return query.getResultList();
    }
    
    //Buscar stock 
    public List<Libroescolar> buscarStockLibro(Libroescolar le){
        String jpql= "SELECT l FROM Libroescolar l WHERE l.idLibroEscolar = :idCodigo";
        Query query = getEntityManager().createQuery(jpql);
        query.setParameter("idCodigo", le.getIdLibroEscolar());
        return query.getResultList();
    }
    
    //listado de categorias para filtro
    public List<Libroescolar> listarCategorias(Libroescolar le){
         String jpql= "SELECT distinct l FROM Libroescolar l WHERE l.idLibroEscolar > 0";
         Query query = getEntityManager().createQuery(jpql);
        return query.getResultList();
    }
    
    
    //Buscar Bruño
    public List<Libroescolar> buscarBruno(Libroescolar le){
       String jpql= "SELECT l FROM Libroescolar l WHERE l.idEditorial = :idEditorial";
        Query query = getEntityManager().createQuery(jpql);
        query.setParameter("idEditorial", "Bruno");
        return query.getResultList();
    }
    
    //Buscar lumbreras
     public List<Libroescolar> buscarLumbreras(Libroescolar le){
       String jpql= "SELECT l FROM Libroescolar l WHERE l.idEditorial = :idEditorial";
        Query query = getEntityManager().createQuery(jpql);
        query.setParameter("idEditorial", "Lumbreras");
        return query.getResultList();
    }
    
}

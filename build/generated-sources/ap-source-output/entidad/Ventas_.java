package entidad;

import entidad.Clientes;
import entidad.Detalleventa;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2022-10-15T02:39:27")
@StaticMetamodel(Ventas.class)
public class Ventas_ { 

    public static volatile SingularAttribute<Ventas, Double> total;
    public static volatile SingularAttribute<Ventas, Character> estado;
    public static volatile SingularAttribute<Ventas, Clientes> idCliente;
    public static volatile CollectionAttribute<Ventas, Detalleventa> detalleventaCollection;
    public static volatile SingularAttribute<Ventas, Integer> idVenta;

}
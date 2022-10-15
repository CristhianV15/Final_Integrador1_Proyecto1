package entidad;

import entidad.Libroescolar;
import entidad.Ventas;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2022-10-15T02:39:27")
@StaticMetamodel(Detalleventa.class)
public class Detalleventa_ { 

    public static volatile SingularAttribute<Detalleventa, Libroescolar> idLibroEscolar;
    public static volatile SingularAttribute<Detalleventa, Integer> idDetalleVenta;
    public static volatile SingularAttribute<Detalleventa, Integer> cantidad;
    public static volatile SingularAttribute<Detalleventa, Double> subTotal;
    public static volatile SingularAttribute<Detalleventa, Ventas> idVenta;

}
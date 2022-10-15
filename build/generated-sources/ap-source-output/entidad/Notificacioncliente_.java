package entidad;

import entidad.Libroescolar;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2022-10-15T02:22:03")
@StaticMetamodel(Notificacioncliente.class)
public class Notificacioncliente_ { 

    public static volatile SingularAttribute<Notificacioncliente, Libroescolar> idLibroEscolar;
    public static volatile SingularAttribute<Notificacioncliente, Character> estado;
    public static volatile SingularAttribute<Notificacioncliente, Date> fechaSolicitud;
    public static volatile SingularAttribute<Notificacioncliente, String> correo;
    public static volatile SingularAttribute<Notificacioncliente, Date> fechaNotificacion;
    public static volatile SingularAttribute<Notificacioncliente, Integer> idNotificacionCliente;

}
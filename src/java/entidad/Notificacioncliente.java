/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author VALLADOLID
 */
@Entity
@Table(name = "notificacioncliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notificacioncliente.findAll", query = "SELECT n FROM Notificacioncliente n")
    , @NamedQuery(name = "Notificacioncliente.findByIdNotificacionCliente", query = "SELECT n FROM Notificacioncliente n WHERE n.idNotificacionCliente = :idNotificacionCliente")
    , @NamedQuery(name = "Notificacioncliente.findByCorreo", query = "SELECT n FROM Notificacioncliente n WHERE n.correo = :correo")
    , @NamedQuery(name = "Notificacioncliente.findByFechaSolicitud", query = "SELECT n FROM Notificacioncliente n WHERE n.fechaSolicitud = :fechaSolicitud")
    , @NamedQuery(name = "Notificacioncliente.findByFechaNotificacion", query = "SELECT n FROM Notificacioncliente n WHERE n.fechaNotificacion = :fechaNotificacion")
    , @NamedQuery(name = "Notificacioncliente.findByEstado", query = "SELECT n FROM Notificacioncliente n WHERE n.estado = :estado")})
public class Notificacioncliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNotificacionCliente")
    private Integer idNotificacionCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaSolicitud")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaNotificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNotificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private Character estado;
    @JoinColumn(name = "idLibroEscolar", referencedColumnName = "idLibroEscolar")
    @ManyToOne(optional = false)
    private Libroescolar idLibroEscolar;

    public Notificacioncliente() {
    }

    public Notificacioncliente(Integer idNotificacionCliente) {
        this.idNotificacionCliente = idNotificacionCliente;
    }

    public Notificacioncliente(Integer idNotificacionCliente, String correo, Date fechaSolicitud, Date fechaNotificacion, Character estado) {
        this.idNotificacionCliente = idNotificacionCliente;
        this.correo = correo;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaNotificacion = fechaNotificacion;
        this.estado = estado;
    }

    public Integer getIdNotificacionCliente() {
        return idNotificacionCliente;
    }

    public void setIdNotificacionCliente(Integer idNotificacionCliente) {
        this.idNotificacionCliente = idNotificacionCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Libroescolar getIdLibroEscolar() {
        return idLibroEscolar;
    }

    public void setIdLibroEscolar(Libroescolar idLibroEscolar) {
        this.idLibroEscolar = idLibroEscolar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNotificacionCliente != null ? idNotificacionCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notificacioncliente)) {
            return false;
        }
        Notificacioncliente other = (Notificacioncliente) object;
        if ((this.idNotificacionCliente == null && other.idNotificacionCliente != null) || (this.idNotificacionCliente != null && !this.idNotificacionCliente.equals(other.idNotificacionCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Notificacioncliente[ idNotificacionCliente=" + idNotificacionCliente + " ]";
    }
    
}

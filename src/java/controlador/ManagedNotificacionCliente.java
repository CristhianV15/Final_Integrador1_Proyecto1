/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import EJB.LibroescolarFacadeLocal;
import EJB.NotificacionclienteFacadeLocal;
import entidad.Libroescolar;
import entidad.Notificacioncliente;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author VALLADOLID
 */
@ManagedBean
@SessionScoped
public class ManagedNotificacionCliente {
    @EJB
    NotificacionclienteFacadeLocal notificacionclienteFacadeLocal;
    private Notificacioncliente notificacioncliente;
    
    public void EnviarCorreo(Notificacioncliente nc){
        notificacionclienteFacadeLocal.enviarCorreo(notificacioncliente);
    }
    public Notificacioncliente getNotificacioncliente() {
        return notificacioncliente;
    }

    public void setNotificacioncliente(Notificacioncliente notificacioncliente) {
        this.notificacioncliente = notificacioncliente;
    }
}

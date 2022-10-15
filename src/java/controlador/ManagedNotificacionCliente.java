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
    
    String correoenviado= notificacionclienteFacadeLocal.enviarCorreo(notificacioncliente);
    public void enviarCorreo() throws MessagingException{
        String correoEnvia="anon.utp@gmail.com";
        String contrasena= "rixrkyowvrtzuyxm";
        String mensaje= "Ya hay stock";
        
        //Pec= para envio correo 
        Properties objetoPec=new Properties();
        
        objetoPec.put("mail.smtp.host","smtp.gmail.com");
        objetoPec.setProperty("mail.smtp.starttls.enable","true");
        objetoPec.put("mail.smtp.port","587");
        objetoPec.setProperty("mail.smtp.port","587");
        objetoPec.put("mail.smtp.user", correoEnvia);
        objetoPec.setProperty("mail.smtp.auth", "true");
        
        Session sesion= Session.getDefaultInstance(objetoPec);
        MimeMessage mail= new MimeMessage(sesion);
        
        try{
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(correoenviado));
            mail.setSubject("Prueba de envio");
            mail.setText(mensaje);
            
            Transport transporte=sesion.getTransport("smtp");
            transporte.connect(correoEnvia,contrasena);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            System.out.println("Funciono, correo enviado");
            
        } catch (AddressException ex) {
            System.out.println("Fracaso :'v" + ex);
        }
    }

    public Notificacioncliente getNotificacioncliente() {
        return notificacioncliente;
    }

    public void setNotificacioncliente(Notificacioncliente notificacioncliente) {
        this.notificacioncliente = notificacioncliente;
    }
}

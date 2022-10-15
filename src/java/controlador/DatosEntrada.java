/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 *
 * @author VALLADOLID
 */
public class DatosEntrada {
    private String intentosAplicacion;
    private String intentosExitosos;
    private String  intentosFallidos;

    public String getIntentosAplicacion() {
        return intentosAplicacion;
    }

    public void setIntentosAplicacion(String intentosAplicacion) {
        this.intentosAplicacion = intentosAplicacion;
    }

    public String getIntentosExitosos() {
        return intentosExitosos;
    }

    public void setIntentosExitosos(String intentosExitosos) {
        this.intentosExitosos = intentosExitosos;
    }

    public String getIntentosFallidos() {
        return intentosFallidos;
    }

    public void setIntentosFallidos(String intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }
}

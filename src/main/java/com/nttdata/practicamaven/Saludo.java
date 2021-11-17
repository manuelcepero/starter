/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nttdata.practicamaven;

/**
 *
 * @author Manuel
 */
public class Saludo {

    private String idioma;

    public Saludo(String idioma) {
        this.idioma = idioma;
    }

    public String mensajeSaludo() {
        String mensaje = "";
        switch (idioma) {
            case "Castellano":
                mensaje = "Hola";
                break;

            default:
                mensaje = "Hi";
                break;
        }

        return mensaje;
    }
}

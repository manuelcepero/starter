/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nttdata.practicamaven;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author Manuel
 */
@ConfigurationProperties("saludo.mensaje")
public class SaludoProperties {
	private String idioma ="Castellano";

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
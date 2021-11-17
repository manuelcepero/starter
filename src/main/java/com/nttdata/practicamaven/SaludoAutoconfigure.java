/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nttdata.practicamaven;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Manuel
 */
@Configuration
@ConditionalOnClass(Saludo.class)
@EnableConfigurationProperties(SaludoProperties.class)
public class SaludoAutoconfigure {

	private final SaludoProperties properties;
	
	public SaludoAutoconfigure(SaludoProperties properties) {
		this.properties= properties;
	}
	
	@Bean
	public Saludo saludo() {
		System.out.println("Idioma: "+properties.getIdioma());
		return new Saludo(properties.getIdioma());
	}
}
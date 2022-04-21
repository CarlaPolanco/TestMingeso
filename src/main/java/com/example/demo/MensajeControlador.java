package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensajeControlador {
	
	 @GetMapping("/mensaje")
	 public String Mensaje(){
	     return ("Aplicacion web muy simple");
	 }

}


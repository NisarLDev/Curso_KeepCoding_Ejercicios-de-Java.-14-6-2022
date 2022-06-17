package com.formacion.spring.hola.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacion.spring.hola.model.Coche;

@Service
public class CocheServiceImp implements CocheService {

	@Autowired
	private Coche coche,coche2,coche3,coche4,coche5,coche6,coche7,coche8,coche9,coche10;
	@Override
	public List<Coche> listaCoches() {
		// TODO Auto-generated method stub
		List<Coche> listado = new ArrayList<Coche>();
		
		coche.setMarca("Mercedes");
		coche.setModelo("Sedan");
		coche.setColor("Negro");
		coche.setVelocidad_maxima(270);
		coche.setCilindrada(3200);
		
		listado.add(coche);
		
		coche2.setMarca("Ferrari");
		coche2.setModelo("Deportivo");
		coche2.setColor("Rojo Magenta");
		coche2.setVelocidad_maxima(320);
		coche2.setCilindrada(3500);
		
		listado.add(coche2);
		
		coche3.setMarca("Toyota");
		coche3.setModelo("Corolla");
		coche3.setColor("Verde");
		coche3.setVelocidad_maxima(260);
		coche3.setCilindrada(2500);
		
		listado.add(coche3);
		
		coche4.setMarca("Seat");
		coche4.setModelo("Arosa");
		coche4.setColor("Fuxia");
		coche4.setVelocidad_maxima(200);
		coche4.setCilindrada(1400);
		
		
		listado.add(coche4);
		
		coche5.setMarca("Alfa Romeo");
		coche5.setModelo("Julietta");
		coche5.setColor("Gris metalizado");
		coche5.setVelocidad_maxima(240);
		coche5.setCilindrada(1800);
		
		
		listado.add(coche5);
		
		coche6.setMarca("Ford");
		coche6.setModelo("Fiesta");
		coche6.setColor("Azul");
		coche6.setVelocidad_maxima(220);
		coche6.setCilindrada(1850);
		
		listado.add(coche6);
		
		coche7.setMarca("Opel");
		coche7.setModelo("Corsa");
		coche7.setColor("Marrón");
		coche7.setVelocidad_maxima(200);
		coche7.setCilindrada(1400);
		
		listado.add(coche7);
		
		coche8.setMarca("Renault");
		coche8.setModelo("Megane");
		coche8.setColor("Naranja");
		coche8.setVelocidad_maxima(200);
		coche8.setCilindrada(1700);
		
		
		listado.add(coche8);
		
		coche9.setMarca("Suzuki");
		coche9.setModelo("Vitara");
		coche9.setColor("Amarillo");
		coche9.setVelocidad_maxima(200);
		coche9.setCilindrada(1500);
		
		
		listado.add(coche9);
		
		coche10.setMarca("Audi");
		coche10.setModelo("A8");
		coche10.setColor("Negro");
		coche10.setVelocidad_maxima(240);
		coche10.setCilindrada(3200);
		
		listado.add(coche10);

		return listado;
		
	}

	
}

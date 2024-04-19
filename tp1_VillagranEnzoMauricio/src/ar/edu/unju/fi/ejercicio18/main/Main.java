package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio18.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pais> paises = new ArrayList<>();
		paises.add(new Pais("1111", "Argentina"));
		paises.add(new Pais("2222", "Brasil"));
		paises.add(new Pais("3333", "Mexico"));
		List<DestinoTuristico> destinosTuristicos = new ArrayList<>();
		
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean encontrado=false;
		do {
			System.out.println("------- MENU -------");
			System.out.println("1) Alta de un destino turistico");
			System.out.println("2) Mostrar todos los destinos turisticos");
			System.out.println("3) Modificar el pais de un destino turistico");
			System.out.println("4) Limpiar todos los destinos turisticos");
			System.out.println("5) Eliminar un destino turistico");
			System.out.println("6) Mostrar los destinos turisticos ordenados por nombre");
			System.out.println("7) Mostrar todos los paises");
			System.out.println("8) Mostrar los destinos turisticos de un pais");
			System.out.println("9) Salir");
			try{
				System.out.println("Ingrese opcion: ");
				opcion = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Las opciones solo aceptan dato de tipo numerico del 1 al 9");
				opcion = 10;
				sc.nextLine();
			}
			sc.nextLine();
			switch(opcion) {
			    case 1: System.out.println("------- NUEVO DESTINO TURISTICO -------");
			    		System.out.println("Ingrese codigo:");
			    		String codigoDestino=sc.nextLine();
			    		System.out.println("Ingrese nombre:");
			    		String nombreDestino = sc.nextLine();
			    		String paisDestino="",codigoPais="";
			    		do {
				    		System.out.println("Ingrese el codigo del pais donde se encuentra el destino:");
				    		codigoPais = sc.nextLine();
				    		Iterator<Pais>iteratorPaises = paises.iterator();
				    		while(iteratorPaises.hasNext()) { 
				    			Pais p = iteratorPaises.next(); 
				    			if(p.getCodigo().equals(codigoPais)) {
				    				paisDestino = p.getNombre();
				    				encontrado=true;
				    			}
				    		}
				    		if(encontrado==false)
				    			System.out.println("No hay ningun pais asociado con el codigo "+codigoPais);
			    		}while(!encontrado);
			    		float precio;
					 	do {
					 		 try {
					 			 System.out.println("Ingrese precio:"); 
							 	 precio = sc.nextFloat(); 
							 	 if(precio<=0)
							 		 System.out.println("Error en el precio, no puede ser 0 o menor");
					 		 }catch(InputMismatchException e) {
					 			System.out.println("Se pide un dato numerico, intente de nuevo");
								precio=0;
								sc.nextLine();
					 		 }
					 	 }while(precio<=0); 
					 	int dias;
					 	do {
					 		 try {
					 			 System.out.println("Ingrese cantidad de dias:"); 
							 	 dias = sc.nextInt(); 
							 	 if(dias<=0)
							 		 System.out.println("Error en los dias, no puede ser menor a 1");
					 		 }catch(InputMismatchException e) {
					 			System.out.println("Se pide un dato numerico, intente de nuevo");
								dias=0;
								sc.nextLine();
					 		 }
					 	}while(dias<=0); 
			    		destinosTuristicos.add(new DestinoTuristico(codigoDestino, nombreDestino, precio,new Pais(codigoPais, paisDestino), dias));
			    		break;
			    case 2: System.out.println("------- DESTINOS TURISTICOS -------");
			    		destinosTuristicos.forEach(des->System.out.println(des.toString()));
			    	    break;
			    case 3: System.out.println("------- MODIFICACION DEL PAIS DEL DESTINO -------");
					    String codigoDestinoaModificar,codigoPaisModificar;
					    Pais datosPaisEncontrado=null;
					    boolean encontradoDestino=false;
					    encontrado=false;
				    		System.out.println("Ingrese el codigo de destino turistico:");
				    		codigoDestinoaModificar = sc.nextLine();
				    		Iterator<DestinoTuristico>iteratorDestinos = destinosTuristicos.iterator();
				    		while(iteratorDestinos.hasNext()) { //busca si el destino turistico a modificar existe
				    			DestinoTuristico d = iteratorDestinos.next(); 
				    			if(d.getCodigo().equals(codigoDestinoaModificar)) { //si encuentra el destino que queremos modificar
				    				System.out.println("Ingrese el codigo del pais al que quiere modificar:");
						    		codigoPaisModificar = sc.nextLine();
						    		Iterator<Pais>iteratorPaises = paises.iterator();
				    				while(iteratorPaises.hasNext()) { //busca si el pais por el que queremos modificar existe
						    			Pais p = iteratorPaises.next(); 
						    			if(p.getCodigo().equals(codigoPaisModificar)) {
						    				datosPaisEncontrado = p;
						    				encontrado=true; //encontrado de toda la operacion
						    				encontradoDestino=true; //encontrado solo del destino
						    			}
						    		}
				    				if(encontrado==false){
						    			System.out.println("No hay ningun pais asociado con el codigo "+codigoPaisModificar);
						    			encontradoDestino=true;
				    				}
				    				else {
				    					d.setPais(datosPaisEncontrado);
				    					System.out.println("El cambio se realizo con exito, nuevos datos: ");
				    					System.out.println(d.toString());
				    				}
				    			}
				    		}
				    		if(encontradoDestino==false)
				    			System.out.println("No hay ningun destino turistico asociado con el codigo "+codigoDestinoaModificar);
			    		break;
			    case 4: System.out.println("------- ELIMINACION TOTAL DE LOS DESTINOS -------");
			    		String eleccion;
			    		System.out.println("Se eliminara toda la lista, esta seguro? s/n");
			    		eleccion=sc.nextLine();
				    	if(eleccion.equals("S") || eleccion.equals("s") ) {
				    		destinosTuristicos.clear();
				    		System.out.println("Borrado con éxito");
				    	}
				    	else
				    		System.out.println("No se realizó el borrado");
			    	    break;
			    case 5: System.out.println("------- ELIMINACION DE UN DESTINO -------");
			    		System.out.println("Ingrese el codigo de destino turistico:");
			    		String codigoDestinoaEliminar = sc.nextLine();
			    		boolean encontradoDestinoEliminar=false;
			    		Iterator<DestinoTuristico>iteratorDestinosEliminar = destinosTuristicos.iterator();
			    		while(iteratorDestinosEliminar.hasNext()) { 
			    			DestinoTuristico d = iteratorDestinosEliminar.next(); 
			    			if(d.getCodigo().equals(codigoDestinoaEliminar)) { 
			    				iteratorDestinosEliminar.remove();
			    				encontradoDestinoEliminar=true;
			    			}
			    		}
			    		if(encontradoDestinoEliminar==false)
			    			System.out.println("No hay ningun destino turistico asociado con el codigo "+codigoDestinoaEliminar);
			    		else {
			    			System.out.println("Se elimino exitosamente el destino turistico: "+codigoDestinoaEliminar+"\nNuevos datos:");
			    			destinosTuristicos.forEach(des->System.out.println(des.toString()));
			    		}
			    		break;
			    case 6:	System.out.println("------- DESTINOS TURISTICOS -------");
			    		destinosTuristicos.sort(Comparator.comparing(DestinoTuristico::getNombre));
			    		destinosTuristicos.forEach(des-> System.out.println(des.toString()));
			    		break;
			    case 7: System.out.println("------- PAISES -------");
			    		paises.forEach(pai->System.out.println(pai.toString()));
			    		break;
			    case 8:	System.out.println("------- DESTINOS TURISTICOS DE UN PAIS -------");
					    System.out.println("Ingrese el nombre del pais:");
			    		String paisBuscar = sc.nextLine();
			    		boolean destinoEncontrado=false;
			    		Iterator<DestinoTuristico>iteratorPaisBuscar = destinosTuristicos.iterator();
			    		while(iteratorPaisBuscar.hasNext()) { 
			    			DestinoTuristico d = iteratorPaisBuscar.next(); 
			    			if(d.getPais().getNombre().equals(paisBuscar)) { 
			    				System.out.println(d.toString());
			    				destinoEncontrado=true;
			    			}
			    		}
			    		if(destinoEncontrado==false)
			    			System.out.println("No hay ningun destino turistico asociado con el pais "+paisBuscar);
			    		break;
			    case 9:	System.out.println("FIN DEL PROGRAMA");;break;
			    default: System.out.println("Opcion incorrecta");
			}
		}while(opcion!=9);
		sc.close();
	}
	
	
	
	
}

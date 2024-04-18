package ar.edu.unju.fi.ejercicio17.main;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio17.model.Jugador;


import java.util.List;


public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion;
		LocalDate anioActual = LocalDate.now();
		List<Jugador>jugadores = new ArrayList<>();
		do {
			System.out.println("------- MENU -------");
			System.out.println("1) Alta de un jugador");
			System.out.println("2) Mostrar los datos de un jugador");
			System.out.println("3) Mostrar jugadores ordenados por apellido");
			System.out.println("4) Modificar datos de un jugador");
			System.out.println("5) Eliminar un jugador");
			System.out.println("6) Cantidad de jugadores registrados");
			System.out.println("7) Cantidad de jugadores de una nacionalidad");
			System.out.println("8) Salir");
			System.out.println("Ingrese opcion: ");
			try{
				opcion = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Las opciones solo aceptan dato de tipo numerico del 1 al 8");
				opcion = 9;
			}
			sc.nextLine();
			switch(opcion) {
			 case 1: System.out.println("------- NUEVO JUGADOR -------");
				 	 System.out.println("Ingrese nombre:"); 
				 	 String nombre = sc.nextLine();
				 	 System.out.println("Ingrese apellido:"); 
				 	 String apellido = sc.nextLine();
				 	 System.out.println("Ingrese nacionalidad:"); 
				 	 String nacionalidad = sc.nextLine();
				 	 System.out.println("Ingrese posicion: (delantero, medio, defensa, arquero)"); 
				 	 String posicion = sc.nextLine();
				 	 float estatura;
				 	 do {
				 		 try {
				 			 System.out.println("Ingrese estatura:"); 
						 	 estatura = sc.nextFloat(); 
						 	 if(estatura<=0)
						 		 System.out.println("Error en la estatura, no puede medir 0 o menos");
				 		 }catch(InputMismatchException e) {
				 			System.out.println("Se pide un dato numerico, intente de nuevo");
							estatura=0;
							sc.nextLine();
				 		 }
				 	 }while(estatura<=0); 
				 	float peso; 
				 	do {
				 		 try {
				 			 System.out.println("Ingrese peso:"); 
						 	 peso = sc.nextFloat(); 
						 	 if(peso<=0)
						 		 System.out.println("Error en el peso, no puede pesar 0 o menos");
				 		 }catch(InputMismatchException e) {
				 			System.out.println("Se pide un dato numerico, intente de nuevo");
							peso=0;
							sc.nextLine();
				 		 }
				 	 }while(peso<=0);
				 	int anio; 
				 	System.out.println("Fecha de Nacimiento");
				 	do {
					 	 try {
					 		 System.out.println("Ingrese año:");
					 		 anio = sc.nextInt();
					 		 if(anio<=1900 || anio>anioActual.getYear())
					 			 System.out.println("Los años validos estan entre el 1900 y "+anioActual.getYear());
					 	 }catch(InputMismatchException e) {
					 		 System.out.println("Error en la fecha, se introdujo una cadena, se pide el numero de año");
					 		 anio=0;
					 		 sc.nextLine();
					 	 }
				 	}while(anio<=1900 || anio>anioActual.getYear());
				 	 int mes;
				 	 do {
				 		try {
					 		System.out.println("Ingrese mes:");
						 	mes = sc.nextInt();
						 	if(mes<=0 || mes>12)
						 		System.out.println("Los meses son validos unicamente si estan entre 1 y 12");
					 	 }catch(InputMismatchException e) {
					 		 System.out.println("Error en la fecha, se introdujo una cadena, se pide el numero del mes");
					 		 mes=0;
					 		 sc.nextLine();
					 	 }
				 	 }while(mes<=0 || mes>12);
				 	 int dia ;
				 	 int diasMes=diasSegunMes(mes,anio);
				 	 do {
				 		 try {
				 			 System.out.println("Ingrese dia:"); 
						 	 dia = sc.nextInt();
						 	 if(dia<=0 || dia>diasMes) {
						 		if(anio%4==0) {
							 		 System.out.println(anio+" es año bisiesto");
							     }
						 		 System.out.println("Para el mes:"+mes+"\nLos dias son validos unicamente si estan entre 1 y "+diasMes);
						 	 }
				 		 }catch(InputMismatchException e) {
					 		 System.out.println("Error en la fecha, se introdujo una cadena, se pide el numero de dia");
					 		 dia=0;
					 		 sc.nextLine();
					 	 }
				 	 }while(dia<=0 || dia>diasMes); 	 
				 	 LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
				 	 jugadores.add(new Jugador(nombre, apellido, nacionalidad, estatura, peso, posicion, fechaNacimiento));
				 	 break;
			 case 2: System.out.println("------- BUSCAR JUGADOR -------");
				 	 System.out.println("Ingrese nombre:"); 
				 	 String nombreBuscar = sc.nextLine();
				 	 System.out.println("Ingrese apellido:");
				 	 String apellidoBuscar = sc.nextLine();
				 	 Iterator<Jugador>iterator = jugadores.iterator();
				 	 int encontrado = 0;
					 while(iterator.hasNext()) {
						Jugador j = iterator.next();
						if(j.getNombre().equals(nombreBuscar) && j.getApellido().equals(apellidoBuscar)) {
							System.out.println(j.toString());
							encontrado++;
						}
					 }
					 if(encontrado == 0)
							System.out.println("No hay nigun jugador registrado como: "+nombreBuscar+" "+apellidoBuscar);
				 	 break;
			 case 3: System.out.println("------- JUGADORES -------");
				 	 jugadores.sort(Comparator.comparing(Jugador::getApellido));
				     jugadores.forEach(jug -> System.out.println(jug.toString()));
				 	 break;
			 case 4: System.out.println("------- MODIFICAR JUGADOR -------");
				 	 System.out.println("Ingrese nombre:"); 
				 	 String nombreModificar = sc.nextLine();
				 	 System.out.println("Ingrese apellido:");
				 	 String apellidoModificar = sc.nextLine();
				 	 Iterator<Jugador>iteratorModificar = jugadores.iterator();
				 	 int encontradoModificar = 0;
					 while(iteratorModificar.hasNext()) {
						Jugador j = iteratorModificar.next();
						if(j.getNombre().equals(nombreModificar) && j.getApellido().equals(apellidoModificar)) {
							System.out.println(j.toString());
							System.out.println("Ingrese nuevo nombre:"); 
						 	j.setNombre(sc.nextLine());
						 	System.out.println("Ingrese nuevo apellido:"); 
						 	j.setApellido(sc.nextLine());
						 	System.out.println("Ingrese nueva nacionalidad:"); 
						 	j.setNacionalidad(sc.nextLine());
						 	System.out.println("Ingrese nueva posicion: (delantero, medio, defensa, arquero)"); 
						 	j.setPosicion(sc.nextLine()); 	
						 	float modificarEstatura;
						 	 do {
						 		 try {
						 			 System.out.println("Ingrese nueva estatura:"); 
								 	 modificarEstatura = sc.nextFloat(); 
								 	 if(modificarEstatura<=0)
								 		 System.out.println("Error en la estatura, no puede medir 0 o menos");
						 		 }catch(InputMismatchException e) {
						 			System.out.println("Se pide un dato numerico, intente de nuevo");
									modificarEstatura=0;
									sc.nextLine();
						 		 }
						 	 }while(modificarEstatura<=0); 
						 	j.setEstatura(modificarEstatura);
						 	float modificarPeso; 
						 	do {
						 		 try {
						 			 System.out.println("Ingrese nuevo peso:"); 
								 	 modificarPeso = sc.nextFloat(); 
								 	 if(modificarPeso<=0)
								 		 System.out.println("Error en el peso, no puede pesar 0 o menos");
						 		 }catch(InputMismatchException e) {
						 			System.out.println("Se pide un dato numerico, intente de nuevo");
									modificarPeso=0;
									sc.nextLine();
						 		 }
						 	 }while(modificarPeso<=0);
						 	j.setPeso(modificarPeso);
						 	int anioNuevo;
							System.out.println("Fecha de Nacimiento");
						 	do {
							 	 try {
							 		 System.out.println("Ingrese nuevo año:");
							 		 anioNuevo = sc.nextInt();
							 		 if(anioNuevo<=1900 || anioNuevo>anioActual.getYear())
							 			 System.out.println("Los años validos estan entre el 1900 y "+anioActual.getYear());
							 	 }catch(InputMismatchException e) {
							 		 System.out.println("Error en la fecha, se introdujo una cadena, se pide el numero de año");
							 		 anioNuevo=0;
							 		 sc.nextLine();
							 	 }
						 	}while(anioNuevo<=1900 || anioNuevo>anioActual.getYear());
						 	int mesNuevo;
						 	 do {
						 		try {
							 		System.out.println("Fecha de nacimiento \nIngrese mes:");
								 	mesNuevo = sc.nextInt();
								 	if(mesNuevo<=0 || mesNuevo>12)
								 		System.out.println("Los meses son validos unicamente si estan entre 1 y 12");
							 	 }catch(InputMismatchException e) {
							 		 System.out.println("Error en la fecha, se introdujo una cadena, se pide el numero del mes");
							 		 mesNuevo=0;
							 		 sc.nextLine();
							 	 }
						 	 }while(mesNuevo<=0 || mesNuevo>12);
						 	int diaNuevo;
						 	diasMes=diasSegunMes(mesNuevo,anioNuevo);
						 	 do {
						 		 try {
						 			 System.out.println("Ingrese dia:"); 
								 	 diaNuevo = sc.nextInt();
								 	 if(diaNuevo<=0 || diaNuevo>diasMes) {
								 		if(anioNuevo%4==0) {
									 		 System.out.println(anioNuevo+" es año bisiesto");
									     }
								 		 System.out.println("Para el mes:"+mesNuevo+"\nLos dias son validos unicamente si estan entre 1 y "+diasMes);
								 	 }
						 		 }catch(InputMismatchException e) {
							 		 System.out.println("Error en la fecha, se introdujo una cadena, se pide el numero de dia");
							 		 diaNuevo=0;
							 		 sc.nextLine();
							 	 }
						 	 }while(diaNuevo<=0 || diaNuevo>diasMes); 
						 	LocalDate fechaNacimientoModificada = LocalDate.of(anioNuevo, mesNuevo, diaNuevo);
						 	j.setFechaNacimiento(fechaNacimientoModificada);
							System.out.println("------- CAMBIOS REALIZADOS -------");
							System.out.println("Nuevos datos: ");
							System.out.println(j.toString());
							encontradoModificar++;
						}
					 }
					 if(encontradoModificar == 0)
							System.out.println("No hay nigun jugador registrado como: "+nombreModificar+" "+apellidoModificar);
				 	 break;
			 case 5: System.out.println("------- ELIMINAR JUGADOR -------");
				     System.out.println("Ingrese nombre:"); 
				 	 String nombreEliminar = sc.nextLine();
				 	 System.out.println("Ingrese apellido:");
				 	 String apellidoEliminar = sc.nextLine();
				 	 Iterator<Jugador>iteratorEliminar = jugadores.iterator();
				 	 int encontradoEliminar = 0;
					 while(iteratorEliminar.hasNext()) {
						Jugador j = iteratorEliminar.next();
						if(j.getNombre().equals(nombreEliminar) && j.getApellido().equals(apellidoEliminar)) {
							System.out.println("Jugador a eliminar:\n"+j.toString());
							iteratorEliminar.remove();
							System.out.println("Jugador eliminado con exito");
							encontradoEliminar++;
						}
					 }
					 if(encontradoEliminar == 0)
						 System.out.println("No hay nigun jugador registrado como: "+nombreEliminar+" "+apellidoEliminar);
				     break;
			 case 6: System.out.println("------- TOTAL JUGADORES -------");
			 		 if(jugadores.size()==0)
			 			 System.out.println("Aun no se registran jugadores");
			 		 else
			 			 System.out.println("Hay "+jugadores.size()+" jugador/es registrado/s"); 
			 		 break;
			 case 7: System.out.println("------- NACIONALIDAD DE JUGADORES -------");
				 	 System.out.println("Ingrese nacionalidad: ");
				 	 String nacionalidadBuscar = sc.nextLine();
				 	 Iterator<Jugador>iteratorNacionalidad = jugadores.iterator();
				 	 int encontradoNacionalidad = 0;
					 while(iteratorNacionalidad.hasNext()) {
						Jugador j = iteratorNacionalidad.next();
						if(j.getNacionalidad().equals(nacionalidadBuscar)) {
							encontradoNacionalidad++;
						}
					 }
					 if(encontradoNacionalidad == 0)
						System.out.println("No hay ningun "+nacionalidadBuscar+" registrado");
					 else
						System.out.println("Hay "+encontradoNacionalidad+" "+nacionalidadBuscar+" registrado/s");
					 break;
			 case 8: System.out.println("------- FIN DEL PROGRAMA -------");
			 		 break;
			 default: System.out.println("Opcion invalida, vuelva a elegir :)");
			}
		} while(opcion != 8);
		sc.close();
	}
	public static int diasSegunMes(int mes,int anio) {
		int dias=0;
		switch(mes) {
			case 2: dias= anio%4 == 0? 29:28 ; //para saber si es bisiesto o no
					break;
			
			case 1,3,5,7,8,10,12: dias=31;
							  	  break;
			case 4,6,9,11: dias=30;
							break;
		
		}
		return dias;
	}
}

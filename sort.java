package clases;

/**
 * @author Fox21
 *
 */
public class Persona implements Comparable<Persona>
{
	private String nombre,apellidopaterno;
	private Integer promedio,edad;
	
	public Persona(String nombre,String apellidopaterno,Integer promedio,Integer edad){
		this.nombre=nombre;
		this.apellidopaterno=apellidopaterno;
		this.promedio=promedio;
		this.edad=edad;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getApellidopaterno(){
		return apellidopaterno;
	}
	public void setApellidopaterno(String apellidopaterno){
		this.apellidopaterno=apellidopaterno;
	}
	
	public Integer getPromedio(){
		return promedio;
	}
	public void setPromedio(Integer promedio){
		this.promedio=promedio;
	}
	
	public Integer getEdad(){
		return edad;
	}
	public void setEdad(Integer edad){
		this.edad=edad;
	}
	
	public String toString(){
		return "Nombre: "+ nombre + ", ApellidoP " + apellidopaterno + ", Promedio "+ promedio +", Edad "+ edad + "\n";
	}
	
	public int compareTo(Persona o) {
		return apellidopaterno.compareTo(o.getApellidopaterno());
		//return promedio.compareTo(o.getPromedio());
		//return edad.compareTo(o.getEdad());
	}
/*
	public int compareTo(Persona o) {
        Persona persona = (Persona)o;       
        
        if(this.apellidopaterno.compareToIgnoreCase(persona.apellidopaterno) == 0) {           
            if(this.nombre.compareToIgnoreCase(persona.nombre) == 0) {
                return promedio.compareTo(persona.promedio);
            } else {
                return edad.compareTo(persona.edad);
            }
        } else {
            return this.apellidopaterno.compareToIgnoreCase(persona.apellidopaterno);
        }       
       
    }
*/
}

//Main

package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import clases.Persona;

public class Principal {
	public static void main(String[] args){
		Persona p1=new Persona("Pablo","Escarcena",15,18);
		Persona p2=new Persona("Rosa","Paredes",13,17);
		Persona p3=new Persona("Lucas","Gonzales",9,19);
		Persona p4=new Persona("Lina","Meneses",11,20);
		Persona p5=new Persona("Jimena","Arpa",18,22);
		
		List<Persona> personas=new ArrayList<Persona>() ;
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);
		
		//Collections.sort(personas,Collections.reverseOrder());
		Collections.sort(personas);
		for(Persona elemento:personas)
		{
			System.out.println(elemento);
		}
	}
}

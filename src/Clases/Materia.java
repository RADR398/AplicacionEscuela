package Clases;
// Generated 10-20-2015 07:14:19 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Materia generated by hbm2java
 */
public class Materia  implements java.io.Serializable {


     private Integer idMateria;
     private String nombre;
     private String descripcion;
     private Set docenteMaterias = new HashSet(0);

    public Materia() {
    }

	
    public Materia(String nombre) {
        this.nombre = nombre;
    }
    public Materia(String nombre, String descripcion, Set docenteMaterias) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.docenteMaterias = docenteMaterias;
    }
   
    public Integer getIdMateria() {
        return this.idMateria;
    }
    
    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getDocenteMaterias() {
        return this.docenteMaterias;
    }
    
    public void setDocenteMaterias(Set docenteMaterias) {
        this.docenteMaterias = docenteMaterias;
    }




}



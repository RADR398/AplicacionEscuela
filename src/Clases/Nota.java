package Clases;
// Generated 10-20-2015 07:14:19 PM by Hibernate Tools 4.3.1



/**
 * Nota generated by hbm2java
 */
public class Nota  implements java.io.Serializable {


     private Integer idNota;
     private Estudiante estudiante;
     private Trabajador trabajador;
     private int nota;
     private int periodo;

    public Nota() {
    }

    public Nota(Estudiante estudiante, Trabajador trabajador, int nota, int periodo) {
       this.estudiante = estudiante;
       this.trabajador = trabajador;
       this.nota = nota;
       this.periodo = periodo;
    }
   
    public Integer getIdNota() {
        return this.idNota;
    }
    
    public void setIdNota(Integer idNota) {
        this.idNota = idNota;
    }
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Trabajador getTrabajador() {
        return this.trabajador;
    }
    
    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
    public int getNota() {
        return this.nota;
    }
    
    public void setNota(int nota) {
        this.nota = nota;
    }
    public int getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }




}



package Clases;
// Generated 10-20-2015 07:14:19 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Matricula generated by hbm2java
 */
public class Matricula  implements java.io.Serializable {


     private Integer idMatricula;
     private Estudiante estudiante;
     private Monto monto;
     private Trabajador trabajador;
     private Date fecha;
     private int turno;
     private Set mensualidads = new HashSet(0);
     private Set matriculaGrados = new HashSet(0);

    public Matricula() {
    }

	
    public Matricula(Estudiante estudiante, Monto monto, Trabajador trabajador, Date fecha, int turno) {
        this.estudiante = estudiante;
        this.monto = monto;
        this.trabajador = trabajador;
        this.fecha = fecha;
        this.turno = turno;
    }
    public Matricula(Estudiante estudiante, Monto monto, Trabajador trabajador, Date fecha, int turno, Set mensualidads, Set matriculaGrados) {
       this.estudiante = estudiante;
       this.monto = monto;
       this.trabajador = trabajador;
       this.fecha = fecha;
       this.turno = turno;
       this.mensualidads = mensualidads;
       this.matriculaGrados = matriculaGrados;
    }
   
    public Integer getIdMatricula() {
        return this.idMatricula;
    }
    
    public void setIdMatricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Monto getMonto() {
        return this.monto;
    }
    
    public void setMonto(Monto monto) {
        this.monto = monto;
    }
    public Trabajador getTrabajador() {
        return this.trabajador;
    }
    
    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getTurno() {
        return this.turno;
    }
    
    public void setTurno(int turno) {
        this.turno = turno;
    }
    public Set getMensualidads() {
        return this.mensualidads;
    }
    
    public void setMensualidads(Set mensualidads) {
        this.mensualidads = mensualidads;
    }
    public Set getMatriculaGrados() {
        return this.matriculaGrados;
    }
    
    public void setMatriculaGrados(Set matriculaGrados) {
        this.matriculaGrados = matriculaGrados;
    }




}


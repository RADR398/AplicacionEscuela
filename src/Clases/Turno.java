package Clases;
// Generated 10-20-2015 07:14:19 PM by Hibernate Tools 4.3.1



/**
 * Turno generated by hbm2java
 */
public class Turno  implements java.io.Serializable {


     private Integer idTurno;
     private boolean estado;

    public Turno() {
    }

    public Turno(boolean estado) {
       this.estado = estado;
    }
   
    public Integer getIdTurno() {
        return this.idTurno;
    }
    
    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }




}



package Clases;
// Generated 10-20-2015 07:14:19 PM by Hibernate Tools 4.3.1



/**
 * PagoMensualidad generated by hbm2java
 */
public class PagoMensualidad  implements java.io.Serializable {


     private Integer idPagoMensualidad;
     private FacturaMensualidad facturaMensualidad;
     private Mensualidad mensualidad;

    public PagoMensualidad() {
    }

    public PagoMensualidad(FacturaMensualidad facturaMensualidad, Mensualidad mensualidad) {
       this.facturaMensualidad = facturaMensualidad;
       this.mensualidad = mensualidad;
    }
   
    public Integer getIdPagoMensualidad() {
        return this.idPagoMensualidad;
    }
    
    public void setIdPagoMensualidad(Integer idPagoMensualidad) {
        this.idPagoMensualidad = idPagoMensualidad;
    }
    public FacturaMensualidad getFacturaMensualidad() {
        return this.facturaMensualidad;
    }
    
    public void setFacturaMensualidad(FacturaMensualidad facturaMensualidad) {
        this.facturaMensualidad = facturaMensualidad;
    }
    public Mensualidad getMensualidad() {
        return this.mensualidad;
    }
    
    public void setMensualidad(Mensualidad mensualidad) {
        this.mensualidad = mensualidad;
    }




}


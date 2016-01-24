
package Metodos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Validar {
    private  String cedula;
    private String LETRAS = "ABCDEFGHJKLMNPQRSTUVWXY";
    

    
     private String getCedulaSinLetra()
     {
        if(cedula!=null)
        {
            return cedula.substring(0,13);
        }
        else
        {
            return null;
    
        }
     }
     
     private String getLetraCedula(){
        if(cedula!=null)
        {
            return cedula.substring(13,14);
        }
        else 
        {    
            return null;
        }
    }
    
      private String getSufijoCedula(){
        if(cedula!=null)
        {
            return cedula.substring(9,14);
        }else 
        {
            return null;
        }
    }
     
       private String getFechaCedula(){
        if(cedula!=null)
        {
            return cedula.substring(3,9);
        }else
        {
            return null;
        }    
            
    }
        private String getPrefijoCedula(){
        if(cedula!=null)
            return cedula.substring(0,3);
        else 
            return null;
    }
        private String getCedula() {
        return cedula;
        }
        
        public void setCedula(String cedula) {
            
        cedula = cedula.trim().replaceAll("-","");
        
        if(cedula == null || cedula.length() != 14)
            this.cedula = null;
        else
            this.cedula = cedula.trim().replaceAll("-","").toUpperCase();
        
    }
        private char calcularLetra(){
            
        int posicionLetra = getPosicionLetra();
        
        if(posicionLetra <0 || posicionLetra>= LETRAS.length())
            return '?';
        else
            return LETRAS.charAt(posicionLetra);
        
    }
        
        private boolean isCedulaValida(){     
        if(!isPrefijoValido())
            return false;
            
        if(!isFechaValida())
            return false;
            
        if(!isSufijoValido())
            return false;
        
        if(!isLetraValida())
            return false;
            
        return true;
    }
        private boolean isPrefijoValido(){
        String prefijo = this.getPrefijoCedula();
        
        if(prefijo==null) return false;
        
        Pattern p = Pattern.compile("^[0-9]{3}$");
        Matcher m = p.matcher(prefijo);
        if (!m.find())       
            return false;
        
        return true;
    }
        
        private boolean isFechaValida(){
        String fecha = this.getFechaCedula();
        
        if(fecha == null) return false;
        
        Pattern p = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])(0[1-9]|1[012])([0-9]{2})$");
        Matcher m = p.matcher(fecha);
        if (!m.find())
            return false;
            
        // verificar si la fecha existe en el calendario
        try {
         DateFormat df = new SimpleDateFormat("ddMMyy");
         if(!fecha.equals(df.format(df.parse(fecha)))){ 
          return false;
         }
        } catch (ParseException ex) {
         return false;
        }
        
        return true;
    }
        
        private boolean isSufijoValido(){
        String sufijo = this.getSufijoCedula();
        
        if(sufijo == null) return false;
        
        Pattern p = Pattern.compile("^[0-9]{4}[A-Y]$");
        Matcher m = p.matcher(sufijo);
        if (!m.find())
            return false;
        
        return true;
    }
        
        private boolean isLetraValida(){
        String letraValida = null;
        String letra = this.getLetraCedula();
        
        if(letra == null) return false;
        
        letraValida = String.valueOf(this.calcularLetra());
        
        return letraValida.equals(letra);
    }
        
    private int getPosicionLetra(){
        int posicionLetra = 0;
        String cedulaSinLetra = this.getCedulaSinLetra();
        long numeroSinLetra = 0;
        
        if(cedulaSinLetra == null) return -1;
        
        try{
            numeroSinLetra =  Long.parseLong(cedulaSinLetra);
        }catch(NumberFormatException e){
            return -1;
        }
        
        posicionLetra = (int)(numeroSinLetra - Math.floor((double)numeroSinLetra/23.0) * 23);
        
        return posicionLetra;
    }
         
    public boolean Cedula(String numer){   
        
        setCedula(numer);
        String message = "Verificar numero de cédula, esta es erronea";
        boolean estado = false;
        
        
        if(isCedulaValida() && isLetraValida() && isPrefijoValido() && 
                isFechaValida() && isSufijoValido()){
        
            estado = true;
            
        }else{
            
            JOptionPane.showMessageDialog(null, message,"Error de cédula", JOptionPane.ERROR_MESSAGE);
            
        }
        
       return estado;
    }

     public boolean ValidarLetras(String cadena,String tutor){
    
        String numeros = "0123456789";
        cadena = cadena.trim();
        for(int i=0;i<cadena.length();i++){
        
            if(numeros.indexOf(cadena.substring(i, i+1), 0)!=-1){
            
                JOptionPane.showMessageDialog(null, tutor+" se encuentra mal escrito por favor verificarlo",
                  "Error de "+tutor,JOptionPane.ERROR_MESSAGE);
                return false;
            
          
            }
        
        }
        
        
    return true;
    }
     
    public String ArreglarCadenas(String cadena){
    
        cadena = cadena.trim();
        
        
        StringTokenizer st = new StringTokenizer(cadena, " ");
        String value = null;
        cadena =  "";
        while(st.hasMoreElements()){
        
         value = st.nextToken();
         cadena += value.substring(0, 1).toUpperCase()+value.substring(1, value.length())+" ";
        
        }
    return cadena;
    }
    
}

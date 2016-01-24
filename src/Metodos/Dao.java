/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;


import Clases.*;
import java.util.List;
import java.util.StringTokenizer;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Dao {
    
    public static String fecha = getFecha();
    
    public static List<Grupo> getGrupos(int turno){
    
        String consulta = "select * from Grupo where IdTurno";
        Session session = NewHibernateUtil.sessionFactory.openSession();
        SQLQuery query = session.createSQLQuery(String.format(consulta));
        List<Grupo> grupos = query.addEntity(Grupo.class).list();
        session.close();
        
        return grupos;
    
    }
    
    public static List<Integer> getTurnos(){
    
        String consulta = "select IdTurno from Turno where Estado = True";
        Session session = NewHibernateUtil.sessionFactory.openSession();
        SQLQuery query = session.createSQLQuery(String.format(consulta));
        List<Integer> turns = query.list();
        session.close();
        
        return turns;
    }
    
    public static String getFecha(){
    
        Session session = NewHibernateUtil.sessionFactory.openSession();
        String consulta = "select curdate()";
        consulta = session.createSQLQuery(String.format(consulta)).uniqueResult().toString();
        session.close();
        
        return consulta;
        
    
    }
   
    public static void SaveOrUpdateEstudiante(Estudiante estudiante){
    
        Session session = NewHibernateUtil.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(estudiante);
        tx.commit();
        session.flush();
        
    
    }
    
    public static void SaveOrUpdateTutor(List<Tutor> tutores){
    
        
       Session session = NewHibernateUtil.sessionFactory.openSession();
       Transaction tx = session.beginTransaction();
      
       for(Tutor tutor:tutores){
       
           session.saveOrUpdate(tutor);
           
       }
         tx.commit();
         session.flush();
        
        session.close();
        
    }
    
    public static String GetCarnet(){
    
        String consulta = "select getCarnet()";
        Session session = NewHibernateUtil.sessionFactory.openSession();
        SQLQuery consultaMysql = session.createSQLQuery(String.format(consulta));
        
      String value = consultaMysql.uniqueResult().toString();
      session.close();
      
    return value;
    }
    
    public static int idEstudiante(String carnet){
    
    String consulta = "select count(*) "
                + "from Estudiante";
    Session session = NewHibernateUtil.sessionFactory.openSession();
    
    
    SQLQuery consultaMysql = session.createSQLQuery(String.format(consulta));
    int value = Integer.parseInt(consultaMysql.uniqueResult().toString());
    
    session.close();
    
    return value;
    }
    
    
    
    public static Object[] getItems(){
    
        Session session = NewHibernateUtil.sessionFactory.openSession();
        List<Rol> objetos = session.createSQLQuery(String.format("select * from Rol")).addEntity(Rol.class).list();
        Object[] items;
        items = new Object[objetos.size()+1];
        int i = 1;
        items[0] = "Seleccionar Opcion";
        
        for(Rol c : objetos){
            
            items[i] = (Object)c.getNombre();
            i++;
            
        }
        
        session.close();
        
    return items;
    }
    
    public static void SaveOrUpdateTrabajador(Trabajador t){
    
        Session session = NewHibernateUtil.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.saveOrUpdate(t);
        
        tx.commit();
        session.flush();
        
        session.close();
    
    }
    
    public static void PermisosUsuario(String usuario,String contraseña,String rol){
        
        String consulta = "CREATE USER :usuario @'localhost' IDENTIFIED BY :contraseña ;";
        String permisos = "";
//        String [] tablas;
        
        switch (rol) {
            case "Director":
                
                permisos = "GRANT ALL PRIVILEGES ON School. * TO :usuario @'localhost'";
                
                break;
                
            case "Secretaria":
                
//                permisos = "GRANT ALL PRIVILEGES ON School.Matricula to :usuario @'localhost'";
                String [] tablas = {"Matricula","Mensualidad","FacturaMensualidad","Estudiante","Tutor","MatriculaGrado"
                ,"PagoMensualidad"};
                permisos = ObjetoPermisos(tablas);
                
                break;
        }
        
        StringTokenizer st = new StringTokenizer(permisos, ";");
        
        Session session = NewHibernateUtil.sessionFactory.openSession();
        session.createSQLQuery(String.format(consulta))
        .setParameter("usuario", usuario)
        .setParameter("contraseña", contraseña)
        .executeUpdate();
        
        session.flush();
        
        while(st.hasMoreElements()){

             consulta = st.nextToken();
             session.createSQLQuery(String.format(consulta))
            .setParameter("usuario", usuario)
            .executeUpdate();

        }

session.close();
    
    }
    
    public static String ObjetoPermisos(String [] tablas){
        
        String part1 = "GRANT ALL PRIVILEGES ON School.";
        String part2 = " TO :usuario @'localhost'";
        String permiso = "";
        int tam = tablas.length;
        
        for (int i = 0; i<tam; i++) {
            
            permiso += part1 + tablas[i] + part2;
            
            if((i+1) != tam){
                
                permiso += ";";
            
            }
            
        }
        
        return permiso;
    }
    
    
    public static String[] getGrados(int value){
        
        Session session = NewHibernateUtil.sessionFactory.openSession();
        List<Grado> grados = session.createSQLQuery(String.format("select * from Grado where Nivel = :value")).
                             addEntity(Grado.class).
                             setParameter("value", value).
                             list();
        String[] listaGrados = new String[grados.size()+1];
        
        listaGrados[0] = "Seleccionar Opcion";
        
        int i=1;
        for(Grado grado:grados){
            
            listaGrados[i] = grado.getNombre();
            i++;
        }
        
        return listaGrados;
    }
    
    
    public static int Year(){
    
        Session session = NewHibernateUtil.sessionFactory.openSession();
        int year = Integer.parseInt(session.createSQLQuery("select year(curdate())").uniqueResult().toString());
        session.close();
        
        return year;
    }
    
    public static int Dia(int año, int mes){
        
        String date = año +"-"+mes+"-"+1;
        String consulta = "select day(last_day(:fecha))";
        Session session = NewHibernateUtil.sessionFactory.openSession();
        int dia = Integer.parseInt(session.createSQLQuery(consulta).setParameter("fecha", date).uniqueResult().toString());
        session.close();
        
        return dia;
        
    }
}

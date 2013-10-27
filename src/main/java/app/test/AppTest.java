/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.test;

import app.dao.ServicioDAO;
import app.model.Servicio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrador
 */
public class AppTest {
    
        public static void main(String[] args) {
        //AppTest.getAll();
        //AppTest.addCampo();
        AppTest.listServicio();
    }

/*    public static void getAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("h_database.xml");

        LocalDAO localDAO = (LocalDAO) context.getBean("localDAO");
        List<Local> locales = localDAO.list();
        for (Local local : locales) {
            System.out.println(local.getDescripcion() + " " + local.getTelefono());
        }
    }
    
    public static void addCampo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("h_database.xml");
        LocalDAO localDAO = (LocalDAO) context.getBean("localDAO");
        CampoDAO campoDAO = (CampoDAO) context.getBean("campoDAO");
        
        
        Local local = localDAO.get(new Local(13l));
        
        Campo campo = new Campo();
        campo.setCostoHora(12D);
        campo.setDescripcion("Campod de Basket");
        campo.setLocal(local);
        campoDAO.save(campo);
        
        System.out.println(campo.getId() +" " + campo.getDescripcion());
    }
    */
    public static void listServicio(){
        ApplicationContext context = new ClassPathXmlApplicationContext("database.xml");
        ServicioDAO servicioDAO = (ServicioDAO) context.getBean("servicioDAO");//Aca va el nombre q tiene el ServicioDAOH en el repository
        
        
        Servicio servicio = servicioDAO.get(new Servicio(1l));//Traer el q tiene id= 1L  (LONG)
        
        System.out.println(servicio.getId() +" " + servicio.getDescripcion()
                + " "+ servicio.getCostoHora());
    }
    
    
    
}

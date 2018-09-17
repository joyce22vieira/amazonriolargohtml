package amazonrl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import amazonrl.model.Usuario;


public class App {
    public static void main( String[] args ){
    	EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
	
         Usuario user = new Usuario();
		 user.setNome("Luiz");
		 user.setSenha("auxilioebom");
         
		tx.commit();
		manager.close();
		JPAUtil.close();
    }
}

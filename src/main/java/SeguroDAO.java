import Entity.Seguro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SeguroDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");

    private EntityManager manager = emf.createEntityManager();

    private EntityTransaction transaction = manager.getTransaction();

    public void insertar(Seguro seguro){
        try {
            transaction.begin();
            if (manager.contains(seguro)){
                System.out.println("El seguro ya existe en la base de datos");
            } else {
                manager.persist(seguro);
            }
            transaction.commit();

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
        }
    }

    public void leer(int id){
        Seguro seguroBuscar;
        try {
            transaction.begin();
            seguroBuscar= manager.find(Seguro.class, id);
            System.out.println(seguroBuscar);

            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
        }
    }

    public void actualizar(String nombre, int id){
        try {
            Seguro seguroActualizar;
            transaction.begin();
            seguroActualizar = manager.find(Seguro.class, id);
            seguroActualizar.setNombre(nombre);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
        }
    }

    public void borrar(Seguro seguro){
        try {
            transaction.begin();
            manager.remove(seguro);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
        }
    }
}

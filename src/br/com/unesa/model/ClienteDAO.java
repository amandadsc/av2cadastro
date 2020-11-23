package br.com.unesa.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Amanda Dias
 * @author Abraão Barreiros
 * @brief Classe DAO com acesso ao banco AV2CadastroPU
 * @date 23/11/2020
 */
public class ClienteDAO {
    private EntityManager getEntityManager(){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AV2CadastroPU");
        EntityManager em = emf.createEntityManager();
        
        return em;
    }
    protected EntityManager entityManager;
    
    //Cadastra cliente
    public void incluir(Cliente cliente) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!!!");
            em.getTransaction().commit();
        } catch(Exception ex){
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao incluir cliente! "+ex);
        } finally {
            em.close();
        }
    }
    
    //Atualiza cliente
    public void atualizar(Cliente cliente) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(cliente);
            JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!!!");
            em.getTransaction().commit();
        } catch(Exception ex){
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente! "+ex);
        } finally {
            em.close();
        }   
    }
    
    //Exclui cliente
    public void excluir(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Cliente cliente = em.find(Cliente.class, id);
            em.remove(cliente);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso!");
        } catch (Exception ex) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente! "+ex);
        } finally {
            em.close();
        }
    }
    
    //Busca cliente por id
    public Cliente buscar(int id) {
        EntityManager em = getEntityManager();
        Cliente cliente = null;
        try {
            cliente = em.find(Cliente.class, id);
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente "+ex);
        }finally {
            em.close();
        }
        return cliente;
    }
     
    
    //Lista clientes
    @SuppressWarnings("unchecked")
    public List<Cliente> listar() {
        EntityManager em = getEntityManager();
        return em.createQuery("select c from Cliente c").getResultList();

    }
}

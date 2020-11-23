package br.com.unesa.controller;

import br.com.unesa.model.Cliente;
import br.com.unesa.model.ClienteDAO;
import java.util.List;

/**
 *
 * @author Amanda Dias
 * @author Abraão Barreiros
 * @brief Classe controller (efetua as chamadas da camada model)
 * @date 23/11/2020
 */
public class ClienteController {
    
    private ClienteDAO dao = new ClienteDAO();
    
    public void incluir(Cliente cliente){
        dao.incluir(cliente);
    }
    
    public void excluir(int id){
        dao.excluir(id);
    }
    
    public List<Cliente> ObterTodos(){
        return dao.listar();
    }
    
    public Cliente buscar(int id){
        return dao.buscar(id);
    }
    
    public void atualizar(Cliente cliente){
        dao.atualizar(cliente);
    }

}

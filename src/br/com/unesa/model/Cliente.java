package br.com.unesa.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Amanda Dias
 * @author Abraão Barreiros
 * @brief Classe entidade Cliente
 * @date 23/11/2020
 */

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("C")
@Table(name = "cliente")
public class Cliente implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String nome;
    @Column
    private String endereco;
    @Column
    private String email;
    @Column
    private String tipo;
    @Column
    private String cpf;
    @Column
    private String rg;
    @Column
    private String cnpj;
    @Column
    private String inscEstadual;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public String getInscEstadual() {
        return inscEstadual;
    }


    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }
    
    public Cliente(){}
    
    public Cliente(int id, String nome, String endereco, String email, String tipo, String cpf, String rg, String cnpj, String inscEstadual){
        setId(id);
        setNome(nome);
        setEndereco(endereco);
        setEmail(email);   
        setTipo(tipo);
        setCpf(cpf);
        setRg(rg);
        setCnpj(cnpj);
        setInscEstadual(inscEstadual);
    }  
    
    @Override
    public String toString(){
        return " Id: "+id+"\n Nome: "+nome+"\n Endereço: "+endereco+"\n E-mail: "
                +email+"\n Tipo: "+tipo+"\n CPF: "+cpf+"\n RG: "
                +rg+"\n CNPJ: "+cnpj+"\n Insc. Estadual: "
                +inscEstadual;
    }
    
}

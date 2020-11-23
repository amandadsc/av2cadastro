package br.com.unesa.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Amanda Dias
 * @author Abraão Barreiros
 * @brief Classe entidade Juridico, filha de Cliente
 * @date 23/11/2020
 */

/*
@Entity
@DiscriminatorValue(value = "J")
public class Juridico extends Cliente {
    @Column
    private String cnpj;
    @Column
    private String inscEstadual;


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
    
    public Juridico() {}
    
    public Juridico(int id, String nome, String endereco, String email, String tipo, String cnpj, String inscEstadual) {
        super(id, nome, endereco, email, tipo);
        setCnpj(cnpj);
        setInscEstadual(inscEstadual);
    }
}
*/

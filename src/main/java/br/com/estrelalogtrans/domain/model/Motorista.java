package br.com.estrelalogtrans.domain.model;

import java.io.Serializable;
import java.util.HashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.estrelalogtrans.domain.model.composition.CNH;
import br.com.estrelalogtrans.domain.model.composition.Consulta;
import br.com.estrelalogtrans.domain.model.composition.Endereco;
import br.com.estrelalogtrans.domain.model.composition.RG;
import br.com.estrelalogtrans.domain.model.enums.Vinculo;

@Document
public class Motorista implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;
    private String nome;
    private String cpf;
    private RG rg = new RG();
    private Endereco endereco = new Endereco();
    private CNH cnh = new CNH();
    private HashSet<Consulta> consultas = new HashSet<>();
    private Vinculo vinculo = Vinculo.FROTA;
    private String observacao;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public RG getRg() {
        return rg;
    }
    public void setRg(RG rg) {
        this.rg = rg;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public CNH getCnh() {
        return cnh;
    }
    public void setCnh(CNH cnh) {
        this.cnh = cnh;
    }
    public HashSet<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(HashSet<Consulta> consultas) {
        this.consultas = consultas;
    }
    public Vinculo getVinculo() {
        return vinculo;
    }
    public void setVinculo(Vinculo vinculo) {
        this.vinculo = vinculo;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Motorista other = (Motorista) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
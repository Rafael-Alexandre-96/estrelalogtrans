package br.com.estrelalogtrans.domain.model.composition;

import java.io.Serializable;
import java.util.Date;

import br.com.estrelalogtrans.domain.model.Gerenciadora;

public class Consulta implements Serializable {
    private static final long serialVersionUID = 1L;

    private String codigo;
    private Gerenciadora gerenciadora;
    private Date dataConsulta;
    private Date dataVencimento;
    private StatusConsulta status = StatusConsulta.NAO_POSSUI;
    private String observacao;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Gerenciadora getGerenciadora() {
        return gerenciadora;
    }
    public void setGerenciadora(Gerenciadora gerenciadora) {
        this.gerenciadora = gerenciadora;
    }
    public Date getDataConsulta() {
        return dataConsulta;
    }
    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
    public Date getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public StatusConsulta getStatus() {
        return status;
    }
    public void setStatus(StatusConsulta status) {
        this.status = status;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public enum StatusConsulta {
        APROVADO, REPROVADO, EM_CONSULTA, NAO_POSSUI
    }
}
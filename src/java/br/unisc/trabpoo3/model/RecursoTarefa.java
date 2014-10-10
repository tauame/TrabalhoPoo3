/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisc.trabpoo3.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tauame
 */
@Entity
public class RecursoTarefa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;
    private String tipo;
    private Integer diasAlocacao;
    @Temporal(TemporalType.DATE)
    private Date inicioAlocacao;
    @Temporal(TemporalType.DATE)
    private Date fimAlocacao;

    @ManyToOne
    private Tarefa tarefa;
    @ManyToOne
    private Recurso recurso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getDiasAlocacao() {
        return diasAlocacao;
    }

    public void setDiasAlocacao(Integer diasAlocacao) {
        this.diasAlocacao = diasAlocacao;
    }

    public Date getInicioAlocacao() {
        return inicioAlocacao;
    }

    public void setInicioAlocacao(Date inicioAlocacao) {
        this.inicioAlocacao = inicioAlocacao;
    }

    public Date getFimAlocacao() {
        return fimAlocacao;
    }

    public void setFimAlocacao(Date fimAlocacao) {
        this.fimAlocacao = fimAlocacao;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecursoTarefa)) {
            return false;
        }
        RecursoTarefa other = (RecursoTarefa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.unisc.trabpoo3.model.RecursoTarefa[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisc.trabpoo3.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author tauame
 */
@Entity
public class Tarefa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titulo;
    private String descricao;
    private String origem;
    private String tempoEstimado;
    private Double custoEstimado;
    private String tempoEfetivo;
    private Integer numero;
    private Integer andamento;
    private String comentario;
    
    @ManyToOne
    private Projeto projeto;
    @OneToMany(mappedBy = "tarefa")
    private List<EquipeTarefa> equipeTarefaList;
    @OneToMany(mappedBy = "tarefa")
    private List<RecursoTarefa> recursoTarefaList;
    @OneToMany(mappedBy = "tarefa")
    private List<BugTarefa> bugTarefaList;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(String tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public Double getCustoEstimado() {
        return custoEstimado;
    }

    public void setCustoEstimado(Double custoEstimado) {
        this.custoEstimado = custoEstimado;
    }

    public String getTempoEfetivo() {
        return tempoEfetivo;
    }

    public void setTempoEfetivo(String tempoEfetivo) {
        this.tempoEfetivo = tempoEfetivo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAndamento() {
        return andamento;
    }

    public void setAndamento(Integer andamento) {
        this.andamento = andamento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public List<EquipeTarefa> getEquipeTarefaList() {
        return equipeTarefaList;
    }

    public void setEquipeTarefaList(List<EquipeTarefa> equipeTarefaList) {
        this.equipeTarefaList = equipeTarefaList;
    }

    public List<RecursoTarefa> getRecursoTarefaList() {
        return recursoTarefaList;
    }

    public void setRecursoTarefaList(List<RecursoTarefa> recursoTarefaList) {
        this.recursoTarefaList = recursoTarefaList;
    }

    public List<BugTarefa> getBugTarefaList() {
        return bugTarefaList;
    }

    public void setBugTarefaList(List<BugTarefa> bugTarefaList) {
        this.bugTarefaList = bugTarefaList;
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
        if (!(object instanceof Tarefa)) {
            return false;
        }
        Tarefa other = (Tarefa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.unisc.trabpoo3.model.Tarefa[ id=" + id + " ]";
    }
    
}

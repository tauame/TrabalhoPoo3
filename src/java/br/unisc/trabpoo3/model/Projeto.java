/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisc.trabpoo3.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tauame
 */
@Entity
public class Projeto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String area;
    private Double orcamentoDisponivel;
    private Double orcamentoUtilizado;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataInicio;  
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataPrevisaoFim;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @Column(length = 2)
    private String status;
    
    @ManyToOne
    private Departamento departamento;
    @ManyToOne
    private Empresa empresa;
    @OneToMany(mappedBy = "projeto")
    private List<Tarefa> tarefaList;
    @OneToMany(mappedBy = "projeto")
    private List<EquipeProjeto> equipeProjetoList;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getOrcamentoDisponivel() {
        return orcamentoDisponivel;
    }

    public void setOrcamentoDisponivel(Double orcamentoDisponivel) {
        this.orcamentoDisponivel = orcamentoDisponivel;
    }

    public Double getOrcamentoUtilizado() {
        return orcamentoUtilizado;
    }

    public void setOrcamentoUtilizado(Double orcamentoUtilizado) {
        this.orcamentoUtilizado = orcamentoUtilizado;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataPrevisaoFim() {
        return dataPrevisaoFim;
    }

    public void setDataPrevisaoFim(Date dataPrevisaoFim) {
        this.dataPrevisaoFim = dataPrevisaoFim;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Tarefa> getTarefaList() {
        return tarefaList;
    }

    public void setTarefaList(List<Tarefa> tarefaList) {
        this.tarefaList = tarefaList;
    }

    public List<EquipeProjeto> getEquipeProjetoList() {
        return equipeProjetoList;
    }

    public void setEquipeProjetoList(List<EquipeProjeto> equipeProjetoList) {
        this.equipeProjetoList = equipeProjetoList;
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
        if (!(object instanceof Projeto)) {
            return false;
        }
        Projeto other = (Projeto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.unisc.trabpoo3.model.Projeto[ id=" + id + " ]";
    }
    
}

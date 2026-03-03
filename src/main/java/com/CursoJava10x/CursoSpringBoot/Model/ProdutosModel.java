package com.CursoJava10x.CursoSpringBoot.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_Cadastro")
public class ProdutosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int codigo;
    private String nome;
    private double peso;

    public ProdutosModel() {
    }

    public ProdutosModel(int codigo, String nome, double peso) {
        this.codigo = codigo;
        this.nome = nome;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

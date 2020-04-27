/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atvextra;

/**
 *
 * @author yurim
 */
public abstract class Funcionario {
    
    protected String Nome;
    protected double salario;
    protected String cargo;

    
    public Funcionario(String Nome, String cargo) {
        this.Nome = Nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }
    
    public Funcionario(String Nome, double salario, String cargo) {
        this.Nome = Nome;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    public abstract double bonificacao(double salario);
    
    public abstract String tipobonificacao();
    
    public abstract String Cargo();
    
    
}

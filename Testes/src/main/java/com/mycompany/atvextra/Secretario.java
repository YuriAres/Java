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
public class Secretario extends Funcionario{
    
    public Secretario(String Nome, double salario, String cargo) {
        super(Nome, salario, cargo);
    }

    public Secretario(String Nome, String cargo) {
        super(Nome, cargo);
    }
    
    @Override
    public String Cargo(){
        return "Secretário";
    }

    @Override
    public String tipobonificacao() {
        return "3%";
    }

    @Override
    public double bonificacao(double salario) {
        this.salario = salario + (salario*0.03);
        return this.salario;
    }
    
}

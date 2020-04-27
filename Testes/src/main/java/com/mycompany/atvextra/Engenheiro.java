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
public class Engenheiro extends Funcionario{
    
    public Engenheiro(String Nome, double salario, String cargo) {
        super(Nome, salario, cargo);
    }

    public Engenheiro(String Nome, String cargo) {
        super(Nome, cargo);
    }
    
    @Override
    public String Cargo(){
        return "Engenheiro";
    }

    @Override
    public String tipobonificacao() {
        return "5%";
    }

    @Override
    public double bonificacao(double salario) {
        this.salario = salario + (salario*0.05);
        return this.salario;
    }
    
}

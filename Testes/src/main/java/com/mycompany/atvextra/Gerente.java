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
public class Gerente extends Funcionario{
    
    public Gerente(String Nome, double salario, String cargo) {
        super(Nome, salario, cargo);
    }

    public Gerente(String Nome, String cargo) {
        super(Nome, cargo);
    }
    

    @Override
    public double bonificacao(double salario){
        this.salario = salario + (salario*0.10);
        return this.salario;
    }
    
    @Override
    public String tipobonificacao(){
        return "10%";
    }
    
    
    
    @Override
    public String Cargo(){
        return "Gerente";
    }
    
}

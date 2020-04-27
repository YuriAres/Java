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
public class Diretor extends Funcionario{
    
    public Diretor(String Nome, double salario, String cargo) {
        super(Nome, salario, cargo);
    }
    
   
    
    @Override
    public double bonificacao(double salario){
        this.salario = salario + (salario*0.10);
        return this.salario;
    }

    public Diretor(String Nome, String cargo) {
        super(Nome, cargo);
    }
    
    @Override
    public String tipobonificacao(){
        return "10%";
    }
    
    
    
    @Override
    public String Cargo(){
        return "Diretor";
    }
    
    
    
    
}

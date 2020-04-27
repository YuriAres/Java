/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade005;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author yurim
 */
public class Contauniversitario extends Cliente {
    
    public Contauniversitario(String nome, int ID, String senha, double saldo) {
        super(nome, ID, senha, saldo);
    }
    
    protected String curso;

    public Contauniversitario(String curso, String nome, int ID, String senha, double saldo) {
        super(nome, ID, senha, saldo);
        this.curso = curso;
    }

    public Contauniversitario(String curso, String nome, int ID, String senha) {
        super(nome, ID, senha);
        this.curso = curso;
    }

    public Contauniversitario(String curso, String nome, int ID, String senha, double saldo, int tipoconta) {
        super(nome, ID, senha, saldo, tipoconta);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public void depositar(double valor){
        if(valor <= 0){
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro!", ERROR_MESSAGE);
        
        }else{
            this.saldo += valor + (valor*0.05);
            JOptionPane.showMessageDialog(null, "Operação Realizada com sucesso!\nDevido sua conta ser universitária 5% a mais ("+(valor*0.05)+" reais) foi depositado!", "Sucesso!", INFORMATION_MESSAGE);
        }
    
    }
    
    
    @Override
     public String tipoconta(){
            return "Conta Universitária";
        }

    @Override
    public void sacar(double valor) {
           if(valor > saldo){
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!", "Erro!", ERROR_MESSAGE);
        } else if(valor <= 0){
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro!", ERROR_MESSAGE);
        
        }else{
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Operação Realizada com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
        }
    
}
}

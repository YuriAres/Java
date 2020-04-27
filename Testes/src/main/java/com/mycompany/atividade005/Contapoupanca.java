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
public class Contapoupanca extends Cliente{
    
    public Contapoupanca(String nome, int ID, String senha, double saldo) {
        super(nome, ID, senha, saldo);
    }
    
    protected double poupanca;

    public Contapoupanca(double poupanca, String nome, int ID, String senha, double saldo) {
        super(nome, ID, senha, saldo);
        this.poupanca = poupanca;
    }

    public Contapoupanca(double poupanca, String nome, int ID, String senha, double saldo, int tipoconta) {
        super(nome, ID, senha, saldo, tipoconta);
        this.poupanca = poupanca;
    }

    public Contapoupanca(double poupanca, String nome, int ID, String senha) {
        super(nome, ID, senha);
        this.poupanca = poupanca;
    }

    public Contapoupanca(String nome, int ID, String senha) {
        super(nome, ID, senha);
    }

    public double getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(double poupanca) {
        this.poupanca = poupanca;
    }
    
     public void sacar(double valor, int i){
        if(valor > poupanca){
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!", "Erro!", ERROR_MESSAGE);
        } else if(valor <= 0){
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro!", ERROR_MESSAGE);
        
        }else{
            this.poupanca -= valor;
            JOptionPane.showMessageDialog(null, "Operação Realizada com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
        }
    }
    
    public void depositar(double valor, int i){
        if(valor <= 0){
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro!", ERROR_MESSAGE);
        
        }else{
            this.poupanca += valor;
            JOptionPane.showMessageDialog(null, "Operação Realizada com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
        }
    
    }
    
    @Override
     public String tipoconta(){
            return "Conta Poupança";
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

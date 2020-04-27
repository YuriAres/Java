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
public class Contaespecial extends Cliente{
    
    protected double creditoespecial;

    public Contaespecial(double creditoespecial, String nome, int ID, String senha) {
        super(nome, ID, senha);
        this.creditoespecial = creditoespecial;
    }
    
    public Contaespecial(String nome, int ID, String senha, double saldo) {
        super(nome, ID, senha, saldo);
    }

    public Contaespecial(String nome, int ID, String senha, double saldo, int tipoconta) {
        super(nome, ID, senha, saldo, tipoconta);
    }
    
    public void sacar(double valor, int i){
        if(valor <= 0){
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro!", ERROR_MESSAGE);
        
        }else{
            this.creditoespecial += valor;
            JOptionPane.showMessageDialog(null, "Operação Realizada com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
        }
    }
    
    public void depositar(double valor, int i){
        if(valor > creditoespecial){
            double restante = valor - this.creditoespecial;
            this.creditoespecial = 0;
            this.saldo += restante;
            JOptionPane.showMessageDialog(null, "O valor de pagamento foi maior que o saldo devedor, devido a isso o montante de R$ "+restante+" foi adicionado ao seu saldo!", "Concluido!", INFORMATION_MESSAGE);
            
        }else if(valor <= 0){
            JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro!", ERROR_MESSAGE);
        
        }if(valor <= creditoespecial){
            this.creditoespecial -= valor;
            JOptionPane.showMessageDialog(null, "Operação Realizada com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
        }
    
    }

    public double getCreditoespecial() {
        return creditoespecial;
    }

    public void setCreditoespecial(double creditoespecial) {
        this.creditoespecial = creditoespecial;
    }

    public Contaespecial(String nome, int ID, String senha) {
        super(nome, ID, senha);
    }
    
    
    @Override
     public String tipoconta(){
            return "Conta Especial";
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

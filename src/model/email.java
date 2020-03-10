/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.EnviaEmail;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonas
 */
public class Email {

    /**
     * @return the destExtras
     */
    public String[] getDestExtras() {
        return destExtras;
    }

    /**
     * @param destExtras the destExtras to set
     */
    public void setDestExtras(String[] destExtras) {
        this.destExtras = destExtras;
    }

    /**
     * @return the password
     */
        private String remetente;
        private String destinatarios;
        private String assunto;
        private String corpoEmail;
        private String password;
        private String [] destExtras;
        
    
  public  Email (){
      
  }
        
        public Email (String remetente,String password,String destinatarios, String assunto,String corpoEmail){
            this.remetente = remetente;
            this.password = password;
            this.destinatarios = destinatarios;
            this.assunto = assunto;
            this.corpoEmail = corpoEmail;
        }

    
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
       

    /**
     * @return the remetente
     */
    public String getRemetente() {
        return remetente;
    }

    /**
     * @param remetente the remetente to set
     */
    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    /**
     * @return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @param assunto the assunto to set
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    /**
     * @return the destinatarios
     */
    public String getDestinatarios() {
        return destinatarios;
    }

    /**
     * @param destinatarios the destinatarios to set
     */
    public void setDestinatarios(String destinatarios) {
        this.destinatarios = destinatarios;
    }

    /**
     * @return the corpoEmail
     */
    public String getCorpoEmail() {
        return corpoEmail;
    }

    /**
     * @param corpoEmail the corpoEmail to set
     */
    public void setCorpoEmail(String corpoEmail) {
        this.corpoEmail = corpoEmail;
    }
    
    public void check(){
       EnviaEmail  send = new EnviaEmail();
       send.autentication(this.remetente, this.password,this.destinatarios, this.assunto,  this.corpoEmail);
    }
    
        
    
    
    
    
    
    
}

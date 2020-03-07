/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jonas
 */
public class email {
    
    
    
        private String remetente;
        private String assunto;
        private String [] destinatarios;
        private String corpoEmail;

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
    public String[] getDestinatarios() {
        return destinatarios;
    }

    /**
     * @param destinatarios the destinatarios to set
     */
    public void setDestinatarios(String[] destinatarios) {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
}

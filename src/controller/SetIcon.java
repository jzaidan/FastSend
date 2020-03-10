/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;
import java.awt.Toolkit;

/**
 *
 * @author Jonas
 */
public class SetIcon {
    public void inserirIcon(JFrame frame){
        try{
            
          frame.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/email_open.png"));
            
            
        }catch(Exception ex){
            
        }
    
    }
    
    
    
    
}

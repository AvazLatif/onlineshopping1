/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.component;

import com.raven.swing.MyTextField;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author AVA
 */
public class PanelLoginAndregister extends javax.swing.JLayeredPane {

    
    
    public PanelLoginAndregister() {
        initComponents();
        initRegister();
        initLogin();
        login.setVisible(false);
        register.setVisible(true);
     
    }

    private void initRegister(){
        register.setLayout(new MigLayout("wrap","push[center]push","push[]push"));
        JLabel label=new JLabel("Create Account");
        label.setFont(new Font("sansserif",1,30));
        label.setForeground(new Color(7,164,121));
        register.add(label);
        MyTextField txtUser=new MyTextField();
        
    }
    
    private void initLogin(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register = new javax.swing.JPanel();
        login = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        add(register, "card2");

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        add(login, "card3");
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables

}

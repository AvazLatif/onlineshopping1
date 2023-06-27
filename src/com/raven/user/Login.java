/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.raven.user;

import com.raven.component.CoverPanel;
import com.raven.component.PanelLoginAndregister;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;


public class Login extends javax.swing.JFrame {

    
   private MigLayout layout;
    private CoverPanel cover;
    private PanelLoginAndregister LoginAndRegister;
    private boolean islogin;
    private final double addSize=30;
    private final double coverSize=40;
    private final double loginsize=60;
    private final DecimalFormat df=new DecimalFormat("##0.###");
    
    
    public Login() {
        initComponents();
        init();
    }

    private void init() {
        layout=new MigLayout("fill,insets 0");
        cover =new CoverPanel();
        LoginAndRegister=new PanelLoginAndregister();
        TimingTarget target= new TimingTargetAdapter(){
          @Override
           public void timingEvent(float fraction){
               double fractionCover;
               double fractionlogin;
               double Size=coverSize;
               if(fraction<=0.5f){
                  Size+=fraction*addSize; 
               }else{
                   Size+=addSize-fraction*addSize;
               }
               if(islogin){
                  fractionCover=1f -fraction; 
                  fractionlogin=fraction;
               }else{
                   fractionCover=fraction;
                   fractionlogin=1f-fraction;
               }
               
               fractionCover=Double.valueOf(df.format(fractionCover));
               fractionlogin=Double.valueOf(df.format(fractionlogin));
               layout.setComponentConstraints(cover, "width " + Size + "%, pos "+fractionCover+"al 0 n 100%");
               layout.setComponentConstraints(LoginAndRegister, "width " +loginsize + "%, pos "+fractionlogin+"al 0 n 100%");
               bg.revalidate();
           }
           @Override
           public void end(){
               islogin=!islogin;
           }
       };
       Animator animator=new Animator(1000,target);
      animator.setAcceleration(0.5f);
       animator.setDeceleration(0.5f);
       animator.setResolution(0);
        bg.setLayout(layout);
        bg.add(cover,"width "+coverSize+"%, pos 0al 0 n 100%");
        bg.add(LoginAndRegister,"width "+loginsize+"%, pos 1al 0 n 100%");
       cover.addEvent(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae){
              if(!animator.isRunning()){
                   animator.start();
               }
             
            }
           
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables

   
}

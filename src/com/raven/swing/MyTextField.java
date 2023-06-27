/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.swing;

import com.raven.component.PanelLoginAndregister;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author AVA
 */
public class MyTextField extends JTextField{
    
    Icon prefixIcon;
    
    
    public MyTextField(){
        setBorder(new EmptyBorder(5,5,5,5));
        
        
    }
    protected void paintComponent(Graphics graphics ){
        super.paintComponent(graphics);
      Graphics2D g2=(Graphics2D)graphics;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
      int width=getWidth();
      int height=getHeight();
      g2.fillRect(2, height-1, width-4,1);
      g2.dispose();
      
  }
    
}

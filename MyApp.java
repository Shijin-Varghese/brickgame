/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myapp;
import javax.swing.*;
/**
 *
 * @author chinm
 */
public class MyApp  {

    public static void main(String[] args) {
       JFrame obj = new JFrame();
        GamePlay gameplay = new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("BrickBreaker");
        obj.setResizable(false);
        
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
        obj.setVisible(true);
//        9315087298
    }
}
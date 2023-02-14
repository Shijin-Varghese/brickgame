
package com.mycompany.myapp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import java.awt.BasicStroke;

import java.awt.Color;
import java.util.HashSet;

/**
 *
 * @author chinm
 */
public class MapGenerator  {
     public int map[][];
    public int bricksWidth;
    public int bricksHeight;
    public  int level;
    
    static int vis[][];
    public HashSet<int[]> set=new HashSet<>();
    public MapGenerator(int row , int col,int x){
        this.level=x;
        MapGenerator.vis=GamePlay.vis;
         map = new int[row][col];
         System.out.print(level+"mjjjs");
        if(level==1){
            int st=0;
               for (int[] map1 : map) {
             for (int j = 0; j < map[0].length; j++) {
                if(vis[st][j]!=1) {
                if(st%2==0 && j%2==1)
                         map1[j] = 2;
                  else   map1[j] = 1; 
                 }
                
             }
             st++;
         }
        }
         if(level==2){
             int st=0;
               for (int[] map1 : map) {
             for (int j = 0; j < map[0].length; j++) {
                 if(vis[st][j]!=1) {
                     if(st==0 && j==0){
                         map1[j] = 2;
                     }
                     
//                     if(st==0){
//                         if(j==2||j==5) map1[j] = 1; 
//                         else map1[j] = 2; 
//                     }
//                 else if(st%2==0 && j%2==1)
//                         map1[j] = 2;
//                  else  map1[j] = 1; 
                 }
             }
             st++;
         }
        }
         if(level==3){
             int st=0;
               for (int[] map1 : map) {
             for (int j = 0; j < map[0].length; j++) {
                  if(vis[st][j]!=1) {
                         if(st==0||st==3){
                         if(j==2||j==5) map1[j] = 1; 
                         else map1[j] = 2; 
                     }
                         else if(st%2==0 && j%2==1){
                       map1[j] = 2;
                  }
                     else  map1[j] = 1; 
                 }
             }
             st++;
         }
        }
        bricksWidth = 540/col;
        bricksHeight = 150/row;
    }
    public MapGenerator(int row , int col){
//        
        map = new int[row][col];
        
         for (int[] map1 : map) {
             for (int j = 0; j < map[0].length; j++) {
                 map1[j] = 1;
             }
         }
        bricksWidth = 540/col;
        bricksHeight = 150/row;
    }
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 2) {
                    g.setColor(Color.red);
                    g.fillRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.red);
                    g.drawRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                }
                if (map[i][j] == 1) {
                    g.setColor(Color.blue);
                    g.fillRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                }
            }

        }
    }
    public void setBricksValue(int value,int row,int col)
    {
        map[row][col] = value;

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performancecomparison;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdulaziz Al-Alshaikh
 */
public class Writer extends Thread {
    Database database;
    
    public Writer(Database database){
        this.database = database;
    }
    
    @Override
    public void run(){
        Random rd = new Random();
        for(int i = 0; i < Database.MAX_OPERATIONS; i++) {
            int randomId = rd.nextInt(0, Database.MAX_USER_ID + 1);
            //write operation.
            database.addShares(randomId, rd.nextInt(1, 100));
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {Logger.getLogger(Writer.class.getName()).log(Level.SEVERE, null, ex);}
        }
    }
    
}

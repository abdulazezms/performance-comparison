/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performancecomparison;

import java.util.Random;

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
        }
    }
    
}

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
public class Reader extends Thread {
    Database database;
    
    public Reader(Database database){
        this.database = database;
    }
    
    @Override
    public void run(){
        Random rd = new Random();
        for(int i = 0; i < Database.MAX_OPERATIONS; i++) {
            int randomId = rd.nextInt(0, Database.MAX_USER_ID + 1);
            //read operation.
            long shares = database.getSubscriberShares(randomId);
            //System.out.println("shares of subscriber with id = " + randomId + " = " + shares");
        }
    }
    
}

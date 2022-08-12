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
    public void run(){}
    
}

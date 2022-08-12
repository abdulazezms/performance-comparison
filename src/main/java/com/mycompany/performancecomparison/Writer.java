/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performancecomparison;

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
    public void run(){}
    
}

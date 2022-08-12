/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performancecomparison;

/**
 *
 * @author Abdulaziz Al-Alshaikh
 */
public class Database {
    
    private Subscriber [] subscribers;
    public static int MAX_OPERATIONS;
    public static int MAX_USER_ID;

    public Database(Subscriber [] subscribers, int maxOperations){
        this.subscribers = subscribers;
        MAX_OPERATIONS = maxOperations;
        MAX_USER_ID = subscribers.length - 1;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performancecomparison;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Abdulaziz Al-Alshaikh
 */
public class Database {
    
    private Subscriber [] subscribers;
    Lock lock;
    
    public Database(Subscriber [] subscribers){
        this.subscribers = subscribers;
        this.lock = new ReentrantLock();
    }
    
    
    
    
    
}

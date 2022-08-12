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
    
    
    //This method is called by a writer thread.
    public void addShares(int subscriberId, long shares){
        try{
            this.lock.lock();
            this.subscribers[subscriberId].addShares(shares);
        }
        finally{
            this.lock.unlock();
        }
    }
    
    //This method is called by a reader thread.
    public long getSubscriberShares(int subscriberId){
        try{
            this.lock.lock();
            return this.subscribers[subscriberId].getShares();
        }
        finally{
            this.lock.unlock();
        }
    }
    
    
    
}

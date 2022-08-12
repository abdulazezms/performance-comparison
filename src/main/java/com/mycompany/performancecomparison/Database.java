/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performancecomparison;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author Abdulaziz Al-Alshaikh
 */
public class Database {
    
    private Subscriber [] subscribers;
    ReentrantReadWriteLock lock;
    Lock readLock;
    Lock writeLock;
    public static int MAX_OPERATIONS;
    public static int MAX_USER_ID;

    public Database(Subscriber [] subscribers, int maxOperations){
        this.subscribers = subscribers;
        this.lock = new ReentrantReadWriteLock();
        this.readLock = lock.readLock();
        this.writeLock = lock.writeLock();
        MAX_OPERATIONS = maxOperations;
        MAX_USER_ID = subscribers.length - 1;
    }
    
    
    //This method is called by a writer thread.
    public void addShares(int subscriberId, long shares){
        try{
            this.writeLock.lock();
            this.subscribers[subscriberId].addShares(shares);
        }
        finally{
            this.writeLock.unlock();
        }
    }
    
    //This method is called by a reader thread.
    public long getSubscriberShares(int subscriberId){
        try{
            this.readLock.lock();
            return this.subscribers[subscriberId].getShares();
        }
        finally{
            this.readLock.unlock();
        }
    }

    
}

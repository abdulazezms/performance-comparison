/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performancecomparison;

import java.util.*;


/**
 *
 * @author Abdulaziz Al-Alshaikh
 */
public class Main {
    static final int NUMBER_OF_SUBSCRIBERS = (int)Math.pow(10, 6);
    static final int MAX_NUMBER_OF_OPERATIONS = (int)Math.pow(10, 8);
    static final int READER_THREADS = 7;
    
    
    public static void main(String[] args) throws InterruptedException {
        Subscriber [] subscribers = new Subscriber[NUMBER_OF_SUBSCRIBERS];
        for(int i = 0; i < subscribers.length; i++){
            int id = i;
            long shares = new Random().nextLong(0, 100);
            subscribers[i] = new Subscriber(id, shares);
        }
        
        Database database = new Database(subscribers, MAX_NUMBER_OF_OPERATIONS);
        Writer writerTask = new Writer(database);
        writerTask.setDaemon(true);
        writerTask.start();
        
        
        List<Reader> readerThreads = new ArrayList<>();
        for(int i = 0; i < READER_THREADS; i++) {
            Reader readerTask = new Reader(database);
            readerTask.setDaemon(true);
            readerThreads.add(readerTask);
        }
        
        
        long startTime = System.currentTimeMillis();
        
        for(Thread reader : readerThreads){
            reader.start();
        }
        
        for(Thread reader : readerThreads){
            reader.join();
        }
        
        long endTime = System.currentTimeMillis();
        
        System.out.println("Time taken = " + (endTime - startTime) + "ms");
    }
}

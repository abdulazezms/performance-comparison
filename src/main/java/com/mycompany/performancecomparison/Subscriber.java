/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performancecomparison;

/**
 *
 * @author Abdulaziz Al-Alshaikh
 */
public class Subscriber {
    private long shares;
    private final int id;
    
    public Subscriber(int id, long shares){
        this.id = id;
        this.shares = shares;
    }
    
    public long getShares(){
        return this.shares;
    }
    
    public void addShares(long newShares){
        this.shares += newShares;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 *Tatpiya_5907101005
 *Pannawat_5907101020 
 *
 * @author kp2442
 */
public class HashEntry {
    private String key;
    private String value;
    

    HashEntry(String key, String value) {
        this.key = key;
        this.value = value;
        
    }

    public String getKey() {
        return this.key;
    }

    public String getValue(String key) {
        // use string key to move down linked list in case of collision
        // haven't implemented this yet
        return this.value;
    }
}

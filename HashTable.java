/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/*
 *
 *Tatpiya_5907101005
 *Pannawat_5907101020
 * 
 */

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.Scanner;

public class HashTable {
    
    private final static int TABLE_SIZE = 10000; // number of indexes in hash table
    
    HashEntry[] table; // initialise array of HashEntry (table)
    /*public int count=0;
    public String [] countfind = new String [TABLE_SIZE];*/
    // constructor, create array, assign all values to null
    HashTable() {
        // create array of HashEntry, predefined size
        table = new HashEntry[TABLE_SIZE];
        // assign all values to null
        
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = null;
        }
    }

    // from key, find the correct index, load the HashEntry object and return the value
    public String getValue(String key) {
        int index = this.getKeyIndex(key);
        if(table[index]==null)
        	return  key +" does not exist";
        else{
        while(table[index].equals(key)==true){
        	        index++;
       }
        HashEntry chosen_entry = table[index];
        String chosen_entry_value = chosen_entry.getValue(key);
        return chosen_entry_value;
        }
    }

    // creates a new HashEntry object, inserts that into the table array at the correct index
    // determined by getKeyIndex(key)
    public void insert(String key, String value) {
    	value.toLowerCase();
        
        int index = this.getKeyIndex(key);
        while(table[index]!=null){
        index++;
        }
        HashEntry keyValuePair;
        keyValuePair = new HashEntry(key, value);
        table[index] = keyValuePair;
        /* countfind[count]=key;
        count++;*/
    }
    // ** PRIVATE FUNCTIONS ** //
    // get index from key
    private Integer getKeyIndex(String key) {
    
        key=key.toLowerCase();
        int hash = 7;
        
        for (int i = 0; i < key.length(); i++) {
            hash = (hash*31 + key.charAt(i))%5000;
        }
        return hash;
    }
    public boolean checkKey(String key){
    	
        key=key.toLowerCase();
    	int index = this.getKeyIndex(key);
    	return table[index]==null;
    }
    public void getEdit(String key,String value){
    	value.toLowerCase();
       
    	if(checkKey(key)==true)
    		 System.out.println("your key '"+key+"' does not exist");
    	else{
    		int index = this.getKeyIndex(key);
    		  HashEntry keyValuePair;
    		  keyValuePair = new HashEntry(key, value);
    		  table[index] = keyValuePair;
    		  System.out.println("Edit ok");
    	}
    }
    public void deleteKey(String key){
    	 int index = this.getKeyIndex(key);
    	 HashEntry keyValuePair;
    	 keyValuePair = new HashEntry(null, key +" Does not exist");
    	 table[index] = keyValuePair;
    	 System.out.println("this key "+key+" have Delete");
    }
     public void displaymenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("************ Menu ************");
        System.out.println("::  1. Load word dictionary ::");
        System.out.println("******************************");
        System.out.print("Choose the choice :: ");

       
        int ch = sc.nextInt();
        switch(ch){
                    //a
            case 1  :insert("about","à¹€à¸�à¸µà¹ˆà¸¢à¸§à¸�à¸±à¸š"); 
                    insert("across","à¸‚à¹‰à¸²à¸¡");
                    insert("add","à¹€à¸žà¸´à¹ˆà¸¡");
                    insert("again","à¸­à¸µà¸�à¸—à¸µ");
                    //b
                    insert("banana","à¸�à¸¥à¹‰à¸§à¸¢"); 
                    insert("basic","à¸žà¸·à¹‰à¸™à¸�à¸²à¸™");
                    insert("beauty","à¸„à¸§à¸²à¸¡à¸ªà¸§à¸¢à¸‡à¸²à¸¡");
                    insert("build","à¸ªà¸£à¹‰à¸²à¸‡");
                    //c
                    insert("captain","à¸�à¸±à¸›à¸•à¸±à¸™");
                    insert("century","à¸¨à¸•à¸§à¸£à¸£à¸©");
                    insert("change","à¹€à¸›à¸¥à¸µà¹ˆà¸¢à¸™");
                    insert("complete","à¸ªà¸¡à¸šà¸¹à¸£à¸“à¹Œ");
                    //d
                    insert("danger","à¸­à¸±à¸™à¸•à¸£à¸²à¸¢");
                    insert("dead","à¸•à¸²à¸¢");
                    insert("die","à¸•à¸²à¸¢");
                    insert("difference","à¸„à¸§à¸²à¸¡à¹�à¸•à¸�à¸•à¹ˆà¸²à¸‡");
                    //e
                    insert("earth","à¹‚à¸¥à¸�");
                    insert("education","à¸�à¸²à¸£à¸¨à¸¶à¸�à¸©à¸²");
                    insert("expensive","à¹�à¸žà¸‡");
                    insert("experience","à¸›à¸£à¸°à¸ªà¸šà¸�à¸²à¸£à¸“à¹Œ");
                    //f
                    insert("family","à¸„à¸£à¸­à¸šà¸„à¸£à¸±à¸§");
                    insert("feel","à¸£à¸¹à¹‰à¸ªà¸¶à¸�");
                    insert("first","à¹�à¸£à¸�");
                    insert("follow","à¸•à¸´à¸”à¸•à¸²à¸¡");
                    //g
                    insert("give","à¹ƒà¸«à¹‰"); 
                    insert("group","à¸�à¸¥à¸¸à¹ˆà¸¡");
                    insert("guide","à¹�à¸™à¸°à¹�à¸™à¸§");
                    insert("gun","à¸›à¸·à¸™");
                    //h
                    insert("handsome","à¸«à¸¥à¹ˆà¸­");
                    insert("healthy","à¸¡à¸µà¸ªà¸¸à¸‚à¸ à¸²à¸žà¸”à¸µ");
                    insert("heart","à¸«à¸±à¸§à¹ƒà¸ˆ");
                    insert("hospital","à¸žà¸¢à¸²à¸šà¸²à¸¥");
                    //i
                    insert("ice","à¸™à¹‰à¸³à¹�à¸‚à¹‡à¸‡");
                    insert("imagine","à¸ˆà¸´à¸™à¸•à¸™à¸²à¸�à¸²à¸£");
                    insert("inch","à¸™à¸´à¹‰à¸§ (à¸«à¸™à¹ˆà¸§à¸¢à¸§à¸±à¸”)");
                    insert("island","à¹€à¸�à¸²à¸°");
                    //j
                    insert("join","à¹€à¸‚à¹‰à¸²à¸£à¹ˆà¸§à¸¡");
                    insert("Journey","à¸�à¸²à¸£à¹€à¸”à¸´à¸™à¸—à¸²à¸‡");
                    insert("Jump","à¸�à¸£à¸°à¹‚à¸”à¸”");
                    insert("just","à¹€à¸žà¸´à¹ˆà¸‡à¸ˆà¸°, à¹€à¸žà¸µà¸¢à¸‡à¹�à¸„à¹ˆ");
                    //k
                    insert("keep","à¹€à¸�à¹‡à¸š, à¸£à¸±à¸�à¸©à¸²à¹„à¸§à¹‰");
                    insert("kill","à¸†à¹ˆà¸²");//k
                    insert("kind","à¸Šà¸™à¸´à¸”, à¸ˆà¸³à¸žà¸§à¸�");
                    insert("king","à¸�à¸©à¸±à¸•à¸£à¸´à¸¢à¹Œ, à¸£à¸²à¸Šà¸²");
                    //l
                    insert("language","à¸ à¸²à¸©à¸²");
                    insert("last","à¸ªà¸¸à¸”à¸—à¹‰à¸²à¸¢");
                    insert("learn","à¹€à¸£à¸µà¸¢à¸™à¸£à¸¹à¹‰");
                    insert("lost","à¸ªà¸¹à¸�à¸«à¸²à¸¢, à¸žà¹ˆà¸²à¸¢à¹�à¸žà¹‰");
                    //m
                    insert("machine","à¹€à¸„à¸£à¸·à¹ˆà¸­à¸‡à¸ˆà¸±à¸�à¸£");
                    insert("Meeting","à¸�à¸²à¸£à¸›à¸£à¸°à¸Šà¸¸à¸¡");
                    insert("moment","à¸‚à¸“à¸°à¸™à¸±à¹‰à¸™, à¸Šà¸±à¹ˆà¸§à¸„à¸£à¸¹à¹ˆ");
                    insert("music","à¸”à¸™à¸•à¸£à¸µ");
                    //n
                    insert("nation","à¸Šà¸²à¸•à¸´");
                    insert("nature","à¸˜à¸£à¸£à¸¡à¸Šà¸²à¸•à¸´");
                    insert("notebook","à¸ªà¸¡à¸¸à¸”à¸šà¸±à¸™à¸—à¸¶à¸�");
                    insert("nurse","à¸žà¸¢à¸²à¸šà¸²à¸¥");
                    //o
                    insert("object"," à¸§à¸±à¸•à¸–à¸¸");
                    insert("only","à¹€à¸—à¹ˆà¸²à¸™à¸±à¹‰à¸™");
                    insert("opposite","à¸•à¸£à¸‡à¸�à¸±à¸™à¸‚à¹‰à¸²à¸¡");
                    insert("original","à¸•à¹‰à¸™à¸‰à¸šà¸±à¸š");
                    //p
                    insert("pair","à¸„à¸¹à¹ˆ");
                    insert("particular","à¹‚à¸”à¸¢à¹€à¸‰à¸žà¸²à¸°");
                    insert("picture","à¸£à¸¹à¸›à¸ à¸²à¸ž");
                    insert("possible","à¹€à¸›à¹‡à¸™à¹„à¸›à¹„à¸”à¹‰");
                    //q
                    insert("quiet","à¹€à¸‡à¸µà¸¢à¸š, à¸ªà¸‡à¸š");
                    insert("quick","à¸£à¸§à¸”à¹€à¸£à¹‡à¸§");
                    insert("quite","à¹‚à¸”à¸¢à¹�à¸—à¹‰à¸ˆà¸£à¸´à¸‡");
                    insert("queen","à¸£à¸²à¸Šà¸´à¸™à¸µ");
                    //r
                    insert("reason","à¹€à¸«à¸•à¸¸à¸œà¸¥");
                    insert("receive","à¹„à¸”à¹‰à¸£à¸±à¸š");
                    insert("root","à¸£à¸²à¸�");
                    insert("rope","à¹€à¸Šà¸·à¸­à¸�");
                    //s   
                    insert("school","à¹‚à¸£à¸‡à¹€à¸£à¸µà¸¢à¸™"); 
                    insert("science","à¸§à¸´à¸—à¸¢à¸²à¸¨à¸²à¸ªà¸•à¸£à¹Œ");
                    insert("should","à¸„à¸§à¸£à¸ˆà¸°");
                    insert("sorry","à¹€à¸ªà¸µà¸¢à¹ƒà¸ˆ");
                    //t
                    insert("teacher","à¸œà¸¹à¹‰à¸ªà¸­à¸™, à¸„à¸£à¸¹");
                    insert("though","à¹�à¸¡à¹‰à¸§à¹ˆà¸²");
                    insert("through","à¸œà¹ˆà¸²à¸™");
                    insert("together","à¸”à¹‰à¸§à¸¢à¸�à¸±à¸™");
                    //u
                    insert("unclear","à¹„à¸¡à¹ˆà¸Šà¸±à¸”à¹€à¸ˆà¸™");
                    insert("understand","à¹€à¸‚à¹‰à¸²à¹ƒà¸ˆ");
                    insert("unit","à¸«à¸™à¹ˆà¸§à¸¢");
                    insert("useless","à¹„à¸¡à¹ˆà¸¡à¸µà¸›à¸£à¸°à¹‚à¸¢à¸Šà¸™à¹Œ");
                    //v
                    insert("valley","à¸«à¸¸à¸šà¹€à¸‚à¸²");
                    insert("victory","à¸Šà¸±à¸¢à¸Šà¸™à¸°");
                    insert("voice","à¹€à¸ªà¸µà¸¢à¸‡");
                    insert("volcano","à¸ à¸¹à¹€à¸‚à¸²à¹„à¸Ÿ");
                    //w
                    insert("walk","à¹€à¸”à¸´à¸™");
                    insert("want","à¸•à¹‰à¸­à¸‡à¸�à¸²à¸£");
                    insert("waterfall ","à¸™à¹‰à¸³à¸•à¸�");
                    insert("weak","à¸­à¹ˆà¸­à¸™à¹�à¸­");
                    //x
                    insert("X-ray","à¸£à¸±à¸‡à¸ªà¸µà¹€à¸­à¹‡à¸�à¸‹à¹Œ");
                    insert("Xerox","à¸–à¹ˆà¸²à¸¢à¹€à¸­à¸�à¸ªà¸²à¸£");
                    insert("Xmas","à¸„à¸£à¸´à¸ªà¸•à¹Œà¸¡à¸²à¸ª");
                    insert("xyster","à¹€à¸„à¸£à¸·à¹ˆà¸­à¸‡à¸¡à¸·à¸­à¸œà¹ˆà¸²à¸•à¸±à¸”");
                    //y
                    insert("yard","à¸ªà¸™à¸²à¸¡, à¸«à¸¥à¸²");
                    insert("yesterday","à¹€à¸¡à¸·à¹ˆà¸­à¸§à¸²à¸™à¸™à¸µà¹‰");
                    insert("young","à¸­à¹ˆà¸­à¸™à¸§à¸±à¸¢");
                    insert("yummy","à¸­à¸£à¹ˆà¸­à¸¢");
                    //z
                    insert("zero","à¸¨à¸¹à¸™à¸¢à¹Œ");                    
                    insert("zip","à¸‹à¸´à¸›, à¸šà¸µà¸š, à¸­à¸±à¸”"); 
                    insert("zombie","à¸œà¸µà¸”à¸´à¸š");
                    insert("zone","à¹€à¸‚à¸•, à¸šà¸£à¸´à¹€à¸§à¸“");
                    
                    
                    System.out.println("Load file complete");            
                    displaymenu1();
                    break;
                    
             
            default :if(ch != 1){
                System.out.println("Can't choice");
                displaymenu();
            }
       }
       }
    public void displaymenu1(){
        Scanner sc = new Scanner(System.in);
                    System.out.println("************* Menu ***************");
                    System.out.println("::          1. add word         ::");
                    System.out.println("::          2. Search word      ::");
                    System.out.println("::          3. Delete word      ::");
                    System.out.println("::          4. Edit word        ::");
                    System.out.println("::          5. close            ::");
                    System.out.println("**********************************");
                    System.out.print("Choose the choice :: ");
                    int ch1 = sc.nextInt();
                    switch(ch1){
                        case 1 :System.out.print("Input to add word :: ");
                                String word = sc.next();
                                System.out.print("Input to add mean :: ");
                                String mean = sc.next();
                                insert(word, mean);
                                displaymenu1();   
                                break;
                        case 2 :System.out.print("Input to word Search :: ");
                                String search = sc.next() ;
                                System.out.println("Search from key mean :: "+ getValue(search) );
                                displaymenu2(search); 
                                break;
                        case 3 :System.out.print("Input to  key word delelte :: ");
                                String dele = sc.next() ;
                                deleteKey(dele);
                                displaymenu2(dele);
                                break;
                        case 4 : 
                                System.out.print("Input to key word :: ");
                                String eword = sc.next() ;
                                System.out.print("Edit mean :: ");
                                    String eread = sc.next() ;
                                getEdit(eword,eread);
                                displaymenu1(); 
                                break;           
                        case 5 :System.out.print("Close Program");    
                        break;
                        default :if((ch1 < 1)||(ch1 >=6)){
                                 System.out.println("Can't choice");
                                 displaymenu1();
                                 }
                        }
    }
    
    public void displaymenu2(String key){
        Scanner sc = new Scanner(System.in);
            System.out.println("************ Menu Search ***************");
            System.out.println("::          1. Next word              ::");
            System.out.println("::          2. Previous word          ::");
            System.out.println("::          3. Menu add               ::");
            System.out.println("****************************************");
            System.out.print("input to choice :: ");
            int ch2 = sc.nextInt();
            switch(ch2)
            {
                case 1 :key = findlisd(key,0);
                        System.out.println("Next word is '"+key+"'");
                        displaymenu2(key);                      
                break;
                case 2 :key = findlisd(key,1);
                        System.out.println("Previous word is '"+key+"'");
                        displaymenu2(key);                       
                break;
                case 3 :displaymenu1(); 
                break;
                default :System.out.print("Can't choice");
            }
    }
    
      
    public String findlisd(String key,int list){
 
        key=key.toLowerCase();
        int index = getKeyIndex(key);
        if(list==+1){
            index++;
             while(table[index]==null){
        index++;
        }
        }
        
        else{ index--;
                 while(table[index]==null){
        index--;
        }
        }
            return  table[index].getKey();
    }
  
       


}

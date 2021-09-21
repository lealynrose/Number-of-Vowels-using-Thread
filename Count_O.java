/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Count_O extends Thread {
    public void run(){
       int letterO = 0;
       File file = new File("big.txt");
         try {
           Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
        //System.out.println(sc.nextLine());
         String str = sc.nextLine();
        for (char ch : str.toUpperCase().toCharArray()) {
    	      //System.out.print(ch);
              if( ch == 'O')
                letterO++;
          }
        } 
            System.out.println("TOTAL LETTER O : " + letterO);
            
            } catch (FileNotFoundException e) {
             System.out.println("UNABLE");
         } 
           
         }
    
}

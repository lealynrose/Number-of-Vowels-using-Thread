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
public class main {

    public static void main(String[] args) throws InterruptedException{
        
        Count_A a = new Count_A();
        a.setPriority(5);
                a.start();
                a.join();
        Count_E e = new Count_E();
        e.setPriority(4);
                 e.start();
                 e.join();
        Count_I i = new Count_I();
        i.setPriority(3);
                i.start();
                i.join();
        Count_O o = new Count_O();
        o.setPriority(1);
                o.start();
                 o.join();
        Count_U u = new Count_U();
        u.setPriority(2);
                u.start();
                u.join();
         
}
}
//TOTAL LETTER A : 408089
//TOTAL LETTER E : 633818
//TOTAL LETTER I : 365638
//TOTAL LETTER O : 386867
//TOTAL LETTER U : 138732



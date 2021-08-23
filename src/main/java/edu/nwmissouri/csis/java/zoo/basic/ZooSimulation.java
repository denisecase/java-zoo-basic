/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.csis.java.zoo.basic;

/**
 *
 * @author Dr. Case
 */
public class ZooSimulation {
 
    static String greeting = "Welcome to Dr. Case's Zoo!";
    
    
    /*
    * Execution begins here
    */
    public static void main(String args[]) {

      System.out.println(greeting.toUpperCase());
      
      Aardvark alice = new Aardvark();
      alice.speak();
      alice.move();
      
    }
}
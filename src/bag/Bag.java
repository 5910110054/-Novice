/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bag;

/**
 *
 * @author Keem
 */
import java.util.*;
public class Bag {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.print("Please Enter HP of novice rank(0-200): ");
        int hp = sc.nextInt();
        System.out.println("HP of Novice = "+ hp);
        System.out.println("---------------------------------------");
        if (hp >= 150) {
            System.out.println("Novice must select item in Bag1 => Power_Buff!!");
            System.out.print("Please Enter 1 to see item in Bag1: ");
            int num = sc.nextInt();
            System.out.println("---------------------------------------");
            if(num == 1){
              System.out.println("List of item in Bag1");
              System.out.println("---------------------------------------");
              bag1();
              System.out.println("---------------------------------------");
            }
            else{
              System.out.println("Cannot open Bag1 !! You enter incorrect!!");
            }
            System.out.println("---------------------------------------");
        } 
        else if(hp <= 55 && hp >= 0){
            System.out.println("Novice must select item in Bag2 => HP_Buff!!");
            System.out.print("Please Enter 2 to see item in Bag2: ");
            int num = sc.nextInt();
            System.out.println("---------------------------------------");
            if(num == 2){
              System.out.println("List of item in Bag2");
              System.out.println("---------------------------------------");
              bag2();
              System.out.println("---------------------------------------");
            }
            else{
              System.out.println("Cannot open Bag2 !! You enter incorrect!!");
            }
            
        }
        else{
            System.out.println("Novice must select item in Bag3 => General_Buff");
            System.out.print("Please Enter 3 to see item in Bag3: ");
            int num = sc.nextInt();
            System.out.println("---------------------------------------");
            if(num == 3){
                System.out.println("List of item in Bag3");
                System.out.println("---------------------------------------");
                bag3();
                System.out.println("---------------------------------------");
            }
            else{
              System.out.println("Cannot open Bag3 !! You enter incorrect!!");
            }
            
            
        }   
        
    }
       
      private static void bag1(){
          Item bag1 = new Item(); //object
          //System.out.println(bag1);
            bag1.setCard("Orc Hero Card");
            bag1.setFood("Hotdish");
            bag1.setWeapon("Gakkung");
            bag1.setArmor("Tight");
            bag1.showAll();   
      }
      private static void bag2(){
          Item bag2 = new Item(); //object
          //System.out.println(bag1);
            bag2.setCard("Orc Lord Card");
            bag2.setFood("Warmdish");
            bag2.setWeapon("Cutlus");
            bag2.setArmor("Dragon Vest");
            bag2.showAll();   
      }      
      private static void bag3(){
          Item bag3 = new Item(); //object
          //System.out.println(bag1);
            bag3.setCard("Golden Thief Bug Card");
            bag3.setFood("Red_Poition");
            bag3.setWeapon("Cardo");
            bag3.setArmor("Cotton Shirt");
            bag3.showAll();   
      }
      
    }
    


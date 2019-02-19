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
public class Item {
    public String card;
    public String food;
    public String weapon;
    public String armor;
    
    public void setCard(String card){
        this.card = card;
    }
    public void setFood(String food){
        this.food = food;
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public void setArmor(String armor){
        this.armor = armor;
    }
    public void showAll(){
        System.out.println("Card in Bag: "+ card);
        System.out.println("Food in Bag: "+ food);
        System.out.println("Weapon in Bag: "+ weapon);
        System.out.println("Armor in Bag: "+ armor);
    }
}

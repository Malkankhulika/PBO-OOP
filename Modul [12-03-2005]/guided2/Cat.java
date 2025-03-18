/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guided2;

/**
 *
 * @author Khulika Malkan
 */
public class Cat extends Animal{
    @Override
    public void bark(){
        System.out.println("Bark Bark Cihuuuyyyyy");
    }
    
    public static void main(String[] args){
        Cat Fish = new Cat();
        Fish.bark();
    }
    
}

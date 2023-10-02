/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice.opp;

/**
 *
 * @author LENOVO
 */

public class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display(){
        System.out.println("Im real Red Headed duck");
    }
    
}
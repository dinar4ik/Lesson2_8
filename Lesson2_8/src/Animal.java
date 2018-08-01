/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Animal {
    void eat(){
        System.out.println("Nyam-nyam");
    }
}
class Dog extends Animal{
    void voiceDog(){
        System.out.println("Gav");
    }
}
class Cat extends Animal{
    void voiceCat(){
        System.out.println("Myau");
    }
}
class test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.voiceDog();
    }
}

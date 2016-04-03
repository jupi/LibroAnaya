/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cap_12_Enum_Autoboxig_ImportEstatica_Anotaciones;

//Usar constructos, variable de instancia y método de enumeración
public enum Trasnport {

           COCHE(100), BUS(25), CARRO(10), BICI(10), MOTO(150);

           private int speed;
           
           //contructor

    private Trasnport(int speed) {
        this.speed = speed;
    }
           
    int getSpeed(){
    
        return speed;
    
    }
                     
}


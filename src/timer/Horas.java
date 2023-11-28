/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timer;



/**
 *
 * @author ESTUDIANTE
 */
public class Horas extends Thread{
    
    static int flag1;
        
        public Horas (int flag){
            this.flag1 = flag;          
        }
       
        @Override
        public void run(){
            int hora = 0;
            while (true){                
                System.out.println("Cambio efectuado " + flag1);            
                if (flag1 == 1){                 
                    hora += 1;
                    Timer.setHora(hora);
                    System.out.println("Incremento hora....");
                    flag1 = 0;
                }                
            }           
        }
    
}

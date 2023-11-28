
package timer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Minutos extends Thread{
    
        static int flag;
        static volatile boolean reseteado = false;
        
        public Minutos (int flag){
            this.flag = flag;          
        }
       
        @Override
        public void run(){
             int min = 0;
             while (true){                
                System.out.println(flag);            
                if (this.flag == 1){
                    if (reseteado!= false) {
                        min=0;
                        reseteado = false;
                    }else{
                    min += 1;
                    Timer.setmin(min);
                    System.out.println("Incremento min....");
                    flag = 0;
                    if (min==59){    
                    min = 0;
                    Horas.flag1 = 1;
                    System.out.println("esto viene de segundos " +Minutos.getFlag() );
                }
                }
                }                               
        }}

    public static int getFlag() {
        return flag;
    }
    
   
}


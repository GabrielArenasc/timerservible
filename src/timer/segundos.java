
package timer;

import java.util.logging.Level;
import java.util.logging.Logger;


public class segundos extends Thread{
    private volatile boolean pausado = false;
    private volatile boolean reseteado = false;
    
        

         @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
            if (reseteado!= false) {
                i=0;
                reseteado = false;
            }else{
            if (!pausado) {
                Timer.setsec(i);
                try {
                    segundos.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(segundos.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (i == 59) {
                    i = -1; // Reiniciar el contador
                    Minutos.flag = 1;
                    System.out.println("esto viene de segundos " + Minutos.getFlag());
                }
            } else {
                i--; // No incrementar el contador mientras esté pausado
            }
        }}
    }

    public void pausar() {
        pausado = true;
    }

    public void reanudar() {
        pausado = false;
    }

    public boolean isPausado() {
        return pausado;
    }

    public void resetear() {
        reseteado = true;
        Minutos.reseteado = true;
    }
}   


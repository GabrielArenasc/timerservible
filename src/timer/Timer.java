
package timer;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Timer {

    static reloj _reloj = new reloj();
    static segundos hilo;
    static Minutos hilo2;
    static Horas hilo3;

    public static void main(String[] args) {

        _reloj.setVisible(true);

        hilo = new segundos();
        hilo2 = new Minutos(0);
        hilo3 = new Horas(0);

        hilo.start();
        hilo2.start();
        hilo3.start();

        // Agregar botones y asignar acciones
        _reloj.getPauseButton().addActionListener(e -> pausarDespausar());
        _reloj.getResetButton().addActionListener(e -> resetear());
    }

    public static void setsec(int _num) {
        _reloj.setSec(_num);
    }

    public static void setmin(int _min) {
        _reloj.setMin(_min);
    }

    public static void setHora(int _hora) {
        _reloj.setHora(_hora);
    }

    public static void pausarDespausar() {
        if (hilo.isPausado()) {
            hilo.reanudar();
        } else {
            hilo.pausar();
        }
    }

    public static void resetear() {
        _reloj.setMin(0);
        _reloj.setHora(0);
        _reloj.setSec(0);
        hilo.resetear();
        
    }
}

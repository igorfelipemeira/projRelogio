/**
 * Relegio
 */
public class Relogio {

    public int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        if (minuto >= 60) {
            hora = hora + 1;
        }
        if (hora < 24) {
                return hora;
            } else {
                return hora=hora-24;

            }
        }

    

    public int getMinuto() {
        if (segundo >= 60) {
            minuto = minuto + 1;
        }
        if (minuto < 60) {
                return minuto;
            } else {
                return minuto = minuto - 60;
            }
        }
    

    public int getSegundo() {
        if (segundo < 60) {
            return segundo;
        } else {
            return segundo = (segundo - 60);
        }

    }

    public void setHoraAtual() {
        System.out.println("Hora atual: " + getHora() + ":" + getMinuto() + ":" + getSegundo());

    }

}

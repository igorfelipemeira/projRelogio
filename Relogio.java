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
            return hora = hora + 1;
        } else {
            if (hora < 24) {
                return hora = hora + 1;
            } else {
                return hora;

            }
        }

    }

    public int getMinuto() {
        if (segundo >= 60) {
            return minuto = minuto + 1;
        } else {
            if (minuto < 60) {
                return minuto;
            } else {
                return minuto = minuto - 60;
            }
        }
    }

    public int getSegundo() {
        if (segundo < 60) {
            return segundo;
        } else {
            return segundo = segundo - 60;
        }

    }

    public void setHoraAtual() {
        System.out.println("Hora atual: " + hora + ":" + minuto + ":" + segundo);

    }

}

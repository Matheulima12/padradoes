package padros;
public class quadrado implements adm {

    private int lado;

    private boolean condEx(int c) {
        return c > 0;
    }

    public quadrado() {
        this.lado = 1;
    }

    public quadrado(int lado) {
        if(!condEx(lado)) {
            throw new RuntimeException("não e possivel construir o quadrado");
        }
        this.lado = lado;

    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        if(condEx(lado)){
            this.lado = lado;
        }
    }

    public double pe() {
        return (lado*4);
    }

    public double ar() {
        return (lado*lado);
    }

    public String toString() {
        return("(" + this.lado + ")");
    }


    }



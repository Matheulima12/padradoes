package padros;

public abstract class bola implements adm {

    private float area;

    private boolean condEx(int c) {
        return c > 0;
    }

    public bola() {
        this.area = 1;
    }

    public bola(int area) {
        if(!condEx(area)) {
            throw new RuntimeException("impossivel construir circulo");
        }
        this.area = area;

    }

    public float getLado() {
        return area;
    }

    public void setLado(int area) {
        if(condEx(area)){
            this.area = area;
        }
    }

    public double per() {
        double pi = Math.PI;
        return (2*area*pi);
    }

    public double ar() {
        double pi = Math.PI;
        return (pi*area*area);
    }

    public String toString() {
        return("(" + this.area + ")");
    }
}


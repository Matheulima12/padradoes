package padros;

public class triangulo {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public triangulo() {
        this.ladoA = 1;
        this.ladoB = 1;
        this.ladoC = 1;
    }

    public triangulo(int ladoA, int ladoB, int ladoC) {
        this();
        if (condEx(ladoA,ladoB,ladoC)){
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
        }
    }

    private boolean condEx(int a, int b, int c) {
        return Math.abs(b - c) < a && a < b + c;
    }

    private int perimetro(){
        return (ladoA + ladoB + ladoC);
    }

    public double area(){
        int s = perimetro()/2; //s  semi perimetro
        double area = s *(s - getLadoA())*(s - getLadoB())*(s - getLadoC());
        return Math.sqrt(area);
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        if (condEx(ladoA, getLadoB(), getLadoC())) {
            this.ladoA = ladoA;
        }
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        if (condEx(getLadoA(), ladoB, getLadoC())) {
            this.ladoB = ladoB;
        }
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        if (condEx(ladoA, ladoB, ladoC)) {
            this.ladoC = ladoC;
        }
    }

    public String toString() {
        return "Triangulo{" +
                "ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", ladoC=" + ladoC +
                '}';
    }
}



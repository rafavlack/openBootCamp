public class Coche {

    private int numeroPuertas;

    public Coche() {
    }

    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int numeroPuertas(int puerta){

        int totalNumeroPuerta = 0;
        totalNumeroPuerta = totalNumeroPuerta + puerta;

        return totalNumeroPuerta;
    }
}



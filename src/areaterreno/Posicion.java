package areaterreno;

public class Posicion {
    double x,y;
    
    public Posicion (double x, double y){
        this.x = x;
        this.y = y;
    }
    
    double CalcularDist (Posicion punto) {
        double difx2 = Math.pow((punto.x-this.x),2);
        double dify2 = Math.pow((punto.y-this.y),2);
        double distancia = Math.sqrt(difx2+dify2);
        return distancia;
    }
}

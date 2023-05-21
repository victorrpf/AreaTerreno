package areaterreno;

public class PosicionMain {

    public static void main(String[] args) {
        Posicion pnt1 = new Posicion(0,0);
        Posicion pnt2 = new Posicion(200,0);
        Posicion pnt3 = new Posicion(200,150);
        Posicion pnt4 = new Posicion(0,150);
         
        double DistA = pnt1.CalcularDist(pnt2);
        double DistB = pnt2.CalcularDist(pnt3);
        double area = DistA * DistB;
        
        System.out.println("Punto 1: (" + pnt1.x + ", " + pnt1.y +") metros");
        System.out.println("Punto 2: (" + pnt2.x + ", " + pnt2.y +") metros");
        System.out.println("Punto 3: (" + pnt3.x + ", " + pnt3.y +") metros");
        System.out.println("Punto 4: (" + pnt4.x + ", " + pnt4.y +") metros");
        System.out.println("Área: " + area + " mentros cuadrados");
        
    }    
}

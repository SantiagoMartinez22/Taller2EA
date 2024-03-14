public class Punto2D {
    private double x;
    private double y;

    public Punto2D(double x, double y){
        this.x=x;
        this.y=y;



    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distancia(Punto2D p) {
        return Math.sqrt( (x-p.getX())*(x-p.getX()) + (y-p.getY())*(y-p.getY()) );
    }



    public String toString() {
        return "("+getX()+","+getY()+")";
    }


    public boolean equals(Object a) {
        if (a==null) return false;
        if ( !(a instanceof Punto2D) ) return false;
        Punto2D px = (Punto2D) a;
        if (px.getX()==this.getX() && px.getY()==this.getY()) return true;
        return false;
    }
}

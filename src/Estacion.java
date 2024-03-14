class Estacion {
    private int id;
    private Punto2D ubicacion;

    public Estacion(int id, Punto2D ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
    }

    public Punto2D getUbicacion() {
        return ubicacion;
    }

    @Override
    public String toString() {
        return "Estacion{" +
                "id=" + id +
                ", ubicacion=" + ubicacion +
                '}';
    }
}
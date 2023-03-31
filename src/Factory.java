public class Factory {
    public static final int CAMION = 1;
    public static final int BICICLETA = 2;

    public static final int BARCO = 3; // creamos la constante BARCO


        public static Transporte getTransporte(int type) {
            switch (type) {
                case CAMION:
                    return new Camion();

                case BICICLETA:
                    return new Bicicleta();
                case BARCO:
                    return new Barco(); // Añadimos al switch de transporte la opcion Barco y que lo instancie si se selecciona
                default:
                    return null;
            }
}
}

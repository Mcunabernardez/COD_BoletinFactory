public class Factory {
    public static final int CAMION = 1;
    public static final int BICICLETA = 2;


        public static Transporte getTransporte(int type) {
            switch (type) {
                case CAMION:
                    return new Camion();

                case BICICLETA:
                    return new Bicicleta();
                default:
                    return null;
            }
}
}

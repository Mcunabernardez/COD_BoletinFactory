public interface Transporte {

    final int EMBALAJE_PALET = 0;
    final int EMBALAJE_CARTON = 1;

    final int EMBALAJE_MADERA = 2;

    Float costeTotal(Integer cp);

    Integer tipoEquipaje(Float x, Float y, Float z, Float peso);
}

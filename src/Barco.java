
public class Barco implements Transporte {
/*
Creamos la clase Barco y le añadimos los métodos sacados de la matriz Transporte como con las otras clases

 */
    @Override
    public Float costeTotal(Integer cp){
        float coste = 0f;
        return coste;
    }

    @Override
    public Integer tipoEquipaje(Float x, Float y, Float z, Float peso){
        float tamanho = x + y+ z;
        if (tamanho>10 && peso > 5 ) {
            return EMBALAJE_PALET;
        } else if(tamanho <=10 && peso <= 5) {
            return EMBALAJE_CARTON;
        } else if(tamanho <=10 && peso >5) {
            return EMBALAJE_MADERA;
        } return null;
    }
}


import javax.swing.*;

public class Bicicleta implements Transporte {
    public Bicicleta(){
    }


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

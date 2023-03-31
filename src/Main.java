import java.util.Scanner;
/*
@Author Maikel Cuña
Instanciar diferentes tipos de transportes,
en principio solo camión y bicicleta

Métodos comunes:
costeTotal(Integer cp) : Float
Recibe el código postal
Devuelve el coste

tipoEmbalaje(Float x, Float y, Float z, Float peso): Integer
Recibe dimensiones y peso
Devuelve tipo de embalaje (que es un entero)
0 - palet
1 - envoltorio cartón
2 - caja de madera
 */
public class Main {
    static Transporte transporte; //instanciamos un objeto estatico

    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in); //generamos un scanner

        System.out.println("Tipo de transporte: \n (1) CAMION \n (2) BICICLETA");
        int type = guardar.nextInt();
        System.out.println("Introducir CP");
        Integer cp = guardar.nextInt();
        System.out.println("Peso del producto");
        Float peso = guardar.nextFloat();
        System.out.println("Ancho del producto");
        Float x = guardar.nextFloat();
        System.out.println("Alto del producto");
        Float y = guardar.nextFloat();
        System.out.println("Profundidad del producto");
        Float z = guardar.nextFloat();

        transporte = Factory.getTransporte(type); //igualamos el transporte instanciado para elegir con el factory que tipo de transporte será

        Integer embalaje = transporte.tipoEquipaje(x,y,z,peso); //pasamos los datos del paquete para elegir donde irán embalados
        switch (embalaje){
            case 0:
                System.out.println("Se enviará en un palet");
                break;
            case 1:
                System.out.println("Se enviará en un envoltorio de cartón");
                break;
            case 2:
                System.out.println("Se enviará en una caja de madera");
                break;
        }
        Float precio = transporte.costeTotal(cp); //le pasamos el precio según si CP
        System.out.println("El precio será "+precio);

    }
}
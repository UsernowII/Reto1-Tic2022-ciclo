package Controller;

import java.util.Scanner;

public class NaturalGas {

    public static void operation() {
        int status = 0;
        int cubicMeter = 5234;
        double impost = 0.01;
        double total = 0;
        double discount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Estrato del inmueble:");
        status = sc.nextInt();
        System.out.println("Consumo del inmueble");
        int consumption = sc.nextInt();

        total = cubicMeter * consumption;

        if (status > 0 && status <= 2) {
            discount = total * 0.50;
            discount = (-discount);
        } else if (status > 2 && status <= 4) {
            discount = total * 0.10;
            discount = (-discount);
        } else {
            discount = total * 0.25;
        }

        System.out.println("El consumo fue: "+ consumption);
        System.out.println("Valor de unidad: "+ cubicMeter);
        System.out.println("Estrato del inmueble: "+ status);
        System.out.println("Costo total: " + total);
        System.out.println("Descuento o sobrecoste: "+ discount);
        System.out.println("Impuesto por infraestructura: "+ (total * impost));
        System.out.println("TOTAL A PAGAR: " + (total + (total * impost) + discount));

    }
}
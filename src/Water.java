import java.util.Scanner;

public class Water {
    private final int unitMeasure;
    private final double impost ;
    private double discount ;

    public Water() {
        this.unitMeasure = 9256;
        this.impost = 0.01;
        this.discount = discount;
    }

    public void operation() {
        int status;
        int consumption;
        int total;
        Scanner sc = new Scanner(System.in);

        System.out.println("Estrato del inmueble:");
        status = sc.nextInt();
        System.out.println("Consumo del inmueble");
        consumption = sc.nextInt();

        total = this.unitMeasure * consumption;

        if (status > 0 && status <= 2) {
            discount = total * 0.50;
            discount = (-discount);
        } else if (status > 2 && status <= 4) {
            discount = total * 0.10;
            discount = (-discount);
        } else {
            discount = total * 1.25;
        }

        System.out.println("El consumo fue: "+ consumption);
        System.out.println("Valor de unidad: "+ this.unitMeasure);
        System.out.println("Estrato del inmueble: "+ status);
        System.out.println("Costo total: " + total);
        System.out.println("Descuento o sobrecoste: "+ discount);
        System.out.println("Impuesto por infraestructura: "+ (total * impost));
        System.out.println("TOTAL A PAGAR: " + (total + (total * impost) + discount));

    }
}

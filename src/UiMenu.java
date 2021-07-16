import java.util.Scanner;

public class UiMenu {

    Energy energyService = new Energy();
    Water waterService = new Water();
    NaturalGas gasService = new NaturalGas();


    public void showMenu() {

        int response = 0;
        do {
            System.out.println();
            System.out.println();
            System.out.println("PAGO DE SERVICIOS PUBLICOS");
            System.out.println("Seleccione el servicio publico:");
            System.out.println("1. Energia");
            System.out.println("2. Acueducto");
            System.out.println("3. Gas Natural");
            System.out.println("4. Salir");

            System.out.println();
            System.out.println();
            System.out.println("Opcion:");
            //Captura de datos por teclado
            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    energyService.operation();
                    break;
                case 2:
                    waterService.operation();
                    break;
                case 3:
                    gasService.operation();
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Please select a correct option ");
                    break;
            }
        } while (response != 4);
    }
}

package guru.springframework.sfgdependencyinjection.solid.openclosed;

public class Main {

    public static void main(String[] args) {

        InspectorSeguroSalud inspectorSeguroSalud = new InspectorSeguroSalud();

        GerenteAprobacionReclamos gerente = new GerenteAprobacionReclamos();

        //acepta la clase heredada => InspectorSeguroSalud
        gerente.procesarReclamo(inspectorSeguroSalud);

        System.out.println("===========");

        InspectorSeguroVehicular inspectorSeguroVehicular = new InspectorSeguroVehicular();

        gerente.procesarReclamo(inspectorSeguroVehicular);


    }

}

package guru.springframework.sfgdependencyinjection.solid.openclosed;

public class InspectorSeguroSalud extends InspectorSeguro {

    public boolean reclamoValido() {
        System.out.println("Inspector de Seguros de Salud: Validando reclamo de seguro de salud ...");
        /*Logic to validate health insurance claims*/
        return true;
    }

}

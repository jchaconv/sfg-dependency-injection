package guru.springframework.sfgdependencyinjection.solid.openclosed;

public class InspectorSeguroVehicular extends InspectorSeguro {

    public boolean reclamoValido() {
        System.out.println("Inspector de Seguros Vehicular: Validando reclamo de seguro de salud ...");
        /*Logic to validate health insurance claims*/
        return true;
    }

}

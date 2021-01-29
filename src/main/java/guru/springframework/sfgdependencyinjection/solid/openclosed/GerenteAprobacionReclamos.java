package guru.springframework.sfgdependencyinjection.solid.openclosed;

public class GerenteAprobacionReclamos {


    //Open-Closed principle
    public void procesarReclamo(InspectorSeguro inspectorSeguro) {

        if (inspectorSeguro.reclamoValido()) {
            System.out.println("Gerente: Se está validando el reclamo .... Aprobando ... Listo !!!! ");
        } else {
            System.out.println("Gerente: Reclamo rechazado !!!! ");
        }

    }


    //Bad practice
    public void procesarReclamoSalud(InspectorSeguroSalud inspector) {
        if (inspector.reclamoValido()) {
            System.out.println("GerenteAprobacionReclamos: Reclamo válido. Ahora procesando reclamo para aprobación ....");
        }
    }


    //Bad practice
    //Se Agregó lógica para validar reclamos de tipo vehicular. Es un mala práctica agregar la lógica de esta manera.
    //No se respeta el principio Open-Closed de Solid. La manera correcta es creando una clase abstracta y que los inspectores
    //hereden de ella.
    public void procesarReclamoVehicular(InspectorSeguroVehicular inspector) {
        if (inspector.reclamoValido()) {
            System.out.println("GerenteAprobacionReclamos: Reclamo válido. Ahora procesando reclamo para aprobación....");
        }
    }

}

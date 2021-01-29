package guru.springframework.sfgdependencyinjection;

import guru.springframework.sfgdependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDependencyInjectionApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SfgDependencyInjectionApplication.class, args);
        ApplicationContext ctx = SpringApplication.run(SfgDependencyInjectionApplication.class, args);

        System.out.println("=== Active Profiles ===");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());


        //Spring crea la instancia del controller desde el SpringContext, no es necesario
        //el clásico "= new Controller();"
        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("=== Primary Bean ===");
        System.out.println(myController.sayHello());

        /*String greeting = myController.sayHello();
        System.out.println(greeting);*/

        System.out.println("=== Property ===");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());


        System.out.println("=== Setter ===");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("=== Constructor ===");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());


    }

}

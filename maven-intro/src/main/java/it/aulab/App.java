package it.aulab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.aulab.models.Arm;
import it.aulab.models.Jeeg;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );

       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       Jeeg jeeg = (Jeeg) context.getBean("jeeg", Jeeg.class);
       System.out.println(jeeg);

       System.out.println(jeeg.getArmSX());

        Arm armSX = context.getBean("armSX", Arm.class);
        System.out.println(armSX);
    }
}

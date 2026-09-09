package it.aulab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.aulab.models.Jeeg;
import it.aulab.models.Arm;
import it.aulab.models.Leg;

@Configuration 
public class AppConfig {

    @Bean(name = "jeeg")
    public Jeeg getJeeg() {
        return new Jeeg(getArmSX(), getArmDX(), getLeg());
    }

    @Bean(name = "armSX")
        //@Scope ("prototype") *preferenziale
    //@Scope (BeanDefinition.SCOPE_PROTOTYPE) *stesso risulatato 

    @Scope ("prototype") //ogni volta che chiamo il bean mi restituisce un nuovo oggetto
    public Arm getArmSX() {
        return new Arm(Side.SX);
    }

    @Bean(name = "armDX")

    public Arm getArmDX() {
        return new Arm(Side.DX);
    }

    @Bean(name = "leg")
    public Leg getLeg() {
        return new Leg();
    }

}
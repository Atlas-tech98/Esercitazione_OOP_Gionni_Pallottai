package it.aulab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.aulab.Side;
import it.aulab.models.Arm;
import it.aulab.models.Jeeg;
import it.aulab.models.Leg;
import it.aulab.repositories.JeegRepository;

@Component ("jeegService")

public class JeegServiceImpl implements JeegService {
    
    @Autowired 
    private JeegRepository repository;
    
    public JeegRepository getRepository() {
        return repository;
    }

    @Override
    public void attack() {
        Jeeg jeeg = this.repository.getJeeg();
        Arm armDX = jeeg.getArmDX();
        armDX.attack(Side.DX);
        System.out.println("Jeeg is attacking!");
    }

    @Override
    public void defend() {
        Jeeg jeeg = this.repository.getJeeg();
        Arm armSX = jeeg.getArmSX();
        armSX.defend(Side.SX);
        System.out.println("Jeeg is defending!");
    }

    @Override
    public void move() {
        Jeeg jeeg = this.repository.getJeeg();
        Leg leg = jeeg.getLeg();
        leg.walkForward();
        leg.walkBackward();
        System.out.println("Jeeg is moving!");
    }
}

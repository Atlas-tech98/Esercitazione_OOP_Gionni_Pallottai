package it.aulab.models;

public class Jeeg {
    private Arm armSX;
    private Arm armDX;
    private Leg leg;

    public Jeeg(Arm armSX, Arm armDX, Leg leg) {
        this.armSX = armSX;
        this.armDX = armDX;
        this.leg = leg;
    }

    public Arm getArmSX() {
        return armSX;
    }

    public void setArmSX(Arm armSX) {
        this.armSX = armSX;
    }

    public Arm getArmDX() {
        return armDX;
    }

    public void setArmDX(Arm armDX) {
        this.armDX = armDX;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
    
}

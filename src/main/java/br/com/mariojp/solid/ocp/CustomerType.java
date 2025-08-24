package br.com.mariojp.solid.ocp;

public enum CustomerType { 
    REGULAR(0.95), 
    PREMIUM(0.90), 
    PARTNER(0.88);

    public double value;

    private CustomerType(double value) {
        this.value = value;
    }
}

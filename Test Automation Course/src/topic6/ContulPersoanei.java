package topic6;

import topic4.Persoana;

public class ContulPersoanei {
    private String numePersoana;
    private int id;
    private Double sumaCurenta;

    public ContulPersoanei(String numePersoana, int id, Double sumaCurenta) {
        this.numePersoana = numePersoana;
        this.id = id;
        this.sumaCurenta = sumaCurenta;
    }

    public String getNumePersoana() {
        return numePersoana;
    }

    public void setNumePersoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSumaCurenta() {
        return sumaCurenta;
    }

    public void setSumaCurenta(Double sumaCurenta) {
        this.sumaCurenta = sumaCurenta;
    }

    public void sustragereBani(double suma) {
        if (suma > 0 && suma <= sumaCurenta) {
            this.sumaCurenta -= suma;
        } else throw new IllegalArgumentException("Suma solicitata e gresita");
    }

    public void transferCatrePersoana(double suma, ContulPersoanei persoana) {
        try {
            if (suma > 0 && suma <= sumaCurenta) {
                this.sumaCurenta -= suma;
                persoana.sumaCurenta += suma;
            } else {
                throw new IllegalArgumentException("Suma solicitata e gresita");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Operatiunea a fost finalizata!");

        }
    }
}
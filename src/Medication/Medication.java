package Medication;

import java.util.Date;

public class Medication {
    private int id;
    private String name;
    private String dose;
    private int quantityInStock;
    private Date expiryDate;

    public Medication(){
    }

    public Medication(int id, String name, String dose, Date expiryDate){
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.expiryDate = expiryDate;
    }

    public Medication(int id, String name, String dose, int quantityInStock, Date expiryDate){
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantityInStock = quantityInStock;
        this.expiryDate = expiryDate;
    }
}

package Medication;

import java.time.LocalDate;

public class Medication {
    private int id;
    private String name;
    private String dose;
    private int quantityInStock;
    private LocalDate expiryDate;

    public Medication(LocalDate expiryDate){
        this.expiryDate = expiryDate;
    }

    public Medication(int id, String name, String dose, LocalDate expiryDate){
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.expiryDate = expiryDate;
    }

    public Medication(int id, String name, String dose, int quantityInStock, LocalDate expiryDate){
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantityInStock = quantityInStock;
        this.expiryDate = expiryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDose(){
        return this.dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public int getQuantityInStock() {
        if (quantityInStock == 0) {
            System.out.println("Medication is out of stock");
        }
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return "ID: " + this.id + " \n" +" Name: " + this.name + "\n" +" Dosage: " + this.dose + "\n" +
                " Expiry date: " + this.expiryDate + "\n" + " Quantity in stock: " + this.quantityInStock;
    }
}

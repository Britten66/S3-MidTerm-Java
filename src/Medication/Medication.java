package Medication;


import java.time.LocalDate;
import java.util.Date;

public class Medication {
    private int id;
    private String name;
    private String dose;
    private int quantityInStock;
    private Date expiryDate;

    public Medication(){
    }

    public Medication(int id, String name, String dose){
        this.id = id;
        this.name = name;
        this.dose = dose;
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
    // TODO: Add validation to compare expiry date of the medication and the current date.
    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return "Medication information - " + "ID:" + this.id + ", Name: " + this.name + ", Dosage: " + this.dose +
                ", Expiry date: " + this.expiryDate + ", Quantity in stock: " + this.quantityInStock;
    }
}

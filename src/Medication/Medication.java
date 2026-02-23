package Medication;

import java.time.LocalDate;

public class Medication {
    private int id;
    private String name;
    private String dose;
    private int quantityInStock;
    private LocalDate expiryDate;

//    public Medication(){
//    }
//
//    public Medication(int id, String name, String dose){
//        this.id = id;
//        this.name = name;
//        this.dose = dose;
//    }
//
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

    public void addQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public LocalDate getExpiryDate() {
//        LocalDate currentDate = LocalDate.now();
//        if(expiryDate.isBefore(currentDate)){
//            System.out.println("Medication is expired." + this.expiryDate);
//        }
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return "Medication information - " + "ID:" + this.id + ", Name: " + this.name + ", Dosage: " + this.dose +
                ", Expiry date: " + this.expiryDate + ", Quantity in stock: " + this.quantityInStock;
    }
}

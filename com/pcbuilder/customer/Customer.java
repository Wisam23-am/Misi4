package com.pcbuilder.customer;

public class Customer {
    private String name;
    private String email;
    private double totalPurchases;

    public Customer(String name, String email, double totalPurchases) {
        this.name = name;
        this.email = email;
        this.totalPurchases = totalPurchases;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public double getTotalPurchases() { return totalPurchases; }

    // ✅ METODE HASIL REFRACTOR TAHAP 2
    // (Dipindahkan dari SalesReport ke sini)
    public void generateSalesReport() {
        System.out.println("=== Customer Sales Report ===");
        System.out.println("Customer: " + this.getName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Total Purchases: IDR" + this.getTotalPurchases() + "K");
        System.out.println("==============================");
    }
}
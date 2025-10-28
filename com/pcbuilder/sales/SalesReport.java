package com.pcbuilder.sales;

import com.pcbuilder.customer.Customer;

public class SalesReport {
    public void generateCustomerReport(Customer c) {
        c.generateSalesReport();
    }
}
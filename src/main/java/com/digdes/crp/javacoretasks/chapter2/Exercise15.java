package com.digdes.crp.javacoretasks.chapter2;

public class Exercise15 {
    public static void main(String[] args){
        Invoice invoice = new Invoice();
        Invoice.Item newltem1 = new Invoice. Item ("Тостер", 2, 1900);
        Invoice.Item newltem2 = new Invoice. Item ("Микроволновка", 2, 2300);
        Invoice.Item newltem3 = new Invoice. Item ("Холодильник", 2, 3300);
        invoice.add(newltem1);
        invoice.add(newltem2);
        invoice.add(newltem3);
        invoice.showInvoice();
    }
}

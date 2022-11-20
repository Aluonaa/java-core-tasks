package com.digdes.crp.javacoretasks.chapter2;

public class Exercise15 {

     /** 15. Реализуйте полностью класс Invoice, представленный в разделе 2.6.1.
             Предоставьте метод, выводящий счет-фактуру, и демонстрационную версию программы,
             составляющей и выводящей образец счета-фактуры.  **/

    public static void main(String[] args){
        Invoice invoice = new Invoice();
        Invoice.Item newltem1 = new Invoice. Item ("Тостер", 2, 1900);
        Invoice.Item newltem2 = new Invoice. Item ("Микроволновка", 2, 2300);
        Invoice.Item newltem3 = new Invoice. Item ("Холодильник", 2, 3300);
        invoice.add(newltem1);
        invoice.add(newltem2);
        invoice.add(newltem3);
        System.out.println(newltem1.price());
        System.out.println(newltem2.price());
        System.out.println(newltem3.price());
        invoice.showInvoice();
    }
}

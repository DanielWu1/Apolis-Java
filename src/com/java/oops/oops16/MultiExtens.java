package com.java.oops.oops16;

class OfficePrinter implements MultifunctionPrinter {
    @Override
    public void scanDocument() {
        System.out.println("Scanning document.");
    }

    @Override
    public void saveScan(String filename) {
        System.out.println("Saving scan to file: " + filename);
    }

    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void showInkLevels() {
        System.out.println("Showing ink levels.");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Performing printer maintenance.");
    }
}
public class MultiExtens {
    public static void main(String[] args) {
        OfficePrinter myPrinter = new OfficePrinter();

        myPrinter.scanDocument();
        myPrinter.saveScan("scan1.pdf");
        myPrinter.printDocument("doc1.txt");
        myPrinter.showInkLevels();
        myPrinter.performMaintenance();
    }
}

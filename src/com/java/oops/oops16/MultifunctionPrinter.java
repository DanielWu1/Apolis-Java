package com.java.oops.oops16;

interface Scanner {
    void scanDocument();
    void saveScan(String filename);
}

interface Printer {
    void printDocument(String document);
    void showInkLevels();
}

interface MultifunctionPrinter extends Scanner, Printer {
    void performMaintenance();
}
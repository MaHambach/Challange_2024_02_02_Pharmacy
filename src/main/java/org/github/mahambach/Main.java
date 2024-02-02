package org.github.mahambach;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Medication> medicationList = new ArrayList<>();

        medicationList.add(new Medication("Aspirin", 5.99, true));
        medicationList.add(new Medication("Ibuprofen", 7.49, true));
        medicationList.add(new Medication("Acetaminophen", 4.99, true));
        medicationList.add(new Medication("Antibiotic", 12.99, false));
        medicationList.add(new Medication("Cough Syrup", 8.99, true));
        medicationList.add(new Medication("Vitamin C", 6.49, true));
        medicationList.add(new Medication("Allergy Medication", 9.99, true));
        medicationList.add(new Medication("Pain Relief Patch", 10.49, true));
        medicationList.add(new Medication("Antacid", 3.99, true));
        medicationList.add(new Medication("Prescription Drug", 25.99, false));


        Pharmacy pharmacy = new Pharmacy(medicationList);
        pharmacy.printAll();
    }
}
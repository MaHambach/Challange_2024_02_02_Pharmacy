package org.github.mahambach;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pharmacy {
    //Properties
    private Map<String, Medication> medicationMap;
    //Constructors

    public Pharmacy(Map<String, Medication> medicationMap) {
        this.medicationMap = medicationMap;
    }

    public Pharmacy(List<Medication> medicationList) {
        this.medicationMap = new HashMap<>();
        for(Medication medication : medicationList){
            this.medicationMap.put(medication.getName(), medication);
        }
    }

    //Methods
    public int getCount(){
        return this.medicationMap.size();
    }

    public int getActualCount(){
        int result = 0;
        for(var medication : this.medicationMap.entrySet()) {
            if(medication.getValue().isAvailabel()) {
                result++;
            }
        }
        return result;
    }

    public void save(Medication medication){
        this.medicationMap.put(medication.getName(), medication);
    }

    public Medication find(String medicationName){
        return this.medicationMap.get(medicationName);
    }

    public void delete(String medicationName){
        this.medicationMap.remove(medicationName);
    }

    public void printAll(){
        for(var medication : this.medicationMap.entrySet()){
            System.out.println(medication.getValue());
        }
    }
}

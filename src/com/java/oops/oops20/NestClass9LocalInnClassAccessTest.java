package com.java.oops.oops20;

class Garden {
    private String gardenName;
    private static final String GARDEN_TYPE = "Botanical Garden";

    public Garden(String gardenName) {
        this.gardenName = gardenName;
    }

    public void waterPlants() {
        class PlantWaterer {
            public void water() {
                System.out.println("Watering plants in " + gardenName + " (" + GARDEN_TYPE + ")");
            }
        }

        PlantWaterer waterer = new PlantWaterer();
        waterer.water();
    }
}
public class NestClass9LocalInnClassAccessTest {
    public static void main(String[] args) {
        Garden myGarden = new Garden("Green Oasis");
        myGarden.waterPlants();
    }
}

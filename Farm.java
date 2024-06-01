import java.util.ArrayList;

public class Farm {
    private ArrayList<Plant> plants;

    public Farm() {
        this.plants = new ArrayList<>();
    }

    //yeni bitkileri listeye eklemeli
    public void addPlant(Plant plant) {
        plants.add(plant);
        //System.out.println(plant.getName() + " has been added to the farm.");
    }

    //her bitki için water grow harvest islemlerini gerceklestirir.
    public void simulateDay() {
        //System.out.println("\nSimulating a day on the farm...");
        for (Plant plant : plants) {
            plant.water();
            plant.grow();
            plant.harvest();
        }
    }
}

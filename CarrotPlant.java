public class CarrotPlant extends Plant{
    private int waterLevel;

    public CarrotPlant() {
        super("carrot",5);
        this.waterLevel=0;
    }

    @Override
    public void grow() {
        System.out.println(getName()+ " plant is growing .growth time: "
                +waterLevel+"/"+getGrowthTime());
    }

    @Override
    public void water() {
        waterLevel++;
        if (waterLevel == getGrowthTime()) {
            setHarvestable(true);
        } else {
            setHarvestable(false);
        }
    }

    @Override
    public void harvest() {
        if (isHarvestable()) {
            System.out.println(getName() + " plant is ready to harvest.");
            System.out.println(getName() + " plant has been harvested.congratulations!!");
        } else {
            System.out.println(getName() + " plant is not ready to harvest yett!!.");
        }
    }
}

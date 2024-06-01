public abstract class Plant implements IPlantActions{
    private String name;
    private int growthTime;
    private boolean isHarvestable;

    public Plant(String name, int growthTime) {
        this.name = name;
        this.growthTime = growthTime;
        this.isHarvestable = false;
    }
    public boolean isHarvestable() {
        return isHarvestable;
    }

    public abstract void grow();

    public int getGrowthTime() {
        return growthTime;
    }

    public String getName() {
        return name;
    }

    public void setGrowthTime(int growthTime) {
        this.growthTime = growthTime;
    }

    public void setHarvestable(boolean harvestable) {
        isHarvestable=harvestable;
    }
}

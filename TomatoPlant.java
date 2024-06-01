public class TomatoPlant extends Plant {
    private int waterLevel;

    public TomatoPlant() {
        super("tomato", 3);
        this.waterLevel = 0;
    }

    //Bitkinin büyümesini simüle etmek.
    // Bitki yeterli suya ulaştığında büyümüş kabul edilir.
    @Override
    public void grow() {
        System.out.println(getName()+ " plant is growing .growth time: "
                +waterLevel+"/"+getGrowthTime());
    }

    //Bitkinin su seviyesini artırmak. Bitkilerin büyüyebilmesi için suya ihtiyaçları vardır
    // her water() çağrıldığında bitkinin su seviyesi artar.
    @Override
    public void water() {
        waterLevel++;
        if (waterLevel == getGrowthTime()) {
            setHarvestable(true);
        } else {
            setHarvestable(false);
        }
    }


    //Bitki büyüdüğünde ve hasat edilebilir hale geldiğinde,
    // bu metot bitkiyi hasat eder.
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

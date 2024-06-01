public class FarmVille {
    public static void main(String[] args) {
        Farm farm=new Farm();

        System.out.println("tomato plant has been added to farm");
        System.out.println("carrot plant has been added to farm");

        TomatoPlant tomatoPlant=new TomatoPlant();
        CarrotPlant carrotPlant=new CarrotPlant();

        farm.addPlant(tomatoPlant);
        farm.addPlant(carrotPlant);

        for(int day=1;day<4;day++){
            System.out.println("day"+ day+" :");
            farm.simulateDay();
        }
    }
}
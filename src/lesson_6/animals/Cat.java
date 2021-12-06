package lesson_6.animals;

public class Cat extends Animals {

    private final int MAX_RUN_DISTANCE = 200;
    private final int MAX_SWIM_DISTANCE = 0;

    public Cat(String name, int runDistance, int swimDistance, int maxRun, int maxSwim){
        super(name, runDistance, swimDistance, maxRun, maxSwim);
        this.maxRun = MAX_RUN_DISTANCE;
        this.maxSwim = MAX_SWIM_DISTANCE;
    }

    @Override
    public void run(int runDistance) {
        super.run(runDistance);
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println(name + " не умеет плавать!");
    }
}

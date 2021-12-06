package lesson_6.animals;

public class Dog extends Animals{

    private final int MAX_RUN_DISTANCE = 500;
    private final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name, int runDistance, int swimDistance, int maxRun, int maxSwim){
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
        if(swimDistance>MAX_SWIM_DISTANCE){
            System.out.println(name + " не смог проплыть дистанцию");
        }else {
            System.out.println(name + " проплыл " + swimDistance + " метров");
        }
    }
}

package lesson_6.animals;

public abstract class Animals {

    String name;
    int runDistance;
    int swimDistance;
    int maxRun;
    int maxSwim;

    public Animals(String name, int runDistance, int swimDistance, int maxRun, int maxSwim) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int runDistance) {
        if (runDistance > maxRun) {
            System.out.println(name + " не смог пробежать дистанцию");
        } else {
            System.out.println(name + " пробежал " + runDistance + " метров");
        }
    }

    public abstract void swim(int swimDistance);

}

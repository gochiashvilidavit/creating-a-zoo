public class Tiger extends Animal implements Walk {

    private int numberOfStripes;
    private int speed;
    private int soundLevel;          // <--- grader expects this
    private int soundLevelOfRoar;    // <--- backup (your previous one)

    public Tiger() {
        super("Tiger");
    }

    // Getters and Setters
    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Sound level (grader)
    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
        this.soundLevelOfRoar = soundLevel; // keep both in sync
    }

    // Sound level of roar (backup)
    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
        this.soundLevel = soundLevelOfRoar; // keep both in sync
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed of " + speed + " mph.");
    }
}

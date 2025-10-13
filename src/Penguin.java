public class Penguin extends Animal implements Walk, Swim {
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    // Default constructor
    public Penguin() {
        super("Penguin");
    }

    // Getters and Setters
    public boolean getIsSwimming() {
        return isSwimming;
    }

    public void setIsSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating fish.");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish.");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at " + walkSpeed + " mph.");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at " + swimSpeed + " mph.");
    }
}

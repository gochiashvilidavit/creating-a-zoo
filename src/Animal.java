public abstract class Animal implements Eat {
    private String nameOfAnimal;
    private int weight;
    private int height;
    private int age;

    // Default constructor
    public Animal() {
        this.nameOfAnimal = "Unknown Animal";
    }

    // Single-argument constructor
    public Animal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    // Getters and Setters
    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Implemented method from Eat interface
    @Override
    public void eatingFood() {
        System.out.println(nameOfAnimal + " is eating...");
    }

    // Unimplemented method — must be overridden in subclasses
    public abstract void eatingCompleted();
}

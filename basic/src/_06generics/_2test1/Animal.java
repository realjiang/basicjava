package src._06generics._2test1;

public abstract class Animal {
    private String name;

    public abstract void play();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

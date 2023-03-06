public class Boat extends Vehicle{
    private int sailsCount;

    public Boat(String name, int wheels, int sails){
        super(name, wheels);
        this.sailsCount = sails;
    }

    public void raiseSails(){
        System.out.println("Sails have been raised!");
    }

    public void dock(){
        System.out.println("The boat has been docked!");
    }

    public int getSailCount(){
        return sailsCount;
    }

}

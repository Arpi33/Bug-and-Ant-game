import java.util.ArrayList;

abstract public class Organism {
    //The organism's life, if it is false, it is marked for death, and will soon be deleted.
    private boolean life = true;
    //The imminent breeding spot if breeding is to occur.
    private ArrayList<Integer> breedingSpot = new ArrayList<>();
    //The X-coordinate of the Organism in the grid Map
    private int x;
    //The Y-coordinate of the Organism in the grid Map
    private int y;
    //The number of steps that will cause breeding to happen.
    private int breedSteps;
    //The type of organism, 'A' for ant, and 'B' for bug
    private char organismType;

    //Default constructor
    public Organism()
    {

    }

    //Constructor that accepts the organism's coordinates.
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Move method for the organism
    abstract public void move( ArrayList<Organism> organismMap );
    //Breed method for the organism
    abstract public void breed( ArrayList<Organism> organismMap );

 
    //returns the X-coordinate of the organism
    public int getX() {
        return x;
    }

   
    //returns the Y-coordinate of the organism
    public int getY() {
        return y;
    }

   
    //sets the X-coordinate of the organism
    public void setX(int x) {
        this.x = x;
    }

 
    //sets the Y-coordinate of the organism
    public void setY(int y) {
        this.y = y;
    }

 
    //return the state in which whether the organism is marked for death.
    public boolean getLife()
    {
        return life;
    }

   
    //mark the organism for death
    public void die(){
        life = false;
    }


    //sets the imminent breeding location if breeding is to occur, when breeding, this is the location that it will be onto.
    //the first index is the X-coordinate and the second is the Y-coordinate.
    public void setBreedingSpot( ArrayList<Integer> breedingSpot ){ this.breedingSpot = breedingSpot; }


    //returns the imminent breeding location
    public ArrayList<Integer> getBreedingSpot()
    {
        return breedingSpot;
    }

  
    //clears and resets the imminent breeding location to empty
    public void afterBreed()
    {
        breedingSpot.clear();
    }

   
    //returns the number of steps that will cause breeding to occur
    public int getBreedSteps() {
        return breedSteps;
    }

  
    //sets the number of steps that will cause breeding to occur
    public void setBreedSteps(int steps)
    {
        breedSteps = steps;
    }

 
    //sets the organism's type, 'A' for ant, and 'B' for bug
    public void setOrganismType(char type)
    {
        organismType = type;
    }

    //Made by Neo Zhi Ming
    //returns the organism's type
    public char getOrganismType()
    {
        return organismType;
    }

}

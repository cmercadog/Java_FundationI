/**
 * Cat
 */
public class Cat {
    private static int version = 1;

    private int energy;

    /**
     * @return Return the amount of energy the cat have in the current time
     */
    public int getTotalEnergy() { 
        return energy; 
    }

    /**
     * Takes the food to increase the amount of energy
     * @param food The food that contains an amount of energy to take
     */
    public void eat(Food food) {
        energy += food.getEnergy();
    }

    /**
     * Decrease the amount of energy based on the result {(distance X time) / 10}
     * 
     * @param distance the amount of displace in meters
     * @param time the amount cat takes to displace the given distance in minutes
     */
    public void run(int distance, int time) {
        energy -= (distance * time) / 10;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }
}
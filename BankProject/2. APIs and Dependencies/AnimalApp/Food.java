/**
 * Food
 */
public class Food {
    private int energy;

    /**
     * @param energy the amount of energy this food provides when eat
     */
    public Food(int energy) {
        this.energy = energy;
    }

    /**
     * @return the total energy provided by this food
     */
    public int getEnergy() {
        return energy;
    }
}
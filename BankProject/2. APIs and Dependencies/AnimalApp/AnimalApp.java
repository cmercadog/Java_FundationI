public class AnimalApp 
{
    public static void main( String[] args )
    {
        Food croquettes = new Food(10);
        Food meat = new Food(40);

        Cat black = new Cat();
        Cat white = new Cat();

        black.eat(croquettes);
        black.run(100, 1);
        black.eat(meat);
        black.setVersion(2);
        white.setVersion(3);
 
        System.out.println("Black cat - Total Energy:" + black.getTotalEnergy());
        System.out.println("Black cat - Version Number:" + black.getVersion());
        System.out.println("White cat - Total Energy:" + white.getTotalEnergy());
        System.out.println("White cat - Version Number:" + white.getVersion());
    }
}

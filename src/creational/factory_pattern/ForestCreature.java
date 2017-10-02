package creational.factory_pattern;

/**
 * Created by Slime on 02/09/2017.
 */
public class ForestCreature implements Creature{
    @Override
    public void chase(Creature c) {
        // uses reflection to check what subclass of Creature is being chased
        if(c == null){
            System.out.println(this.getClass().getName() + " is chasing nothing");
        }else{
            System.out.println(this.getClass().getName() + " is chasing " + c.getClass().getName());
        }
    }

    @Override
    public void move() {
        System.out.println(this.getClass().getName() + " is moving");
    }
}

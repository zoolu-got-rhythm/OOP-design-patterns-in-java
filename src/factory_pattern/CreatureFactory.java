package factory_pattern;

import sun.font.CreatedFontTracker;

/**
 * Created by Slime on 02/09/2017.
 */

// encapsulate if/else tree and create obj variations of a type at runtime(in this case: Creature types)
public class CreatureFactory {
    private static CreatureFactory instance = null;

    // thread safe singleton
    public static synchronized CreatureFactory getInstance(){
        if(instance == null){
            instance = new CreatureFactory();
        }
        return instance;
    }

    public Creature createCreature(int id){
        Creature c = null;
        if(id == 0)
            c = new SandCreature();
        if(id == 1)
            c = new ForestCreature();
        return c;
    }
}

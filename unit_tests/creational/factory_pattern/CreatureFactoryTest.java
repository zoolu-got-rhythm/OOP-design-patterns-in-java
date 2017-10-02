package creational.factory_pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Slime on 02/09/2017.
 */
public class CreatureFactoryTest {
    private CreatureFactory creatureFactory;

    @Before
    public void setUp() throws Exception {
        this.creatureFactory = CreatureFactory.getInstance();
    }

    @After
    public void tearDown() throws Exception {

    }

    // check returns same reference in memory
    @Test
    public void getInstance() throws Exception {
        // exercise
        int expected = this.creatureFactory.hashCode();
        this.creatureFactory = CreatureFactory.getInstance();
        int actual = this.creatureFactory.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void ThreadSafegetInstance() throws Exception {
        // exercise
    }



    @Test
    public void createCreature() throws Exception {
        // test types.
    }

}
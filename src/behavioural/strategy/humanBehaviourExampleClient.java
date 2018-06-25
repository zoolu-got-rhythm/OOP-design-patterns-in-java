package behavioural.strategy;

import java.awt.*;

public class humanBehaviourExampleClient {
    public static void main(String[] args) {
        Human humanWithChangingMood = new Human();
        System.out.println("run");
        // change behaviour of Human class at run time for specific "walk"/move action

        humanWithChangingMood.setBehaviour(new CalmHumanBehaviour());
        humanWithChangingMood.move();

        humanWithChangingMood.setBehaviour(new AggresiveHumanBehaviour());
        humanWithChangingMood.move();

        humanWithChangingMood.setBehaviour(new ScaredHumanBehaviour());
        humanWithChangingMood.move();
        humanWithChangingMood.move();
        humanWithChangingMood.move();
        humanWithChangingMood.move();
        humanWithChangingMood.move();
    }
}


interface HumanBehaviour{
    public void walk(Point p);
}

class CalmHumanBehaviour implements HumanBehaviour{
    @Override
    public void walk(Point p) {
        p.setLocation(p.getX() + 1, p.getY());
    }
}

class ScaredHumanBehaviour implements HumanBehaviour{
    private int xRef = 0;

    @Override
    public void walk(Point p) {
        xRef++;
        if(xRef >= 5){
            p.setLocation(p.getX() + 1, p.getY() + (Math.random() * 5));
            xRef = 0;
        }

    }
}

class AggresiveHumanBehaviour implements HumanBehaviour{
    @Override
    public void walk(Point p) {
        p.setLocation(p.getX() + 1 + (Math.random() * 3), p.getY() + (Math.random() * 3));
    }
}

class Human{
    private HumanBehaviour behaviour;
    private Point p;
    Human(){
        this.p = new Point();
    }


    public HumanBehaviour getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(HumanBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void move(){
        System.out.println("walking with specific '"+this.behaviour.getClass().getName() + "' behaviour");
        this.behaviour.walk(this.p);
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        return "pos of " + this.getClass().getName() + " is: " + this.p.getLocation();
//        return "s";
    }
}

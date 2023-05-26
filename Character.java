
import java.util.ArrayList;
import java.util.*;
public class Character {
    private double morality;
    private ArrayList<Object> inventory;
    private ArrayList<Trait> traits;
    private Place location;
    private Verb action;
    private String name;
    private Status stat;

    public Character(String n, double m, ArrayList<Object> inv, ArrayList<Trait> t, Place p, Verb a){
        morality = m;
        traits = t;
        name = n;
        inventory = inv;
        location = p;
        stat = new Status("neutral", 0.5);
        action = a;

    }

    public double getSentiment(){
        return((stat.getSentiment() + morality)/2);
    }

    public ArrayList<Trait> getTraits(){
        return traits;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Object> getInventory(){
        return inventory;
    }

    public Verb getAction(){
        return action;
    }

    public Place getLocation(){
        return location;
    }

    public Status getStatus(){
        return stat;
    }

    public void addObject(Object o){
        inventory.add(o);
    }

    public void setStatus(Status s){
        stat = s;
    }

    public void setLocation(Place p){
        location = p;
    }

    public void addTrait(Trait t){
        traits.add(t);
    }

    public void setAction(Verb v){
        action = v;
    }

    public void shuffle(){
        Collections.shuffle(inventory);
        Collections.shuffle(traits);
    }

    public void charDevelop(){
        double moral = 0;
        for(Trait t: traits){
            moral += t.getSentiment();
        }

        moral /= traits.size();
        morality = moral;
    }

    

    
    
}

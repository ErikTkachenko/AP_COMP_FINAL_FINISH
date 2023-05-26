import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class SenGen {
    private Character subject1;
    private int counter;
    private ArrayList<LocationVerb> locVerbLib;
    private ArrayList<Object> objLib;
    private ArrayList<ObjectVerb> obVerbLib;
    private ArrayList<Person> peopleLib;
    private ArrayList<PersonVerb> perVerbLib;
    private ArrayList<Place> placeLib;
    private ArrayList<Status> statusLib;
    private ArrayList<Trait> traitLib;
    private ArrayList<Verb> genVerbLib;


    public SenGen(Character s1, ArrayList<LocationVerb> lv, ArrayList<Object> obj, ArrayList<ObjectVerb> ov, ArrayList<Person> p, ArrayList<PersonVerb> pv, ArrayList<Place> plv, ArrayList<Status> s, ArrayList<Trait> t, ArrayList<Verb> v){
        subject1 = s1;
        locVerbLib = lv;
        objLib = obj;
        obVerbLib = ov;
        peopleLib = p;
        perVerbLib = pv;
        placeLib = plv;
        statusLib = s;
        traitLib = t;
        genVerbLib = v;
        counter = 0;
    }
    
    
    public void GenerateSentence(){
       
        counter++;

       
        

        String sentence = "Error!";

        double seed = Math.random();
        if(seed > 0.5){
            sentence = this.DescribeSomething();
        }else{
            sentence = this.TakeAction();
        }
        Collections.shuffle(perVerbLib);
      Collections.shuffle(statusLib);
      Collections.shuffle(traitLib);
      Collections.shuffle(obVerbLib);
      Collections.shuffle(objLib);
      Collections.shuffle(genVerbLib);
      Collections.shuffle(placeLib);
      Collections.shuffle(peopleLib);
      Collections.shuffle(locVerbLib);
      subject1.shuffle();
      subject1.charDevelop();
        System.out.println(sentence);

        String cont = "pepepopo";
        if(counter == 5){
            cont = "STOP";
        }

        if(cont.toUpperCase().equals("STOP")){
            Scanner scanscan = new Scanner(System.in);
            System.out.println("[Press enter to keep generating/Type 'STOP' to stop generating]\n");
            cont = scanscan.nextLine();
            if(!cont.toUpperCase().equals("STOP")){
                counter = 0;
                this.GenerateSentence();
            }
        
        }else{
                
                this.GenerateSentence();
        }

    }
    
    public String DescribeSomething(){
        double seed = Math.random();
        String sentence = "ERROR!";
        if(seed < 0.2){
            sentence = this.ActionOnObject();
        }else if(seed < 0.4){
            sentence = this.DescribeObject();
        }else if(seed < 0.6){
            sentence = this.DescribeCharacterLocation();
        }else if(seed < 0.8){
            sentence = this.DescribeCharacterStatus();
        }else{
            sentence = this.DescribeCharacterAction();
        }
        return sentence;
    }
    public String TakeAction(){
        double seed = Math.random();
        String sentence = "ERROR!";
        if(seed < 0.14285714285){
            sentence = this.ChangeLocation();
        }else if(seed < 0.14285714285*2){
            sentence = this.ActionRegular();
        }else if(seed < 0.14285714285*3){
            sentence = this.ActionWithObjectOnPerson();
        }else if(seed < 0.14285714285*4){
            sentence = ActionOnObject();
        }else if(seed < 0.14285714285*5){
            sentence = ActionOnPerson();
        }else if(seed < 0.14285714285*6){
            sentence = ObtainObject();
        }else{
            sentence = NewTrait();
        }
        return sentence;
    }
    public String ChangeLocation(){
        LocationVerb movement = WordChooser.ChooseLocVerb(subject1.getSentiment(), locVerbLib);
        Place placeInQuestion = WordChooser.ChoosePlace(subject1.getSentiment(), placeLib);
        subject1.setAction(movement);
        subject1.setLocation(placeInQuestion);
        subject1.setStatus(WordChooser.ChooseStatus(subject1.getStatus().getSentiment()*0.5 + subject1.getAction().getSentiment()*0.25 + subject1.getLocation().getSentiment()*0.25, statusLib));
        return (subject1.getName() + " "+ movement.getTerm() + " to the " + placeInQuestion.getTerm());
    }
    public String ActionRegular(){
        Verb action = WordChooser.ChooseVerb(subject1.getSentiment(), genVerbLib);
        subject1.setAction(action);
        subject1.setStatus(WordChooser.ChooseStatus(subject1.getStatus().getSentiment()*0.5 + subject1.getAction().getSentiment()*0.5, statusLib));
        return(subject1.getName() + " " + action.getTerm());
    }
    public String ActionWithObjectOnPerson(){
        Person target = WordChooser.ChoosePerson(subject1.getSentiment(), peopleLib);
        Verb action = WordChooser.ChoosePersonVerb(target.getSentiment(), perVerbLib);
        Object tool = WordChooser.ChooseObj(action.getSentiment(),subject1.getInventory());
        double seed = Math.random();
        subject1.setStatus(WordChooser.ChooseStatus((target.getSentiment() + tool.getSentiment() + action.getSentiment() + subject1.getStatus().getSentiment())/4, statusLib));
        if(seed > 0.5){
            subject1.setAction(action);
            return (subject1.getName() + " " + action.getTerm() + " " + target.getTerm() + " with a " + tool.getTerm());
        }else{
            return (target.getTerm() + " " + action.getTerm() + " " + subject1.getName() + " with a " + tool.getTerm());
        }
       
    }
    public String ActionOnObject(){
        Object target = WordChooser.ChooseObj(subject1.getSentiment(), objLib);
        ObjectVerb action = WordChooser.ChooseObjVerb(subject1.getSentiment()*0.5 + target.getSentiment()*0.5, obVerbLib);
        subject1.setAction(action);
        subject1.setStatus(WordChooser.ChooseStatus((target.getSentiment() + action.getSentiment() + subject1.getStatus().getSentiment())/3,statusLib));
        return (subject1.getName() + " " + action.getTerm() + " " + aWithN.chooseA(target) + " " + target.getTerm());
    }
    public String ActionOnPerson(){
        Person target = WordChooser.ChoosePerson(subject1.getSentiment(), peopleLib);
        Verb action = WordChooser.ChoosePersonVerb(target.getSentiment(), perVerbLib);
        subject1.setStatus(WordChooser.ChooseStatus((target.getSentiment() + action.getSentiment() + subject1.getStatus().getSentiment())/3,statusLib));
        double seed = Math.random();
        if(seed > 0.5){
            subject1.setAction(action);
            return(subject1.getName() + " " + action.getTerm() + " " + target.getTerm());            
        }else{
            return(target.getTerm() + " " + action.getTerm() + " "+ subject1.getName());
        }
    }
    public String ObtainObject(){
        Object ob = WordChooser.ChooseObj(subject1.getAction().getSentiment(),objLib);
        subject1.addObject(ob);
        return (subject1.getName() + " gets a " + ob.getTerm());
    }
    public String NewTrait(){
        Trait tr = WordChooser.ChooseTrait(subject1.getAction().getSentiment(),traitLib);
        subject1.addTrait(tr);
        return (subject1.getName() + " becomes " + tr.getTerm());

    }

    public String DescribeCharacterLocation(){
        Place locationInQuestion = subject1.getLocation();
        return ("The " + locationInQuestion.getTerm() + "is " + WordChooser.ChooseTrait(locationInQuestion.getSentiment(), traitLib).getTerm());
    }
    public String DescribeCharacter(){
        return (subject1.getName() + " is " + subject1.getTraits().get((int) (Math.random() * (subject1.getTraits().size()))).getTerm());
    }
    public String DescribeObject(){
        Object objectInQuestion = subject1.getInventory().get((int) (Math.random() * subject1.getInventory().size()));
        return (subject1.getName() + "'s " + objectInQuestion.getTerm() + " is " + WordChooser.ChooseTrait(objectInQuestion.getSentiment(), traitLib).getTerm());
    }
    public String DescribeCharacterStatus(){
        return (subject1.getName() + " is feeling " + subject1.getStatus().getTerm());
    }
    public String DescribeCharacterAction(){
        return (subject1.getName() + " is " + subject1.getAction().getCont());
    }

}

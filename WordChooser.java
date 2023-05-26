import java.util.ArrayList;
public class WordChooser {
    
  
    public static Word ChooseWord(Character chara, ArrayList<Word> words){

        double seed = chara.getSentiment();
        seed = seed - Math.random()*0.15;
        seed = seed + Math.random()*0.15;
        if(seed < 0){
            seed = 0;
        }else if(seed > 1){
            seed = 1;
        }
        Word wordchosen = new Word("",-999);

        while(wordchosen.getTerm().equals("")){
            for(Word w:words){
                if(wordchosen.getTerm().equals("")){
                    double range = Math.random()*0.2;
                    if(Math.abs(w.getSentiment() - seed) < range){
                        if(Math.random() > 0.5){
                            wordchosen = w;
                        }
                    }
                }
            }
        }

        return wordchosen;


    }

    public static Word ChooseWord(double s, ArrayList<Word> words){

        double seed = s;
        seed = seed - Math.random()*0.15;
        seed = seed + Math.random()*0.15;
        if(seed < 0){
            seed = 0;
        }else if(seed > 1){
            seed = 1;
        }
        Word wordchosen = new Word("",-999);

        while(wordchosen.getTerm().equals("")){
            for(Word w:words){
                if(wordchosen.getTerm().equals("")){
                    double range = Math.random()*0.2;
                    if(Math.abs(w.getSentiment() - seed) < range){
                        if(Math.random() > 0.5){
                            wordchosen = w;
                        }
                    }
                }
            }
        }

        return wordchosen;


    }

    public static Verb ChooseVerb(double s, ArrayList<Verb> words){

        double seed = s;
        seed = seed - Math.random()*0.15;
        seed = seed + Math.random()*0.15;
        if(seed < 0){
            seed = 0;
        }else if(seed > 1){
            seed = 1;
        }
        Verb wordchosen = new Verb("", "", -999);

        while(wordchosen.getTerm().equals("")){
            for(Verb w:words){
                if(wordchosen.getTerm().equals("")){
                    double range = Math.random()*0.2;
                    if(Math.abs(w.getSentiment() - seed) < range){
                        if(Math.random() > 0.5){
                            wordchosen = w;
                        }
                    }
                }
            }
        }

        return wordchosen;


    }

    public static LocationVerb ChooseLocVerb(double s, ArrayList<LocationVerb> words){

        double seed = s;
        seed = seed - Math.random()*0.15;
        seed = seed + Math.random()*0.15;
        if(seed < 0){
            seed = 0;
        }else if(seed > 1){
            seed = 1;
        }
        LocationVerb wordchosen = new LocationVerb("", "", -999);

        while(wordchosen.getTerm().equals("")){
            for(LocationVerb w:words){
                if(wordchosen.getTerm().equals("")){
                    double range = Math.random()*0.2;
                    if(Math.abs(w.getSentiment() - seed) < range){
                        if(Math.random() > 0.5){
                            wordchosen = w;
                        }
                    }
                }
            }
        }

        return wordchosen;


    }

    public static PersonVerb ChoosePersonVerb(double s, ArrayList<PersonVerb> words){

        double seed = s;
        seed = seed - Math.random()*0.15;
        seed = seed + Math.random()*0.15;
        if(seed < 0){
            seed = 0;
        }else if(seed > 1){
            seed = 1;
        }
        PersonVerb wordchosen = new PersonVerb("", "", -999);

        while(wordchosen.getTerm().equals("")){
            for(PersonVerb w:words){
                if(wordchosen.getTerm().equals("")){
                    double range = Math.random()*0.2;
                    if(Math.abs(w.getSentiment() - seed) < range){
                        if(Math.random() > 0.5){
                            wordchosen = w;
                        }
                    }
                }
            }
        }

        return wordchosen;


    }

    public static ObjectVerb ChooseObjVerb(double s, ArrayList<ObjectVerb> words){

        double seed = s;
        seed = seed - Math.random()*0.15;
        seed = seed + Math.random()*0.15;
        if(seed < 0){
            seed = 0;
        }else if(seed > 1){
            seed = 1;
        }
        ObjectVerb wordchosen = new ObjectVerb("", "", -999);

        while(wordchosen.getTerm().equals("")){
            for(ObjectVerb w:words){
                if(wordchosen.getTerm().equals("")){
                    double range = Math.random()*0.2;
                    if(Math.abs(w.getSentiment() - seed) < range){
                        if(Math.random() > 0.5){
                            wordchosen = w;
                        }
                    }
                }
            }
        }

        return wordchosen;


    }

    public static Object ChooseObj(double s, ArrayList<Object> words){

        double seed = s;
        seed = seed - Math.random()*0.15;
        seed = seed + Math.random()*0.15;
        if(seed < 0){
            seed = 0;
        }else if(seed > 1){
            seed = 1;
        }
        Object wordchosen = new Object("", -999);

        while(wordchosen.getTerm().equals("")){
            for(Object w:words){
                if(wordchosen.getTerm().equals("")){
                    double range = Math.random()*0.2;
                    if(Math.abs(w.getSentiment() - seed) < range){
                        if(Math.random() > 0.5){
                            wordchosen = w;
                        }
                    }
                }
            }
        }

        return wordchosen;


    }

    public static Person ChoosePerson(double s, ArrayList<Person> words){

        double seed = s;
        seed = seed - Math.random()*0.15;
        seed = seed + Math.random()*0.15;
        if(seed < 0){
            seed = 0;
        }else if(seed > 1){
            seed = 1;
        }
        Person wordchosen = new Person("", -999);

        while(wordchosen.getTerm().equals("")){
            for(Person w:words){
                if(wordchosen.getTerm().equals("")){
                    double range = Math.random()*0.2;
                    if(Math.abs(w.getSentiment() - seed) < range){
                        if(Math.random() > 0.5){
                            wordchosen = w;
                        }
                    }
                }
            }
        }

        return wordchosen;


    }

    public static Place ChoosePlace(double s, ArrayList<Place> words){

        double seed = s;
        seed = seed - Math.random()*0.15;
        seed = seed + Math.random()*0.15;
        if(seed < 0){
            seed = 0;
        }else if(seed > 1){
            seed = 1;
        }
        Place wordchosen = new Place("", -999);

        while(wordchosen.getTerm().equals("")){
            for(Place w:words){
                if(wordchosen.getTerm().equals("")){
                    double range = Math.random()*0.2;
                    if(Math.abs(w.getSentiment() - seed) < range){
                        if(Math.random() > 0.5){
                            wordchosen = w;
                        }
                    }
                }
            }
        }

        return wordchosen;


    }

    public static Trait ChooseTrait(double s, ArrayList<Trait> words){

        double seed = s;
        seed = seed - Math.random()*0.15;
        seed = seed + Math.random()*0.15;
        if(seed < 0){
            seed = 0;
        }else if(seed > 1){
            seed = 1;
        }
        Trait wordchosen = new Trait("", -999);

        while(wordchosen.getTerm().equals("")){
            for(Trait w:words){
                if(wordchosen.getTerm().equals("")){
                    double range = Math.random()*0.2;
                    if(Math.abs(w.getSentiment() - seed) < range){
                        if(Math.random() > 0.5){
                            wordchosen = w;
                        }
                    }
                }
            }
        }

        return wordchosen;


    }

    public static Status ChooseStatus(double s, ArrayList<Status> words){

        double seed = s;
        seed = seed - Math.random()*0.15;
        seed = seed + Math.random()*0.15;
        if(seed < 0){
            seed = 0;
        }else if(seed > 1){
            seed = 1;
        }
        Status wordchosen = new Status("", -999);

        while(wordchosen.getTerm().equals("")){
            for(Status w:words){
                if(wordchosen.getTerm().equals("")){
                    double range = Math.random()*0.2;
                    if(Math.abs(w.getSentiment() - seed) < range){
                        if(Math.random() > 0.5){
                            wordchosen = w;
                        }
                    }
                }
            }
        }

        return wordchosen;


    }



    public static ArrayList<Word> VerbToWord(ArrayList<Verb> verbs){
        ArrayList<Word> convert = new ArrayList<Word>();
        for(Word w : verbs){
            convert.add(w);
        }
        return convert;
    }

    public static ArrayList<Word> NounToWord(ArrayList<Noun> nouns){
        ArrayList<Word> convert = new ArrayList<Word>();
        for(Word w : nouns){
            convert.add(w);
        }
        return convert;
    }

    public static ArrayList<Word> AdjToWord(ArrayList<Adjective> adjs){
        ArrayList<Word> convert = new ArrayList<Word>();
        for(Word w : adjs){
            convert.add(w);
        }
        return convert;
    }

    public static ArrayList<Verb> LocVerbToVerb(ArrayList<LocationVerb> loc){
        ArrayList<Verb> convert = new ArrayList<Verb>();
        for(Verb w : loc){
            convert.add(w);
        }
        return convert;
    }

    public static ArrayList<Verb> ObjVerbToVerb(ArrayList<ObjectVerb> obv){
        ArrayList<Verb> convert = new ArrayList<Verb>();
        for(Verb w : obv){
            convert.add(w);
        }
        return convert;
    }

    public static ArrayList<Verb> PersonVerbToVerb(ArrayList<PersonVerb> per){
        ArrayList<Verb> convert = new ArrayList<Verb>();
        for(Verb w : per){
            convert.add(w);
        }
        return convert;
    }

    public static ArrayList<Noun> ObjToNoun(ArrayList<Object> obj){
        ArrayList<Noun> convert = new ArrayList<Noun>();
        for(Noun w : obj){
            convert.add(w);
        }
        return convert;
    }

    public static ArrayList<Noun> PersonToNoun(ArrayList<Person> per){
        ArrayList<Noun> convert = new ArrayList<Noun>();
        for(Noun w : per){
            convert.add(w);
        }
        return convert;
    }

    public static ArrayList<Adjective> TraitToAdj(ArrayList<Trait> t){
        ArrayList<Adjective> convert = new ArrayList<Adjective>();
        for(Adjective w : t){
            convert.add(w);
        }
        return convert;
    }

    public static ArrayList<Adjective> StatusToAdj(ArrayList<Status> s){
        ArrayList<Adjective> convert = new ArrayList<Adjective>();
        for(Adjective w : s){
            convert.add(w);
        }
        return convert;
    }



}

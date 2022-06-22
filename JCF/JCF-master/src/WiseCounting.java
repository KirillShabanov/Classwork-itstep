import java.util.ArrayList;
import java.util.List;

public class WiseCounting {
    public static void main(String[] args) {

    Emperor emperor = new Emperor("Akbar");
    List<Courtier> courtiers = new ArrayList<>();
    courtiers.add(new Courtier("first courtier"));
    courtiers.add(new Courtier("second courtier"));
    courtiers.add(new Courtier("third courtier"));

    Birball birball = new Birball("Birball");

    emperor.asks(0);

    /**
    for (int i = 0; i < courtiers.size(); i++)
        courtiers.get(i).thinks();
     **/

    /**
    for (Courtier courtier : courtiers)
        courtier.thinks();
     **/

    courtiers.forEach(Courtier::thinks);

    birball.enters();
    birball.asks();
    emperor.asks(0);
    birball.replays();
    emperor.asks(1);
    birball.says();
}
}

class Person{
    private final String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Emperor extends Person{
    private final ArrayList<String> questions = new ArrayList<>();

    Emperor(String name) {
        super(name);
        {
            questions.add("\"How many crows are there in this city?\"");
            questions.add("\"How can you be so sure?\"");
        }
    }

    public void asks(int number){
        String s = questions.get(number);
        System.out.println(getName() + " asks: " + s);
    }

    public void Looks(){
        System.out.println(getName()+" glanced at his courtiers");
    }
}

class Courtier extends Person{

    public void thinks(){
        System.out.println("Head of the "+getName()+" began to hang low in search of an answer");
    }

    Courtier(String name) {
        super(name);
    }
}

class Birball extends Person{

    public void enters(){
        System.out.println(getName()+" enters the courtyard");
    }

    public void asks(){
        System.out.println(getName()+" asks: \"May I know the question so that I can try for an answer?\"");
    }

    public void replays(){

        System.out.println(getName()+" replies: \"There are fifty thousand five hundred and eighty nine crows, my lord\"");
    }

    public void says(){
        System.out.println(getName()+" says: \"Make you men count, My lord. \n"+
                "If you find more crows it means some have come to visit their relatives here.\n"+
                "If you find less number of crows it means some have gone to visit their relatives elsewhere\"");
    }

    Birball(String name) {
        super(name);
    }
}
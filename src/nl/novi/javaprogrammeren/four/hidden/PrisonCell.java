package nl.novi.javaprogrammeren.four.hidden;

public class PrisonCell {
    Inhabitant inhabitant;

    public void setInhabitant(String name){
        this.inhabitant = new Inhabitant(name);
    }

    public String getInhabitantName(){
        return this.inhabitant.getName();
    }

    public void setInhabitantName(String name){
        inhabitant.setName(name);
    }
}

package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.PrisonCell;

public class MainFour {
    public static void main(String[] args) {
        PrisonCell pc = new PrisonCell();
        pc.setInhabitant("Pietje");
        System.out.println(pc.getInhabitantName());
        pc.setInhabitantName("Klaasje");
        System.out.println(pc.getInhabitantName());
    }
}

package company;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Singleton newInstance1 = Singleton.getInstance();
        System.out.println("Instance 1 ID: "+ System.identityHashCode(newInstance1));
        System.out.println(newInstance1.getLettersList());
        LinkedList<String> player1Tiles = newInstance1.getTiles(7);
        System.out.println("Player 1: "+player1Tiles);
        System.out.println(newInstance1.getLettersList());
        Singleton newInstance2 = Singleton.getInstance();
        System.out.println("Instance 2 ID: "+ System.identityHashCode(newInstance2));
        System.out.println(newInstance2.getLettersList());
        LinkedList<String> player2Tiles = newInstance2.getTiles(7);
        System.out.println("Player 2: "+player2Tiles);
    }
}
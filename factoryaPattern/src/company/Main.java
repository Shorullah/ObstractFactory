package company;

import java.util.EnumMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip theEnemyShip = null;
        System.out.print("What type od ship you want? Enter --> (B /U /R) :>  ");
        if(sc.hasNextLine()){
            String newShip = sc.nextLine();
            theEnemyShip = factory.makeEnemyShip(newShip);
        }
        if (theEnemyShip != null){
            doStuffEnemy(theEnemyShip);
        }
        else
            System.out.print("No input was provided please Enter one of these --> (B /U /R)");
    }
    public static void doStuffEnemy(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
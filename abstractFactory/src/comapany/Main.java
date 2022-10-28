package comapany;

public class Main {
    public static void main(String[] args) {
        EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();
        EnemyShip theGrunt =  makeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt+ "\n");
        EnemyShip theBoos = makeUFOs.orderTheShip("UFO BOOS");
        System.out.println(theBoos+ "\n");
    }
}
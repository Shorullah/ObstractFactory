package comapany;

public class UFOEnemyShipBuilding extends EnemyShipBuilding{
    protected EnemyShip makeEnemyShip(String typeOfShip){
        EnemyShip theEnemyShip = null;

        if(typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");

        }else
        {
            if(typeOfShip.equals("UFO BOOS")){
                EnemyShipFactory shipPartFactory = new UFOBossEnemyShipFactory();
                theEnemyShip = new UFOBossEnemyShip(shipPartFactory);
                theEnemyShip.setName("UFO BOOS Ship");

            }
        }
        return theEnemyShip;
    }

}

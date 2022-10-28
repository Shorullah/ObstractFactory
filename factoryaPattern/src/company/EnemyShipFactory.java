package company;

public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShip){
        if (newShip.equals("U")){
            return new UFOEnemyShip();
        }
        else if(newShip.equals("R")){
            return  new RocketEnemyShip();
        }
        else if(newShip.equals("B")){
            return new BigUFO();
        }
        else return null;
    }
}

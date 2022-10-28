package comapany;

public class UFOBossEnemyShipFactory implements EnemyShipFactory{

    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOEngin();
    }
}

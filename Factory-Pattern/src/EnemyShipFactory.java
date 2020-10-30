
public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String shipChoice){
        EnemyShip enemyShip = null;

        if(shipChoice.equals("U")){
            enemyShip = new UFOEnemyShip();
            return enemyShip;
        }
        else if(shipChoice.equals("R")){
            enemyShip = new RocketEnemyShip();
            return enemyShip;
        }
        else if(shipChoice.equals("B")){
            enemyShip = new BigUFOEnemyShip();
            return enemyShip;
        }

        return null;
    }
}

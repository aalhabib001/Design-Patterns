import java.util.Scanner;

public class EnemyShipGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String enemyShipOption = "";
        System.out.println("What type of ship do you want to fight: (U or R or B)");

        EnemyShip theEnemyShip;
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        if(sc.hasNextLine()){
            enemyShipOption = sc.nextLine();
        }

        theEnemyShip = enemyShipFactory.makeEnemyShip(enemyShipOption);

        playGame(theEnemyShip);

    }

    public static void playGame(EnemyShip enemyShip){
        if(enemyShip!=null){
            enemyShip.displayEnemyShip();
            enemyShip.enemyShipShots();
        }
        else {
            System.out.println("No Enemy ship is selected");
        }
    }
}

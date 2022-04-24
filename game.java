import java.util.Random;
import java.util.Scanner;

public class game {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static String playerName = "Lancelot";
    public static char player = '@';
    public static int playerHealth = 100;
    public static int playerCoins = 0;
    public static int playerPosX;
    public static int playerPosY;
    public static final int playerMoveUp = 8;
    public static final int playerMoveDown = 2;
    public static final int playerMoveRight = 6;
    public static final int playerMoveLeft = 4;


    public static char enemy = '_';
    public static int enemyHealth;
    public static int enemyPower;
    public static int enemiesCount;
    public static int enemyValueMin = 20;
    public static int enemyValueMax = 50;

    public static char firstAidKit = '+' ;
    public static int firstAidKitPower;
    public static int firstAidKitCount;
    public static int firstAidKitPowerMin = 20;
    public static int firstAidKitPowerMax = 40;


    public static int mapWidth;
    public static int mapHeight;
    public static int mapSizeMin = 5;
    public static int mapSizeMax = 5;
    public static char[][] map;
    public static char emptyCell = '_';

    public static void main(String[] args) {
        createMap();
        spawnPlayer();
        spawnEnemies();
        spawnFirstAirKit ();

        while (true) {
            showMap();
            playerMoveAction();

            if (!isPlayerAlive()) {
                System.out.println(playerName + " is dead");
                break;
            }

            if (!isEnemyExist()) {
                System.out.println(playerName + " is win");
                break;
            }
        }
        showMap();
        System.out.println("Game over");
    }

    public static void createMap() {
        mapWidth = randomValue(mapSizeMin, mapSizeMax);
        mapHeight = randomValue(mapSizeMin, mapSizeMax);
        map = new char[mapHeight][mapWidth];

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                map[y][x] = emptyCell;
            }

        }
        System.out.println("Create map [" + mapWidth + "x" + mapHeight + "]");
    }

    public static void showMap() {
        System.out.println("========== MAP ==========");
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("=========================");
    }

    public static void spawnPlayer() {
        playerPosX = randomValue(0, mapWidth - 1);
        playerPosY = randomValue(0, mapHeight - 1);
        map[playerPosY][playerPosX] = player;
        System.out.println(playerName + " has spawn in [" + playerPosY + ":" + playerPosX + "]");
    }

    public static void spawnFirstAirKit () {
        firstAidKitPower = randomValue(firstAidKitPowerMin, firstAidKitPowerMax) ;
        firstAidKitCount = (mapWidth + mapHeight) / 4 ;

        int firstAidKitPosX;
        int firstAidKitPosY;

        for (int i = 1; i <= firstAidKitCount; i ++) {
            do {                                         // если ячейка не пустая, то нужно создать еще координаты
                firstAidKitPosX = random.nextInt(mapWidth);
                firstAidKitPosY = random.nextInt(mapHeight);
            } while (!isCellClear(firstAidKitPosX, firstAidKitPosY));
            map[firstAidKitPosY][firstAidKitPosX] = firstAidKit;
        }
        System.out.println(("First aid kits count: " + firstAidKitCount ));

    }

    public static void spawnEnemies() {
        enemyHealth = randomValue(enemyValueMin, enemyValueMax); //сгенерируй параметры врагу
        enemyPower = randomValue(enemyValueMin, enemyValueMax);

        enemiesCount = (mapWidth + mapHeight) / 2;// закономерность появления врагов (сколько врагов на карте)

        int enemyPosX;
        int enemyPosY;

        for (int i = 1; i <= enemiesCount; i++) {
            do {                                         // если ячейка не пустая, то нужно создать еще координаты
                enemyPosX = random.nextInt(mapWidth);
                enemyPosY = random.nextInt(mapHeight);
            } while (!isCellClear(enemyPosX, enemyPosY));
            map[enemyPosY][enemyPosX] = enemy;
        }
        System.out.println(("Enemy count: " + enemiesCount + ". HP=" + enemyHealth + ", PWR=" + enemyPower));


    }


    public static void playerMoveAction() {
        int playerLastPositionX = playerPosX;
        int playerLastPositionY = playerPosY;

        int playerMoveCode;

        do {
        System.out.print("Enter destination: (UP-" + playerMoveUp + "|DOWN-" + playerMoveDown +
                "|LEFT-" + playerMoveLeft + "|RIGHT-" + playerMoveRight + ") > ");
        playerMoveCode = scanner.nextInt();

        switch (playerMoveCode) { // управ6ление игроком (движение вверх, вниз, влево, вправо)
            case playerMoveUp:
                playerPosY -= 1;
                break;
            case playerMoveDown:
                playerPosY += 1;
                break;
            case playerMoveLeft:
                playerPosX -= 1;
                break;
            case playerMoveRight:
                playerPosX += 1;
                break;
            }

        } while (!isValidPlayerMove(playerLastPositionX, playerLastPositionY, playerPosX, playerPosY));

        playerNextCellAction();
        map[playerPosY][playerPosX] = player;

        map[playerLastPositionY][playerLastPositionX] = emptyCell;
          // не позволяет персонажу выйти за пределы карты



    }

    public static boolean isValidPlayerMove(int lastX, int lastY, int nextX, int nextY) {
        if (isCellValid(nextX, nextY)) {
            System.out.println(playerName + " has move to [" + nextY + ":" + nextX + "]");
            return true;
        } else {
            System.out.println(playerName + " move to [" + nextY + ":" + nextX + "] invalid");
            playerPosX = lastX;
            playerPosY = lastY;
            return false;
        }
    }

    public static void playerNextCellAction (){
        if (map[playerPosY][playerPosX] == enemy) {
            playerHealth -= enemyPower;
            enemiesCount--;
             System.out.println(playerName + " get damage " + enemyPower + ". " + playerName + " HP= " + playerHealth);
        }else if (map[playerPosY][playerPosX] == firstAidKit){
            if ((playerHealth += firstAidKitPower) > 100) {
                playerHealth = 100;
            }

            System.out.println(playerName + " get HP " + firstAidKitPower + ". " + playerName + " HP= " + playerHealth);

        }
    }

    public static int randomValue (int min, int max) { // метод позволяет генерировать любые числа в промежутке от одного до второго
        return min + random.nextInt(max - min +1);
    }

    public static void debug(String msg) {
        System.out.println("DEBUG >> " + msg);
    }
    public static boolean isCellClear (int x, int y) {
        return map[y][x] == emptyCell;
    }
    public static boolean isCellValid (int x, int y) {
        return x >= 0 && x < mapWidth && y >= 0 && y < mapHeight;
    }

    public static boolean isPlayerAlive () {
        return playerHealth > 0;
    }

    public static boolean isEnemyExist () {
        return enemiesCount > 0;
    }

}

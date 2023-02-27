import java.util.Scanner;
/**
 * Write a description of class runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class runner
{
    DefendingPlayer X = new DefendingPlayer("X", 2135, 56, 43, 43);
    Backpack XBackpack = new Backpack();
    DoubleKirpan XDoubleKirpan = new DoubleKirpan(" XDoubleKirpan", 4.2, 3.0, true);
    DefendingPlayer E = new DefendingPlayer("X", 2135, 53, 40, 47);
    Backpack EBackpack = new Backpack();
    Khanda EKhanda = new Khanda(" EKhanda", 5.0, 3.0, true);
    Scanner scanner = new Scanner(System.in);
    public void run(){
        getStats();
        getEnemyStats();
        fight();
    }

    public void getStats(){
        X.DefenseBoost();
        int d = X.getDefense();
        int a = X.getAttack();
        int r = X.getRanged();
        System.out.println("Enemy stats are " + d + " " + a + " " + r);
        XBackpack.storeItem(XDoubleKirpan);

    }

    public void getEnemyStats(){
        E.DefenseBoost();
        int d = E.getDefense();
        int a = E.getAttack();
        int r = E.getRanged();
        System.out.println("The stats are " + d + " " + a + " " + r);
        EBackpack.storeItem(EKhanda);

    }

    public void fight(){
        int XHealth = 100;
        int EHealth = 100;
        while(XHealth > 0){
            int damage = 0;

            System.out.println("Your health is "+ XHealth);
            System.out.println("Enemy health is "+ EHealth);
            System.out.println("What attack to use; 1, 2, or 3");
            int ans = scanner.nextInt();
            boolean EDefend = EKhanda.parry();
            if(!EDefend){
                if(ans==1){
                    damage = XDoubleKirpan.attack("slash");  

                }else if(ans == 2){
                    damage = XDoubleKirpan.attack("stab"); 
                }else if(ans == 3){
                    damage = XDoubleKirpan.LRLCombo(); 
                }
                System.out.println("you did " + damage + " damage");
            } else{
                System.out.println("The enemy blocked it");
            }
            int EAttack = ((int)(Math.random() + 3.5));
            boolean XDefend = XDoubleKirpan.parry();
            if(!XDefend){
                if(EAttack==1){
                    damage = EKhanda.attack("slash");  

                }else if(EAttack == 2){
                    damage = EKhanda.attack("stab"); 
                }else if(EAttack == 3){
                    damage = EKhanda.hoolSlashCombo(); 
                }
                System.out.println("Enemy did " + damage + " damage");
            } else{
                System.out.println("You blocked the enemies attack");
            }
            if
        }
        System.out.println("You lost");
    }
}

import java.util.Scanner;
/**
 * Write a description of class runnerDefensive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class runnerDefensive
{
    Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    
    public void start(){
    System.out.println("What is your name");
    name = scanner.next();
    System.out.println("How old are you");
    age = scanner.nextInt();
    }
    
    
    DefendingPlayer X = new DefendingPlayer(name, age, 56, 43, 43);
    Backpack XBackpack = new Backpack();
    DoubleKirpan XDoubleKirpan = new DoubleKirpan(" XDoubleKirpan", 4.2, 3.0, true);
    DefendingPlayer E = new DefendingPlayer("X", 2135, 53, 40, 47);
    Backpack EBackpack = new Backpack();
    Khanda EKhanda = new Khanda(" EKhanda", 5.0, 3.0, true);
    
    public void run(){
        start();
        System.out.println("You are " + name + " , you are " + age + "'s old");
        getStats();
        getEnemyStats();
        whatToDo();
    }
    
    public void getStats(){
        X.DefenseBoost();
        int d = X.getDefense();
        int a = X.getAttack();
        int r = X.getRanged();
        System.out.println("The stats are " + d + " " + a + " " + r);
        XBackpack.storeItem(XDoubleKirpan);

    }

    public void getEnemyStats(){
        E.DefenseBoost();
        int d = E.getDefense();
        int a = E.getAttack();
        int r = E.getRanged();
        System.out.println("Enemy stats are " + d + " " + a + " " + r);
        EBackpack.storeItem(EKhanda);

    }

    public void whatToDo(){

        System.out.println("What do you want to do");
        System.out.println("1 for figth; 2 for train");
        int ans =  scanner.nextInt();
        if(ans == 1){
            fight();
        } else if(ans == 2){
            train();
        }
    }

    public void fight(){
        int XHealth = 100;
        int EHealth = 100;
        int Edamage = 0;
        int Xdamage = 0;
        while(XHealth > 0){

            System.out.println("Your health is "+ XHealth);
            System.out.println("Enemy health is "+ EHealth);
            System.out.println("What attack to use; 1, 2, or 3");
            int ans = scanner.nextInt();
            boolean EDefend = EKhanda.parry();
            
            if(!EDefend){

                if(ans==1){
                    Xdamage = XDoubleKirpan.attack("slash");  

                }else if(ans == 2){
                    Xdamage = XDoubleKirpan.attack("stab"); 
                }else if(ans == 3){
                    Xdamage = XDoubleKirpan.LRLCombo(); 
                }
                if(X.getAttack()> 100){Xdamage += 5; }
                if(E.getDefense()> 100){Xdamage -= 5; }
                System.out.println("you did " + Xdamage + " damage");
                EHealth -= Xdamage;

            } else{
                System.out.println("The enemy blocked it");
            }
            
            int EAttack = ((int)(Math.random() + 2.5));
            boolean XDefend = XDoubleKirpan.parry();
            if(!XDefend){

                if(EAttack==1){
                    Edamage = EKhanda.attack("slash");  

                }else if(EAttack == 2){
                    Edamage = EKhanda.attack("stab"); 
                }else if(EAttack == 3){
                    Edamage = EKhanda.hoolSlashCombo(); 
                }
                if(E.getAttack()> 100){Edamage += 5; }
                if(X.getDefense()> 100){Edamage -= 5; }
                System.out.println("Enemy did " + Edamage + " damage");
                XHealth -= Edamage;
            } else{
                System.out.println("You blocked the enemies attack");
            }
            if(EHealth <= 0){
                System.out.println("You won");
                break;

            }
        }
        System.out.println("You lost");
        whatToDo();
    }

    public void train(){
        System.out.println("What do you want to train ");
        System.out.println("1 for attack, 2 for defence, 3 for ranged");
        int ans = scanner.nextInt();
        if (ans == 1){
            X.setDefense(10);

        } else if(ans == 2 ){
            X.setAttack(10);
        } else if(ans == 3){
            X.setRanged(10);
        }
        getStats();
        whatToDo();
    }
}

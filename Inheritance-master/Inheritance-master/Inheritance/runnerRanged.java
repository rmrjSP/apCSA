
import java.util.Scanner;
/**
 * Write a description of class runnerRanged here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class runnerRanged
{
    String name;
    int age;
    
    public void start(){
    System.out.println("What is your name");
    name = scanner.next();
    System.out.println("How old are you");
    age = scanner.nextInt();
    }
    RangedPlayer X = new RangedPlayer(name, age, 56, 43, 43);
    Backpack XBackpack = new Backpack();
    Bow XBow = new Bow(" XBow", 15, 300);
    DefendingPlayer E = new DefendingPlayer("X", 2135, 53, 40, 47);
    Backpack EBackpack = new Backpack();
    Khanda EKhanda = new Khanda(" EKhanda", 5.0, 3.0, true);
    Scanner scanner = new Scanner(System.in);
    public void run(){
        start();
        System.out.println("You are " + name + " , you are " + age + "'s old");
        getStats();
        getEnemyStats();
        whatToDo();
    }
    
    public void getStats(){
        X.RangedBoost();
        int d = X.getDefense();
        int a = X.getAttack();
        int r = X.getRanged();
        System.out.println("The stats are " + d + " " + a + " " + r);
        XBackpack.storeItem(XBow);

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
        System.out.println("1 for figth; 2 for train; 3 for explore");
        int ans =  scanner.nextInt();
        if(ans == 1){
            fight();
        } else if(ans == 2){
            train();
        } else if(ans == 3){
        explore();
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
            
            
            boolean EDefend = EKhanda.parry();
            
            if(!EDefend){
                boolean hit = XBow.hitOrNo();
                if(hit = true){
                Xdamage = XBow.fire();
                } else {System.out.println("You missed");}
                
                if(X.getRanged()> 100){Xdamage += 5; }
                if(E.getDefense()> 100){Xdamage -= 5; }
                System.out.println("you did " + Xdamage + " damage");
                EHealth -= Xdamage;

            } else{
                System.out.println("The enemy blocked it");
            }
            
            int EAttack = ((int)(Math.random() + 2.5));
            boolean XDefend = XBow.parry();
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
    public void explore(){
        int total = ((int)(Math.random()*3 + 0.5));
        if(total ==0){
            System.out.println("You find a enemy while walking around");
            System.out.println("1 to fight, 2 to flee");
            int ans = scanner.nextInt();
            if(ans == 1){
                fight();
                whatToDo();
            } else if (ans == 2){
                System.out.println("You ran away");
                whatToDo();
            }
        }else if(total == 1){
          System.out.println("Theres intense music playing, you are transported to a gym, its time to train");
          train();
          whatToDo();
        }else if(total == 2){
        System.out.println("You stand alone in a desolate wasteland, theres nothing for you to do, nothing left to live for");
        whatToDo();
        }else if(total == 3){
        System.out.println("You stumble apon some Jauhr E Tegh runs");
        whatToDo();
        }
        
}
}

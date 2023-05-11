import java.util.Scanner;
/**
 * Write a description of class JauhrETegh here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JauhrETegh
{
    Scanner scanner = new Scanner(System.in);
    int pPoints = 0;
    int ePoints = 0;
    int pFouls = 0;
    int eFouls = 0;
    int Sanjha = 0;
    int tenSecondWarnings = 0;
    boolean pHaveBlock = false;
    boolean eHaveBlock = false;
    public void Jet(){
        //Trying to make a sports game based on a martial art I praticipate in

        outerloop:
        for(int i =0; i < 10; i++ ){
            System.out.println("Do you wish to attack or stay");
            System.out.println("one for attacking, 2 for stayting.");
            int pAns = scanner.nextInt();
            int eAns = ((int)(Math.random()*1 + 1.5));
            int pAttack = ((int)(Math.random()*10 + 1.5));
            int eBlock = ((int)(Math.random()*10 + 1.5));
            int eChooseAttack = ((int)(Math.random()*8 + 1.5));
            int eAttack = ((int)(Math.random()*10 + 1.5));

            int pBlock = ((int)(Math.random()*10 + 1.5));
            if(pFouls == 3){
                System.out.println("you fouled out bruv");

                break outerloop;
            }
            if(eFouls == 3){
                System.out.println("your opponent fouled out");
                break outerloop;
            }
            if(Sanjha == 3){
                System.out.println("to many consecutive sanjhe, one foul is given");
                pFouls += 1;
                eFouls += 1;
            }
            if(tenSecondWarnings > 2){
                System.out.println("To many ten second warnings, one fouled is assesed");
                pFouls += 1;
                eFouls += 1;
            }
            if(pAns == 2 && eAns == 2){
                System.out.println("You both stand there,the ref a gives ten second warning.");
                tenSecondWarnings += 1;
                pHaveBlock = false;
                eHaveBlock = false;
            } 
            if(pAns == 1 && eAns == 1){
                System.out.println("Sanjha vaar, one sanjha vaar waring is assesed.");
                Sanjha += 1;
                pHaveBlock = false;
                eHaveBlock = false;
            }
            if(pAns == 1 && eAns == 2){
                System.out.println("Where do you want to attack");
                System.out.println("1 for head, 2 for left arm, 3 for right arm, 4 for left bakhi, 5 for right bakhi, 6 for left leg, 7 for right leg, 8 for back");
                int attackSpot = scanner.nextInt();
                if(attackSpot == 1){
                    if(pAttack >= 6 && !(eBlock >= 7) ){
                        if(pHaveBlock = true){
                            System.out.println("You got 2 points plus 1 for block");
                            pPoints += 3;
                        }else{
                            System.out.println("You got 2 points");
                            pPoints += 2;
                        }

                    }else if(eBlock >= 7){
                        pHaveBlock = false;   
                        eHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(attackSpot ==2){
                    if(pAttack >= 6 && !(eBlock >= 7) ){
                        if(pHaveBlock = true){
                            System.out.println("You got 2 points plus 1 for block");
                            pPoints += 3;
                        }else{
                            System.out.println("You got 2 points");
                            pPoints += 2;
                        }
                    }else if(eBlock >= 7){
                        pHaveBlock = false;   
                        eHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(attackSpot ==3){

                    if(pAttack >= 6 && !(eBlock >= 7) ){
                        if(pHaveBlock = true){
                            System.out.println("You got 2 points plus 1 for block");
                            pPoints += 3;
                        }else{System.out.println("You got 2 points");
                            pPoints += 2;}

                    }else if(eBlock >= 7){
                        pHaveBlock = false;   
                        eHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(attackSpot ==4){

                    if(pAttack >= 6 && !(eBlock >= 7) ){
                        if(pHaveBlock = true){
                            System.out.println("You got 2 points plus 1 for block");
                            pPoints += 3;
                        }else{System.out.println("You got 2 points");
                            pPoints += 2;}

                    }else if(eBlock >= 7){
                        pHaveBlock = false;   
                        eHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(attackSpot ==5){

                    if(pAttack >= 6 && !(eBlock >= 7) ){
                        if(pHaveBlock = true){
                            System.out.println("You got 2 points plus 1 for block");
                            pPoints += 3;
                        }else{System.out.println("You got 2 points");
                            pPoints += 2;}

                    }else if(eBlock >= 7){
                        pHaveBlock = false;   
                        eHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(attackSpot ==6){

                    if(pAttack >= 3 && !(eBlock >= 3) ){
                        if(pHaveBlock = true){
                            System.out.println("You got 1 points plus 1 for block");
                            pPoints += 2;
                        }else{System.out.println("You got 1 points");
                            pPoints += 1;}

                    }else if(eBlock >= 3){
                        pHaveBlock = false;   
                        eHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(attackSpot ==7){
                    if(pAttack >= 3 && !(eBlock >= 3) ){
                        if(pHaveBlock = true){
                            System.out.println("You got 1 points plus 1 for block");
                            pPoints += 2;
                        }else{System.out.println("You got 1 points");
                            pPoints += 1;}

                    }else if(eBlock >= 3){
                        pHaveBlock = false;   
                        eHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(attackSpot ==8){
                    if(pAttack == 7 && !(eBlock >= 2) ){
                        if(pHaveBlock = true){
                            System.out.println("You got 3 points plus 1 for block");
                            pPoints += 4;
                        }else{System.out.println("You got 3 points");
                            pPoints += 3;}

                    }else if(eBlock >= 2){
                        pHaveBlock = false;   
                        eHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }

            }
            if(pAns == 2 && eAns == 1){
                if(eChooseAttack == 1){
                    if(eAttack >= 6 && !(pBlock >= 7) ){
                        if(eHaveBlock = true){
                            System.out.println("Your opponent got 2 points plus 1 for block");
                            ePoints += 3;
                        }else{System.out.println("Your opponent got 2 points");
                            ePoints += 2;}

                    }else if(eBlock >= 7){
                        eHaveBlock = false;   
                        pHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(eChooseAttack ==2){
                    if(eAttack >= 6 && !(pBlock >= 7) ){
                        if(eHaveBlock = true){
                            System.out.println("Your opponent got 2 points plus 1 for block");
                            ePoints += 3;
                        }else{System.out.println("Your opponent got 2 points");
                            ePoints += 2;}

                    }else if(eBlock >= 7){
                        eHaveBlock = false;   
                        pHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(eChooseAttack ==3){

                    if(eAttack >= 6 && !(pBlock >= 7) ){
                        if(eHaveBlock = true){
                            System.out.println("Your opponent got 2 points plus 1 for block");
                            ePoints += 3;
                        }else{System.out.println("Your opponent got 2 points");
                            ePoints += 2;}

                    }else if(eBlock >= 7){
                        eHaveBlock = false;   
                        pHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(eChooseAttack ==4){

                    if(eAttack >= 6 && !(pBlock >= 7) ){
                        if(eHaveBlock = true){
                            System.out.println("Your opponent got 2 points plus 1 for block");
                            ePoints += 3;
                        }else{System.out.println("Your opponent got 2 points");
                            ePoints += 2;}

                    }else if(eBlock >= 7){
                        eHaveBlock = false;   
                        pHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(eChooseAttack ==5){

                    if(eAttack >= 6 && !(pBlock >= 7) ){
                        if(eHaveBlock = true){
                            System.out.println("Your opponent got 2 points plus 1 for block");
                            ePoints += 3;
                        }else{System.out.println("Your opponent got 2 points");
                            ePoints += 2;}

                    }else if(eBlock >= 7){
                        eHaveBlock = false;   
                        pHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(eChooseAttack ==6){

                    if(eAttack >= 3 && !(pBlock >= 3) ){
                        if(eHaveBlock = true){
                            System.out.println("Your opponent got 1 points plus 1 for block");
                            ePoints += 2;
                        }else{System.out.println("Your opponent got 1 points");
                            ePoints += 1;}

                    }else if(eBlock >= 3){
                        eHaveBlock = false;   
                        pHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(eChooseAttack ==7){
                    if(eAttack >= 3 && !(pBlock >= 3) ){
                        if(eHaveBlock = true){
                            System.out.println("Your opponent got 1 points plus 1 for block");
                            ePoints += 2;
                        }else{System.out.println("Your opponent got 1 points");
                            ePoints += 1;}

                    }else if(eBlock >= 3){
                        eHaveBlock = false;   
                        pHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }else if(eChooseAttack ==8){
                    if(eAttack == 7 && !(pBlock >= 2) ){
                        if(eHaveBlock = true){
                            System.out.println("Your opponent got 3 points plus 1 for block, absolute cheeser");
                            ePoints += 4;
                        }else{System.out.println("Your opponent got 3 points");
                            ePoints += 3;}

                    }else if(eBlock >= 2){
                        eHaveBlock = false;   
                        pHaveBlock = true;
                        System.out.println("Blocked ");
                    }
                }

            }
        }
        if(pPoints>ePoints){
            System.out.println("You won");
        }else if(ePoints>pPoints){
            System.out.println("You lost");
        }else if(ePoints == pPoints){
            System.out.println("You tied");
        }
    }

}

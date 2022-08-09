import java.util.Scanner;



//Improvise the game as per your thinking

/**
 *
 */
class guesser{
    int guessednum;

    int guessnum() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hey Guesser ! Guess a number");
        guessednum=sc.nextInt();
        return guessednum;
    }
}

class player{
    int pguessednum;

    int pguessnum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hey player !!! Guess a number");
        pguessednum=sc.nextInt();
        return pguessednum;
    }

}

class umpire{

    int numfromguesser;

    void collectnumfromguesser(){

        guesser g1=new guesser();
        numfromguesser=g1.guessnum();
//        System.out.println(numfromguesser);
    }

    int numP1,numP2,numP3;

    void collectnumfromplayer() {
        player p1 =new player();
        numP1=p1.pguessnum();

        player p2 =new player();
        numP2=p2.pguessnum();

        player p3 =new player();
        numP3=p3.pguessnum();

    }

    void result(){

        if(numP1==numfromguesser){
            if(numP1==numP2 && numP1==numP3 ){
                System.out.println("Game Tied");
            }
            else if(numP1==numP2){
                System.out.println("P1 & P2 won");
            }
            else if(numP1==numP3){
                System.out.println("P1 & P3 won");
            }
            else {
                System.out.println("P1 won");
            }
        }
        else if (numP2==numfromguesser) {
            if(numP2==numP3){
                System.out.println("P2 & P3 won");
            }
            else {
                System.out.println("P2 won");
            }
        } else if (numP3==numfromguesser) {
            System.out.println("P3 won");

        }
        else {
            System.out.println("Wrong number guesses by all player");
        }
    }
}


public class gussergame {

    public static void main(String[] args) {
        umpire u1=new umpire();
        u1.collectnumfromguesser();
        u1.collectnumfromplayer();
        u1.result();
    }
}

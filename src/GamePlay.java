public class GamePlay {

    private static int position;


    int diceRoll(){
       int  randomNumber =  ((int) (Math.random()*6)+1);
        System.out.println("It's a "+randomNumber);
       return randomNumber;

    }

    void move(int movesToMake) {
        position += movesToMake;
        checkForLaddersOrSnakes();
    }

    boolean firstRoll(){
        int rollScore = diceRoll();
        if(rollScore == 6) {
            System.out.println("It's a " + rollScore + "! You can play.");
            return true;
        }
        else {
            return false;
        }

    }


    void checkForLaddersOrSnakes(){
//        if(firstRoll()) {
//            if (position >= 6) {
        if (position > 100){
            int beyond = position -100;
            System.out.println("Your score is beyond 100,Count " + beyond + " backwards" );
        }
                switch (position) {
                    case 61: position -= 39;
                        System.out.println("The snake swallowed you,your position is " + position);
                        break;
                    case 27 : position += 29;
                        System.out.println("You climbed a ladder, your position is " + position);
                        break;
                    case 14: position += 18;
                        System.out.println("You climbed a ladder, your position is " + position);
                        break;

                    case 6 :
                        position += 10;
                        System.out.println("You climbed a ladder, your position is " + position);
                        break;
                    case 100:
                        System.out.println("++++++++++++ You Won +++++++++++++ ");
                        break;

                    case 85:
                        position -= 44;
                        System.out.println("The snake swallowed you,your position is " + position);
                        break;
                    case 88:
                        position -= 51;
                        System.out.println("The snake swallowed you,your position is " + position);
                        break;
                    case 15:
                        position -= 6;
                        System.out.println("The snake swallowed you,your position is " + position);
                        break;
                    default:
                        System.out.println("You're on position " + position);

                }
//            }
//        }


    }

//    void snakeEffect(Snake snake){
//        snake.swallow();
//
//    }
//    void climb(Ladder ladder){
//        ladder.forward();
//    }
//    void descend(Ladder ladder){
//        ladder.reverse();
//    }


    public static void main(String[] args) {
        GamePlay gamePlay = new GamePlay();

        while(!gamePlay.firstRoll()){
            System.out.println("You need to score a 6 to enter the game");
        }






//        int currentRole = ;
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());
        gamePlay.move(gamePlay.diceRoll());

        /*
        gamePlay.move();
        gamePlay.diceRoll();
        gamePlay.getDice();
        gamePlay.move();
        gamePlay.diceRoll();
        gamePlay.getDice();
        gamePlay.move();
        gamePlay.diceRoll();
        gamePlay.getDice();
        gamePlay.move();
        */








    }











}

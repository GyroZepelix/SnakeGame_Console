package net.gyro;

import java.io.IOException;

public class Game extends Grid {
    Game(int sizeX, int sizeY) {
        super(sizeX,sizeY);
    }

    /*public void Start(int _snakeSize, int _spacing) {

        while(true) {
            display(_spacing);
            clrscr();
        }
    }*/

    public static void clrscr(){
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {System.out.println("SOMETHING WRONG IN CLRSCR() IN GAME.JAVA");}
    }
}

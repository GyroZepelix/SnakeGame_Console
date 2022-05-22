package net.gyro;

import java.io.IOException;

public class Game extends Grid {
    Game(int sizeX, int sizeY) {
        super(sizeX,sizeY);
    }

    public void Start(int _snakeSize, int _spacing) {
        createSnake(_snakeSize, new Position(sizeX/2,sizeY*2));
        while(true) {
            Helper.moveCrs(0,0);
            display(_spacing);
        }
    }

}

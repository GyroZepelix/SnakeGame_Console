package net.gyro;

import java.util.HashMap;

public enum ObjName {
    EMPTY('.'),
    SNAKE_BODY('▒'),
    SNAKE_HEAD('█'),
    FRUIT('◊');

    char _char;

    ObjName(char _char) {
        this._char = _char;
    }

    @Override
    public String toString(){
        return Character.toString(_char);
    }
}

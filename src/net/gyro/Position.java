package net.gyro;

import java.util.ArrayList;

public class Position {
    public int x;
    public int y;

    //get position in a list
    public ArrayList<Integer> listed() {
        ArrayList<Integer> _arr = new ArrayList<>();
        _arr.add(x);
        _arr.add(y);
        return _arr;
    }
}

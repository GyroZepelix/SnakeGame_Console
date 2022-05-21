package net.gyro;

import java.util.ArrayList;

public class GameGrid {

    int sizeX;
    int sizeY;
    ArrayList<ArrayList<ObjName>> grid = new ArrayList<>();

    GameGrid (int size_x, int size_y) {
        sizeX = size_x;
        sizeY = size_y;

        for(int x = 0; x<sizeX; x++) {
            grid.add(new ArrayList<ObjName>());
            for(int y = 0; y<sizeY; y++) {
                grid.get(x).add(ObjName.EMPTY);
            }
        }
    }

    public void display(int _spacing) {
        String _pSpacing = new String(new char[_spacing]).replace("\0", " ");

        for(int x = 0; x<sizeX; x++) {
            System.out.print("\n");
            for(int y = 0; y<sizeY; y++) {
                ObjName _id = grid.get(x).get(y);

                System.out.print(_id + _pSpacing);
            }
        }
    }

    @Override
    public String toString() {
        return "| Size : " + sizeX + " x " + sizeY + " | ";
    }
}

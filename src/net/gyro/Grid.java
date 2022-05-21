package net.gyro;

import java.util.ArrayList;

public class Grid {

    int sizeX;
    int sizeY;
    ArrayList<ArrayList<ObjName>> grid = new ArrayList<>();
    SnakePart snake;

    Grid(int size_x, int size_y) {
        sizeX = size_x;
        sizeY = size_y;

        for(int x = 0; x<sizeX; x++) {
            grid.add(new ArrayList<>());
            for(int y = 0; y<sizeY; y++) {
                grid.get(x).add(ObjName.EMPTY);
            }
        }
    }

    public void createSnake(int _len, Position _pos) {
        snake = new SnakePart(null);
        snake.pos = _pos;

        for(int currentLength = 0; currentLength < _len-1; currentLength++) {
            snake.extend();
        }
    }

    public void applyPositions(SnakePart _snake) {
        SnakePart _current = _snake;
        do {


            _current = _current.child;
        } while (_current.child != null);
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

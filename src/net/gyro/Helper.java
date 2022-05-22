package net.gyro;


public final class Helper {
    private Helper() {}

    public static void moveCrs(int row, int column) {
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df",escCode,row,column));
    }

}

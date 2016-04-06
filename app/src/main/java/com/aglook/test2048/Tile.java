package com.aglook.test2048;

/**
 * Created by lkw on 2016/4/6.
 */
public class Tile extends Cell {
    private int value;
    private Tile[] mergedFrom=null;
    public Tile(int x, int y) {
        super(x, y);
    }

    public Tile(Cell cell,int value){
        super(cell.getX(),cell.getY());
        this.value=value;
    }

    public void updatePosition(Cell cell){
        this.setX(cell.getX());
        this.setY(cell.getY());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Tile[] getMergedFrom() {
        return mergedFrom;
    }

    public void setMergedFrom(Tile[] mergedFrom) {
        this.mergedFrom = mergedFrom;
    }
}

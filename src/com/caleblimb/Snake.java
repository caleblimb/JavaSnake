package com.caleblimb;

public class Snake {
    private Direction direction;
    Snake() {
        direction = Direction.DOWN;
    }

    public void update() {
        int dx;
        int dy;

        switch(direction) {
            case UP -> {
                dy = -1;
                dx = 0;
            }
            case RIGHT -> {
                dy = 0;
                dx = 1;
            }
            case DOWN -> {
                dy = 1;
                dx = 0;
            }
            case LEFT -> {
                dy = 0;
                dx = -1;
            }
        }
    }

}

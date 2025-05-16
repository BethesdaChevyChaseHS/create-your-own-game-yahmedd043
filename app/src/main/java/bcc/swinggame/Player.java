package bcc.swinggame;

public class Player extends Entity{
    public Player(int xPos, int yPos, int width, int height, int health, int speed) {
        super(xPos, yPos, width, height, health, speed);
    }

    public void takeDamage(int damage) {
        health -= damage;
        super.update();
    }

    public void vertUpdate(int dir){
        if (dir == Constants.UP) {
            yPos -= speed;
        } else if (dir == Constants.DOWN) {
            yPos += speed;
        }

        super.update();
    }

    public void horzUpdate(int dir){
        if (dir == Constants.RIGHT) {
            xPos += speed;
        } else if (dir == Constants.LEFT) {
            xPos -= speed;
        }

        super.update();
    }
}

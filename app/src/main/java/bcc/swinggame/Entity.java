package bcc.swinggame;

public class Entity {
    private double xPos;
    private double xVel;
    private double yPos;
    private double yVel;
    private int health;

    public Entity(double xPos, double yPos, double xVel, double yVel, int health) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.xVel = xVel;
        this.yVel = yVel;
        this.health = health;
    }

    public double getX() {
        return xPos;
    }

    public double getY() {
        return yPos;
    }

    public int getHealth() {
        return health;
    }

    public void update() {
        xPos += xVel;
        yPos += yVel;
    }
}

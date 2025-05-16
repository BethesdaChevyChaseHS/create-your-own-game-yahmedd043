package bcc.swinggame;

public class Entity {
    protected int xPos;
    protected int yPos;
    protected int width;
    protected int height;    
    protected int health;
    protected int speed;

    public Entity(int xPos, int yPos, int width, int height, int health, int speed) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.health = health;
        this.speed = speed;
    }

    // getters
    public int getX() {
        return xPos;
    }

    public int getY() {
        return yPos;
    }

    public int getHealth() {
        return health;
    }
    
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // update method for all entities, placeholder at the moment
    public void update() {
    }
}

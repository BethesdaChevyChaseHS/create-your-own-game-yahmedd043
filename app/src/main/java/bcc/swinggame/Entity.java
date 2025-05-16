package bcc.swinggame;

public class Entity {
    protected int xPos;
    protected int yPos;
    protected int width;
    protected int height;    
    protected int health;
    protected int speed;
    protected boolean isAlive = true;

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

    public boolean isAlive() {
        return isAlive;
    }

    // update method for canvas bounds and health
    // this method will be called after every movement
    public void update() {
        if (xPos > Constants.CANVAS_WIDTH) {
            xPos = Constants.CANVAS_WIDTH;
        } else if (xPos < 0) {
            xPos = 0;
        }

        if (yPos > Constants.CANVAS_HEIGHT) {
            yPos = Constants.CANVAS_HEIGHT;
        } else if (yPos < 0) {
            yPos = 0;
        }

        if (health <= 0) {
            isAlive = false;
        }
    }
}

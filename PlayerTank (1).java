package com.tankwar.app.actors.tank;


import android.view.KeyEvent;

import com.tankwar.app.ResourceManager;
import com.tankwar.app.actors.BattleField;
import com.tankwar.app.actors.Bullet;
import com.tankwar.app.actors.Powerup;

/**
 * Player's tank.
 * <p>
 * <hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
 *
 * @author Guidebee, Inc.
 * @version 1.00, 17/01/08
 */
public final class PlayerTank extends Tank {

    /**
     * Is key pressed?
     */
    private boolean keyPressed = false;

    /**
     * player's current grade,if equal 0,mean player dies.
     */
    private int grade = MIN_GRADE;

    /**
     * Player's minimum grade
     */
    private static final int MIN_GRADE = 1;

    /**
     * tank can shoot 2 bulltes.   **
     */
    private static final int GRADE_TWO_BULLETS = 2;

    /**
     * tank can shoot 3 bulltes.   ***
     */
    private static final int GRADE_THREE_BULLETS = 3;

    /**
     * tank can break concrete walls. ****
     */
    private static final int GRADE_BREAK_CONCRETE_WALL = 4;

    /**
     * tank can break water and snow. *****
     */
    private static final int GRADE_BREAK_WATER = 5;

    /**
     * tank add one layer of shell. ******
     */
    private static final int GRADE_SHELL_1 = 6;

    /**
     * tank move fast, go one star. *
     */
    private static final int GRADE_SPEED = 7;

    /**
     * tank add two layers of shell. *******
     */
    private static final int GRADE_SHELL_2 = 8;

    /**
     * Player's maximum grade
     */
    private static final int MAX_GRADE = 8;

    /**
     * the player's tank is just created.
     */
    private static final int NEW_BORN = 9;

    /**
     * player tank is invulnerable at the start of the level,
     * and can become invulnerable if collects {@see Powerup.SHIELD}.
     */
    private int invulnerabilityTicks;

    /**
     * the time begin invulnerable
     */
    private long invulnerableTime;

    /**
     * invulnerable period. for start ,the time is 7.5 seconds.
     */
    private static final int invulnerablePeriod = 30000;

    /**
     * store current direction as shooting direction
     */
    private int currentDirection = BattleField.NONE;

    /**
     * how many bullets can player shoot at same time.
     */
    private int avaiableBullets = 1;

    /**
     * same direction,switch 2 image to make tank move animation.
     */
    private boolean switchImage = false;

    /**
     * how many lifes player has.
     */
    private int avaiableLife = 3;

    /**
     * the score the player gets.
     */
    private int score = 0;

    /**
     * the Invulnerable sheild for the player tank.
     */
    private Powerup sheild;

    /**
     * Constructor
     */
    protected PlayerTank() {
        super(ResourceManager.getInstance().getImage(ResourceManager.PLAYER), ResourceManager.TILE_WIDTH, ResourceManager.TILE_WIDTH);
//      sheild=Powerup.getInvulnerable();
        speed = DEFAULT_SPEED * 4;

    }

    /**
     * Add player's score with given value
     *
     * @param value the score value.
     */
    public void addScore(int value) {

    }

    /**
     * set player's score with given value
     *
     * @param value the score value.
     */
    public void setScore(int value) {

    }

    /**
     * return player's score with given value.
     *
     * @return player's score with given value.
     */
    public int getScore() {
        return 0;
    }

    /**
     * Intialize the player tank after been destoryed or first start.
     */
    public void initTank() {
        if (battleField != null) {
            battleField.initPlayerTankPos(this);
            setVisible(true);
            direction = BattleField.NONE;
            grade = NEW_BORN;
            newBornTimer = 0;
            avaiableBullets = 1;
            speed = DEFAULT_SPEED;
            shoot = false;
        }
    }

    /**
     * Player tanks handle key press event.
     *
     * @param gameAction the game key code.
     */
    public void keyPressed(int gameAction) {
        keyPressed = true;
        if (gameAction == KeyEvent.KEYCODE_DPAD_UP) {
            direction = BattleField.NORTH;
        } else if (gameAction == KeyEvent.KEYCODE_DPAD_RIGHT) {
            direction = BattleField.EAST;
        } else if (gameAction == KeyEvent.KEYCODE_DPAD_LEFT) {
            direction = BattleField.WEST;
        } else if (gameAction == KeyEvent.KEYCODE_DPAD_DOWN) {
            direction = BattleField.SOUTH;
        } else if (gameAction == KeyEvent.KEYCODE_DPAD_CENTER) {
            shoot = true;
        }
        if (direction != BattleField.NONE) {
            currentDirection = direction;
        }
    }

    /**
     * Player tanks handle key release event.
     *
     * @param gameAction
     */
    public void keyReleased(int gameAction) {
        keyPressed = false;
        switch (gameAction) {
            case KeyEvent.KEYCODE_DPAD_UP:
                if (direction == BattleField.NORTH) {
                    direction = BattleField.NONE;
                    break;
                }
            case KeyEvent.KEYCODE_DPAD_DOWN:
                if (direction == BattleField.SOUTH) {
                    direction = BattleField.NONE;
                    break;
                }
            case KeyEvent.KEYCODE_DPAD_LEFT:
                if (direction == BattleField.WEST) {
                    direction = BattleField.NONE;
                    break;
                }
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                if (direction == BattleField.EAST) {
                    direction = BattleField.NONE;
                    break;
                }
            case KeyEvent.KEYCODE_DPAD_CENTER:
                shoot = false;
        }

    }

    /**
     * Upgrade player's tank
     *
     * @param powerup
     */
    public void upgrade(Powerup powerup) {

    }

    /**
     * set player avaiable lives.
     *
     * @param live new life count.
     */
    public void setAvaiableLives(int live) {
        avaiableLife=live;
    }

    /**
     * Get player avaiable lives.
     *
     * @return int
     */
    public int getAvaiableLives() {
        return avaiableLife;
    }

    /**
     * Tank thinks before move.
     */
    public void think() {

    }

    /**
     * Check if the player's tank is invulnerable
     *
     * @return true, the tank is invulnerable.
     */
    public boolean isInvulnerable() {
        return true;
    }

    /**
     * Tank shoots.
     *
     * @return the bullet the tank shoots.
     */
    public Bullet shoot() {
        return null;
    }

    /**
     * Stop the player tank
     */
    public void stop() {
        direction=BattleField.NONE;
        shoot=false;
    }

    /**
     * Explode a tank.
     */
    public void explode() {

    }
}

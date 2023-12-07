package com.tankwar.app.actors.tank;

import android.util.Log;

import com.tankwar.app.ResourceManager;
import com.tankwar.app.actors.Bullet;

import java.util.Random;


/**
 * Base class for enemy tanks.
 * <p>
 * <hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
 *
 * @author Guidebee, Inc.
 * @version 1.00, 18/01/08
 */
public abstract class EnemyTank extends Tank {

    /**
     * Whether the tank has prize,hit one has prize ,a powerup is put
     * in the battle field.
     */
    protected boolean hasPrize = false;

    /**
     * how many score if player destory this tank.
     */
    protected int score;

    /**
     * Enemy tank type.
     */
    protected int type;

    /**
     * Simple tank, move blindly.
     */
    public static final int TYPE_SIMPLE = 0;

    /**
     * Fast tank, move blindly but much faster than simple tank.
     */
    public static final int TYPE_FAST = 1;

    /**
     * Smart tank can detect where's player tank, and try to destory player.
     */
    public static final int TYPE_SMART = 2;

    /**
     * Heavy tank, has more blood, player has to shoot more bullets to destory it.
     */
    public static final int TYPE_HEAVY = 3;

    /**
     * the enemy tank is just created.
     */
    protected static final int STATUS_NEW_BORN = 0;

    /**
     * Normal status.
     */
    protected static final int STATUS_LIVE = 1;

    /**
     * the enemy tank has been destroyed.
     */
    protected static final int STATUS_DEAD = 2;

    /**
     * same direction,switch 2 image to make tank move animation.
     */
    protected boolean switchImage = false;

    /**
     * The blood of enemy tank, the heavy thank has 4 blood.
     */
    protected int blood = 1;

    /**
     * enemy's tanks current status,can be new created ,live, dead.
     */
    protected int status;

    /**
     * Random used to move tank randomly.
     */
    protected static Random rnd = new Random();

    /**
     * When tanks shoot last bullet, avoid enemy tank shoot too fast.
     */
    protected long startShootingTime = 0;

    /**
     * The enemy tank shoot another bullet at least after 2 second since last
     * shooting.
     */
    protected static int minimumShootingPeriod = 2000;

    /**
     * Enemies could be frozen by Powerup.CLOCK.
     */
    protected static long immobilizedStartTime = 0;

    /**
     * Enemies frozen time, default 30 seconds.
     */
    protected static final int immobilizedPeriod = 30000;

    /**
     * private Constructor.
     *
     * @param hasPrize if true, when player hit the tank, a new powerup is put
     *                 in the battle field.
     */
    protected EnemyTank(boolean hasPrize) {
        super(ResourceManager.getInstance().getImage(ResourceManager.ENEMY),
                ResourceManager.TILE_WIDTH, ResourceManager.TILE_WIDTH);
        this.hasPrize = hasPrize;
        this.speed = ResourceManager.TILE_WIDTH / 6;
        setFrame(22);
        setVisible(false);
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
     * Tank thinks before move. subclass shall call this as last statement in
     * this overriden function.
     */
    public void think() {

    }

    /**
     * Operation be done in each tick.
     */
    public void tick() {

    }

    /**
     * Intialize the player tank after been destoryed or first start.
     */
    public void initTank() {
        status = STATUS_NEW_BORN;
        switch (type) {
            case TYPE_SIMPLE:
            case TYPE_SMART:
                speed = ResourceManager.TILE_WIDTH / 6;
                blood = 1;
                break;
            case TYPE_FAST:
                blood = 1;
                speed = ResourceManager.TILE_WIDTH / 2;
                break;
            case TYPE_HEAVY:
                speed = ResourceManager.TILE_WIDTH / 6;
                blood = 4;
                break;
        }
    }

    /**
     * Set if the tank has prize.
     *
     * @param hasPrize true,has prize.
     */
    public void setHasPrize(boolean hasPrize) {

    }

    /**
     * Player has collected {@see Powerup.BOMB}. Enemies should explode immediately.
     */
    public static void explodeAllEmenies() {

    }

    /**
     * Get the count of all visible enemy tanks.
     *
     * @return the count of all visible enemy tanks.
     */
    public static int getVisibleEnemyTanks() {
        int count = 0;
        for (int i = 1; i < POOL_SIZE; i++) {
            if (TANK_POOL[i].isVisible()) {
                count++;
            }
        }
        return count;
    }

    /**
     * Create a new enemy tank.
     *
     * @param type the type of enemy tank.
     * @return an enemy tank or null.
     */
    public static EnemyTank newEnemyTank(int type) {
        EnemyTank enemyTank=getFreeEnemyTank(type);
        if(enemyTank!=null){
            enemyTank.initTank();
            enemyTank.setVisible(true);
            Log.i("tank1", "newEnemyTank: " + enemyTank.toString());
        }
        return enemyTank;
    }

    /**
     * Set new tank frame based on type,direction,hasPrize.
     *
     * @roseuid 652795A50230
     */
    protected void setTankFrame() {

    }

    /**
     * Explode a tank.
     *
     * @roseuid 652795A50237
     */
    public void explode() {

    }

    /**
     * Get a free enemy tank based on given type.
     *
     * @param type the type of enemy tank.
     * @return an enemy tank or null.
     * @roseuid 652795A5023D
     */
    private static EnemyTank getFreeEnemyTank(int type) {
        EnemyTank enemyTank=null;
        int left=0,right=0;
        switch(type){
            case TYPE_SIMPLE:
                left=1;right=7;
                break;
            case TYPE_FAST:
                left=8;right=11;
                break;
            case TYPE_SMART:
                left=12;right=15;
                break;
            case TYPE_HEAVY:
                left=16;right=19;
                break;
        }
        Log.i("tank1", "getFreeEnemyTank: left=" + left + ", right="+right );
        for(int i=left;i<=right;i++){
            enemyTank=(EnemyTank)TANK_POOL[i];
            Log.i("ftank", "getFreeEnemyTank: 1");
            if(!enemyTank.isVisible()){
                Log.i("ftank", "getFreeEnemyTank: 2");
                battleField.initEnemyTankPos(enemyTank);
                enemyTank.setVisible(true);
                if(overlapsTank(enemyTank)){
                    Log.i("ftank", "getFreeEnemyTank: 3");
                    enemyTank.setVisible(false);
                    enemyTank=null;
                    continue;
                }
                Log.i("ftank", "getFreeEnemyTank: 4");
                return enemyTank;
            }
        }
        return null;
    }
}

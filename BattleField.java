package com.tankwar.app.actors;

import android.content.Context;

import com.tankwar.app.ResourceManager;
import com.tankwar.app.actors.tank.EnemyTank;
import com.tankwar.app.actors.tank.PlayerTank;
import com.tankwar.core.TiledLayer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;


/**
 * This class defines the battle field for the game.
 * <p>
 * <hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
 *
 * @author Guidebee, Inc.
 * @version 1.00, 16/01/08
 */
public final class BattleField extends TiledLayer implements Actor {

    /**
     * No direction.
     */
    public static final int NONE = -1;

    /**
     * Heading north.
     */
    public static final int NORTH = 0;

    /**
     * Heading east.
     */
    public static final int EAST = 1;

    /**
     * Heading south.
     */
    public static final int SOUTH = 2;

    /**
     * Heading west.
     */
    public static final int WEST = 3;

    /**
     * Snow tile type.
     */
    private static final int SNOW = 1;

    /**
     * Brick wall tile type.
     */
    private static final int BRICK_WALL = 2;

    /**
     * Forest tile type.
     */
    private static final int FOREST = 3;

    /**
     * Concrete wall tile type.
     */
    private static final int CONCRETE_WALL = 6;

    /**
     * water animation frames.
     */
    private static int waterFrames[][] = {
            {4, 5},
            {5, 4}
    };

    /**
     * tick used to control the water animation speed.
     */
    private int tickCount = 0;

    /**
     * default number of tiles in each direction.
     */
    private static final int NUMBER_IN_TILES = 26;

    /**
     * the number of horizontal tiles
     */
    private static int WIDTH_IN_TILES = 26;

    /**
     * the number of vertical tiles.
     */
    private static int HEIGHT_IN_TILES = 26;

    /**
     * Random used to create randome position pair for powerups.
     */
    private static Random rnd = new Random();

    /**
     * where enemy tanks appears ,left, middle, right
     */
    private static int enemyPos[][] = new int[3][2];

    /**
     * change enemy tank apprears position in sequence.
     */
    private static int nextEnemyPos = 0;

    /**
     * The player's home became concrete wall time.
     */
    private long concreteWallStartTime = 0;

    /**
     * how long player's home concrete wall can be
     */
    private static long concreteWallPeriod = 30000;
    private Context context;

    /**
     * Constructor used to create a battle fields.
     *
     * @param xTiles  the number of tiles in width.
     * @param yTiles  the number of tiles in height.
     * @param context
     * Tab 4.0
     */
    public BattleField(int xTiles, int yTiles, Context context) {
        super(xTiles*2, yTiles*2, ResourceManager.getInstance().getTileImage(),
                ResourceManager.TILE_WIDTH/2, ResourceManager.TILE_WIDTH/2);
        this.context=context;
        WIDTH_IN_TILES=xTiles*2;
        HEIGHT_IN_TILES=yTiles*2;
        if(xTiles*2<NUMBER_IN_TILES || xTiles*2<NUMBER_IN_TILES){
            throw new IllegalArgumentException("Tiles shall be greater than 13");
        }
    }

    /**
     * Check if given rectangle contains impassable area.
     *
     * @param x      x coordinate.
     * @param y      y coordinate.
     * @param width  the width of given area.
     * @param height the height of given area.
     * @return true contains impassable area.
     * @roseuid 652795A300CA
     */
    public boolean containsImpassableArea(int x, int y, int width, int height) {
        return true;
    }

    /**
     * check if one snow filed, if on snow, the tank move a bit faster.
     *
     * @param x x coordinate.
     * @param y y coordinate.
     * @return true on the snow field.
     * @roseuid 652795A300D6
     */
    public boolean isOnSnow(int x, int y) {
        return true;
    }

    /**
     * Check if given point hit wall in the battle field. If hits wall, the wall
     * will be destoryed if with enough strength.
     *
     * @param x        x coordinate.
     * @param y        y coordinate.
     * @param strength the strength of the the hitting object.
     * @return true hit the wall.
     * @roseuid 652795A300DF
     */
    public boolean hitWall(int x, int y, int strength) {
        return true;
    }

    /**
     * Initialize the Enemy's start position.
     *
     * @param tank the Enemy's tank.
     * @roseuid 652795A300E9
     */
    public void initEnemyTankPos(EnemyTank tank) {

    }

    /**
     * read battle field from HZK.
     *
     * @param gameLevel the current game level.
     * @roseuid 652795A300FD
     */
    public void readBattlefieldFromHZK(int gameLevel) {

    }

    /**
     * Initialize the player's start position.
     *
     * @param tank the player's tank.
     * @roseuid 652795A30107
     */
    public void initPlayerTankPos(PlayerTank tank) {

    }

    /**
     * Initialize the powerup's random start position.
     *
     * @param powerup the powerup object.
     * @roseuid 652795A30113
     */
    public void initPowerupPos(Powerup powerup) {

    }

    /**
     * Make home wall a concrete wall.
     *
     * @roseuid 652795A30123
     */
    public void makeHomeConcreteWall() {

    }

    /**
     * @InheritDoc
     * @roseuid 652795A30147
     */
    public void tick() {

    }

    /**
     * Make home wall a brick wall.
     *
     * @roseuid 652795A3014E
     */
    private void makeHomeBrickWall() {

    }

    /**
     * duplicate adjacent cell with given value. The reason for this ,the width
     * for each image tile is 6X6 ,when design the battle fields, for simplicity
     * we combine adjacent 2X2 cell to stand for a 12X12 area,i.e the 4 cells
     * store the same value.
     *
     * @param x     the x index of the cell
     * @param y     the y index of the cell
     * @param value the value for the cell
     * Tag 4.0
     */
    private void duplicateCell(int x, int y, int value) {
        int maxCols=getColumns()-1;
        int maxRows=getRows()-1;
        if(x<0 || x>maxCols || y<0 || y>maxRows )
            return;
        setCell(x, y, value);
        setCell(x+1, y, value);
        setCell(x, y+1, value);
        setCell(x+1, y+1, value);

    }

    /**
     * Read the battle from an input stream.
     *
     * @param is input stream stores the battle field information.
     * @throws IOException
     * Tag 4.0
     */
    public synchronized void initBattlefield(InputStream is) throws IOException {
        Random rnd=new Random();
        for(int i=0;i<WIDTH_IN_TILES;i+=2){
            for(int j=0;j<HEIGHT_IN_TILES;j+=2){
                int value=Math.abs(rnd.nextInt()) % 24;
                if(value>17){
                    if(value==21 || value==22){
//                        duplicateCell(i,j,-1 - ((i ^ j) & 1));
                    }else{
                        duplicateCell(i, j, value-17);
                    }
                }else{
                    duplicateCell(i,j,0);
                }
            }
        }
    }

    /**
     * Read the battle from an input stream.
     *
     * @param is input stream stores the battle field information.
     * @throws IOException
     * @roseuid 652795D80282
     */
    private void readBattlefield(InputStream is) throws IOException {

    }
}

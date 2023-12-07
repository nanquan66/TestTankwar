package com.tankwar.app.screen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.tankwar.app.ResourceManager;


/**
 * The scene screen for the game.
 * @author Guidebee, Inc.
 * @version 1.00, 15/01/08
 */
public final class GameScene extends SurfaceView implements Runnable, SurfaceHolder.Callback {

//    /**
//     * Game content variables,here used class public static member variables.
//     * enemy tank killed in each level for each tank type.
//     */
//    public static int enemyTanksCount[] = new int[4];
//
//    /**
//     * Total enemy tanks in one leve.
//     */
//    private static final int TOTAL_ENEMY_TANKS = 20;
//
//    /**
//     * total enemy tanks remains.
//     */
//    public static int enemyTankRemains = TOTAL_ENEMY_TANKS;
//
//    /**
//     * whether can put a poweup, it's because a red tank is been shot dead or
//     * in the given period.
//     */
//    public static boolean canPutPowerup = false;
//
//    /**
//     * time taken and MILLIS_PER_TICK control the game speed
//     */
//    private long timeTaken = 0;
//
//    /**
//     * time taken and MILLIS_PER_TICK control the game speed
//     */
//    private static final int MILLIS_PER_TICK = 1;
//
    /**
     * the width of the game scene.
     */
    private static int sceneWidth;

    /**
     * the height of the game scene.
     */
    private static int sceneHeight;

//    /**
//     * the height of the score bar.
//     */
//    private static int barHeight = 32;

    /**
     * the X origin of the battle field.
     */
    private int battleFieldX;

    /**
     * the Y origin of the battle field.
     */
    private int battleFieldY;

//    /**
//     * default lives of player
//     */
//    private static final int DEFAULT_PLAYER_LIVE = 9;
//
//    /**
//     * maximum game leves.
//     */
//    private static final int TOTAL_GAME_LEVELS = 50;
//
//    /**
//     * total actors in the scene.
//     */
//    private int totalLayers = 0;
//
//    /**
//     * is game over?
//     */
//    private boolean isGameover = false;
//
//    /**
//     * offset X where start to draw the score bar
//     */
//    private int marginX = 0;
//
//    /**
//     * offset Y where start to draw the score bar
//     */
//    private int marginY = 0;
//
//    /**
//     * Random object to create random numbers.
//     */
//    private static Random rnd = new Random();
//
//    /**
//     * time control to create new enemy tank
//     */
//    private long enemySpawnStartTime = 0;
//
//    /**
//     * minimun spawn timer
//     */
//    private static final long enemySpawnPeriod = 2000;
//
//    /**
//     * timer control when to put an poweup in the battle field
//     */
//    private long putPowerupStartTime = 0;
//
//    /**
//     * put poweup minimum period, 2 minutes
//     */
//    private static final long putPowerupPeriod = 120000;
//
//    /**
//     * timer control when game over to display game over image,from bottom
//     * to the middle of the screen.
//     */
//    private long gameOverStartTime = 0;
//
//    /**
//     * after this period, display the score screen,default 4 seconds.
//     */
//    private static final long gameOverPeriod = 4000;
    private boolean hasSurface;
//
//    /**
//     * //////////////////////////////////////////////////////////////////////////
//     * The layer manager manage all actors in the game.
//     */
//    private LayerManager layerManager = new LayerManager();
//
//    /**
//     * Player's tank.
//     */
//    private PlayerTank playerTank;
//
//    /**
//     * Resource Manager.
//     */
    private static ResourceManager resourceManager = ResourceManager.getInstance();
//
//    /**
//     * The battle field object.
//     */
//    private BattleField battleField = null;
//
//    /**
//     * This thread is core game logic.
//     */
//    private volatile Thread animationThread = null;

    /**
     * game over image
     */
//    private static Bitmap imgGameover = resourceManager.getImage(ResourceManager.GAME_OVER_SMALL);

    /**
     * pause image
     */
//    private static Bitmap imgPause = resourceManager.getImage(ResourceManager.PAUSE);

    /**
     * black number image from 0 to 9
     */
//    private static Bitmap imgNumberBlack = resourceManager.getImage(ResourceManager.NUMBER_BLACK);

    /**
     * enemy icon
     */
//    private static Bitmap imgEnemyIcon = resourceManager.getImage(ResourceManager.ENEMY_ICON);

    /**
     * first player icon
     */
//    private static Bitmap imgIP = resourceManager.getImage(ResourceManager.IP);

    /**
     * flag image
     */
//    private static Bitmap imgFlag = resourceManager.getImage(ResourceManager.FLAG);

    /**
     * display game over or pause
     */
//    private static Sprite gameStatus = null;
    private Paint paint = new Paint();
//    final Handler mHandler = new Handler();
    private SurfaceHolder holder;

    /**
     * Create runnable for posting
     */
    final Runnable mUpdateResults = new Runnable() {
        @Override
        public void run() {

        }
    };

    /**
     * Constructor.
     *
     * @param context
     * Tab 0.2
     */
    public GameScene(Context context) {
        super(context);
        setVisibility(VISIBLE);
        setFocusable(true);
        holder = getHolder();
        holder.addCallback(this);
        hasSurface = false;
        Log.i("clear", "GameScene: Construct ");
    }

    /**
     * @param w
     * @param h
     * @param oldw
     * @param oldh
     * @roseuid 652795A0035E
     * Tab 0.2
     */
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        sceneWidth = w;
        sceneHeight = h;
        battleFieldX = 10;
        battleFieldY = 10;
        Log.i("clear", "onSizeChanged: w+h");
    }

    /**
     * Start a new game.
     * Tab 0.2
     */
    public void newGame() {
        run();
    }

    /**
     * draw number in score bar
     *
     * @param g      the graphics object
     * @param number the number need to be drawn
     * @param x      the x coordinate.
     * @param y      the y coordinate.
     */
    private void drawNumber(Canvas g, int number, int x, int y) {

    }

    /**
     * put an power up in the battle field.
     */
    private void putAnPowerup() {

    }

    /**
     * Game over,either all player tanks or the home has been destroyed.
     */
    private void gameOver() {

    }

    /**
     * Game logic is here.
     */
    private void applyGameLogic() {

    }

    /**
     * draw the score bar
     *
     * @param g the graphics object.
     */
    private void drawScoreBar(Canvas g) {

    }

    /**
     * clear the back ground.
     *
     * @param g the graphics object.
     * Tab 0.2
     */
    private void clearBackground(Canvas g) {
        paint.setColor(0xffff0000);
        paint.setStyle(Paint.Style.FILL);
        g.drawRect(0,0,sceneWidth,sceneHeight,paint);
        paint.setColor(0xff00ff00);
        paint.setStyle(Paint.Style.FILL);
        g.drawRect(battleFieldX,battleFieldY,sceneWidth -10,sceneHeight-10,paint);
    }

    /**
     * paint.
     *
     * @param g the graphics object.
     * Tab 0.2
     */
    protected void updateGame(Canvas g) {
        clearBackground(g);

        // Tab 0.3
        paint.setColor(0xff000000);
        for(int i=0;i< 29;i++){
            if(resourceManager.getImage(i)!=null){
                g.drawText("index"+i,20,(i+1)*22,paint);
                g.drawBitmap(resourceManager.getImage(i),100,(i+1)*22,null);
            }
        }

        Bitmap tileImage= resourceManager.getTileImage();
        g.drawText("index"+28,20,(32)*22,paint);
        g.drawBitmap(tileImage,100,(32)*22,paint);

    }

    /**
     * start the game..
     */
    private synchronized void start() {

    }

    /**
     * stop the game.
     */
    private synchronized void stop() {

    }

    /**
     * run.
     * Tab 0.2
     */
    public void run() {
        if(hasSurface){
            Canvas canvas = holder.lockCanvas();
            updateGame(canvas);
            holder.unlockCanvasAndPost(canvas);
        }
    }

    /**
     * show the score screen.
     */
    private void showScoreScreen() {

    }

    /**
     * key press.
     *
     * @param keyCode
     * @param event
     * @return boolean
     */
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return true;
    }

    /**
     * key release.
     *
     * @param keyCode
     * @param event
     * @return boolean
     */
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return true;
    }

    /**
     * tick. one game step.
     */
    private void tick() {

    }

    /**
     * @param holder
     * @param format
     * @param width
     * @param height
     */
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    /**
     * @param holder
     * Tab 0.2
     */
    public void surfaceCreated(SurfaceHolder holder) {
        hasSurface = true;
        newGame();
    }

    /**
     * @param holder
     * Tab 0.2
     */
    public void surfaceDestroyed(SurfaceHolder holder) {
        hasSurface = false;
        stop();
    }
}

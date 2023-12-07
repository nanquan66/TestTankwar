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
import com.tankwar.app.actors.Actor;
import com.tankwar.app.actors.BattleField;
import com.tankwar.app.actors.Bullet;
import com.tankwar.app.actors.Explosion;
import com.tankwar.app.actors.Powerup;
import com.tankwar.app.actors.Score;
import com.tankwar.app.actors.tank.EnemyTank;
import com.tankwar.app.actors.tank.PlayerTank;
import com.tankwar.app.actors.tank.Tank;
import com.tankwar.core.Layer;
import com.tankwar.core.LayerManager;
import com.tankwar.core.Sprite;

import java.util.Random;


/**
 * The scene screen for the game.
 * @author Guidebee, Inc.
 * @version 1.00, 15/01/08
 */
public final class GameScene extends SurfaceView implements Runnable, SurfaceHolder.Callback {

    /**
     * Game content variables,here used class public static member variables.
     * enemy tank killed in each level for each tank type.
     */
    public static int enemyTanksCount[] = new int[4];
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
    /**
     * time taken and MILLIS_PER_TICK control the game speed
     */
    private long timeTaken = 0;

    /**
     * time taken and MILLIS_PER_TICK control the game speed
     */
    private static final int MILLIS_PER_TICK = 1;

    /**
     * the width of the game scene.
     */
    private static int sceneWidth;

    /**
     * the height of the game scene.
     */
    private static int sceneHeight;

    /**
     * the height of the score bar.
     */
    private static int barHeight = 32;

    /**
     * the X origin of the battle field.
     */
    private int battleFieldX;

    /**
     * the Y origin of the battle field.
     */
    private int battleFieldY;

    /**
     * default lives of player
     */
    private static final int DEFAULT_PLAYER_LIVE = 9;

//    /**
//     * maximum game leves.
//     */
//    private static final int TOTAL_GAME_LEVELS = 50;
//
    /**
     * total actors in the scene.
     */
    private int totalLayers = 0;

    /**
     * is game over?
     */
    private boolean isGameover = false;

    /**
     * offset X where start to draw the score bar
     */
    private int marginX = 0;

    /**
     * offset Y where start to draw the score bar
     */
    private int marginY = 0;

    /**
     * Random object to create random numbers.
     */
    private static Random rnd = new Random();

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

    /**
     * //////////////////////////////////////////////////////////////////////////
     * The layer manager manage all actors in the game.
     */
    private LayerManager layerManager = new LayerManager();

    /**
     * Player's tank.
     */
    private PlayerTank playerTank;

    /**
     * Resource Manager.
     */
    private static ResourceManager resourceManager = ResourceManager.getInstance();

    /**
     * The battle field object.
     */
    private BattleField battleField = null;

    /**
     * This thread is core game logic.
     */
    private volatile Thread animationThread = null;

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
     * Tab 0.2 Tab 0.4
     */
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        sceneWidth = w;
        sceneHeight = h;
        try{
            int xTiles=sceneWidth/ResourceManager.TILE_WIDTH;
            int yTiles=(sceneHeight-barHeight*2)/ResourceManager.TILE_WIDTH;
            if(xTiles % 2 ==0) xTiles--;
            xTiles=Math.min(xTiles,yTiles);
            yTiles=Math.max(xTiles,yTiles);
            battleFieldX=(sceneWidth-xTiles*ResourceManager.TILE_WIDTH)/2;
            battleFieldY=(sceneHeight-battleFieldX-yTiles*ResourceManager.TILE_WIDTH);
            battleField=new BattleField(xTiles,yTiles,getContext());
            battleField.initBattlefield(this.getClass().getResourceAsStream("/1.txt"));

            Tank.setLayerManager(layerManager);
            Tank.setBattleField(battleField);

            playerTank=Tank.getPlayerTank();
            layerManager.append(battleField);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Start a new game.
     * Tab 0.2
     */
    public void newGame() {
        playerTank.initTank();
        playerTank.setAvaiableLives(DEFAULT_PLAYER_LIVE);
        for(int i=0;i<4;i++) enemyTanksCount[i]=0;

        stop();
        start();
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
        //normal game sequence.
        long tickTime=System.currentTimeMillis();;
        if(!isGameover){
            //Check if player obtain some powerup.
//            Powerup.checkPlayerTank(playerTank);
            //Spawn enemy tank if needed
            boolean canSpawnEnemyTank=true; //false
//            if(enemyTankRemains-EnemyTank.getVisibleEnemyTanks()>0){
//                if(EnemyTank.getVisibleEnemyTanks()<10){
//                    if(enemySpawnStartTime>0){
//                        if(tickTime-enemySpawnStartTime>enemySpawnPeriod){
//                            canSpawnEnemyTank=true;
//                        }
//                    }else{
//                        canSpawnEnemyTank=true;
//                    }
//                }
//            }else{
//                if(EnemyTank.getVisibleEnemyTanks()==0){
//                    ResourceManager.gameLevel++;
//                    showScoreScreen();
//                }
//            }
            if(canSpawnEnemyTank){
                EnemyTank enemyTank=null;
                int tankSelection=Math.abs(rnd.nextInt()) % 100;
                if(tankSelection>90-ResourceManager.gameLevel){
                    enemyTank=EnemyTank.newEnemyTank(EnemyTank.TYPE_HEAVY);
                }else if(tankSelection>75-ResourceManager.gameLevel){
                    enemyTank=EnemyTank.newEnemyTank(EnemyTank.TYPE_SMART);
                }else if(tankSelection>55-ResourceManager.gameLevel){
                    enemyTank=EnemyTank.newEnemyTank(EnemyTank.TYPE_FAST);
                }else {
                    enemyTank=EnemyTank.newEnemyTank(EnemyTank.TYPE_SIMPLE);
                }
                if(enemyTank!=null){

                    tankSelection=Math.abs(rnd.nextInt()) % 100;
                    if(tankSelection+ResourceManager.gameLevel>90){

                        enemyTank.setHasPrize(true);
                    }
//                    enemySpawnStartTime=tickTime;
                }

            }
//            //Check if player has been killed
//            if(!playerTank.isVisible()){
//                if(playerTank.getAvaiableLives()>0){
//                    playerTank.initTank();
//                    playerTank.setVisible(true);
//                }else{
//                    gameOver();
//                }
//            }
//            //Check if home is been destoryed, game over
//            if(Powerup.isHomeDestroyed()){
//                gameOver();
//            }
//            //put an poweup in the battle field
//            if((tickTime-putPowerupStartTime>putPowerupPeriod) || canPutPowerup){
//                putAnPowerup();
//            }
        }else{
//            //game is over, display game over animation.
//            if(((tickTime-gameOverStartTime)<gameOverPeriod) &&
//                    gameOverStartTime>0){
//                int finalY=(sceneHeight-gameStatus.getHeight())/2;
//                if(gameStatus.getY()>finalY){
//                    gameStatus.setPosition(gameStatus.getX(),
//                            gameStatus.getY()-1);
//                }
//            }else{
//                mHandler.post(mUpdateResults);
//                gameOverStartTime=0;
//            }

        }

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
        paint.setColor(0xfff0f0f0);
        paint.setStyle(Paint.Style.FILL);
        g.drawRect(0,0,sceneWidth,sceneHeight,paint);
        paint.setColor(0xff000000);
        paint.setStyle(Paint.Style.FILL);
        g.drawRect(battleFieldX,battleFieldY,battleFieldX+battleField.getWidth(),battleFieldY+battleField.getHeight(),paint);
    }

    /**
     * paint.
     *
     * @param g the graphics object.
     * Tab 0.2
     */
    protected void updateGame(Canvas g) {
        clearBackground(g);
        layerManager.paint(g,battleFieldX,battleFieldY);
    }

    /**
     * start the game..
     */
    private synchronized void start() {
        animationThread = new Thread(this);
        animationThread.start();
    }

    /**
     * stop the game.
     */
    private synchronized void stop() {
        animationThread = null;
    }

    /**
     * run.
     * Tab 0.2
     */
    public void run() {
        Thread currentThread = Thread.currentThread();

        try {
            while (currentThread == animationThread) {
                long startTime = System.currentTimeMillis();
                // Don't advance game or draw if canvas is covered by a system
                // screen.
                if (isShown()) {
                    tick();
                    if(hasSurface){
                        Canvas canvas=holder.lockCanvas();
                        updateGame(canvas);
                        holder.unlockCanvasAndPost(canvas);
                    }
                }
                timeTaken = System.currentTimeMillis() - startTime;
                if (timeTaken < MILLIS_PER_TICK) {
                    synchronized (this) {
                        if(MILLIS_PER_TICK > timeTaken){
                            wait(MILLIS_PER_TICK - timeTaken);
                            timeTaken = System.currentTimeMillis() - startTime;
                        }
                    }
                } else {
                    Thread.yield();
                }
            }
        } catch (InterruptedException e) {
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
        for(int i=0;i<totalLayers;i++){
            Layer layer=layerManager.getLayerAt(i);
            if(layer.isVisible()){
                Actor actor=(Actor)layer;

                actor.tick();
            }
        }
        applyGameLogic();
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

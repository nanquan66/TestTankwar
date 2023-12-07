//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\screen\\ScoreScreen.java

package com.tankwar.app.screen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.view.View;

import com.tankwar.app.actors.tank.PlayerTank;


/**
 * --------------------------------- IMPORTS ------------------------------------
 * [------------------------------ MAIN CLASS ----------------------------------]
 * //////////////////////////////////////////////////////////////////////////////
 * --------------------------------- REVISIONS ----------------------------------
 * Date       Name                 Tracking #         Description
 * --------   -------------------  -------------      --------------------------
 * 19JAN2008  James Shen                        Initial Creation
 * //////////////////////////////////////////////////////////////////////////////
 * Gameover screen.
 * <p>
 * <hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
 *
 * @author Guidebee, Inc.
 * @version 1.00, 19/01/08
 */
public final class ScoreScreen extends View implements Runnable {

    /**
     * picture drawing x offset.
     */
    private int offsetX = 0;

    /**
     * picture drawing y offset. to make the image center in the screen.
     */
    private int offsetY = 0;

    /**
     * where to draw high score.
     */
    private int highScoreX = 0;

    /**
     * where to draw high score.
     */
    private int highScoreY = 0;

    /**
     * where to draw player score.
     */
    private int playerScoreX = 0;

    /**
     * where to draw player score.
     */
    private int playerScoreY = 0;

    /**
     * where to draw total number.
     */
    private int totalNumberX = 0;

    /**
     * where to draw total number.
     */
    private int totalNumberY = 0;

    /**
     * where to draw enemy tank count.
     */
    private int tankNumberPos[][] = new int[4][2];

    /**
     * is the game over?
     */
    private boolean isGameOver = false;

    /**
     * Score screen displays GameScene.enemyTanksCount[] .the following 2
     * variables are used to display the score board animation. each step draw
     * one number change.
     * the enemytype.
     */
    private int enemyType = 0;

    /**
     * the index of enemy count.
     */
    private int enemyCount = 0;

    /**
     * total enemy number killed
     */
    private int totalKilled = 0;
    private int totalKilledIndex = 0;

    /**
     * Score board image.
     */
    private static Bitmap imgScore = null;

    /**
     * black number image from 0 to 9
     */
    private static Bitmap imgNumberWhite = null;

    /**
     * red number image from 0 to 9
     */
    private static Bitmap imgNumberRed = null;

    /**
     * reference to player tank
     */
    private static PlayerTank playerTank = null;

    /**
     * the animation thread.
     */
    private Thread animationThread = null;
    private Paint paint = new Paint();
    final Handler mHandler = new Handler();
    final Runnable mUpdateResults = new Runnable() {
       @Override
       public void run() {

       }
    };

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 20JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * Constructor.
     *
     * @param context
     * @roseuid 652795A10262
     */
    public ScoreScreen(Context context) {
       super(context);

    }

    /**
     * @param w
     * @param h
     * @param oldw
     * @param oldh
     * @roseuid 652795A1026C
     */
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 20JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * draw number in score bar
     *
     * @param g      the graphics object
     * @param number the number need to be drawn
     * @param x      the x coordinate.
     * @param y      the y coordinate.
     * @param isRed
     * @roseuid 652795A10278
     */
    private void drawNumber(Canvas g, int number, int x, int y, boolean isRed) {

    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 20JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * Set the game over value. the game over value decides what's next screen
     * shown after Score board screen is discard, either shows the GameOver
     * screen or the new game.
     *
     * @param gameover true, game is over.
     * @param gameOver
     * @roseuid 652795A1028C
     */
    public void show(boolean gameOver) {

    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 20JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * paint.
     *
     * @param g the graphics object.
     * @roseuid 652795A10294
     */
    protected void onDraw(Canvas g) {

    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 20JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * step to draw number.
     *
     * @roseuid 652795A102A2
     */
    public void run() {

    }
}

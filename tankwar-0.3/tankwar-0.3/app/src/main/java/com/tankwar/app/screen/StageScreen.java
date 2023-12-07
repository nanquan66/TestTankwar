//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\screen\\StageScreen.java

package com.tankwar.app.screen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.View;

/**
 * --------------------------------- IMPORTS ------------------------------------
 * [------------------------------ MAIN CLASS ----------------------------------]
 * //////////////////////////////////////////////////////////////////////////////
 * --------------------------------- REVISIONS ----------------------------------
 * Date       Name                 Tracking #         Description
 * --------   -------------------  -------------      --------------------------
 * 19JAN2008  James Shen                        Initial Creation
 * //////////////////////////////////////////////////////////////////////////////
 * Stage screen.
 * <p>
 * <hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
 *
 * @author Guidebee, Inc.
 * @version 1.00, 19/01/08
 */
public final class StageScreen extends View implements Runnable {

    /**
     * offset X, where is the origin of the picture.
     */
    private int offsetX = 0;

    /**
     * offset X,
     */
    private int offsetY = 0;

    /**
     * splash scroll in start time.
     */
    private long animationStartTime = 0;

    /**
     * splash scroll in period.
     */
    private static long animationPeriod = 50;

    /**
     * anmation postion y
     */
    private int imgPosY = 0;

    /**
     * anmation postion y
     */
    private int imgPosX = 0;

    /**
     * if user click ,stop animation.
     */
    private boolean stopThread = false;

    /**
     * scroll in from top to bottom? or from left to right
     */
    private boolean fromTop2Bottom = false;

    /**
     * stage image
     */
    private Bitmap imgStage = null;

    /**
     * number image
     */
    private Bitmap imgNumberBlack = null;

    /**
     * the animation thread.
     */
    private Thread animationThread = null;
    private Paint paint = new Paint();

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 21JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * Constructor.
     *
     * @param context
     * @roseuid 652795CA0239
     */
    public StageScreen(Context context) {
       super(context);

    }

    /**
     * @param w
     * @param h
     * @param oldw
     * @param oldh
     * @roseuid 652795CA0245
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
     * @roseuid 652795CA0251
     */
    private void drawNumber(Canvas g, int number, int x, int y) {

    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 21JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * Start the animation.
     *
     * @roseuid 652795CA0264
     */
    public void show() {

    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 21JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * animation.
     *
     * @roseuid 652795CA026A
     */
    public void run() {

    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 21JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * paint.
     *
     * @param g
     * @roseuid 652795CA0270
     */
    protected void onDraw(Canvas g) {

    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 21JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * key press.
     *
     * @param keyCode
     * @param event
     * @return boolean
     * @roseuid 652795CA027E
     */
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return true;
    }
}

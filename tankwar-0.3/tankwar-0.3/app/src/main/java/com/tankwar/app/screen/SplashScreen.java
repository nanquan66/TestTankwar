//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\screen\\SplashScreen.java

package com.tankwar.app.screen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.KeyEvent;
import android.view.View;

import com.tankwar.core.Sprite;


/**
 * --------------------------------- IMPORTS ------------------------------------
 * [------------------------------ MAIN CLASS ----------------------------------]
 * //////////////////////////////////////////////////////////////////////////////
 * --------------------------------- REVISIONS ----------------------------------
 * Date       Name                 Tracking #         Description
 * --------   -------------------  -------------      --------------------------
 * 19JAN2008  James Shen                        Initial Creation
 * //////////////////////////////////////////////////////////////////////////////
 * Splash screen.
 * <p>
 * <hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
 *
 * @author Guidebee, Inc.
 * @version 1.00, 19/01/08
 */
public final class SplashScreen extends View implements Runnable {

    /**
     * offset X, where is the origin of the picture.
     */
    private int offsetX = 0;

    /**
     * offset X,
     */
    private int offsetY = 0;

    /**
     * option position.
     */
    private int pointerPos[][] = new int[3][2];

    /**
     * current selection.
     */
    private int currentPointerIndex = 0;

    /**
     * splash scroll in start time.
     */
    private long animationStartTime = 0;

    /**
     * splash scroll in period.
     */
    private static long animationPeriod = 5000;

    /**
     * anmation postion y
     */
    private int imgPosY = 0;

    /**
     * if user click ,stop animation.
     */
    private boolean stopThread = false;

    /**
     * Splash image.
     */
    private Bitmap imgSplash = null;

    /**
     * Guidebee image.
     */
    private Bitmap imgGuidebee = null;

    /**
     * pointer image (tank.)
     */
    private Bitmap imgPointer = null;

    /**
     * pointer ,user can move this pointer to select 1 player ,2 player etc.
     */
    private Sprite pointer = null;

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
     * @roseuid 652795A20018
     */
    public SplashScreen(Context context) {
       super(context);

    }

    /**
     * @param w
     * @param h
     * @param oldw
     * @param oldh
     * @roseuid 652795A20021
     */
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

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
     * @roseuid 652795A2002E
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
     * @roseuid 652795A20034
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
     * @roseuid 652795A2003A
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
     * @roseuid 652795A20046
     */
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return true;
    }
}

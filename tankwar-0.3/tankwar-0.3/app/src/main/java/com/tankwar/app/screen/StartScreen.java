//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\screen\\StartScreen.java

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
 * Startup screen.
 * <p>
 * <hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
 *
 * @author Guidebee, Inc.
 * @version 1.00, 19/01/08
 */
public final class StartScreen extends View {

    /**
     * image origin x,center images.
     */
    private int offsetX = 0;

    /**
     * image origin y,center images.
     */
    private int offsetY = 0;

    /**
     * pointer locations.
     */
    private int pointerPos[][] = new int[2][2];

    /**
     * current pointer index.
     */
    private int currentPointerIndex = 0;

    /**
     * game help image.
     */
    private Bitmap imgGameHelp = null;

    /**
     * turn on sound image.
     */
    private Bitmap imgTurnOnSound = null;

    /**
     * pointer image.
     */
    private Bitmap imgPointer = null;

    /**
     * pointer
     */
    private Sprite pointer = null;
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
     * @roseuid 652795A2015F
     */
    public StartScreen(Context context) {
        super(context);

    }

    /**
     * @param w
     * @param h
     * @param oldw
     * @param oldh
     * @roseuid 652795A20169
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
     * paint.
     *
     * @param g
     * @roseuid 652795A20176
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
     * key pressed.
     *
     * @param keyCode
     * @param event
     * @return boolean
     * @roseuid 652795A20180
     */
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return true;
    }
}

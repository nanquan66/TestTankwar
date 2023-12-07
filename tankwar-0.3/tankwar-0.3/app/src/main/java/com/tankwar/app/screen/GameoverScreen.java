//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\screen\\GameoverScreen.java

package com.tankwar.app.screen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
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
 * Gameover screen.
 * <p>
 * <hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
 *
 * @author Guidebee, Inc.
 * @version 1.00, 19/01/08
 */
public final class GameoverScreen extends View {

    /**
     * image x origin, center the image on the screen.
     */
    private int offsetX = 0;

    /**
     * image y origin.
     */
    private int offsetY = 0;

    /**
     * image game over
     */
    private Bitmap imgGameover = null;
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
     * 21JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * Constructor.
     *
     * @param context
     * @roseuid 6527959E01F2
     */
    public GameoverScreen(Context context) {
      super(context);
    }

    /**
     * @param w
     * @param h
     * @param oldw
     * @param oldh
     * @roseuid 6527959E0204
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
     * @roseuid 6527959E0211
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
     * paint.
     *
     * @param g
     * @roseuid 6527959E0216
     */
    protected void onDraw(Canvas g) {

    }
}

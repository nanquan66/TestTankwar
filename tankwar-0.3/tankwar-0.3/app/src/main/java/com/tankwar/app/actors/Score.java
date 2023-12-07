//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\actors\\Score.java

package com.tankwar.app.actors;

import com.tankwar.core.LayerManager;
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
 * The classes displays score number when an enemy tank is destoryed or player
 * obtains an powerup.
 * <p>
 * <hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
 *
 * @author Guidebee, Inc.
 * @version 1.00, 19/01/08
 */
public final class Score extends Sprite implements Actor {

    /**
     * score 100
     */
    public static final int SCORE_100 = 0;

    /**
     * score 200
     */
    public static final int SCORE_200 = 1;

    /**
     * score 300
     */
    public static final int SCORE_300 = 2;

    /**
     * score 400
     */
    public static final int SCORE_400 = 3;

    /**
     * score 500
     */
    public static final int SCORE_500 = 4;

    /**
     * the score value.
     */
    private int scoreValue = -1;

    /**
     * maximun number of score in the battle field.
     */
    private static final int POOL_SIZE = 10;

    /**
     * the start time of the displaying the score.
     */
    private long startTime = 0;

    /**
     * the score live time, default 1 second
     */
    private static long livePeriod = 3000;

    /**
     * This pool store all scores.
     */
    private static Score SCORE_POOL[];

    /**
     * Tank should know about the layer manager.
     */
    private static LayerManager layerManager;

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 19JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * Constructor.
     *
     * @roseuid 652795A4034C
     */
    private Score() {
        super(null,0,0);

    }

    static {

    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 19JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * Set the value of the score.
     *
     * @param value new value.
     * @roseuid 652795A40340
     */
    public void setValue(int value) {

    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 19JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * return the value for the score.
     *
     * @return the value of the score.
     * @roseuid 652795A40347
     */
    public int getValue() {
        return 0;
    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 17JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * Operation be done in each tick.
     *
     * @roseuid 652795A40352
     */
    public void tick() {

    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 17JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * In give position, display score.
     *
     * @param x     the x coordinate.
     * @param y     the y coordinate.
     * @param value the score value.
     * @return the score object.
     * @roseuid 652795A40358
     */
    public static Score show(int x, int y, int value) {
        return null;
    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 15JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * Set the layerManager for scores.
     *
     * @param manager
     * @roseuid 652795A40363
     */
    public static void setLayerManager(LayerManager manager) {

    }

    /**
     * //////////////////////////////////////////////////////////////////////////
     * --------------------------------- REVISIONS ------------------------------
     * Date       Name                 Tracking #         Description
     * ---------  -------------------  -------------      ----------------------
     * 15JAN2008  James Shen                            Initial Creation
     * //////////////////////////////////////////////////////////////////////////
     * Set the Battle field for scores.
     *
     * @param field
     * @roseuid 652795A40372
     */
    public static void setBattleField(BattleField field) {

    }
}

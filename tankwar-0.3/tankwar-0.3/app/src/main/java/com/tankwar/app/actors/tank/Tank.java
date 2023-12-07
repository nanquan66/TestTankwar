//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\actors\\tank\\Tank.java

package com.tankwar.app.actors.tank;

import android.graphics.Bitmap;

import com.tankwar.app.ResourceManager;
import com.tankwar.app.actors.Actor;
import com.tankwar.app.actors.BattleField;
import com.tankwar.app.actors.Bullet;
import com.tankwar.core.LayerManager;
import com.tankwar.core.Sprite;


/**
--------------------------------- IMPORTS ------------------------------------
[------------------------------ MAIN CLASS ----------------------------------]
//////////////////////////////////////////////////////////////////////////////
--------------------------------- REVISIONS ----------------------------------
Date       Name                 Tracking #         Description
--------   -------------------  -------------      --------------------------
16JAN2008  James Shen                        Initial Creation
//////////////////////////////////////////////////////////////////////////////
Base class for all tanks.
<p>
<hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
@version     1.00, 16/01/08
@author      Guidebee, Inc.
 */
public abstract class Tank extends Sprite implements Actor
{
   
   /**
   the speed of the tank, default speed is 6 ,half of the
   width of each tile.
    */
   protected int speed = DEFAULT_SPEED;
   
   /**
   The direction in which player is driving.
    */
   protected int direction = BattleField.NONE;
   
   /**
   default speed for tank.
    */
   protected static final int DEFAULT_SPEED = ResourceManager.TILE_WIDTH / 4;
   
   /**
   maximun number of tanks in the battle field.
    */
   public static final int POOL_SIZE = 21;
   
   /**
   time monitored to avoid the tank move to fast.
    */
   protected long driveStartTime = 0;
   
   /**
   minimum time period between each move
    */
   private static final long minimumDrivePeriod = 40;
   
   /**
   Should the tank shoot?
    */
   protected boolean shoot = false;
   
   /**
   new boun timer
    */
   protected int newBornTimer = 0;
   
   /**
   Tank should know about the battle field.
    */
   protected static BattleField battleField;
   
   /**
   Tank should know about the layer manager.
    */
   protected static LayerManager layerManager;
   
   /**
   This pool store all tanks include player and enemy tanks.
    */
   protected static Tank TANK_POOL[];
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Creates a new animated tank using frames contained in the provided Image.
   @param battleField the battle field where the tank in.
   @param image  the Image to use for Sprite.
   @param frameWidth  the width, in pixels, of the individual raw frames.
   @param frameHeight  the height, in pixels, of the individual raw frames.
   @roseuid 652795A60356
    */
   protected Tank(Bitmap image, int frameWidth, int frameHeight) 
   {
      super(null,0,0);

   }
   
   static 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Tank moves.
   @roseuid 652795A60370
    */
   public void drive() 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   18JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   return player tank object.
   @return player tank object.
   @roseuid 652795A60377
    */
   public static PlayerTank getPlayerTank() 
   {
    return null;
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   15JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Set the layerManager for tanks.
   @param manager
   @roseuid 652795A6038B
    */
   public static void setLayerManager(LayerManager manager)
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   15JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Set the Battle field for tanks.
   @param field
   @roseuid 652795A603A3
    */
   public static void setBattleField(BattleField field) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   15JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Operation be done in each tick.
   @roseuid 652795A603B7
    */
   public void tick() 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Tank thinks before move.
   @roseuid 652795A603C1
    */
   public abstract void think();
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Tank shoots.
   @return the bullet the tank shoots.
   @roseuid 652795A603C9
    */
   public abstract Bullet shoot();
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Initialize tank status.
   @roseuid 652795A603D5
    */
   public abstract void initTank();
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Tank try to move (dx,dy)
   @param dx the delta x 
   @param dy the delta y
   @roseuid 652795A603DC
    */
   private void tryMove(int dx, int dy) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Explode a tank.
   @roseuid 652795A70003
    */
   protected void explode() 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   15JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Get an tank object.
   @param i the index of tank.
   @return com.pstreets.game.battlecity.actors.tank.Tank
   @roseuid 652795A7000B
    */
   public static Tank getTank(int i) 
   {
    return null;
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Check if there's overlap of tanks.
   @param sprite the tank need to be checked
   @return true, overlap.
   @roseuid 652795A70017
    */
   protected static boolean overlapsTank(Sprite sprite) 
   {
    return true;
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   change the direction of current tank.
   @param direction new direction for the tank.
   @roseuid 652795A70027
    */
   protected void changeDirection(int direction) 
   {
    
   }
}

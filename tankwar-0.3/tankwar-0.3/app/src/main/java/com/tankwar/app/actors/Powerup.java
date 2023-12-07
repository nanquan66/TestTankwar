//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\actors\\Powerup.java

package com.tankwar.app.actors;

import com.tankwar.app.actors.tank.PlayerTank;
import com.tankwar.core.LayerManager;
import com.tankwar.core.Sprite;

/**
--------------------------------- IMPORTS ------------------------------------
[------------------------------ MAIN CLASS ----------------------------------]
//////////////////////////////////////////////////////////////////////////////
--------------------------------- REVISIONS ----------------------------------
Date       Name                 Tracking #         Description
--------   -------------------  -------------      --------------------------
17JAN2008  James Shen                        Initial Creation
//////////////////////////////////////////////////////////////////////////////
Power up class which can upgrade player's tank.
<p>
<hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
@version     1.00, 17/01/08
@author      Guidebee, Inc.
 */
public final class Powerup extends Sprite implements Actor
{
   
   /**
   invulnerable animation.
    */
   public static final int INVULNERABLE = 1;
   
   /**
   Player's home
    */
   public static final int HOME = 2;
   
   /**
   Player's home been destroyed.
    */
   public static final int HOME_DESTROYED = 3;
   
   /**
   Tank symbol gives an extra life.
    */
   public static final int TANK = 4;
   
   /**
   Clock freezes all enemy tanks for a period of time.
    */
   public static final int CLOCK = 5;
   
   /**
   Shovel adds steel walls around the base for a period of time.
    */
   public static final int SHOVEL = 6;
   
   /**
   Bomb destroys all visible enemy tanks.
    */
   public static final int BOMB = 7;
   
   /**
   Star improves player's tank. maxium 8 grades.
    */
   public static final int STAR = 8;
   
   /**
   Shield makes player's tank invulnerable to attack for a period of time.
    */
   public static final int SHIELD = 9;
   
   /**
   No image.
    */
   private static final int NOTHING = 10;
   
   /**
   maximun number of power ups in the battle field.
    */
   private static final int POOL_SIZE = 10;
   
   /**
   time monitored to avoid the powerup flashes too fast.
    */
   private long timeTaken = MILLIS_PER_TICK;
   
   /**
   minimum time period between each flash
    */
   private static final int MILLIS_PER_TICK = 50;
   
   /**
   the type of the powerup
    */
   private int type = NOTHING;
   
   /**
   varible to toggle the powerup image to make it animation.
    */
   private boolean showNextFrame = false;
   
   /**
   the start time of the powup.
    */
   private long startTime = 0;
   
   /**
   the poweup live time, default 3 minutes.
    */
   private static long livePeriod = 180000;
   
   /**
   Tank should know about the battle field.
    */
   private static BattleField battleField;
   
   /**
   Tank should know about the layer manager.
    */
   private static LayerManager layerManager;
   
   /**
   This pool store all powerups.
    */
   private static Powerup POWERUP_POOL[];
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Constructor.
   @param type the type of the powerup.
   @roseuid 652795A401E3
    */
   private Powerup(int type) 
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
   17JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Set the new type for the poweup.
   @param type new type.
   @roseuid 652795A401D6
    */
   public void setType(int type) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   return the type for the poweup.
   @return the type of the powerup.
   @roseuid 652795A401DC
    */
   public int getType() 
   {
    return 0;
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   18JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Check if bullet hit Player's home,if so, display the destoryed home.
   @return boolean
   @roseuid 652795A401EA
    */
   public static boolean isHomeDestroyed() 
   {
    return true;
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   18JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Check if bullet hit Player's home,if so, display the destoryed home.
   @param bullet
   @return boolean
   @roseuid 652795A401F0
    */
   public static boolean isHittingHome(Bullet bullet) 
   {
    return true;
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Create a new power up in the battle field.
   @param type the type of the powerup.
   @roseuid 652795A401FB
    */
   public static void putNewPowerup(int type) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Operation be done in each tick.
   @roseuid 652795A40203
    */
   public void tick() 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Check if player's tank move above the powerup.
   @param tank player's tank.
   @roseuid 652795A40209
    */
   public static void checkPlayerTank(PlayerTank tank)
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   15JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Get the invulnerable powerup. When player collects this powerup. it shows
   invulnerable animation.
   @return the invulnerable powerup.
   @roseuid 652795A40216
    */
   public static Powerup getInvulnerable() 
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
   Player has collected {@see Powerup.BOMB}. Enemies should explode immediately.
   @roseuid 652795A4021D
    */
   public static void removeAllPowerups() 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   15JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Set the layerManager for powerups.
   @param manager
   @roseuid 652795A40223
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
   Set the Battle field for powerups.
   @param field
   @roseuid 652795A40230
    */
   public static void setBattleField(BattleField field) 
   {
    
   }
}

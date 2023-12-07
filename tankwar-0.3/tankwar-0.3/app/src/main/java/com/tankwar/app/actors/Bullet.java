//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\actors\\Bullet.java

package com.tankwar.app.actors;

import com.tankwar.app.ResourceManager;
import com.tankwar.core.LayerManager;
import com.tankwar.core.Sprite;

/**
--------------------------------- IMPORTS ------------------------------------
[------------------------------ MAIN CLASS ----------------------------------]
//////////////////////////////////////////////////////////////////////////////
--------------------------------- REVISIONS ----------------------------------
Date       Name                 Tracking #         Description
--------   -------------------  -------------      --------------------------
15JAN2008  James Shen                        Initial Creation
//////////////////////////////////////////////////////////////////////////////
Bullet class. Bullet can be shoot by player and enemy tank.
<p>
<hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
@version     1.00, 15/01/08
@author      Guidebee, Inc.
 */
public final class Bullet extends Sprite implements Actor
{
   
   /**
   bullet can break brick walls and enmeny tanks. ****
    */
   public static final int GRADE_DEFAULT = 1;
   
   /**
   bullet can break concrete walls. ****
    */
   public static final int GRADE_BREAK_CONCRETE_WALL = 2;
   
   /**
   bullet can break water and snow. *****
    */
   public static final int GRADE_BREAK_WATER = 3;
   
   /**
   bullet strength
    */
   private int strength = GRADE_DEFAULT;
   
   /**
   shot by player or enmeny tanks
    */
   private boolean friendly = false;
   
   /**
   maximun number of tanks in the battle field.
    */
   private static final int POOL_SIZE = 20;
   
   /**
   bullet direction
    */
   private int direction = BattleField.NONE;
   
   /**
   bullet direction
    */
   private int speed = ResourceManager.TILE_WIDTH / 2;
   
   /**
   when move, the delta distance, dx,dy can not be nozero at the same time.
    */
   private int dx;
   
   /**
   when move, the delta distance, dx,dy can not be nozero at the same time.
    */
   private int dy;
   
   /**
   Tank should know about the battle field.
    */
   private static BattleField battleField;
   
   /**
   Tank should know about the layer manager.
    */
   private static LayerManager layerManager;
   
   /**
   This pool store all tanks include player and enemy tanks.
    */
   private static Bullet BULLET_POOL[];
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   15JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Constructor
   @param strength the bullet's hitting strength.
   @param direction the bullet's moving direction.
   @param speed the bullet's moving speed.
   @roseuid 652795A302C1
    */
   private Bullet(int strength, int direction, int speed) 
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
   15JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Set the bullet friendship. If true, shot by player
   @param friend true,shot by player,otherwize by enemy tank.
   @roseuid 652795A302CC
    */
   public void setFriendly(boolean friend) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   15JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Set the bullet's speed.
   @param speed the bullet's moving speed.
   @roseuid 652795A302D4
    */
   public void setSpeed(int speed) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   15JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Set the bullet's direction.
   @param direction the bullet's moving direction.
   @roseuid 652795A302DB
    */
   public void setDirection(int direction) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   15JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Set the bullet's strength.
   @param strength the bullet's hitting strength.
   @roseuid 652795A302E3
    */
   public void setStrength(int strength) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   15JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   the bullet hit something and explodes
   @roseuid 652795A302EA
    */
   public void explode() 
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
   @roseuid 652795A302F0
    */
   public void tick() 
   {
    
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
   @roseuid 652795A302F6
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
   @roseuid 652795A30305
    */
   public static void setBattleField(BattleField field) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Get how many bullets the player shot.the player can shoot 3 bullets 
   at most.
   @return int
   @roseuid 652795A30313
    */
   public static int getPlayerBulletCount() 
   {
    return 0;
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Get a free bullet from the pool.
   @return com.pstreets.game.battlecity.actors.Bullet
   @roseuid 652795A30319
    */
   public static Bullet getFreeBullet() 
   {
    return null;
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation 
   //////////////////////////////////////////////////////////////////////////
   Stop all bullets in the game scene.
   @roseuid 652795A30320
    */
   public static void stopAllBullets() 
   {
    
   }
}

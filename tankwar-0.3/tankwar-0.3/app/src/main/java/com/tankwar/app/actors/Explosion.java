//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\actors\\Explosion.java

package com.tankwar.app.actors;

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
Explosion class. Display explosion image when bullet or tank explodes.
<p>
<hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
@version     1.00, 15/01/08
@author      Guidebee, Inc.
 */
public final class Explosion extends Sprite implements Actor
{
   
   /**
   Small explosion. when bullets hit wall.
    */
   public static final int SMALL = 0;
   
   /**
   Big explosion, when tank explodes.
    */
   public static final int BIG = 1;
   
   /**
   The width of the explosion image.
    */
   private static final int WIDTH = 24;
   
   /**
   The height of the explosion image.
    */
   private static final int HEIGHT = 24;
   
   /**
   Explosition sequence.
    */
   private static final int FRAME_SEQ[][] = new int [][] {
   {0,1,1,2,2},
   {0,1,1,2,2,3,3,4,4,5,5},
   };
   
   /**
   The pool size of explosion.
    */
   private static final int POOL_SIZE = 10;
   
   /**
   Explosion should know about the layer manager.
    */
   private static LayerManager layerManager;
   
   /**
   the explosion pool.
    */
   private static Explosion EXPLOSIONS_POOL[];
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   private Constructor.
   @param strength SMALL or BIG explosion.
   @roseuid 652795A40015
    */
   private Explosion(int strength) 
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
   Set explosion strength
   @param strength SMALL or BIG explosion.
   @roseuid 652795A4001D
    */
   private void setStrength(int strength) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   In give position, display explosion animation.
   @param x the x coordinate.
   @param y the y coordinate.
   @param strenght SMALL or BIG explosion.
   @param strength
   @return com.pstreets.game.battlecity.actors.Explosion
   @roseuid 652795A40024
    */
   public static Explosion explode(int x, int y, int strength) 
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
   Operation be done in each tick.
   @roseuid 652795A4003B
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
   Stop all explosion.
   @roseuid 652795A40041
    */
   public static void stopAllExplosions() 
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
   @roseuid 652795A40047
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
   @roseuid 652795A40052
    */
   public static void setBattleField(BattleField field) 
   {
    
   }
}

//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\actors\\tank\\EnemyTank.java

package com.tankwar.app.actors.tank;

import com.tankwar.app.actors.Bullet;

import java.util.Random;


/**
--------------------------------- IMPORTS ------------------------------------
--------------------------------- REVISIONS ----------------------------------
Date       Name                 Tracking #         Description
--------   -------------------  -------------      --------------------------
18JAN2008  James Shen                        Initial Creation
//////////////////////////////////////////////////////////////////////////////
Base class for enemy tanks.
<p>
<hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
@version     1.00, 18/01/08
@author      Guidebee, Inc.
 */
public abstract class EnemyTank extends Tank 
{
   
   /**
   Whether the tank has prize,hit one has prize ,a powerup is put
   in the battle field.
    */
   protected boolean hasPrize = false;
   
   /**
   how many score if player destory this tank.
    */
   protected int score;
   
   /**
   Enemy tank type.
    */
   protected int type;
   
   /**
   Simple tank, move blindly.
    */
   public static final int TYPE_SIMPLE = 0;
   
   /**
   Fast tank, move blindly but much faster than simple tank.
    */
   public static final int TYPE_FAST = 1;
   
   /**
   Smart tank can detect where's player tank, and try to destory player.
    */
   public static final int TYPE_SMART = 2;
   
   /**
   Heavy tank, has more blood, player has to shoot more bullets to destory it.
    */
   public static final int TYPE_HEAVY = 3;
   
   /**
   the enemy tank is just created.
    */
   protected static final int STATUS_NEW_BORN = 0;
   
   /**
   Normal status.
    */
   protected static final int STATUS_LIVE = 1;
   
   /**
   the enemy tank has been destroyed.
    */
   protected static final int STATUS_DEAD = 2;
   
   /**
   same direction,switch 2 image to make tank move animation.
    */
   protected boolean switchImage = false;
   
   /**
   The blood of enemy tank, the heavy thank has 4 blood.
    */
   protected int blood = 1;
   
   /**
   enemy's tanks current status,can be new created ,live, dead.
    */
   protected int status;
   
   /**
   Random used to move tank randomly.
    */
   protected static Random rnd = new Random ();
   
   /**
   When tanks shoot last bullet, avoid enemy tank shoot too fast.
    */
   protected long startShootingTime = 0;
   
   /**
   The enemy tank shoot another bullet at least after 2 second since last
   shooting.
    */
   protected static int minimumShootingPeriod = 2000;
   
   /**
   Enemies could be frozen by Powerup.CLOCK.
    */
   protected static long immobilizedStartTime = 0;
   
   /**
   Enemies frozen time, default 30 seconds.
    */
   protected static final int immobilizedPeriod = 30000;
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   private Constructor.
   @param hasPrize if true, when player hit the tank, a new powerup is put
   in the battle field.
   @roseuid 652795A501EE
    */
   protected EnemyTank(boolean hasPrize) 
   {
      super(null,0,0);

   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN200 8  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Tank shoots.
   @return the bullet the tank shoots.
   @roseuid 652795A501F6
    */
   public Bullet shoot()
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
   Tank thinks before move. subclass shall call this as last statement in
   this overriden function.
   @roseuid 652795A50201
    */
   public void think() 
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
   @roseuid 652795A50207
    */
   public void tick() 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   18JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Intialize the player tank after been destoryed or first start.
   @roseuid 652795A5020C
    */
   public void initTank() 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   18JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Set if the tank has prize.
   @param hasPrize true,has prize.
   @roseuid 652795A50214
    */
   public void setHasPrize(boolean hasPrize) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Player has collected {@see Powerup.BOMB}. Enemies should explode immediately.
   @roseuid 652795A5021D
    */
   public static void explodeAllEmenies() 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Get the count of all visible enemy tanks.
   @return the count of all visible enemy tanks.
   @roseuid 652795A50224
    */
   public static int getVisibleEnemyTanks() 
   {
    return 0;
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Create a new enemy tank.
   @param type the type of enemy tank.
   @return an enemy tank or null.
   @roseuid 652795A50229
    */
   public static EnemyTank newEnemyTank(int type) 
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
   Set new tank frame based on type,direction,hasPrize.
   @roseuid 652795A50230
    */
   protected void setTankFrame() 
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
   @roseuid 652795A50237
    */
   public void explode() 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Get a free enemy tank based on given type.
   @param type the type of enemy tank.
   @return an enemy tank or null.
   @roseuid 652795A5023D
    */
   private static EnemyTank getFreeEnemyTank(int type) 
   {
    return null;
   }
}

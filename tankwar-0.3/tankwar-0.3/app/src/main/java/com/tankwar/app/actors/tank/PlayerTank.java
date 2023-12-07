//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\actors\\tank\\PlayerTank.java

package com.tankwar.app.actors.tank;


import com.tankwar.app.actors.BattleField;
import com.tankwar.app.actors.Bullet;
import com.tankwar.app.actors.Powerup;

/**
--------------------------------- IMPORTS ------------------------------------
[------------------------------ MAIN CLASS ----------------------------------]
//////////////////////////////////////////////////////////////////////////////
--------------------------------- REVISIONS ----------------------------------
Date       Name                 Tracking #         Description
--------   -------------------  -------------      --------------------------
15JAN2008  James Shen                        Initial Creation
//////////////////////////////////////////////////////////////////////////////
Player's tank.
<p>
<hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
@version     1.00, 17/01/08
@author      Guidebee, Inc.
 */
public final class PlayerTank extends Tank 
{
   
   /**
   Is key pressed?
    */
   private boolean keyPressed = false;
   
   /**
   player's current grade,if equal 0,mean player dies.
    */
   private int grade = MIN_GRADE;
   
   /**
   Player's minimum grade
    */
   private static final int MIN_GRADE = 1;
   
   /**
   tank can shoot 2 bulltes.   **
    */
   private static final int GRADE_TWO_BULLETS = 2;
   
   /**
   tank can shoot 3 bulltes.   ***
    */
   private static final int GRADE_THREE_BULLETS = 3;
   
   /**
   tank can break concrete walls. ****
    */
   private static final int GRADE_BREAK_CONCRETE_WALL = 4;
   
   /**
   tank can break water and snow. *****
    */
   private static final int GRADE_BREAK_WATER = 5;
   
   /**
   tank add one layer of shell. ******
    */
   private static final int GRADE_SHELL_1 = 6;
   
   /**
   tank move fast, go one star. *
    */
   private static final int GRADE_SPEED = 7;
   
   /**
   tank add two layers of shell. *******
    */
   private static final int GRADE_SHELL_2 = 8;
   
   /**
   Player's maximum grade
    */
   private static final int MAX_GRADE = 8;
   
   /**
   the player's tank is just created.
    */
   private static final int NEW_BORN = 9;
   
   /**
   player tank is invulnerable at the start of the level,
   and can become invulnerable if collects {@see Powerup.SHIELD}.
    */
   private int invulnerabilityTicks;
   
   /**
   the time begin invulnerable
    */
   private long invulnerableTime;
   
   /**
   invulnerable period. for start ,the time is 7.5 seconds.
    */
   private static final int invulnerablePeriod = 30000;
   
   /**
   store current direction as shooting direction
    */
   private int currentDirection = BattleField.NONE;
   
   /**
   how many bullets can player shoot at same time.
    */
   private int avaiableBullets = 1;
   
   /**
   same direction,switch 2 image to make tank move animation.
    */
   private boolean switchImage = false;
   
   /**
   how many lifes player has.
    */
   private int avaiableLife = 3;
   
   /**
   the score the player gets.
    */
   private int score = 0;
   
   /**
   the Invulnerable sheild for the player tank.
    */
   private Powerup sheild;
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Constructor
   @roseuid 652795A600A9
    */
   protected PlayerTank() 
   {
      super(null,0,0);

   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Add player's score with given value
   @param value the score value.
   @roseuid 652795A600AF
    */
   public void addScore(int value) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   set player's score with given value
   @param value the score value.
   @roseuid 652795A600B5
    */
   public void setScore(int value) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   17JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   return player's score with given value.
   @return player's score with given value.
   @roseuid 652795A600BD
    */
   public int getScore() 
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
   Intialize the player tank after been destoryed or first start.
   @roseuid 652795A600C3
    */
   public void initTank() 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Player tanks handle key press event.
   @param gameAction the game key code.
   @roseuid 652795A600C9
    */
   public void keyPressed(int gameAction) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Player tanks handle key release event.
   @param gameAction
   @roseuid 652795A600D0
    */
   public void keyReleased(int gameAction) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Upgrade player's tank
   @param powerup
   @roseuid 652795A600D6
    */
   public void upgrade(Powerup powerup) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   set player avaiable lives.
   @param live new life count.
   @roseuid 652795A600E2
    */
   public void setAvaiableLives(int live) 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Get player avaiable lives.
   @return int
   @roseuid 652795A600FC
    */
   public int getAvaiableLives() 
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
   Tank thinks before move.
   @roseuid 652795A60102
    */
   public void think() 
   {
    
   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN200 8  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Check if the player's tank is invulnerable
   @return true,the tank is invulnerable.
   @roseuid 652795A60108
    */
   public boolean isInvulnerable() 
   {
    return true;
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
   @roseuid 652795A60110
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
   Stop the player tank
   @roseuid 652795A6011B
    */
   public void stop() 
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
   @roseuid 652795A60121
    */
   public void explode() 
   {
    
   }
}

//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\actors\\tank\\SmartTank.java

package com.tankwar.app.actors.tank;



/**
--------------------------------- IMPORTS ------------------------------------
[------------------------------ MAIN CLASS ----------------------------------]
//////////////////////////////////////////////////////////////////////////////
--------------------------------- REVISIONS ----------------------------------
Date       Name                 Tracking #         Description
--------   -------------------  -------------      --------------------------
18JAN2008  James Shen                        Initial Creation
//////////////////////////////////////////////////////////////////////////////
Smart tank.
<p>
<hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
@version     1.00, 18/01/08
@author      Guidebee, Inc.
 */
public final class SmartTank extends EnemyTank 
{
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   18JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Constructor.
   @param hasPrize if true, when player hit the tank, a new powerup is put
   in the battle field.
   @roseuid 652795A601D3
    */
   protected SmartTank(boolean hasPrize) 
   {
      super(false);

   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   18JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Look for the player tank,if in the same row or col return true.
   @param dir current direction.
   @return boolean
   @roseuid 652795A601DA
    */
   private boolean lookforPlayer(int dir) 
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
   Tank thinks before move.
   @roseuid 652795A601E1
    */
   public void think() 
   {
    
   }
}

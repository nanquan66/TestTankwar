//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\actors\\tank\\SimpleTank.java

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
Simple tank.
<p>
<hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
@version     1.00, 18/01/08
@author      Guidebee, Inc.
 */
public class SimpleTank extends EnemyTank 
{
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Constructor.
   @param hasPrize if true, when player hit the tank, a new powerup is put
   in the battle field.
   @roseuid 652795A6016E
    */
   protected SimpleTank(boolean hasPrize) 
   {
      super(false);

   }
   
   /**
   //////////////////////////////////////////////////////////////////////////
   --------------------------------- REVISIONS ------------------------------
   Date       Name                 Tracking #         Description
   ---------  -------------------  -------------      ----------------------
   16JAN2008  James Shen                            Initial Creation
   //////////////////////////////////////////////////////////////////////////
   Tank thinks before move.
   @roseuid 652795A60175
    */
   public void think() 
   {
    
   }
}

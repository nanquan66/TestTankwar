//Source file: G:\\teacher\\2023-02\\sd\\reeng\\tankwar\\src\\com\\pstreets\\game\\battlecity\\actors\\tank\\HeavyTank.java

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
Heavy tank.
<p>
<hr><b>&copy; Copyright 2008 Guidebee, Inc. All Rights Reserved.</b>
@version     1.00, 18/01/08
@author      Guidebee, Inc.
 */
public final class HeavyTank extends SimpleTank 
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
   @roseuid 652795A50319
    */
   public HeavyTank(boolean hasPrize) 
   {
      super(false);

   }
}

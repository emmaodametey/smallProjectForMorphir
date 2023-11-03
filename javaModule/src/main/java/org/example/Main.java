package org.example;

//import dist.traderx.models.TradeOrder.TradeOrder;

import debma.ScalaCaseClass;
import debma.ScalaCaseClass$;
import debma.ScalaObject;
//import dist.traderx.models.TradeOrder;
//import dist.traderx.models.TradeOrder.TradeOrder;
//import dist.traderx.models.TradeSide;


public class Main {

    public static void main(String[] args) {
        ScalaCaseClass scalaCaseClass = new ScalaCaseClass(12, "Morphir");
//        TradeSide side = (TradeSide) TradeSide.Buy();

//        TradeOrder tradeOrder = new TradeOrder('1','1', '1', '1', '4', '1');
//        System.out.println(side);
        System.out.println(scalaCaseClass.getName());
    }

}
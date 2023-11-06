package org.example;
import debma.ScalaCaseClass;
import debma.ScalaCaseClass$;
import debma.ScalaObject;
import traderx.models.TradeOrder.TradeOrder;
import traderx.models.TradeSide;
import traderx.models.TradeSide.TradeSide$;


public class Main {

    public static void main(String[] args) {
        ScalaCaseClass scalaCaseClass = new ScalaCaseClass(12, "Morphir");
//        TradeSide.TradeSide.Buy$ side = TradeSide$.MODULE$.Buy();
//        TradeSide$ tradeSide = TradeSide$.MODULE$.;

        TradeOrder tradeOrder = new TradeOrder("1","1", "1", 1, '4', );
        System.out.println(tradeOrder);
//        System.out.println(tradeOrder.security());
    }

}
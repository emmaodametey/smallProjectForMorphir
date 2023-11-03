package models

/** Generated based on Models.TradeSide
*/
object TradeSide{

  sealed trait TradeSide {
  
    
  
  }
  
  object TradeSide{
  
    case object Buy extends models.TradeSide.TradeSide{}
    
    case object Sell extends models.TradeSide.TradeSide{}
  
  }
  
  val Buy: models.TradeSide.TradeSide.Buy.type  = models.TradeSide.TradeSide.Buy
  
  val Sell: models.TradeSide.TradeSide.Sell.type  = models.TradeSide.TradeSide.Sell

}
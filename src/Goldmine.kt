class Goldmine {
    //val thirstf: Int
    //recolecta pepitas una por vez
   val bank = Bank()
    val taver = Tavern()
    val home = HomeSweetHome()
    var intotal = 0



    open fun goldchargingf(goldpocket: Int): Int{

        if (goldpocket < 3){
            val gold = goldpocket
            return gold + 1 // va ir sumando por que va autincrementandose en 1
        }else {

            intotal = bank.GoldInTheBank(goldpocket)
            return goldpocket - goldpocket //tenemos que restarle por que ya fue a dejar la cantidad al banco

        }

    }

    open fun Thirstf(thirst : Int): Int{
        if (thirst < 5)
        {
            val thirsty = thirst
            return thirsty + 1
        }else{
            //si esta en ese nivel de sediento entonces bob va a ir a la taberna
            return taver.tavern(thirst)
        }
    }


    open fun fatiguef(fatigue : Int): Int{
        if (fatigue < 10){
            var fatigue = fatigue
            return fatigue + 2 //va autoincrementandose en dos por cada pepita que recoge en la mina
        }else {
            // si su fatiga es 10 el ira a su hogar
            return home.homesweethome(fatigue)
        }
    }


     open fun fatiguebankf(fatigue : Int): Int {

         if (fatigue < 8){
             val fatigue = fatigue
             return fatigue + 2
         }else {
             return home.homesweethome(fatigue)
         }
     }

}
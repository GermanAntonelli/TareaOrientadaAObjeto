import jdk.nashorn.internal.ir.ReturnNode
class Bank () {

    //var oro = 1
    var gold = 0
    open fun GoldInTheBank(goldcharging: Int): Int{
        var previousgold = goldcharging
        gold = gold + previousgold
        return gold
    }

}
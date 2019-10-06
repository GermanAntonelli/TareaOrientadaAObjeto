import java.util.*
import kotlin.random.Random

class Miner {

    val name: String
    var thirst: Int
    var fatigue: Int
    var goldcharging: Int
    val random = Random

    //objeto para minero bob
    val BobObject = Bob(random.nextInt(3),0,random.nextInt(5))
    //BobObject.show()

    //objeto para la mina de oro
    val GoldmineObject = Goldmine()

   // BobObject.show()

    constructor(name: String, thirst: Int = 0, fatigue: Int = 1, goldcharging: Int = 1) {
        this.name = name
        this.thirst = thirst
        this.fatigue = fatigue
        this.goldcharging = goldcharging
        this.mineroBob = Miner("MineroBob")
    }

    val mineroBob: Miner

    init {
        thirst = 0
        fatigue = 5
        goldcharging = 3
    }

    fun show(){
        println("""
            nombre: $name
            sed: $thirst
            fatiga: $fatigue
            Oro-carga-bolsillo: $goldcharging
        """.trimIndent())
    }

//    fun goldcharginginyourpocket(goldcharging: Int) {
        // val random = Random()
  //      val goldcharging = random.nextInt(3)

    //    if (goldcharging >= 3) {
      //      println("$name Depositando el oro en el banco. El oro ahorrado es: 3")
  //      }
//    }

    //un fatigueBob() {
       // val random = Random()
      //  val fatigue = random.nextInt(5)

        //if (fatigue >= 8) {
           // fatigue = (Goldmine.fatiguebankf(Bob.fatigue))
          //  println("Me siento muy cansado. ire a desacansar")
        //} else {
          //  if (fatigue <= 5) {
           //     println("De regreso a la mina de oro")
            //}
            //return fatigueBob()
        //}
        //}


     //fun thirstBob(thirst: Int){
//        if(thirst == 0){
          //println("Bob no tiene sed, úede ir a la mina a recoger pepotas de oro")
      //}else {
        // if (thirst >= 5){
          //   println("Hombre. Estoy sediento, me dirijo a la taberna")
         //}else{
           //  if (thirst >= 8){
             //    println("Ire a descansar a mi hogar dulce hogar")
             //}
          //}
        //}
      //}

    }











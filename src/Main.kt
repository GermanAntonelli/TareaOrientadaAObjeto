import java.sql.DriverManager
import java.sql.DriverManager.println
import kotlin.concurrent.thread
import kotlin.random.Random

fun main() {

    val random = Random

    //goldchargin, thirst, fatigue
    val BobObjct = Bob(random.nextInt(3),0,random.nextInt(5))

    val MinerObject = Goldmine()

    BobObjct.show()

    for (num in 1..18 < 3)
        if (BobObjct.goldcharging < 3) {
            BobObjct.goldcharging = (MinerObject.goldchargingf(BobObjct.goldcharging))
            BobObjct.thirst = (MinerObject.Thirstf((BobObjct.thirst)))
            BobObjct.fatigue = (MinerObject.fatiguef(BobObjct.fatigue))
            println("Minero Bob: Recolectando pepitas de oro, oro actual: ${BobObjct.goldcharging}")
           Thread.sleep(1500) //funcion para que haga una espera
        }else
        {
            println("Minero Bob: Voy hacia el banco, si señor")
            Thread.sleep(1500)
            BobObjct.goldcharging = (MinerObject.goldchargingf(BobObjct.goldcharging))
            println("Minero Bob: Depositando la carga de oro en el banco. total oro ahorrado: ${BobObjct.goldcharging} ")
            Thread.sleep(1500)

            //para  cuando Bob se pone sediento
            if(BobObjct.thirst >= 5){
                BobObjct.thirst = (MinerObject.Thirstf(BobObjct.thirst))
                Thread.sleep(1500)
                println("Minero Bob: Hombre, estoy sediento, Me dirijo a la taberna")
                Thread.sleep(1500)

                if (BobObjct.fatigue >= 10){
                    BobObjct.fatigue = (MinerObject.fatiguef(BobObjct.fatigue))
                    println("Minero Bob: Me siento muy cansado, Ire a descansar zzzz.")
                    Thread.sleep(1500)
                    println("Minero Bob: De camino a mi Hogar Dulce Hogar.")
                    Thread.sleep(1500)
                    println("Minero Bob: ZZZZZZZ")
                    Thread.sleep(1500)
                    println("Minero Bob: De regreso a la mina")
                    Thread.sleep(1500)
                }else {
                    println("Minero Bob: De regreso a la mina")
                    Thread.sleep(1500)
                }
            }




            //para el calculo de la fatiga de el minero Bob

            if(BobObjct.fatigue >= 8){
                BobObjct.fatigue = (MinerObject.fatiguef(BobObjct.fatigue))
                println("Minero Bob: Me siento muy cansado. Ire a desacansar ZZZZ")
                Thread.sleep(1500)
                println("Minero Bob: De regreso a mi hogar dulce hogar.")
                Thread.sleep(1500)
                println("Minero Bob: ZZZZZZ")
                Thread.sleep(1500)
                println("Minero Bob: De regreso a la mina")
                Thread.sleep(1500)
            }


        }




}




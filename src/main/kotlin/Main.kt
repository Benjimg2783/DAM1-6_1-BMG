open class Animal(val nombre:String){ //Especializacion (Superclase) F) Al ser una persona un tipo de animal la especializacion es la mejor opción ya que te permite que cada subclase use los metodos de la mejor forma.
    open fun hablar(QuiereDecir:String):String=""
}
class Persona(nombre: String): Animal(nombre){//Subclase
    override fun hablar(quiereDecir:String)=quiereDecir
}
class Perro(nombre: String):Animal(nombre){//Subclase
    override fun hablar(quiereDecir: String)="Guau guau"
}



open class Espada(val nombre: String,val danio:Double){//Extension (Superclase) F) La extensión es la mejor opción ya que todos son  espadas pero hay algunas que tienen metodos que no todas las espadas tienen.
    open fun pegar():Double=danio
}
class EspadaFuego(nombre: String,danio: Double, var encendida:Boolean):Espada(nombre, danio){//Subclase
    override fun pegar():Double{
        return if (encendida){danio*2}
        else danio
    }
    fun encender(){ encendida=true }
    fun apagar(){ encendida= false }
}
class EspadaElectrica(nombre: String,danio: Double,var encendida: Boolean):Espada(nombre, danio){//Subclase
    override fun pegar():Double{
        return if (encendida){danio*2}
        else danio
    }
    fun encender(hayTormenta:Boolean){ encendida = hayTormenta }
}

fun main() {
    val espada=Espada("espada", 20.0)
    espada.pegar()
    val espadaElectrica= EspadaElectrica("espadaE",20.0,false)
    espadaElectrica.encender(true)
    espadaElectrica.pegar()
    val espadaFuego= EspadaFuego("espadaF",20.0,false)
    espadaFuego.encender()
    espadaFuego.pegar()
    repeat(20){ print("*") }
    println()

    val animal=Animal("")
    println( animal.hablar("hola"))
    val persona1=Persona("Pepe")
    println(persona1.hablar("hola"))
    val perro=Perro("Paco")
    println(perro.hablar("hola"))

}
//E) Con el uso de clases abstractas o interfaces.
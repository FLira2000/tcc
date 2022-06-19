object Main extends App{
  val names = List("songa", "monga", "minga")
  names.map((name:String) => println(JavaGreeter.greet(name) + "from java!") )
  names.map((name:String) => println(ScalaGreeter.greet(name) + "from scala!") )
}
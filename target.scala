object GreeterClass {
  def greeter(name: String): String = "kekw " + name

  def main(args: Array[String]) = args.map( (x:String) => println("hello, " + x + "!") )
}
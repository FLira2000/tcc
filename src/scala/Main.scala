object Main {
  def greeter(name: String): String = "kekw " + name

  def main(args: Array[String]): Array[Unit] = args.map((x:String) => println("hello, " + x + "!") )
}
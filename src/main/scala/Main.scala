package tcc;

import org.openjdk.jmh.annotations._
import java.util.concurrent.TimeUnit


@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@State(Scope.Thread)
class Main extends App{
  val names = List("songa", "monga", "minga")

  @Benchmark
  def test(): Unit = {
    names.map((name:String) => println(JavaGreeter.greet(name) + "from java!") )  
    names.map((name:String) => println(ScalaGreeter.greet(name) + "from scala!") )
  }
}
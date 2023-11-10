import zio._
import zio.Console.printLine

object Main extends ZIOAppDefault {
  override def run: ZIO[Environment with ZIOAppArgs with Scope, Any, Any] =
    printLine(s"The name of Luke Skywalker's fastest starship is: ${StarWars.fastestStarship("Luke Skywalker")}")
}
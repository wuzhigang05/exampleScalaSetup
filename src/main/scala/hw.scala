import com.frugalmechanic.optparse._

object SimpleApp extends OptParse {
 val name = StrOpt()

  def main(args:Array[String]) {
    parse(args)
    println("Hello "+name.getOrElse("world"))
  }
}

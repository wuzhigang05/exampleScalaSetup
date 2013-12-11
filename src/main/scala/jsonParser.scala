import com.twitter.scalding.TextLine
import com.twitter.scalding.Args
import com.twitter.scalding.Job
import com.twitter.scalding.Tsv

class CC[T] { def unapply(a:Any):Option[T] = Some(a.asInstanceOf[T]) }
object M extends CC[Map[String, Any]]
object L extends CC[List[Any]]
object S extends CC[String]
object D extends CC[Double]
object B extends CC[Boolean]


class jsonParser (args : Args) extends Job(args) {
  TextLine(args("input"))
  .write(Tsv(args("output")))
}
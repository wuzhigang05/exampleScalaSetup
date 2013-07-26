import com.frugalmechanic.optparse._
import util.Random

object SimpleApp extends OptParse {
	val name = StrOpt()

			def test() = {
		val array = Seq.fill(10)(Random.nextInt(10)).toArray
				println("before sort: " + array.mkString(" "))
		var a = quickSort(array)
		println("after sort(Imperative style): " + a.mkString(" "))
		var b = quickSort2(array)
		println("after sort(functional style): " + b.mkString(" "))
		
	}

	def main(args: Array[String]) {
		parse(args)
		println("Hello " + name.getOrElse("world"))
		test
	}

	def quickSort(xs: Array[Int]) = {
		def quickSort1(xs:Array[Int]):Array[Int] = {
				if (xs.length <= 1)
					xs
					else {
						val pivot = xs(xs.length / 2)
								val middle = xs.filter(_ == pivot)
								var less = xs.filter(_ < pivot)
								var greater = xs.filter(_ > pivot)

								quickSort1(less) ++ middle ++ quickSort1(greater)
					}
		}
		quickSort1(xs)
	}
	// funcitonal style
	def quickSort2(xs: Array[Int]): Array[Int] = {
		if(xs.length <= 1)
			xs
		else {
			val pivot =xs(xs.length/2)
			Array.concat(quickSort2(xs.filter(pivot > )),
					xs.filter(pivot == ),
					quickSort(xs.filter(pivot <))
					)
		}
	}
	// define a curring function
	// sum of 2 to the n, which ranges from a to b
	def Sum(f: Int => Int): (Int, Int) => Int = {
		def sumF(a: Int, b: Int): Int = {
			if (a > b) 
				0
			else
				f(a) + sumF(a+1, b)
		}
		sumF
	}
}

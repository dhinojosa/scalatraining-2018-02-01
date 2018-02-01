

//val f:Function1[String, Int] =
//       new Function1[String, Int] {
//         override def apply(v1: String) = v1.length
//       }

val f:Function1[String, Int] = (x:String) => x.length
val f2 = (x:String) => x.length
val f3:Function1[String, Int] = x => x.length
val f4:Function1[String, Int] = _.length

f("Texas")



val list = List(1,2,3,4) //Int
val f6 = (x:Int) => x % 2 == 0
list.filter(f6)


val list2 = List("Poland", "Germany", "Texas", "Arizona", "California")
list2.map(x => x.length)
list2.map(f4)
list2.map(_.length)


List("a", "b", "c").foreach(x => println(x))

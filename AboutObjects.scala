

object MySingleton {
  def rock(x:Int) = x + 1
}

val a = MySingleton
val b = MySingleton

a == b
a eq b


MySingleton.rock(40)


//-------------------------------
//Companion Object

class Employee private (val firstName:String, val lastName:String)
object Employee { //Companion Object
  def apply(fn:String, ln:String) = new Employee(fn, ln)
}

val employee = Employee.apply("Bobby", "Langley")
val employee2 = Employee("Bobby", "Langley")

//List

val list1 = List(1,2,3,4)
val list2 = List.apply(1,2,3,4)

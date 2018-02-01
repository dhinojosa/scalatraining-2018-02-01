

case class Employee(firstName:String, lastName:String)

val e = Employee("David", "Bowie")
val e1 = Employee("David", "Bowie")

println(e == e1) // == is object equality
println(e.equals(e1)) //same as the above

println(e eq e1) //reference equality

val Employee(a, b) = e
println(a)
println(b)

// toString, and equals impl
//  override def toString = s"Employee($firstName, $lastName)"
//
//  override def equals(obj: scala.Any): Boolean = {
//    if (!obj.isInstanceOf[Employee]) false
//    else {
//      val e2: Employee = obj.asInstanceOf[Employee]
//      this.firstName == e2.firstName &&
//      this.lastName == e2.lastName
//    }
//  }
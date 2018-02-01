class Missouri(x:Int) {
  def texas(y:Int) = x + y
}

val mo = new Missouri(40)
mo texas 50

class Foo(x:Int) {
  def apply(y:Int) = x + y
}

val foo = new Foo(40)
foo.apply(20)
foo(20)


class Zoom(x:Int) {
  def ~:(y:Int) = x + y
}

val z = new Zoom(40)
z.~:(20)
20 ~: z

val list1 = List(1,2,3)
val list2 = 1 :: 2 :: 3 :: Nil
val list3 = 1 :: 2 :: 3 :: List()


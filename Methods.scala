

def add(x:Int, y:Int):Int = x + y

add(40, 12)

def badAdd(x:Int, y:Int) {
  x + y
}

badAdd(40, 60)

val u = ()

def sideEffect(x:Int):Unit = {
  println(s"The number is $x")
}

def sideEffect2(x:Int) {
  println(s"The number is $x")
}
sideEffect(40)

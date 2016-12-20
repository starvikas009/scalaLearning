/**
  * Created by vkumar on 12/19/16.
  */

import java.io._

// Singleton Objects
object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!")
    val p1 = new Point(90, 80)
    p1.move(0, 20)


    val loc = new Location(10, 20, 15);

    // Move to a new location
    loc.move(10, 10, 5);

    println( "multiplier(1) value = " +  multiplier(1) )
    println( "multiplier(2) value = " +  multiplier(2) )
  }

  def foo() {
    val myVal : String = "Foo"
    var myVar : String = "Foo"
    myVar = "updated Foo"
    var myVar2 = 10; // type inference
    val myVal2 = "Hello, Scala!"; // type inference


  }

  def fooTypeInference(): Unit = {
    val (myVal1:Int, myVal2:String) = Pair(40, "test")
    val (myVal3, myVal4) = Pair(40, "test") // type inference

  }

  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b
    return sum
  }

  def printMe( ) : Unit = {
    println("Hello, Scala!")
  }

  var factor = 3
  var multiplier = (i:Int) => i * factor
}

class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("Point x location : " + x);
    println ("Point y location : " + y);
  }
}

class Location(val xc: Int, val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println ("Point x location : " + x);
    println ("Point y location : " + y);
    println ("Point z location : " + z);
  }
}
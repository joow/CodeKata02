package day1

import org.scalacheck.Prop.forAll

import scala.collection.JavaConverters._

object CheckBinaryChop {
  val emptyListProperty = forAll { (l: List[Integer], n: Int) => new BinaryChop().find(n).in(l.asJava) == -1 }


/*  val tests = scala.List("emptyListProperty", emptyListProperty)

  def main(args: Array[String]) {
    tests foreach { case (name, p) => testStatsEx(name, check(p))}
  }*/
}
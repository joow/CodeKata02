import day1.BinaryChop
import org.scalacheck.Prop.forAll

import scala.collection.JavaConverters._

val propEmptyList = forAll { (l: List[Integer], n: Int) => new BinaryChop().find(n).in(l.asJava) == -1 }
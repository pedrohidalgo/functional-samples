import org.specs2._
import org.pedrohidalgo.functionalsample.HigherOrderFunctionsExample;

class HigherOrderFunctionsSpec extends mutable.Specification {
    "HigherOrderFunctionExample" should {
        "count the lenght of a string" in {
            val result = HigherOrderFunctionsExample.processer(
                HigherOrderFunctionsExample.lengthCounter, "the length"
            )
            result must beEqualTo(10)
        }
        "count the words in a string" in {
            val result = HigherOrderFunctionsExample.processer(
                HigherOrderFunctionsExample.wordCounter, "Super Druper"
            )
            result must beEqualTo(2)
        }
        "count the F ocurrences in a string" in {
            val result = HigherOrderFunctionsExample.processer(
                HigherOrderFunctionsExample.letterFCounter, "Functional Programming using cool features, super fun :)"
            )
            result must beEqualTo(3)
        }
    }

}
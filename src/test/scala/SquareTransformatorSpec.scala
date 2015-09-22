import org.specs2._
import org.pedrohidalgo.functionalsample.SquareTransformator;

class SquareTransformatorSpec extends mutable.Specification {
  "SquareTransformatorExample" should {
    "numbers to square" in {

      val filePath = getClass.getResource("/numbers.txt").getPath
      val newFilePath = "/home/pedro/NetBeansProjects/functional-samples/src/test/resources/square_numbers.txt"
      SquareTransformator.transform(filePath, newFilePath)

      val newFileCreated = new java.io.File(newFilePath)
      newFileCreated.exists must beEqualTo(true)
    }
  }

}
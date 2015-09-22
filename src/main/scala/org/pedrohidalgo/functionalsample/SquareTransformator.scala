package org.pedrohidalgo.functionalsample;

import scala.io.Source;
import java.nio.file.{ Paths, Files, StandardOpenOption }
import java.nio.charset.StandardCharsets

object SquareTransformator {

  def transform(filePath: String, newFilePath: String) = {
    val lines = Source.fromFile(filePath).getLines
    val squareNumbersPath = Paths.get(newFilePath)
    Files.write(squareNumbersPath, "".getBytes) //we clear the file before writing in it

    lines.filter(line => !line.trim.isEmpty)
      .map(line => {
        val number = line.toLong
        (number * number).toString + System.getProperty("line.separator")
      })
      .foreach(number => {
        Files.write(
          squareNumbersPath,
          number.toString.getBytes(StandardCharsets.UTF_8),
          StandardOpenOption.APPEND
        )
      })

  }

}
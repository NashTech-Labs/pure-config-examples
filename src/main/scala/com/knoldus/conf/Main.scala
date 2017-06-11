package com.knoldus.conf

object Main extends App {

  val simpleConfig = new SimpleConfig().getConfig

  simpleConfig match {
    case Left(ex) => ex.toList.foreach(println)

    case Right(config) => println(s"Company's Name ${config.company.fullName}")
      println(s"Company started at ${config.company.started}")
      println(s"Company's strength is ${config.company.employees}")
      println(s"Company's presence are in  ${config.company.offices}")
      println(s"Company's office in India are  ${config.company.officesInIndia}")
      println(s"Company's extra activity is  ${config.company.extraActivity}")
  }

}

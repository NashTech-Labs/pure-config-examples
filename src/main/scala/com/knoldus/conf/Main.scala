package com.knoldus.conf

import com.knoldus.conf.models.{Company, CompanyDetails}

object Main extends App {

  val company = Company(CompanyDetails("Knoldus Software LLP", 2012, "80-120", Nil, Map(), None))

  // ------------------------------ Read config---------------------------------------

  // To see SimpleConfig output
  // val config = new SimpleConfig().getConfig

  // To see CustomType output
  //  val config = new CustomType().getConfig

  // To see ConfigReaderOverrideBehavior output
  // val config = new ConfigReaderOverrideBehavior().getConfig

  // To see ConfigReaderOverrideBehavior output
  val (config, configValue) = new ConfigConvertOverrideBehavior().getConfig(company)


  config match {
    case Left(ex) => ex.toList.foreach(println)

    case Right(conf) =>
      println(s"Company's Name: ${conf.company.fullName}")
      println(s"Company started at: ${conf.company.started}")
      println(s"Company's strength is: ${conf.company.employees}")
      println(s"Company's presence are in: ${conf.company.offices}")
      println(s"Company's office in India are: ${conf.company.officesInIndia}")
      println(s"Company's extra activity is: ${conf.company.extraActivity}")
  }


  // -------------------------------------Write config------------------------------------------

  // To see ConfigReaderOverrideBehavior output
  // val configValue = new ConfigWriterOverrideBehavior().getConfig(company)

  println("-------------------------------------------------------")
  println(s"Config value: $configValue")
}

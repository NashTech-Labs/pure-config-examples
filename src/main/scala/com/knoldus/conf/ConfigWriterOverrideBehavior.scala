package com.knoldus.conf

import com.knoldus.conf.models.{Company, CompanyDetails}
import com.typesafe.config.ConfigValue
import pureconfig.ConfigWriter
import pureconfig.syntax._


class ConfigWriterOverrideBehavior {

  implicit val myIntWriter = ConfigWriter.toString[String](n => s"$n !!!")

  def getConfig: ConfigValue = {
    val companyDetails = CompanyDetails("Knoldus Software LLP", 2012, "80-120", Nil, Map(), None)
    Company(companyDetails).toConfig
  }
}

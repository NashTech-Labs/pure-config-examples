package com.knoldus.conf

import com.knoldus.conf.models.Company
import com.typesafe.config.ConfigValue
import pureconfig.ConfigWriter
import pureconfig.syntax._

/**
  * Overrides behavior for config writer
  */
class ConfigWriterOverrideBehavior {

  implicit val myStringWriter = ConfigWriter.toString[String](n => s"$n !!!")

  def getConfig(company: Company): ConfigValue = company.toConfig
}

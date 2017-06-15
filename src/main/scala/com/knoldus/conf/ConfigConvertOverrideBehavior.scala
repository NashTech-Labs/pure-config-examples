package com.knoldus.conf

import com.knoldus.conf.models.Company
import com.typesafe.config.ConfigValue
import pureconfig.ConvertHelpers.catchReadError
import pureconfig.error.ConfigReaderFailures
import pureconfig.syntax._
import pureconfig.{ConfigConvert, loadConfig}


/**
  * Overrides behavior for both reader and writer
  */
class ConfigConvertOverrideBehavior {

  implicit val myStringConvert = ConfigConvert.viaString[String](catchReadError(s => s.toUpperCase), n => s"$n !!!")

  def getConfig(company: Company): (Either[ConfigReaderFailures, Company], ConfigValue) = {
    (loadConfig[Company], company.toConfig)
  }
}

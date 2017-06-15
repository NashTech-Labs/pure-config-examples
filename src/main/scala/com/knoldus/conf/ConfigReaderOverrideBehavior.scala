package com.knoldus.conf

import com.knoldus.conf.models.Company
import pureconfig.ConvertHelpers.catchReadError
import pureconfig.error.ConfigReaderFailures
import pureconfig.{ConfigReader, loadConfig}

/**
  * Overrides behavior for config reader
  */
class ConfigReaderOverrideBehavior {

  implicit val overrideStrReader = ConfigReader.fromString[String](catchReadError(_.toUpperCase()))

  def getConfig: Either[ConfigReaderFailures, Company] = loadConfig[Company]


}

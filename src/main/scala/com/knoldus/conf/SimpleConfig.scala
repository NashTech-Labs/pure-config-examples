package com.knoldus.conf

import com.knoldus.conf.models.Company
import pureconfig.error.ConfigReaderFailures
import pureconfig.loadConfig

class SimpleConfig {

  def getConfig: Either[ConfigReaderFailures, Company] = loadConfig[Company]

}

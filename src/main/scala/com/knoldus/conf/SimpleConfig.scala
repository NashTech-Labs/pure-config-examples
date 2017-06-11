package com.knoldus.conf

import pureconfig.error.ConfigReaderFailures
import pureconfig.loadConfig

class SimpleConfig {

  def getConfig: Either[ConfigReaderFailures, Company] = loadConfig[Company]

}

case class Company(company: CompanyDetails)

case class CompanyDetails(fullName: String,
                          started: Int,
                          employees: String,
                          offices: List[String],
                          officesInIndia: Map[String, String],
                          extraActivity: Option[String])

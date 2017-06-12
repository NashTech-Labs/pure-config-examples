package com.knoldus.conf

import pureconfig.error.ConfigReaderFailures
import pureconfig.{ConfigReader, loadConfig}
import pureconfig.ConvertHelpers._


class CustomType {

  implicit val myIntReader: ConfigReader[Year] = ConfigReader.fromString[Year](catchReadError(s => new Year(s.toInt)))
  def getConfig: Either[ConfigReaderFailures, Company1]  = loadConfig[Company1]

}

case class Company1(company: CompanyDetails1)

class Year(value: Int){
  override def toString: String = s"Year($value)"
}

case class CompanyDetails1(fullName: String,
                          started: Year,
                          employees: String,
                          offices: List[String],
                          officesInIndia: Map[String, String],
                          extraActivity: Option[String])
package com.knoldus.conf.models


case class Company(company: CompanyDetails)

case class CompanyDetails(fullName: String,
                          started: Int,
                          employees: String,
                          offices: List[String],
                          officesInIndia: Map[String, String],
                          extraActivity: Option[String])
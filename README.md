# pure-config-examples
Simple examples to load configuration of certain types in a better way

### application.conf file :
~~~
company {
  full-name = "Knoldus Software LLP"
  started = 2012
  employees = "80-120"
  offices = ["India", "Singapore", "US", "Canada"]
  offices-in-india {
    head-office = "Delhi"
    development = "Noida"
  }
}
~~~

### Run application
sbt run


# pure-config-examples
Contains examples to load configuration of certain types in a better way:
1. A basic example
2. Support of custom type

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


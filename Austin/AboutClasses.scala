package org.functionalkoans.forscala

import support.KoanSuite

class AboutClasses extends KoanSuite {

  val  string1: String = "hello"

  // you can define class with var or val parameters
  class ClassWithVarParameter(var description: String)

  class ClassWithValParameter(val name: String)

  koan("val parameters in class definition define getter") {
    val aClass = new ClassWithValParameter(string1)
    aClass.name should be("hello")
  }

  var string2: String = "this is a description"
  var string3: String = "this is a new description"

  koan("var parameters in class definition define getter and setter") {
    val aClass = new ClassWithVarParameter("this is a description")
    aClass.description should be(string2)

    aClass.description = "this is a new description"
    aClass.description should be(string3)
  }

  // you can define class with private fields
  class ClassWithPrivateFields(name: String)

  koan("fields defined internally are private to class") {
    val aClass = new ClassWithPrivateFields("name")

    // NOTE: aClass.name is not accessible
  }

}

package org.functionalkoans.forscala

import support.KoanSuite

class AboutClasses extends KoanSuite {


  // you can define class with var or val parameters
  class ClassWithVarParameter(var description: String)

  class ClassWithValParameter(val name: String)

  koan("val parameters in class definition define getter") {
    val aClass = new ClassWithValParameter("testClass")
    aClass.name should be("testClass")
  }

  koan("var parameters in class definition define getter and setter") {
    val aClass = new ClassWithVarParameter("this is a description")
    aClass.description should be("this is a description")

    aClass.description = "new description"
    aClass.description should be("new description")
  }

  // you can define class with private fields
  class ClassWithPrivateFields(name: String)

  koan("fields defined internally are private to class") {
    val aClass = new ClassWithPrivateFields("name")

    // NOTE: aClass.name is not accessible
  }

}

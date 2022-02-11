package com.wzc.groovy

Student student = new Student()
student.setUsername("Peter")
println student.getUsername()

student.age = 18
println student.age

Student stu = new Student(username: "John")
println stu.getUsername()
stu = new Student(username: "Bush", email: "123456@qq.com", age: 17)
println "${stu.username}, ${stu.getEmail()}, ${stu.getAge()}"

//>groovy com/wzc/groovy/App.groovy
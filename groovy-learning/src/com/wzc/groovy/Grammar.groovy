println "=".repeat(10) + "变量声明" + "=".repeat(10)
def name = "wzc"
age = 18
println "$name = $age"

// 断言
// assert age == 19

println "=".repeat(10) + "字符串定义" + "=".repeat(10)
str1 = 'hello'
str2 = "$str1 world"
str3 = '''I'm very "HAPPY"'''
println str1
println str2
println str3

println "=".repeat(10) + "集合定义" + "=".repeat(10)
// List 集合
def list = ["hi", "hey"]
list.add("hello")
list << "world"
println list
println list.getClass()
// Map 集合
def map = ["four": 4]
map["one"] = 1
map["two"] = 2
map.put("three", 3)
map.five = 5
println map
println map.getClass()

println "=".repeat(10) + "闭包定义" + "=".repeat(10)
def noArgsClosure = {
    println "noArgsClosure"
}
noArgsClosure()
noArgsClosure.call()

def withArgsClosure = { message ->
    println "withArgsClosure: Hello, $message"
}
withArgsClosure("world")
withArgsClosure.call("groovy")

def method0(Closure closure) {
    closure()
}

method0(noArgsClosure)
method0 noArgsClosure
// 直接传递一个闭包
method0({
    println "noArgsClosure2"
})
method0 {
    println "noArgsClosure3"
}

def method1(Closure closure, arg) {
    closure(arg)
}

method1(withArgsClosure, "2022")
method1(withArgsClosure, 100)
method1({ msg -> println "withArgsClosure2: hi, $msg" }, "tiger")


println "=".repeat(10) + "空值比较不会抛出 NPE" + "=".repeat(10)
def nullValue = null
println nullValue.equals(null)

/*
==========变量声明==========
wzc = 18
==========字符串定义==========
hello
hello world
I'm very "HAPPY"
==========集合定义==========
[hi, hey, hello, world]
class java.util.ArrayList
[four:4, one:1, two:2, three:3, five:5]
class java.util.LinkedHashMap
==========闭包定义==========
noArgsClosure
noArgsClosure
withArgsClosure: Hello, world
withArgsClosure: Hello, groovy
noArgsClosure
noArgsClosure
noArgsClosure2
noArgsClosure3
withArgsClosure: Hello, 2022
withArgsClosure: Hello, 100
withArgsClosure2: hi, tiger
==========空值比较不会抛出 NPE==========
true
 */
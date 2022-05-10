// Simple closure
def myClosure = { println "Hello World"}
myClosure.call()

// Closure with parameter
def myClosure1 = { name -> println "Hello ${name}"}
myClosure1.call("Groovy")

// Method call with closure
def closureMethod(clos) {
	clos.call("Groove")
}

closureMethod(myClosure1)

// each wtih list
def list = ["Apples", "Oranges", "Bananas"]
println list.each{ it }

// each with map
def myMap = [
	'subject': 'groovy',
	'topic'  : 'closures'
]
println myMap.each{ it }


// find, findAll, any, every: works with {} also
myList = [1, 2, 3, 4, 5]
println myList.find(item -> item == 3)
println myList.findAll(item -> item > 3)
println myList.any(item -> item > 5)
println myList.every(item -> item < 3)
println myList.collect(item -> item * 2)

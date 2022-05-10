// Still works without def, but better practice as it enforces that the same variable is not used twice
def name = "Groovy"
println "This is " + name + " with concatenation"
println 'This is ${name} with single quotes'
println "This is ${name} with double quotes"
println "This is $name with double quotes without curly braces"
println "======"

// Dynamic typing
def newName = "Dynamic Groovy"
newName = 10
println "New name variable was changed to ${newName}"
println "======"

// Multiple variable assignments
def (a, b, c) = [1, 2, 3]
println "Print multiple variables: ${a}, ${b}, ${c}"

def (String a1, int b1, Double c1) = [1, 2, 3]
println "Print multiple variables with types: ${a1}, ${b1}, ${c1}"

def (String a2, int b2, Double c2) = [1, 2]
println "Print multiple variables without c2 assigned: ${a2}, ${b2}, ${c2}"

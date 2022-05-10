employee = [
	name: 'John',
	age: 30,
	city: 'Paris'
]

employee.each { key, value -> 
	println "$key: $value"
}

println ""

employee.eachWithIndex { key, value, idx -> 
	println "${idx + 1} | $key: $value"
}

println ""

employee.each { entry ->
	println "${entry.key}: ${entry.value}"
}

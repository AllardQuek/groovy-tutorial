def n = 0

// If-else implementation
if (n > 0) {
	println "${n} is positive"
} else if (n < 0) {
	println "${n} is negative"
} else {
	println "${n} is zero"
}

// Switch implementation: curly braces for the case statements
switch(n) {
	case {n > 0}:
		println "${n} is positive"
		// break
	case {n < 0}:
		println "${n} is negative"
		// break
	case 0:
		println "${n} is zero"
		// break
	default:
		println "${n} is unknown"
}

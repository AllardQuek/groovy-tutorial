// for
for (def i=1; i <= 5; i++) {
	print i
}

println ""

// for in 
for (i in 1..5) {
	print i
}

println ""

// upto
1.upto(5) {
	print "$it"
}

println ""

// times
5.times{
	print "$it"
}

println ""

// step
1.step(10, 2) {
	print "$it"
}

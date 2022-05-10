// for
for (def i=1; i <= 5; i++) {
	print i
}

println ""

// for in (works with lists as well)
for (i in 1..5) {
	print i
}

// iterate over a map
def map = ['abc':1, 'def':2, 'xyz':3]
x = 0
for ( e in map ) {
    x += e.value
}
assert x == 6

// iterate over values in a map
x = 0
for ( v in map.values() ) {
    x += v
}
assert x == 6

println ""

// while
int i = 1
while (i <= 5) {
	print i
	i++
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

// Reference: https://groovy-lang.org/operators.html

// Basic operators: no output means no error!
assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1		// remainder
assert  2 ** 3 == 8		// power

// Increment (or decrement) operator
def a = 4
a += 3
assert a == 7

// Boolean operators
assert !false           
assert true && true     
assert true || false    

// Conditional operators
assert (!true)    == false                      
assert (!'foo')   == false                      
assert (!'')      == true 

// Ternary operator
boolean isTrue = true
result = isTrue ? 'Found' : 'Not found'
println result

// Elvis operator
// with the ternary operator, you have to repeat the value you want to assign
// with the Elvis operator, the value, which is tested, is used if it is not false-ish
defaultName = 'Default value'
displayName = defaultName ?: 'Anonymous'     
println displayName         
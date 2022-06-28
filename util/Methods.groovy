package util

class Methods {
    static DEFAULT_VARIABLE = "Hello World"

    def static sum(int a, int b) {
        // Prints sum of a and b
        println a + b
    }

    static sub(int a, int b) {
        def result = a - b
        return result
    }

    static void main(String[] args) {
        println "Working"
    }
}

// * Not working
package templates

class Car {
    Car(LinkedHashMap<String, String> stringStringLinkedHashMap) {

    }
}

xmlDeclaration()
model = [cars: [new Car(make: 'Peugeot', model: '508'), new Car(make: 'Toyota', model: 'Prius')]]
cars {
    cars.each {
        car(make: it.make, model: it.model)
    }
}







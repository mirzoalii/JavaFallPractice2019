package day50_Abstraction;

public class notes {
	
	/*
	 11/06/2019
Topic:  Abstractions continue
            Abstract methods
            Abstract class
            abstract class VS Non-Abstract class
package: day50_Abstraction
WarmUp:
    create an Animal abstract class
            data/attributes: gender, age, color, name
            create one constructor that can set the gender, name, color and age
            Actions: Speak(), Eat(), Sleep(), Drink();
        create sub classes of the Animal and override those actions:
                    dog: Speak()    ==> woof
                         Sleep()    ==> 8 hours
                         Eat()      ==> KFC
                         Drinks()   ==> Milk Shake
                    Cat: Speak()    ==> meow
                         Sleep()    ==> 14 hours
                         Eat()      ==> m&m
                         Drinks()   ==> Hot chocolate
                    cow: Speak()    ==> moo
                         Sleep()    ==> 5 hours
                         Eat()      ==> grace
                         Drinks()   ==> Coffee with sugar
        create  zoo class and store some of those animals' objects
        
        
Abstraction: concentrating on importance/essential things without worrying about the details
abstract keyword: can only applicable to class and methods
abstract class: we cannot create object of
                it's a class that's meant to be extended 
                cannot be final
                class' access modifiers can only public or default
abstract method: a method that's meant to be override
                 a method without body/implementation
                 cannot be static, private, final
                 Only the instance method can be override
                 hides the implementation details
            declearation of abstract method:
                        Access-Modifier  abstract  return-type  name(parameter);
                        Access modifers: public, protected, default
                        return-type: void, primitives, non-primitives(object)
                        name: can be any name
                        parameter: any data-type ( primitives and non primitves)
overriding: same method name, same parameter, same return-type
            access modifier needs to be same or more visible
            MUST override in sub class
            @Override  must be applicable 

	 */

}

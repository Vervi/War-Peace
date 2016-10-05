# homework1
An extension of Exercise 3

Now that you have War working, it's time to think about Peace. Actually, we'll revise your code from Exercise 3 so that it can play either War *or* Peace. 

Peace is just like War, except that in Peace, the *lowest* card wins rather than the highest. That is, in object-oriented terms, Peace `Card`s and War `Card`s behave differently. So, the main challenge for this assignment is to come up with an object-oriented design that effectively captures this difference in behavior (and also lets us imagine other possibilities for different `Card` behavior). 

Specifically, where we before just had a `Card` class for War, now we'll have a handful of classes and/or interfaces that gives us differently-behaving Card-like objects. This change may, or may not, affect other aspects of your War code.

Then, revise `MainDriver` to first ask the user whether to play War or Peace. Depending on the response, create the objects you need and play the game. Of course, our goal, as always, is to set things up to require the smallest possible change. What's the difference between playing War and playing Peace? How can you reflect that in your code?

To turn in your work, clone this repository (which has no code in it) and add your `War` project. Then revise that code, committing and pushing as usual. Push your final work by 9am, Friday October 14. To earn credit, your code must be in the `master` branch of THIS repository (which should have a name like `username-homework1`).

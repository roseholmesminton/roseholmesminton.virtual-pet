# Virtual Pet

 My approach to completing the Virtual Pet Project (Interations)

First I chose an animal, a hamster. 
 

After that I designed, on paper, the virtual pet. I gave it  6 attributes that I felt a pet hamster would have. Two of them would not change in this application and that is the Pet's name and the Pet's breed.
I also decided how I wanted the attributes to relate to each other. As Hunger and Thirst increased, Energy decreased. As Boredom decreased Hunger and Thirst increased and hence Energy decreased.
Since the pet is a hamster I decided the way to decrease Boredom for this app is for the hamster to play on the treadmill.
The hamster will feed and water itself.
The user has to fill the water bottle and the food dispenser and place the hamster on and off the treadmill
Next I constructed my hamster using the VirtualPetTest and Virtual Test

I ran a test for the methods to get all 6 of the attributes and to override the system address of the Virtual Pet class

Next, I constructed my menu in the Java application

I decided on my menu task and then I ran a test on each menu option using the VirtualPetTest

My results were simple at first. I just needed to make sure the menu worked by returning a message that the task was completed.

For example: If the user chose to fill the water bottle, the application would state that the water bottle was filled.

The game used a simple while loop. The while loop would present the menu until the user chose to do nothing. Then the game would end.

Each menu item number was coded as a string to eliminate data type errors that would stop the game from running due to an user input error.

After all of that tested ok. I added a level of complexity to the game. I added a simple tick that would increase and decrease the attributes based on the choice the user made.
For example if the user chose to fill the water bottle. Thirst decrease and Energy would increase.
(It was at this point I rewrote my menu so that the user could both fill the water bottle and the food dispenser on the same menu item since Hunger and Thirst were directly related).

Then I changed the response to my menu item as well.

I used the tick method to change the attributes Hunger, Thirst, Energy and Boredom.

I also wanted to have some fun with those people who did not enter the correct option. Instead of prompting them to reenter a correct option, I decided to end the game with a message.  I decided on 3 different messages which would be chosen by a random number generator.

I decided to also have some fun with the tick method as well and to do the same with a random generator.

So, the time interval for one would be 1 hour, for two 4 hours, for three 8 hours and for four 24 hours. Based on which random number was generated the tick method would give a different message and do different things to the attributes.

For example, if the random number 4 is chosen for take the hamster off the treadmill... the message the user would received would be that the hamster had been on the treadmill for 24 hours and therefore was depleated of all it's energy and could not eat or drink. It had to be transported to the hamster hospital. Game over.

All of the menu items have a game over option under the tick method therefore there is no need to have a menu option to end the game.


<img src="https://github.com/MozB/Beeline-libgdx-examples/blob/master/beeline-in/img/logo.png" width="120" height="120">

# Beeline-libgdx-examples

Beeline-libgdx is a library to aid flattening the learning curve of  libgdx, utilising Scene2D framework in libgdx it is intended to speed up early development of games and code that can be often boiler plate in  game development.  It's easy to use Beeline to create games from the  simple to the complex.  

Beeline is ideal for bringing a project to life quickly and will also protect you from common pitfalls I faced myself  and learnt to protect myself from over time, such as performance and organisation of my code, and time consuming manual processes that are especially distruptive when coding in your spare time.

Find out more - https://github.com/MozB/Beeline-libgdx

## Examples
**Important:** All examples should be run with the working directory set to **projectRoot/android/assets**
### Hello world! ###
Prints a logo and text to the screen with minimal code and only one core project class! Project ready to be deployed on Android or tested on Desktop. Uses `BeelineActor` and `BeelineLabel`.

Core class: [core/src/org/beelinelibgdx/examples/helloworld/HelloWorldGame.java](core/src/org/beelinelibgdx/examples/helloworld/HelloWorldGame.java)

Desktop Launcher: [desktop/src/org/beelinelibgdx/examples/helloworld/DesktopLauncher.java](desktop/src/org/beelinelibgdx/examples/helloworld/DesktopLauncher.java)
### Actors and nine patches ###
Creates three nine patch buttons using Beeline-libgdx nine patch builder. The 1st is a static nine patch, the 2nd is clickable, the 3rd is clickable and animated with different textures and colours using `BeelineNinePatch`. Also the Beeline-libgdx logo is an example of a static image that is clickable and rotates on click using `BeelineActor`.

Core class: [core/src/org/beelinelibgdx/examples/actorsninepatches/ActorsNinePatchesGame.java](core/src/org/beelinelibgdx/examples/actorsninepatches/ActorsNinePatchesGame.java)

Desktop Launcher: [desktop/src/org/beelinelibgdx/examples/actorsninepatches/DesktopLauncher.java](desktop/src/org/beelinelibgdx/examples/actorsninepatches/DesktopLauncher.java)
### Save game ###
Creates a save game object that saves a single integer that can be incremented by click. The game is automatically saved and the value in the counter persisted in reruns of the game, uses `BeelineGame`.

Core class: [core/src/org/beelinelibgdx/examples/savegame/SaveGame.java](core/src/org/beelinelibgdx/examples/savegame/SaveGame.java)

Desktop Launcher: [desktop/src/org/beelinelibgdx/examples/savegame/DesktopLauncher.java](desktop/src/org/beelinelibgdx/examples/savegame/DesktopLauncher.java)
### Model actor contract ###
Creates some simple random agents that move around the screen randomly and exist for a finite amount of time. The addition and removal of actors are handled completely by the Beeline-libgdx framework using the `ModelAndActorVisibilityContract` with minimal code, whenever a model is added, the associated actor is automatically created and also destroyed when the model is removed from the game. Reducing boilerplate code and making your life as a developer easier.

Core class: [core/src/org/beelinelibgdx/examples/modelactorcontract/ModelActorContractGame.java](core/src/org/beelinelibgdx/examples/modelactorcontract/ModelActorContractGame.java)

Desktop Launcher: [desktop/src/org/beelinelibgdx/examples/modelactorcontract/DesktopLauncher.java](desktop/src/org/beelinelibgdx/examples/modelactorcontract/DesktopLauncher.java)

# Beeline-libgdx-examples

Beeline-libgdx is a library utilising Scene2D framework in libgdx that is intended to take some of the pain out of game development.  It's easy to use Beeline to create games from the simple to the complex.  Beeline is ideal for bringing a project to life quickly without the worry of complex libgdx configuration.

Find out more - https://github.com/MozB/Beeline-libgdx

## Examples
All examples should be run with the working directory set to *projectRoot/android/assets*
### Hello world! ###
Prints a logo and text to the screen with minimal code, project ready to be deployed on Android or tested on Desktop using `BeelineActor` and `BeelineLabel`.

Main class: `org.beelinelibgdx.examples.helloworld.DesktopLauncher`
### Actors and nine patches ###
Creates three nine patch buttons using Beeline-libgdx nine patch builder. The 1st is a static nine patch, the 2nd is clickable, the 3rd is clickable and animated with different textures and colours using `BeelineNinePatch`. Also the Beeline-libgdx logo is an example of a static image that is clickable and rotates on click using `BeelineActor`.

Main class: `org.beelinelibgdx.examples.actorsninepatches.DesktopLauncher`
### Save game ###
Creates a save game object that saves a single integer that can be incremented by click. The save game object can be saved and loaded by the other buttons on screen using `BeelineGame`.

Main class: `org.beelinelibgdx.examples.savegame.DesktopLauncher`
### Model actor contract ###
Creates some simple random agents that move around the screen randomly and exist for a finite amount of time. The addition and removal of actors are handled completely by the Beeline-libgdx framework using the `ModelAndActorVisibilityContract` with minimal code.

Main class: `org.beelinelibgdx.examples.modelactorcontract.DesktopLauncher`

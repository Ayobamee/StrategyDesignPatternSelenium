The "driver" folder houses the browser drivers where the application will be tested against.
Under the "src" folder there are two folders ie "main" and "test" folders. 
The "main" folder has three sub folders ie Abstract Component, Page Component and Page Objects.
The "Abstract component" is used to create a constructor and also stores the webdriver find element methods.
The classes in the "Pagecomponents" imports the abstract class and fetches DOM elements to be used for tests, they also specify the exact actions to be performed which is returned.
The "Page Objects" folder specifies classes that have all the page objects in one class which is also returned for use
The test folder contains the different tests to be run, an instance of a class is initiated here so that they can be used to interact with methods in the Page objects and Page components.
Utilities folder houses the browser properties that could be selected
The resuable folder consists methods that can always be reused eg the sign in class 

Author : Ayobami 

# Dog_Play

API Description:

Steps:

1. I created a Maven project and implemented the necessary dependencies.

2. In the src/main/resources directory, there's a file named application.properties. Inside this file, I established the relationship between the database and the Java code by configuring the database connection.

3. I organized my project into four packages, for developer convenience, with one base package.
   The packages are as follows:

1) model
2) controller
3) exception
4) service
4. I created entity classes for both "dog" and "user" and added all the necessary annotations.

5. In the repository package, I created an interface that extends a JpaRepository interface. This interface is used to retrieve data from the entity classes.


6. POST mapping:
    I have created a POST mapping to allow users to create or post dog details. In the service layer, I've implemented the necessary logic for handling these requests. Additionally, I've organized the data using a table structure in the model package.

One notable feature I've incorporated is validation. This ensures that when users enter irrelevant information or make spelling and grammar mistakes, the API provides helpful suggestions.

7. GET Mapping:
In addition to the POST mapping, I've also implemented a GET mapping, which allows users to retrieve dog details from the API.

8. DELETE Mapping: 
I've included a DELETE mapping that enables users to remove specific dog details from the API.

9. PATCH Mapping: 
Furthermore, I've implemented a PATCH mapping, providing users with the ability to partially update dog details in the API.

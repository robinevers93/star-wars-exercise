# Scala exercise in using an external API 

## Introduction
This repo hosts a Scala exercise in using an external API. The exercise is to create a Scala application that uses the [Star Wars API](https://swapi.dev) to find the name of Luke Skywalker's fastest starship.

## Requirements
The Main class has been written for you and doesn't require any changes. It will call the `StarWars.fastestStarship` method on the name `Luke Skywalker` and print the result to the console.
Your task is to implement the `fastestStarship` method. This method should call the Star Wars API to
1. Retrieve the person with the given name
2. Retrieve the starships for that person
3. Work out which of those starships is the fastest

The method should return the name of the fastest starship.

## Not required
- You don't need to handle timeouts or other unexpected API errors, you can assume that the API will always return a successful response
- You don't need to handle pagination, even though the API does return paginated results, you are allowed to only consider the first page of results

## Getting started
1. Clone this repo
2. Open the project in the IDE of your choice
3. Run the `Main` class
4. You should see the following output in the console:

    ```The name of Luke Skywalker's fastest starship is: Not Implemented```
5. If you see this output, you're ready to start the exercise!

## Tips
- Have a look at the [Star Wars API documentation](https://swapi.dev/documentation) to see how to use it
- You can use any libraries you like to help you complete the exercise, libraries for sending requests and parsing json are added to the `build.sbt`, but these can be swapped out for others if you prefer.

## Submitting your solution
When you're happy with your solution, please zip up the project and email it to the person who sent you the exercise. Please don't submit a pull request to this repo.

## _Good luck! 🚀_
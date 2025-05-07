<div id="top"></div>

# <u>Basic Spring and Maven exercice</u>

## Table of Contents
- [Description](#Description)
- [Technologies Used](#Technologies-Used)
- [Requirements](#Requirements)
- [Installation and Execution](#installation-and-execution)
- [Deployment](#Deployment)
- [Contributions](#Contributions)


## Description

Generate a Spring boo project, at https://start.spring.io/

Import it into Eclipse with the File > Import > Existing Maven Project option.

In the application.properties file, configure the server.port variable with the value 9000.

Convert this application into a REST API:
Depending on the main package, create another subpackage called controller, and inside it, add the HelloWorldController class.

It should have two methods:

String greet
String greet2

These two methods will receive a String parameter called name, and will return the phrase:

“Hello, “ + name + “. You are running a Maven project”.

The first method will respond to a GET request, and must be configured to receive the parameter as a RequestParam. The “name” parameter will have the default value “UNKNOWN”.

It should respond to:

http://localhost:9000/HelloWorld
http://localhost:9000/HelloWorld?name=My name

## Technologies Used

* Java
* Maven
* Spring Boot
* Postman
* HTTP navigator

## Requirements

* Java 22 or higher.

## Installation and Execution

1. 	Install Java 22 or higher on your system.
2.  Download the project.
3.  Import it into IDE
4.  Compile the project using a Java compiler or an IDE.
5.  Run the main class of the project.

## Deployment

The compiled files need to be deployed in the designated location.

## Contributions

We welcome contributions to this project. Please follow these guidelines:

1.  Read this document thoroughly.
2.  Check the open "issues" to see if there are any tasks you can help with or report any bugs you find.
3.  Download a local copy or clone the project to work on it.

	* You can either create a "fork" of the repository or create a new branch to develop your code.
	* Once you are finished, if you want to contribute to the original project, you can submit a "pull request" to request merging your code with the main branch of the repository.

[Back to top](#top)
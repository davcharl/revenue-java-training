# Accenture TAG Training - Cancer Diagnosis Predictor 

Welcome to the TAG training course! This Git repo contains a starter project ready for you to clone. Over the next five days, we'll build it up to be able to do some cool stuff. The aim is to have an app that can feed data into a program that helps doctors diagnose a persons risk of developing cancer using some machine learning magic next week. By the end of this course, you should have a greater understanding of Git, Java, Angular and some basic DevOps.   

Sounds exciting!

This course is perfect for complete **Java newbie's**. If you have previous experience in development, this will act as a great refresher. If not, we'll get you up to speed on the basics of how a Java app works. Each day you'll perform a number of **tasks** to build the application. Before you start a task, you should watch the **Pluralsight** videos listed to give you a bit of background and help you complete the task. 

Some of the things we'll cover:   

  - Setting up you development environment.
  - Working with Git to clone, commit, push and merge.
  - Creating classes with variables, methods and other fun stuff in Java.
  - Creating a front end for our app in Angular to input data from a users perspective.

Lets get started...

---
## Day 1

### Overview

Some of the tools we'll be using today include:

  - **Git** is used to store our code. When we make a change, we want to commit it to Git so that it is saved somewhere safe. Others can then pull down our code and run or modify it. **Throughout the course, we will be committing our code to our own repository**. To do this, we will create a GitHub account and pull down our skeleton project.
  - **Intellij** is the IDE we will be using to write and run our code. It's easy to use and contains everything we need to create and deploy Java applications.
  - **Java** is the language we use to write our code. It is based around the idea of Objects. In our case, a patient that could potentially have a malignant cancer could be a patient object, with a name, date of birth and gender. 

### Pluralsight

Watch the below videos before you attempt the first task:

* [What is Git][what_is_git] - Overview of what Git is and why we use it.
* [Git Hipster Analogy][git_hipster_analogy] - Another way to think about version control systems.
* [Create a GitHub Account][create_a_github_account] - Set yourself up with a brand new Github account (If you already have one, great!). 
* [Basic Git Commands][basic_git_commands] - Basics such as clone, push, pull & branch which you'll need.
* [What is Java][what_is_java] - Overview of Java.
* [JRE & JDK][jre_and_jdk] - A bit more background on Java. Good to know...
* [Creating a Basic Intellij Java Project][creating_a_basic_intellij_java_Project] - Another nice to know to get you familiar with Intellij. We'll be importing our project however.
* [Packages][packages] - Classes are stored in packages. They help to logically organize our code.
* [Variables][variables] - Variables are used in all programming languages to store data.
* [Classes][classes] - Classes are a how we represent our data.
* [Initializing Classes][initializing_classes] - How to create a new object.
* [Methods][methods] - These allow us to perform operations on our classes.
* [Strings][strings] - Strings represent sentences and allow us to represent information.

### Tasks

With the videos watched, we can now move onto the fun part. What we'll be doing today is setting up our development environment, cloning this repo to our local environment and start creating some basic Java classes.

#### Task 1
1. Setup up Git on your local PC.
2. Clone this Git repository to somewhere on your computer.
3. Import the project into Intellij.
4. Run the app. You should see a welcome message in the console screen.

*Hints*
* You can install [Git for Windows] to use Git on your laptop.
* It's a good idea to have a dedicated development folder on your PC. Perhaps C:/development/projects...
* Import the project as a Maven project. We'll come to what Maven is later.

#### Task 2
With the app up and running, we can now write some basic code. In our project, we want to represent patients and their cancer diagnoses. We can do this using classes. These classes will contain multiple fields to represent information.

1. First thing first is to create a branch for our new code. 
2. Create a basic class to represent a ```Patient```. Put this object in a new package.
    1. Name 
    2. Id 
    2. Date of Birth 
    3. Gender
3. Create another class to represent a ```Screening```. Again, store it in a new package.
    1. Screening Id 
    2. Patient Id
    3. Date of Screening
    4. Malignant Result
4. Add a constructor to each class.
5. Add getters and setters for each field.
6. In your main class, create a new instance of each object using some dummy data.
7. Print out the patients name and their diaganosis to the console using a ```String```.
8. Change the ```patientId``` field in ```Screening``` to be an instance of ```Patient```. You will need to update the constructor, getters & setters.
9. Rerun the app and verify the same info is printed to the console.
10. Update the patients name using the setter on the ```Patient``` class. Verify the new name is printed.
10. Merge your changes into your main branch and push it up to Github!

*Hints*
* In most project you have a main branch and your own dev branch. Call the branch something identifiable, such as john_doe_dev.
* Switching to a new branch is easy. Simply use ```git checkout -b <branch>```
* Packages help logically organize our code. You can either create a package called models for both classes or better yet a new package for each.
* [Naming] is important in Java. i.e. ```Patient``` class goes into the ```patient``` package. 
* ID fields are normally of type ```Integer```, i.e. 1, 2, 3...
* Date's can be represented using the ```LocalDate``` type.
* Gender can be easily represented using [Enums]
* Constructors, getters and setters can be automatically [generated] by Intellij to save a lot of typing!

[what_is_git]: <https://app.pluralsight.com/course-player?clipId=3fd2f988-28c6-4cbb-8851-94de23080b51>
[git_hipster_analogy]: <https://app.pluralsight.com/course-player?clipId=e9ff6152-e93f-4b08-89eb-3788cf4d58ce>
[create_a_github_account]: <https://app.pluralsight.com/course-player?clipId=0fba4e77-ad72-405f-bb1e-042a6de673cc>
[basic_git_commands]: <https://app.pluralsight.com/course-player?clipId=acfe96df-3bb7-49a7-8054-9e3d72e2c638>
[what_is_java]: <https://app.pluralsight.com/course-player?clipId=f7a9fd0c-1ee8-4628-b21c-ef5a3d246f72>
[jre_and_jdk]: <https://app.pluralsight.com/course-player?clipId=da83e7db-4c5e-4307-aad5-0826861155e2>
[creating_a_basic_intellij_java_Project]: <https://app.pluralsight.com/course-player?clipId=7e4f3268-9649-4891-bfe1-58764e5e11e9>
[variables]: <https://app.pluralsight.com/course-player?clipId=11a5bc5d-1099-43c5-b773-43045ed9bf0e>
[classes]: <https://app.pluralsight.com/course-player?clipId=6643ae8b-28b6-41fb-bba4-569ef4731e36>
[initializing_classes]: <https://app.pluralsight.com/course-player?clipId=3e20bd6d-313e-457a-9d32-50a7b07fa095> 
[methods]: <https://app.pluralsight.com/course-player?clipId=749e618f-c96d-4bd4-b189-40de5ace3cc2>
[strings]: <https://app.pluralsight.com/course-player?clipId=51951ff1-78df-4253-841d-7e8fe9e5fc8c>
[git_for_windows]: <https://git-scm.com/download/win>
[packages]: <https://app.pluralsight.com/course-player?clipId=19f914da-1abe-47dd-baf7-6018d4a14e07>
[localdate]: <http://tutorials.jenkov.com/java-date-time/localdate.html>
[naming]: <https://www.javatpoint.com/java-naming-conventions>
[enums]: <https://app.pluralsight.com/course-player?clipId=b0f36740-9708-4229-a7cd-ddaaf0ccbf86>
[generated]: <https://www.jetbrains.com/help/idea/generating-code.html>
---
## Day 2

### Overview

Yesterday we focused on creating classes with some fields to hold our data. Today we will be exploring more of the features that Java provides to do some cool stuff with our classes. Some of these features we'll cover include:
  - **Conditional Logic** also known as if-else statements are used to make decisions if something is true or false. 
  - **Loops** give us the ability to iterate over these arrays and other collections to perform operations on them.
  - **Arrays** allow us to store multiple objects together.
  - **Methods** are a core part of classes in Java. They allow us to perform operations on our objects. 

### Pluralsight

Again, watch the below videos before you attempt the first task:

* [Conditional Logic][conditional_logic] - What is conditional logic in Java.
* [If-Else Statements][if_else_statements] - Most commonly used way of making decisions in Java.
* [Logical Operators][logical_operators] - We use logical operators to make decisions in our conditional logic. i.e. is 1 == 1, true.
* [Switch][switch] - Similiar to an if-else statement, but more appropiate in certain contexts. 
* [Arrays][arrays] - Way of storing multiple objects in a group.
* [Lists][lists] - A type of collection similiar to an array but with additional functions.
* [Loops][loops] - How to loop over a list of objects.
* [For-each Loop][for_each_loop] - Handy way of looping over objects.
* [Equality][equality] - For when you're trying to find a match between two objects.
* [Null][null] - Objects that have no data are null.

### Tasks

Again, we'll be applying some of what we've learnt in the above videos to our project. What we want to do today is add some verifications to make sure there aren't any mistakes in our logic. We can do this using conditional logic. We also want to leverage the power of collections so that we can process multiple objects, such as a list of screenings.

#### Task 1
1. First things first, check your project from yesterday is still working!
2. Create a new class called ```ScreeningService``` in the service package.
    1. Give the class a default constructor.
    2. Add a method in the new class that accepts a ```Screening``` & ```Patient``` as parameters. The method should return true or false depending on if the screening is for the specified patient.
3. In your main class, instantiate the ```ScreeningSerivce```. 
4. Pass in a screening and patient and capture the result. With the result, print a message stating wheter the screening matches the patient or not.

#### Task 2
1. Create a few new ```Patient``` objects 
2. Also create a few corresponding ```Screening``` objects for each patient.
3. Create a ```List``` of screenings and add each screening to that list.
4. Using a loop, iterate over the list of screenings and print out the patients name and their screening result (like below).

#### Task 3
Now we're going to clean up our code by moving what we've written so far into seperate classes. 
1. Start by creating a ```ScreeningDatabase``` class to hold all our ```Patients``` and ```Screenings```. 
2. Add a new public method to this class to return a list of all the screenings.
3. Update the ```ScreeningService``` class and its constructor to take a ```ScreeningDatabase``` as an argument. Assign it to the class. 
5. Finally, add a third method to the ```ScreeningService``` to print the result of a screening.
6. In your main class, create a new ```ScreeningDatabase``` object and pass it into the ```ScreeningService```.
7. Update your existing screening list to now fetch all the screenings from this service.
8. Update the ```for-each loop``` to now call the ```ScreeningService``` to print the result. 
9. Remove any redundant code and check everything works the same way that it did in **Task 2**.

```sh
Screening for patient Joe, returned a malignant result of false
Screening for patient Debbie, returned a malignant result of false
Screening for patient John, returned a malignant result of true
Screening for patient Cathy, returned a malignant result of true
Screening for patient Bob, returned a malignant result of false
```

**Extra points**
If you've finished the above, congrats! Here's one last challenge:
1. Add a second method to the ```ScreeningService``` class that takes a name, loops over all the screenings and returns the matching ```Screening```. If no match is found, return null.
2. In your main class, call this new method to get a ```Screening``` back for a name.
3. If the ```Screening``` you get back is not null, print the name and the screening result. Else, print a message stating that no screening was found.

[conditional_logic]: <https://app.pluralsight.com/course-player?clipId=08c83d54-1d3e-456a-b122-cb3673f607b3>
[if_else_statements]: <https://app.pluralsight.com/course-player?clipId=a8930d13-7598-4dd4-b2c6-6b7b0af0f90a3>
[logical_operators]: <https://app.pluralsight.com/course-player?clipId=967235c1-a424-41a4-9918-f9646086ee10>
[switch]: <https://app.pluralsight.com/course-player?clipId=25d15753-fb1b-4fe8-a8e6-38224b46dab8>
[lists]: <https://www.geeksforgeeks.org/list-interface-java-examples/>
[loops]: <https://app.pluralsight.com/course-player?clipId=3ba624b3-c92c-448c-b7ee-c049d6efaf56>
[arrays]: <https://app.pluralsight.com/course-player?clipId=03ae8d9a-388d-4b66-a5e3-d07ea816ea33>
[for_each_loop]: <https://app.pluralsight.com/course-player?clipId=212fb6c9-95bd-4f6b-8a26-11057209fae0>
[equality]: <https://app.pluralsight.com/course-player?clipId=f2819dd2-aff3-4151-b518-4c0567420bec>
[null]: <https://app.pluralsight.com/course-player?clipId=c7af73fd-11f5-4f01-910e-e1b26c3e6268>

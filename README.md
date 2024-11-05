# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 


> As an veterinarian, <br> 
> I want to I want to learn the names of different dog breeds, <br> 
> so that I can pass my test on identifying dogs and their breed.

## Dataset 

 [Dog_breeds data set](https://www.kaggle.com/datasets/marshuu/dog-breeds/data)

- **Breed** (String) - breed of dog
- **Longevity (yrs)** (int) - lifespan of the dog in years
- **Common Health Problems** (double) - Most common health problem for the dog

## UML Diagram 


![UML Diagram](image.png)

## Description 

Write a description of your project here. In your description, include as many vocab words from our class to explain your User Story, the chosen dataset and how your project addressed that users goals. If your project used the Scanner class for user input, explain how the user will interact with your project.

Our project is about analyzing data about various dog breeds to help my goal as a veterinarian to learn the different breeds and pass my test. It specifically analyzes their breed names, life expectancies, and common health issues. It takes breed information from three files (breeds, lifespan, health problems) and creates Dogs objects for each breed, and stores them in an array. This project allows a user to view all dog data from this data set we found from kaggle.com ([Dog_breeds data set](https://www.kaggle.com/datasets/marshuu/dog-breeds/data)) and enter a specific health issue to find out how many breeds are affected by it, and receive a count of breeds with that issue. The toString method in the UserStory class is used to display all the information about each dog breed, allowing users to quickly see details like the breed's name, life expectancy, and common health issues. This information is stored in a private Dogs[] dog; array, a 1D array that holds Dogs objects, each representing a different breed and its associated data. The Scanner class is used to prompt the user to enter a health issue, which is then read as input and returned. This input is later used to count how many dog breeds share that specific health issue.This project helped my goals because I was able to learn about 117 more dog breeds in addition to their lifespan and common health problems.

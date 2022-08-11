## Problem Statement: Find total number of pairs in an array of given difference ##

**Given an array of numbers, find the count of total number of pairs in an array having given difference. The given difference should not be negative**
   
**This exercise contains a class named PairsCounter with the following methods:**

    +inputAcceptor() : void
        -Should accept inputs from the console 
        -Should call inputDifferenceValidator method with given difference
        -Should call inputArrayLengthValidator method with given array length
        -Should call displayResult method with "Give proper difference greater than or equal to zero" as argument based on validations of inputDifferenceValidator method       
        -Should call displayResult method with "Give proper length of input array" as argument based on validations of inputArrayLengthValidator method       
        -Should call computePairsCount method if inputs are valid 
------------------------------------------------------
    +inputDifferenceValidator(int) : boolean
        -Should accept input as and check given input is greater than equal to zero
        -Should return true if given input is valid otherwise false
------------------------------------------------------
    +inputArrayLengthValidator(int) : boolean
        -Should accept input as int and check given input is a positive integer 
        -Should return true if given input is valid otherwise false
------------------------------------------------------
    +computePairsCount(int[],int) : String
        -Should get int array and difference as inputs and return result as String 
        -Should return message "Give proper input array not null" if given array as null 
        -Should return like "2 pairs are found with the given difference" based on count of total number of pairs of that difference
------------------------------------------------------
    +displayResult(Object) : void
        -Should accept any input and print it

## Example
    Sample Input:
    2
    4
    1 2 3 4
    
    Expected Output: 
    2 pairs are found with the given difference
--------------------------------------------------------
    Sample Input:
    0 
        
    Expected Output:
    Give proper difference greater than or equal to zero
--------------------------------------------------------
    Sample Input:
    4
    0 
        
    Expected Output:
    Give proper length of input array 

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding

package com.basic_exercise.practicoprogramacionbasica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * FrontEnd Developer - Test Automation engineer, Jr
 * @author Steven Cardona Betancur
 */
public class PracticoProgramacionBasica {
        static ArrayList<Integer> recentOptions = new ArrayList<Integer>();

    public static void main(String[] args) {
         Scanner inputValue = new Scanner(System.in);
        int optionMenu;
        boolean existError = false;
      
        do{
           try{
                showMenu();
                System.out.println("Select Option");
                optionMenu = inputValue.nextInt();
                
                System.out.println("Option: " + optionMenu);
                
                switch (optionMenu) {
                   case 1:
                      System.out.print("Select: M is Male or F is Female; ");
                      String gender =  inputValue.next().toLowerCase();
                      boolean result1 = isFemaleORMale(gender.charAt(0));
                      addInRecentsOptions(optionMenu);
                      System.out.println("Result is: " + result1);
                       break;
                       
                   case 2:
                      System.out.println("Write the values for array");
                      ArrayList<Integer> arrayIntegers = new ArrayList<>();
                      boolean finish = false;
                      int numItem = 0;
                      do{
                          System.out.print("Item " + numItem + ": ");
                           int value = inputValue.nextInt();
                           arrayIntegers.add(value);
                           System.out.print("Other value? S/N ");
                           String isIntoOtherValue = inputValue.next().toLowerCase();
                           
                           if(isIntoOtherValue.equals("n")){
                               finish = true;
                           }
                           
                           numItem++;
                      } while (finish == false);
                      
                      boolean result2 = sumOfArrayToExpectResultEven(arrayIntegers);
                      addInRecentsOptions(optionMenu);
                      System.out.println("Result " + result2);
                      break;
                      
                   case 3:
                      System.out.println("Write the values for array");
                      ArrayList<Integer> array2Integers = new ArrayList<>();
                      boolean isFinish = false;
                      int numOfItem = 0;
                      
                      do{
                           System.out.print("Item " + numOfItem + ": ");
                           int value = inputValue.nextInt();
                           array2Integers.add(value);
                           System.out.print("Other value? S/N ");
                           String isIntoOtherValue = inputValue.next().toLowerCase();
                           
                           if(isIntoOtherValue.equals("n")){
                               isFinish = true;
                           }
                           
                           numOfItem++;
                      } while (isFinish == false);
                      
                      boolean result3 = validateArrayContainTwoItemsEven(array2Integers);
                      addInRecentsOptions(optionMenu);
                      System.out.println("Result " + result3);
                       break;
                       
                   case 4:
                           System.out.println("Write two words: ");
                           
                           System.out.print("Word 1: " );
                           String word1 = inputValue.next();
                           System.out.print("Word 2: ");
                           String word2 = inputValue.next();
                           
                           boolean result4 = validateWords(word1, word2);
                           addInRecentsOptions(optionMenu);
                           System.out.println("Result " + result4);
                       break;
                       
                    case 5:
                           System.out.println("Write an integer number: ");
                           String numberInteger = inputValue.next();
                           
                           boolean result5 = checkNumberIsCapicua(numberInteger);
                           addInRecentsOptions(optionMenu);
                           System.out.println("Result " + result5);
                       break;
                    
                   case 6:
                           System.out.println("Write a number A: ");
                           int numA = inputValue.nextInt();
                           
                           System.out.println("Write a number B: ");
                           int numB = inputValue.nextInt();
                           
                           boolean result6 = findBiggerNum(numA, numB);
                           addInRecentsOptions(optionMenu);
                           System.out.println("Result " + result6);
                       break;
                       
                   case 7:
                       System.out.print("Write a first number: ");
                       double value1 = inputValue.nextDouble();
                           
                       System.out.print("Write a second number: ");
                       double value2 = inputValue.nextDouble();
                           
                       boolean result7 = multiplyAndDivide(value1, value2);
                       addInRecentsOptions(optionMenu);
                       System.out.println("Result " + result7);
                       break;
                       
                   case 8:
                     
                      ArrayList<Integer> arrayA = new ArrayList<>();
                      ArrayList<Integer> arrayB = new ArrayList<>();
                      boolean isFinishArrayA = false;
                      boolean isFinishArrayB = false;
                      
                      numOfItem = 0;
                       System.out.println("Write the values for array A");
                      do{
                           System.out.print("Item " + numOfItem + ": ");
                           int value = inputValue.nextInt();
                           arrayA.add(value);
                           System.out.print("Other value? S/N ");
                           String isIntoOtherValue = inputValue.next().toLowerCase();
                           
                           if(isIntoOtherValue.equals("n")){
                               isFinishArrayA = true;
                           }
                           
                           numOfItem++;
                      } while (isFinishArrayA == false);
                      
                      numOfItem = 0;
                       System.out.println("Write the values for array B");
                      do{
                           System.out.print("Item " + numOfItem + ": ");
                           int value = inputValue.nextInt();
                           arrayB.add(value);
                           System.out.print("Other value? S/N ");
                           String isIntoOtherValue = inputValue.next().toLowerCase();
                           
                           if(isIntoOtherValue.equals("n")){
                               isFinishArrayB = true;
                           }
                           
                           numOfItem++;
                      } while (isFinishArrayB == false);
                      
                      boolean result8 = checkValuesOfTwoArrays(arrayA, arrayB);
                      addInRecentsOptions(optionMenu);
                      System.out.println("Result " + result8);
                       break;
                       
                   case 9:
                      System.out.println("Write any word: ");
                       String initialWord = inputValue.next();
                       
                       String result11 = invertWord(initialWord);
                       addInRecentsOptions(optionMenu);
                       System.out.println("Result " + result11);
                       
                       break; 
                       
                   case 10:
                      System.out.println("Write any word: ");
                      String word = inputValue.next();
                      String letter = "x";
                      
                      String result10 = replaceLetters(word, letter);
                      addInRecentsOptions(optionMenu);
                      System.out.println("Result " + result10);            
                       break; 
                       
                   case 11:
                      System.out.println("The five recents options by code are: " + recentOptions.toString());
                       break;
                       
                   case 12:
                      System.out.println("Copy an Paste in your browser this link");
                      System.out.println("https://github.com/stevencar2004/Course_TestAutomation");
                      addInRecentsOptions(optionMenu);
                       break;
                       
                   case 13:
                       throw new ExcepcionExit("New Throw Error - Exit Execution");
                       
                   default:
                       System.out.println("Try Again! Option not valid...");
               }
                
           } catch(ExcepcionExit e) {
               existError = true;
               System.out.println("GooBye!");
           } catch(Exception e) {
               System.out.println("Several Error!");
               existError = true;
           } 
         
        } while (existError == false);      
    }
    
    public static void showMenu(){
        System.out.println("---------------- Menu ----------------");
        System.out.println("  1) Is Female or Male?");
        System.out.println("  2) The sum of three items of array is even");
        System.out.println("  3) The array of integers contains a even item?");
        System.out.println("  4) Two words are equals?");
        System.out.println("  5) A integer is capicúa?");
        System.out.println("  6) A is smaller than B");
        System.out.println("  7) The multiply between A and b is equal of the division between A and B");
        System.out.println("  8) Two items of the array A exist in array B?");
        System.out.println("  9) Return the word inverted");
        System.out.println(" 10) Replace all vowels of the word by 'x' ");
        System.out.println(" 11) Print the last five exercises");
        System.out.println(" 12) View the exercise in the repository in Github");
        System.out.println(" 13) Exit...");
        System.out.println("------------------------------------------------");
    }
    
    public static boolean isFemaleORMale(char gender){
        return gender  == 'f' || gender == 'm';
    }
    
    public static void addInRecentsOptions(int option){
        if(recentOptions.size() >= 5){
            recentOptions.remove(0);
        }
        recentOptions.add(option);
    }

    public static boolean sumOfArrayToExpectResultEven(ArrayList<Integer> arr){
         int sum;
         
        if(arr.size() >= 5) {
            sum = arr.get(2) + arr.get(3) + arr.get(4);
            
            if(sum % 2 == 0) return true;
        }
        return false;
    }

    public static boolean validateArrayContainTwoItemsEven(ArrayList<Integer> arr){
        int amountItemsEven = 0;
        
        for (Integer integer : arr) {
            if(integer % 2 == 0){
                amountItemsEven++;
            }
            if(amountItemsEven >= 1) break;
        }
        return amountItemsEven >= 1;
    }
    
    public static boolean validateWords(String word1, String word2){
        return word1.equals(word2);
    }

    public static boolean checkNumberIsCapicua(String number){
         int middle = Math.round((number.length()) / 2);
         
         String itemsForLeft = (number.length() % 2 == 0) ? number.substring(0,middle) : number.substring(0,middle+1);
         String itemsForRigth = number.substring(middle);
 
         String reverse = new StringBuffer(itemsForRigth).reverse().toString();
         
         return itemsForLeft == reverse;
    }
    
    public static boolean findBiggerNum(int numA, int numB){
        return numA < numB;
    }

    public static boolean multiplyAndDivide(double num1, double num2){
        double multiply = num1 * num2;
        double divide = num1 / num2;
        
        return multiply == divide;
    }
    
    public static boolean checkValuesOfTwoArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
         int amountItemsEven = 0;
        
        for (Integer integer : arr1) {
            if( arr2.indexOf(integer) >= 0){
                amountItemsEven++;
            }
            if(amountItemsEven >= 2) break;
        }
        return amountItemsEven >= 2;
    }
    
    public static String invertWord(String word) {
           return  new StringBuffer(word).reverse().toString();
    }
    
    public static String replaceLetters(String word, String letter) {
         String newWord = word;

         newWord = newWord.replace("a", letter);
         newWord = newWord.replace("e", letter);
         newWord = newWord.replace("i", letter);
         newWord = newWord.replace("o", letter);
         newWord = newWord.replace("u", letter);

        return newWord;
    }
}


/*
    New kind of Error - Exit the program
*/
class ExcepcionExit extends Exception {
    public ExcepcionExit(String msg) {
        super(msg);
    }

    ExcepcionExit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
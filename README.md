# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get display on this README.

![UML Diagram for my project]
https://docs.google.com/drawings/d/11_JW6l59-moCWrk8t9PUMz1v1W_efwjZ3yeSlpQ9vzs/edit?usp=sharing
## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

([youtube-URL-here](https://youtu.be/CVkbl5nUCJE ))

## Project Description

Write a description of the goal and/or problem that your application. Include descriptions of what text is being analyzed, either if its text files you are using to interpret text an how the user interacts with your project.

The goal of my application is to translate English words into Korean words based off of the user-input. The user enters an English sentence where the program will process the word and provide the Korean translation. The Translation class is what loads the English-Korean word from the text file and uses text-matching to find the translations in the two ArrayLists. The Text Processor class is what reads the text file and stores each entry as a line in an ArrayList where the program structures the words during the translation. The user can also type in "exit" and the program will print out "Goodbye" as it closes the scanner and ends the session.
## NLP Techniques

Write a description of what natural lanugage technique (NLP) you implemented in your project. State which methods in your project are associated with this, and a brief explanation of how those methods word and how they are necessary in the NLP technique. 

I implemented text segmentation where an English sentence is broken down into individual words and each word is matched with its corresponding Korean translation. The method of translateSentence(String sentence) uses a sentence.split() to split the input sentence into an array of wrods based on the spaces. This allows the prgram to analyze each word individually and look up its translation. The method of englishWords.indexOf(words[i]) is also used to find the position of each word in the englsihWords ArrayList iin which it allows quick translation. The loadDictionary(String filename) is used to read the text file and seperate the Englsih words from its Korean words. This method plays a role in making the text file being able to function for the translation.
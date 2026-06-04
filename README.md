Student Grade Calculator

Java Project 2 

About The Project
A console-based Java application that takes marks of multiple subjects as input, calculates the total marks, average percentage, assigns a grade, and displays a formatted report card.
This project demonstrates core Java concepts:

Variables & Data Types
Loops (for, while)
Arithmetic Operations & Type Casting
Conditional Statements (if-else ladder)
Arrays
Input Handling with Scanner
Formatted Output with printf


 Features

✅ Enter any number of subjects dynamically
✅ Input validation — rejects marks outside 0–100 range
✅ Calculates total marks and average percentage
✅ Detects best and weakest subject automatically
✅ Per-subject Pass/Fail status
✅ Grade assigned based on average percentage
✅ Clean, formatted report card output


Project Structure
StudentGradeCalculator/
│
├── StudentGradeCalcualtor.java    # Main source file
└── README.md                      # Project documentation

How To Run
Prerequisites

Java JDK 8 or above installed
Any IDE (IntelliJ IDEA, VS Code, Eclipse) or Terminal

Steps
1. Compile the file
bashjavac StudentGradeCalcualtor.java
2. Run the program
bashjava StudentGradeCalcualtor

Sample Output
-----------------------------------
    STUDENT GRADE CALCULATOR
-----------------------------------
Enter Student Name: Rahul Sharma
Enter number of subjects: 3
Enter name of Subject1: Mathematics
Enter marks of Subject1: 92
Enter name of Subject2: Science
Enter marks of Subject2: 85
Enter name of Subject3: English
Enter marks of Subject3: 73

-----------------------------------------
         GRADE REPORT CARD
-----------------------------------------
Student Name  : Rahul Sharma
Total Subjects: 3
----------------------------------------
Subject              Marks
----------------------------------------
Mathematics          92 / 100  [Pass]
Science              85 / 100  [Pass]
English              73 / 100  [Pass]
----------------------------------------
Best Subject  : Mathematics (92)
Weak Subject  : English (73)
----------------------------------------
Total Marks   : 250 / 300
AvgPerc       : 83.33%
Grade         : A
Remarks       : Excellent
Status        : PASS ✓
-----------------------------------------

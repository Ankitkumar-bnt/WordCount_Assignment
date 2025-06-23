# 🔤 Word Count from Given Input File

This Java console application reads a text file from a provided path, counts the **occurrences of each character**, and prints them grouped in the following order:

1. **Alphabets** (sorted A–Z, case-insensitive)  
2. **Digits** (sorted 0–9)  
3. **Special Characters** (sorted by ASCII value)  
4. If any section has no characters, it prints `Nil`

---

## 🚀 Features

- Reads text from a file
- Counts character occurrences using Java Collections
- Displays sorted output by character group
- Handles empty inputs or missing character types gracefully

---

## 🛠 Technologies Used

- Java 21+
- Java Collections:
  - `Map`, `HashMap`, `TreeMap`
  - `List`, `ArrayList`

---

## ✅ Prerequisites

Before running the project, make sure you have:

- Java JDK 21+
- `javac` and `java` configured in your system's environment variables
- A text file (`.txt`) that you want to process
- Both `.java` files placed in the same folder **and without any package declarations**

---

## ▶️ How to Compile and Run (via Command Prompt)

You should have:
- git clone https://github.com/Ankitkumar-bnt/WordCount_Assign_1.git
- cd WordCount_Assign_1
- Open command propmpt
- `javac CharacterOccurrenceHelper.java` (compile healper class)
- `javac FindOccurenceOfCharFromString.java` (compile main class)
- `java FindOccurenceOfCharFromString` (run main class)

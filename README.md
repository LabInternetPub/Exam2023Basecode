# Code for Exam course 2023-2024
The final exam of Internet Applications Lab will be based on this code. We recommend you to get familiar with the code before the exam.
To do so, you can practice adding a new fancy query about the users or the notes, add a method to modify one entity (or class), or add a new 
entity (class) to the domain with a relationship with the existing ones. 

## Before you begin
* Read this file carefully
* BEFORE **touching** the code, run the application and see it working on your computer. You may also want to run the tests in *Notes2324ApplicationTests*
  to see them pass. There is a set of tests for each question in a separate file. They should fail until you implement the corresponding exercise.
* You have example calls in the file "resources/notes.http," but it might be easier to use the **swagger** documentation at http://localhost:8080/swagger-ui.html
* You have the h2-console enabled at http://localhost:8080/h2-console. The database is in memory, and it is created every time you run the application.
* When attempting to answer the questions, modify the code in small steps and try the application (run it) after every step. In this way, it is easier to track possible errors
* A code that doesn't compile or run will be marked with zero points
* All the questions are independent and can be answered in any order. So, if you get stuck on a question, attempt to answer another one.
* Read the questions and the TODOs
* In the code, you'll see **TODO**s where you must insert new code. TODOs explain what you need to do and may contain some clues. TODOs are numbered according to the question number. When a question has more than one TODO, they are
  numbered TODO X.1, TODO X.2, ..., where X is the question number. There are few TODOs that don't need any code, and they are there to explain code relevant to the question (and its answer)
* Please,
  don't delete the TODOs from the code.

#### TODOs in Intellij
In Intellij, you can see all the TODOs in the TODO tool window. You can open it using the menu View -> Tool Windows -> TODO.
It is a good idea to use this tool window to track the TODOs you must do. You can also navigate to the TODOs in the code from this window.

## The domain. Taking and Sharing Notes
In this application, **users** can create and edit **notes** as well as give permission to view and/or edit notes to other users.
Notes have a title, content, creation date, and tags list. **Tags** are identified by their name (string) that can be used to classify notes.

The relationship between users (owners) and notes is implemented as a @OneToMany relationship. It means that notes have a reference to their owner. See that the
Note class implements the method isOwner(userId) that returns true if the given user is the note owner. You may want to use this method in Question 4.

A **NotePermission** is a class that represents a user's permission over a note. A NotePermission has a user (the user that has permission),
a note (the note that the user has permission to see and/or edit), and two booleans representing the permissions (view and/or edit). See that
the user and the note with an embedded id identify this class. The note's owner is the only one that can grant permissions.

The **data.sql** file contains some data to test the application. If you change it, some tests may fail. There are users, notes, tags, and permissions.

You also have test suites that you can run to check whether your code is correct. Tests can help you to see if your code is correct, but passing the tests doesn't
necessarily mean that your code is correct.

## Questions
Each question is independent of the others. You can answer them in any order. You will get two points for each question correctly answered.

TBA... 

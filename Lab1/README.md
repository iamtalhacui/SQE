# Software Quality Engineering

## Lab1 Tasks
* Name : Muhammad Talha
* Reg-No: FA23-BSE-076 (6B)

### Lab Task 1:
#### Test Cases
I tested the program by changing one thing at a time and observing what happened.
Here are our 3 failure test cases and 3 non-failure test cases:

**Failure Test Cases (Actual output does NOT match expected output):**

| Test Case | Expected Output | Actual Output | Result |
| :--- | :--- | :--- | :--- |
| "Wrong grade stored (c1.grade = ""B"" instead of ""A"")" | Grade is: A | Grade is: B | FAIL |
| Missing course name (courseName never set) | Course Name is: OOP | Course Name is: null | FAIL |
| Wrong operator in marks formula (score * score not score * 10) | Marks = 50 | Marks = 25 | FAIL |

**Non-Failure Test Cases (Actual output matches expected output):**

| Test Case | Expected Output | Actual Output | Result |
| :--- | :--- | :--- | :--- |
| Correct name: Ali | Student Name is: Ali | Student Name is: Ali | PASS |
| Correct grade: A+ | Grade is: A+ | Grade is: A+ | PASS |
| Correct course: OOP | Course Name is: OOP | Course Name is: OOP | PASS |

#### Code
The full working Java code for Lab Task 1 has been uploaded to GitHub. Here in the link below:
https://github.com/iamtalhacui/SQE/tree/main/Lab1

---

### Lab Task 2:
In this task I wrote code according to given information which is uploaded on github and identified failure and non-failure test cases

#### Test Cases
We tested the findLength() method by checking correct results and then deliberately breaking the formula to see what goes wrong.

**Failure Test Cases (Actual output does NOT match expected output):**

| Test Case | Expected Output | Actual Output | Result |
| :--- | :--- | :--- | :--- |
| Wrong operator: used + instead of - in the formula | Length = 5.0 | Length = 7.81 | FAIL |
| Forgot Math.sqrt() (returned raw sum of squares) | Length = 5.0 | Length = 25.0 | FAIL |
| getXCord() returns yCord by mistake (wrong getter) | Length = 5.0 | Length = 4.0 | FAIL |

**Non-Failure Test Cases (Actual output matches expected output):**

| Test Case | Expected Output | Actual Output | Result |
| :--- | :--- | :--- | :--- |
| "Points (0,0) → (3,4) 3-4-5 triangle" | Length = 5.0 | Length = 5.0 | PASS |
| "Points (2,5) → (8,5) horizontal line" | Length = 6.0 | Length = 6.0 | PASS |
| "Points (3,3) → (3,3) same point" | Length = 0.0 | Length = 0.0 | PASS |

#### Code
All three classes (Point, Line, and the runner) are written in a single Java file called LabTask2.java.
The code has been uploaded to GitHub at the link below:
https://github.com/iamtalhacui/SQE/blob/main/Lab1/src/LabTask2.java

---

### Lab Task 3:
Here are some of small defects that I found in CUONLINE system :
* Forgot password button does not exists  :  There should be a forgot password button so students can reset their own passwords after verification.
* Logout button hard to find  — there is no clear logout button on the main screen, students have to search for it.
* Notification bell shows old alerts  — the notification icon keeps showing unread alerts even after you have already read them.

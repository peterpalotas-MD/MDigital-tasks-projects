# Apprenticeship Projects Collection

A collection of self contained Java and Web projects completed during the Manchester Digital bootcamp. These tasks range from fundamental logic exercises to optimized algorithmic solutions.

## 🌟 Highlighted Projects

### **[Amount as Coins (Dynamic Programming)](./amountAsCoinsDP/)**
A dynamic solution to the "Change Making Problem." It uses **Dynamic Programming** to find the minimum number of coins needed for a given amount. By building a DP table, the algorithm avoids the issues of a greedy approach (which doesn't always find the optimal solution for arbitrary coin sets).

### **[Sum of Sequence (O(1) Complexity)](./sumOfSequenceWithSteps(O(1))/)**
The most efficcient implementation for summing an arithmetic sequence with a given step.
While a normal solution would iterate through the range in $O(n)$ time, this would mean runtime would scale with input size.
My solution uses the **Arithmetic Series Formula** (Gaussian sum with steps) to calculate the result in **$O(1)$ constant time**, making it capable of handling massive ranges instantaneously at the same speed as small ranges.

### **[Fibonacci (Memoization)](./fibonacciDP/)**
Calculates the $n$-th Fibonacci number using **Dynamic Programming with Memoization**. This turns the standard recursive $O(2^n)$ exponential time complexity into a performant $O(n)$ linear time complexity by caching previously computed results in a `HashMap`. I'd liek to make a note that **Dynamic programming is NOT NESCCECCARRY** for this problem. I chose to use it to demonstrate my abilities and stretch myself.

### **[Divisible By (Modular Arithmetic)](./divisibleBy/)**
A solution that identifies numbers whose prime factors are exclusively 3 and 5. It uses **modular arithmetic** and recursive division to efficiently filter numbers.

### **[Roman Numeral Converter](./romanNeumarelToInt/)**
A small tool that converts integers to Roman numerals. It uses a **greedy algorithm** with a mapped lookup table of values and symbols to accurately construct the string representation.

### **[Currency Converter (JS/HTML/CSS)](./currencyConvJS-CSS-HTML/)**
A simple web application that performs live currency conversion. It shows my ability to use what we learnt in session 9 using **Asynchronous JavaScript (`async/await`)** to fetch exchange rates from an external API, coupled with dynamic DOM manipulation.

### **[Parking Charges (Modular Logic)](./parkingCharges/)**
An approach to calculating parking fees that vary by the hour. Using a **`TreeMap`** and its **`floorKey`** method, the solution has a  modular lookup system that maps time ranges to specific costs. This design allows for easy adjustments to the pricing and shows a data driven approach to complex conditional logic.

---

## 🛠️ Smaller Logic & Utility Projects

*   **[Seven Boom](./sevenBoom/)**: An algorithm that searches for the digit '7' within an array of integers by extracting digits using modular division.
*   **[ASCII Library](./ascii-library/)**: A project that sorts a list of books by their "complexity," defined as the sum of the ASCII values of the characters in their titles.
*   **[Bouncing Ball](./bouncingBall/)**: A very simple simulation that calculates how many times a ball passes a specific window height as it bounces.
*   **[Football Scores](./footballScores/)**: A sports logic task that calculates league points (3 for a win, 1 for a draw) from an array of match result strings.(Done with paired programming)
*   **[Golf Score](./golfScore/)**: A script that translates golf strokes and par into their official terminology (Eagle, Birdie, Bogey, etc.).
*   **[Rock Paper Scissors](./rockPaperScissors/)**: A CLI based implementation of the classic game with a computer opponent and score tracking.
*   **[String Calculator](./stringCalculator/)**: A calculator that parses space separated strings, handles basic arithmetic, and includes exception handling for negative numbers.
*   **[Password Checker](./passwordChecker/)**: A validation tool using **Regular Expressions (Regex)** to enforce password strength requirements.
*   **[FizzBuzz Extension](./fizzBuzzandExtension/)**: An implementation of the FizzBuzz challenge with an extended functionality to optionally handle custom ranges(Paired programming).
*   **[Salaries](./salaries/)**: Refactored a provided salary calculator to use functions instead of writing in the mainline.
*   **[Celsius Converter](./celsiusConverter/)**: An extremely simple utility for bi directional temperature conversion between Celsius and Fahrenheit.
*   **[Weekly Routine](./weeklyRoutine/)**: A very basic scheduler using switch statements to map tasks to specific days of the week.

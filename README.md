# Pi Approximator

This application calculates the value of Pi using a numerical method based on dividing the radius of a quarter circle into `N` parts, calculating the Y coordinates, and then calculating the lengths of the chords between adjacent points. The total sum of the chord lengths is multiplied by 2 to approximate the value of Pi.

## Features:
- Calculates Pi using a quarter circle and dividing the radius into `N` parts.
- Allows user input for the number of decimal places to which Pi should be approximated (1 to 10 decimal places).
- Includes validation for input values, such as the number of decimal places and maximum iterations for the algorithm.

## Input Arguments:
- `decimalPlaces`: The number of decimal places to calculate Pi to. This value should be an integer between 1 and 10.

### Example Usage:

**Firstly, navigate to the project directory**

Before compiling or running the program, ensure you are in the root directory of your project (the directory containing the `src` folder).

**Compile the code**:
   You need to compile the Java code before running it. Make sure you are in your project directory and run the following command:



```bash
javac -d src .\src\main\java\com\pi\approximator\Main.java .\src\main\java\com\pi\approximator\algorithms\PiCalculator.java
```

To run the program and calculate Pi with the specified number of decimal places, use the following command in the terminal/console:

```bash
java -cp src com.pi.approximator.Main <decimalPlaces>
```

For example, if you want to calculate Pi with 5 decimal places, run:

```bash
java -cp src com.pi.approximator.Main 5
```

### Console Output:

The program will print the approximated value of Pi with the specified decimal precision:
```
Approximated Pi: 3.14159
```

### How the Algorithm Works:

1. The radius of the quarter circle is divided into N parts.
2. For each part, the Y coordinates are calculated using the equation y = sqrt(1 - x^2) where x is the position of the point along the x-axis.
3. The length of the chord between adjacent points is calculated.
4. The total length of the chords is summed up, and the result is multiplied by 2 to approximate Pi.


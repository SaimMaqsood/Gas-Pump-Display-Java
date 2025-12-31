# Gas-Pump-Display-Java
A simple object-oriented program that simulates a gas pump digit counter rolling from 000 to 444 (for 3 digits) or similar for other lengths.

### What it does
- Uses recursive linked structure to handle digit carry-over (like an odometer)
- Starts at all zeros
- Advances one by one until all digits are 4
- Provides iterator-style methods: nextElement() and hasMoreElements()
- Prints all values with 10 per line

### How to run
1. Make sure you have Java installed
2. In the project folder open terminal or command prompt
3. Compile all files:
4. Run the program:
   java UnitConverterTester
### Example output (for 3 digits)
000 001 002 003 004 005 006 007 008 009 010 011 … 444 Simulation complete
### Files
- **GasPumpDisplay.java**  
  Core class for the digit display with recursive tail for carry-over.  
  Contains: roll(), toStringForm(), nextElement(), hasMoreElements(), reset().

- **GasPumpTester.java**  
  Test/demo program.  
  Creates a 3-digit display and prints all values from 000 to 444.

Learning project in Java – December 2025

/**
A class that simulates a gas pump display counter with recursive digit carry-over.
*/
public class GasPumpDisplay {
    private int digits;
    private GasPumpDisplay tail;
    private int currentDigit;
    private static final int MAX_DIGIT = 4;

    /**
    Constructs a gas pump display with the specified number of digit positions.
    @param numberOfPositions the number of digits (1 to 6)
    */
    public GasPumpDisplay(int numberOfPositions) {
        if (numberOfPositions < 1 || numberOfPositions > 6) {
            throw new IllegalArgumentException("Number of positions must be between 1 and 6");
        }
        this.digits = numberOfPositions;
        this.currentDigit = 0;
        if (numberOfPositions > 1) {
            this.tail = new GasPumpDisplay(numberOfPositions - 1);
        } else {
            this.tail = null;
        }
    }

    /**
    Rolls the current digit and carries over if necessary.
    */
    private void roll() {
        currentDigit++;
        if (currentDigit > MAX_DIGIT) {
            currentDigit = 0;
            if (tail != null) {
                tail.roll();
            }
        }
    }

    /**
    Returns the current display as a string.
    @return the current digits as a string
    */
    private String toStringForm() {
        if (tail == null) return "" + currentDigit;
        return tail.toStringForm() + currentDigit;
    }

    @Override
    public String toString() {
        return toStringForm();
    }

    /**
    Returns the next display value and advances the counter.
    @return the current display value as a string
    */
    public String nextElement() {
        String result = toStringForm();
        roll();
        return result;
    }

    /**
    Checks if there are more elements to display (until all digits are MAX_DIGIT).
    @return true if more elements exist, false otherwise
    */
    public boolean hasMoreElements() {
        // Check if current display is all MAX_DIGIT (e.g., 444 for 3 digits)
        String current = toStringForm();
        String max = "";
        for (int i = 0; i < digits; i++) {
            max += MAX_DIGIT;
        }
        return !current.equals(max);
    }

    /**
    Resets the display to all zeros.
    */
    public void reset() {
        currentDigit = 0;
        if (tail != null) {
            tail.reset();
        }
    }
}

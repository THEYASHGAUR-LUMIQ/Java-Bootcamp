public class RemoveAdjacentDuplicates {

    // Recursive method to remove adjacent duplicates
    public static String removeAdjacentDuplicates(String s) {
        // Base case: if the string is empty or has only one character
        if (s.length() <= 1) {
            return s;
        }

        // StringBuilder to store the result after removing duplicates
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < s.length()) {
            // Check if the current character is the same as the next character
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                // Skip all adjacent duplicates
                while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
            } else {
                // Append the character to the result
                result.append(s.charAt(i));
            }
            i++;
        }

        // If the result string is the same as the input, no more duplicates
        // Otherwise, recursively remove duplicates from the new result
        String newResult = result.toString();
        if (newResult.equals(s)) {
            return newResult;
        } else {
            return removeAdjacentDuplicates(newResult);
        }
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "azxxzy";
        String input2 = "caaabbbaacdddd";

        // Removing adjacent duplicates
        String output1 = removeAdjacentDuplicates(input1);
        String output2 = removeAdjacentDuplicates(input2);

        // Display the results
        System.out.println("Input1: " + input1);
        System.out.println("Output1: " + (output1.isEmpty() ? "Empty String" : output1));

        System.out.println("Input2: " + input2);
        System.out.println("Output2: " + (output2.isEmpty() ? "Empty String" : output2));
    }
}

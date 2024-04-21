public class firstUpper {
    public static void main(String[] args) {
        System.out.println(firstUpperCase("sushiL"));
    }

    public static Character firstUpperCase(String str) {
        // Base case: if the string is empty, return null
        if (str.isEmpty()) {
            return null;
        }

        // Check if the first character is uppercase
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }

        // Recursively call the function with the substring starting from the second character
        return firstUpperCase(str.substring(1));
    }
}

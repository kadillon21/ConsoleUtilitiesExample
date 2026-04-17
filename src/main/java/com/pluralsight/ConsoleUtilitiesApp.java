package com.pluralsight;

public class ConsoleUtilitiesApp {


    public static void main(String[] args) {
        // Text styles

        System.out.println(ConsoleUtilities.BOLD + "This is an example of: Bold text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.ITALIC + "This is an example of: Italic text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.UNDERLINE + "This is an example of: Underlined text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.STRIKETHROUGH + "This is an example of: Strikethrough text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.REVERSED + "This is an example of: Reversed text" + ConsoleUtilities.RESET);

        // Regular colors

        System.out.println(ConsoleUtilities.BLACK + "This is an example of: Black text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.RED + "This is an example of: Red text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.GREEN + "This is an example of: Green text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.YELLOW + "This is an example of: Yellow text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.BLUE + "This is an example of: Blue text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.PURPLE + "This is an example of: Purple text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.CYAN + "This is an example of: Cyan text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.WHITE + "This is an example of: White text" + ConsoleUtilities.RESET);

        // Bright colors

        System.out.println(ConsoleUtilities.BRIGHT_BLACK + "This is an example of: Bright Black (Gray) text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.BRIGHT_RED + "This is an example of: Bright Red text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.BRIGHT_GREEN + "This is an example of: Bright Green text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.BRIGHT_YELLOW + "This is an example of: Bright Yellow text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.BRIGHT_BLUE + "This is an example of: Bright Blue text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.BRIGHT_PURPLE + "This is an example of: Bright Purple text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.BRIGHT_CYAN + "This is an example of: Bright Cyan text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.BRIGHT_WHITE + "This is an example of: Bright White text" + ConsoleUtilities.RESET);

         // Combinations

        System.out.println(ConsoleUtilities.BOLD + ConsoleUtilities.RED + "This is an example of: Bold Red text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.UNDERLINE + ConsoleUtilities.CYAN + "This is an example of: Underlined Cyan text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.BOLD + ConsoleUtilities.REVERSED + ConsoleUtilities.GREEN + "This is an example of: Bold Reversed Green text" + ConsoleUtilities.RESET);
        System.out.println(ConsoleUtilities.ITALIC + ConsoleUtilities.YELLOW + "This is an example of: Italic Yellow text" + ConsoleUtilities.RESET);
        }
}

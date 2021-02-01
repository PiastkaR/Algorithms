package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class Robot {
    private static final ArrayList<String> commands = new ArrayList<>(Arrays.asList("LEFT", "DOWN", "LEFT", "LEFT", "UP", "EXIT"));

    public static void main(String[] args) {
        int x = 0, y = 0;
        for (String command : commands) {
            switch (command) {
                case ("LEFT"): {
                    x = x - 1;
                    break;
                }
                case ("RIGHT"): {
                    x = x + 1;
                    break;
                }
                case ("UP"): {
                    y = y + 1;
                    break;
                }
                case ("DOWN"): {
                    y = y - 1;
                    break;
                }
                case ("EXIT"): {
                    System.out.println(String.format("The final robot position is x: '%s', y: '%s'", x, y));
                    System.exit(0);
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + command);
            }
        }
    }
}

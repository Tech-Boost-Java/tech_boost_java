package str;

import java.util.*;

/**
 * Task: Log Formatting with Grouping by Log Levels<br>
 * Given a log text as a string, for example:<br>
 * <p>
 * ERROR 2025-04-02 10:15:23 User login failed <br>
 * INFO 2025-04-02 10:16:01 System started<br>
 * WARNING 2025-04-02 10:17:45 Disk space low<br>
 * ERROR 2025-04-02 10:18:12 Database connection lost<br>
 */


public class LogFormatter {
    /**
     * Formats the given log text by grouping log messages by log levels.
     *
     * @param logText the log text to format
     * @return the formatted log text
     */
    public static String formatLog(String logText) {
        String[] lines = logText.split("\n");

        Map<String, List<String>> logGroups = new HashMap<>();

        for (String line : lines) {
            if (line.trim().isEmpty()) continue;
            String level = line.split(" ", 2)[0];
            String message = line.substring(level.length() + 1);
            logGroups.computeIfAbsent(level, k -> new ArrayList<>()).add(message);
        }

        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, List<String>> entry : logGroups.entrySet()) {
            String level = entry.getKey();
            List<String> messages = entry.getValue();

            result.append(level)
                    .append(" (")
                    .append(messages.size())
                    .append("):\n");

            for (String message : messages) {
                result.append("- ")
                        .append(message)
                        .append("\n");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String log = "ERROR 2025-04-02 10:15:23 User login failed\n" +
                "INFO 2025-04-02 10:16:01 System started\n" +
                "WARNING 2025-04-02 10:17:45 Disk space low\n" +
                "ERROR 2025-04-02 10:18:12 Database connection lost";

        String formattedLog = formatLog(log);
        System.out.println(formattedLog);
    }
}

// Without using Map
class LogFormatterNoMap {

    //Constants for log levels
    private static final String[] LOG_LEVELS = {"ERROR", "INFO", "WARNING"};

    public static String formatLog(String logText) {

        String[] lines = logText.split("\n");

        //Array of StringBuilder for each log level
        StringBuilder[] levelBuilders = new StringBuilder[LOG_LEVELS.length];
        int[] levelCounts = new int[LOG_LEVELS.length];

        //Initialize the array of StringBuilder
        for (int i = 0; i < LOG_LEVELS.length; i++) {
            levelBuilders[i] = new StringBuilder();
        }

        //Iterate over the lines and group the messages by log levels
        for (String line : lines) {
            if (line.trim().isEmpty()) continue;
            for (int i = 0; i < LOG_LEVELS.length; i++) {
                if (line.startsWith(LOG_LEVELS[i])) {
                    String message = line.substring(LOG_LEVELS[i].length() + 1);
                    levelBuilders[i].append("- ").append(message).append("\n");
                    levelCounts[i]++;
                    break;
                }
            }
        }

        //Build the formatted log text
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < LOG_LEVELS.length; i++) {
            if (levelCounts[i] > 0) {
                result.append(LOG_LEVELS[i])
                        .append(" (")
                        .append(levelCounts[i])
                        .append("):\n")
                        .append(levelBuilders[i]);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String log = """
                ERROR 2025-04-02 10:15:23 User login failed
                INFO 2025-04-02 10:16:01 System started
                WARNING 2025-04-02 10:17:45 Disk space low
                ERROR 2025-04-02 10:18:12 Database connection lost
                """;

        String formattedLog = formatLog(log);
        System.out.println(formattedLog);
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandProcessor {
    private static List<String> openedApps = new ArrayList<>();

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // scanner.nextLine(); // consume the newline character
        //
        // for (int i = 0; i < n; i++) {
        //     String command = scanner.nextLine();
        //     processCommand(command);
        // }

        String[] commands = new String[]{"open firefox", "open curl", "open terminal", "close 2", "open ps"};

        for(String command : commands){
            processCommand(command);
        }

        // scanner.close();

        // Print the final list of opened apps
        System.out.println(openedApps);
    }

    private static void processCommand(String command) {
        String[] parts = command.split(" ");
        String action = parts[0];

        if (action.equals("clear")) {
            openedApps.clear();
        } else if (action.equals("open")) {
            openedApps.add(parts[1]);
        } else if (action.equals("close")) {
            int appIndex = Integer.parseInt(parts[1]) - 1;
            if (appIndex >= 0 && appIndex < openedApps.size()) {
                openedApps.remove(appIndex);
            }
        }
    }

}


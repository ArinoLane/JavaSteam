package sources;

import java.io.*;
import javax.swing.JOptionPane;

public class usercontrol{
    public  static String filepath = "/home/snowden/IdeaProjects/Password Manager GUI/src/sources/database/users";
    public String username;


    public usercontrol(String username){
        this.username=username;
    }


    public usercontrol(){
        System.out.println("users syncronising");

    }

    static String getfilePath(){
        return filepath;
    }
    
    public static boolean isUsernamePresent(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(getfilePath()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|\\|");
                if (parts.length > 0 && parts[0].trim().equals(username)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return false;
    }





    public static boolean check_user(String username, String password) {
        String filepath = getfilePath();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|\\|");
                if (parts.length >= 3 && parts[0].trim().equals(username) && parts[2].trim().equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return false;
    }



    int findLineNumber(String username) {
        int lineNumber = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(getfilePath()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] parts = line.split("\\|\\|");
                if (parts.length > 0 && parts[0].trim().equals(username)) {
                    return lineNumber;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return -1; // Username not found
    }



    String extractUserInfo(String username, int infoIndex) {
        int lineNumber = findLineNumber(username);
        if (lineNumber == -1) {
            return "Username not found";
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(getfilePath()))) {
            String line;
            int currentLine = 0;
            while ((line = reader.readLine()) != null) {
                currentLine++;
                if (currentLine == lineNumber) {
                    String[] parts = line.split("\\|\\|");
                    if (parts.length > infoIndex) {
                        String info = parts[infoIndex].trim();
                        return info.isEmpty() ? "N/A" : info;
                    } else {
                        return "N/A";
                    }
                }
            }
        } catch (IOException e) {
            return "Error reading file: " + e.getMessage();
        }
        return "Error: Username not found";
    }

    public static boolean addUser(String username, String email, String password, String gender, String religion, String amount, String tickets) {
        String newUser = username + "||" + email + "||" + password + "||" + gender + "||" + religion + "||" + amount + "||" + tickets;
        if(isUsernamePresent(username)==true){
            return false;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getfilePath(), true))) {
            writer.write(newUser);
            writer.newLine();
            return true;
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return  false;
        }
    }


    String getemail(){
        return extractUserInfo(username, 1);
    }
    String getpassword(){
        return extractUserInfo(username, 2);
    }
    String getreligio(){
        return extractUserInfo(username, 3);
    }
    String getgender(){
        return extractUserInfo(username, 4);
    }
    String getamount(){
        return extractUserInfo(username, 5);
    }
    String gettickets(){
        return extractUserInfo(username, 6);
    }

    public static void addAmount(String username, String amountToAdd) {
        String filePath = getfilePath();
        File file = new File(filePath);
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|\\|");
                if (parts.length >= 6 && parts[0].trim().equals(username)) {
                    int currentAmount = Integer.parseInt(parts[5].trim());
                    int newAmount = currentAmount + Integer.parseInt(amountToAdd);
                    parts[5] = String.valueOf(newAmount);
                    line = String.join("||", parts);
                }
                writer.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }

        // Rename the temporary file to the original file
        if (file.delete()) {
            if (!tempFile.renameTo(file)) {
                System.err.println("Failed to rename the temporary file.");
            }
        } else {
            System.err.println("Failed to delete the original file.");
        }
    }



    public static boolean buyticket(String username, int ticketCount) {
        String filePath = getfilePath();
        int ticketPrice = 100;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter("temp.txt"))) {

            boolean userFound = false;
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|\\|");
                if (parts.length >= 6 && parts[0].trim().equals(username)) {
                    userFound = true;
                    int balance = Integer.parseInt(parts[5].trim());
                    int totalCost = ticketCount * ticketPrice;
                    if (balance < totalCost) {
                        System.out.println("Amount low. Unable to purchase tickets.");
                        return false;
                    }
                    int newBalance = balance - totalCost;
                    parts[5] = String.valueOf(newBalance);
                    parts[6] = String.valueOf(Integer.parseInt(parts[6].trim()) + ticketCount);
                }
                writer.write(String.join("||", parts) + System.lineSeparator());
            }

            if (!userFound) {
                System.out.println("User not found.");
                return false;
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }

        File file = new File(filePath);
        File tempFile = new File("temp.txt");

        // Rename the temporary file to the original file
        if (file.delete()) {
            if (!tempFile.renameTo(file)) {
                System.err.println("Failed to rename the temporary file.");
            }
        } else {
            System.err.println("Failed to delete the original file.");
        }
        JOptionPane.showMessageDialog(null, "Ticket Buying Successful!", "TIcketed Buy Update", JOptionPane.PLAIN_MESSAGE);
        return true;
    }
    public static void updateUser(String username, String email, String password, String gender, String religion) {
        String filePath = getfilePath();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter("temp.txt"))) {

            boolean userFound = false;
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|\\|");
                if (parts.length >= 7 && parts[0].trim().equals(username)) {
                    userFound = true;
                    parts[1] = email;
                    parts[2] = password;
                    parts[3] = gender;
                    parts[4] = religion;
                }
                writer.write(String.join("||", parts) + System.lineSeparator());
            }

            if (!userFound) {
                System.out.println("User not found.");
                return;
            }
        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }

        File file = new File(filePath);
        File tempFile = new File("temp.txt");

        // Rename the temporary file to the original file
        if (file.delete()) {
            if (!tempFile.renameTo(file)) {
                System.err.println("Failed to rename the temporary file.");
            }
        } else {
            System.err.println("Failed to delete the original file.");
        }
        JOptionPane.showMessageDialog(null, "Account Updated!", "Account updated", JOptionPane.PLAIN_MESSAGE);
    }


    public static void deleteAccount(String username) {
        String filePath = getfilePath();
        File inputFile = new File(filePath);
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            boolean userFound = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|\\|");
                if (parts.length >= 7 && parts[0].trim().equals(username)) {
                    userFound = true;
                    continue; // Skip writing this line
                }
                writer.write(line + System.lineSeparator());
            }

            if (!userFound) {
                System.out.println("User not found.");
                return;
            }
        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }

        // Rename the temporary file to the original file
        if (inputFile.delete()) {
            if (!tempFile.renameTo(inputFile)) {
                System.err.println("Failed to rename the temporary file.");
            }
        } else {
            System.err.println("Failed to delete the original file.");
        }
        JOptionPane.showMessageDialog(null, "Account Deleted. Thanks for using!", "Account Deleted", JOptionPane.PLAIN_MESSAGE);
    }

}

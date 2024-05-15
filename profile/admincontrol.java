package sources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class admincontrol extends usercontrol{
        String user;



        public  admincontrol(){

        }


        public admincontrol(String user){
                this.user=user;
        }

        public static int usercount() {
                int count = 0;
                String filePath = getfilePath();

                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                        while (reader.readLine() != null) {
                                count++;
                        }
                } catch (IOException e) {
                        System.err.println("Error reading file: " + e.getMessage());
                }

                return count;
        }






        public static String[] getAllUsernames() {
                String filePath = getfilePath();
                List<String> usernames = new ArrayList<>();

                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                                String[] parts = line.split("\\|\\|");
                                if (parts.length >= 1) {
                                        usernames.add(parts[0].trim());
                                }
                        }
                } catch (IOException e) {
                        System.err.println("Error reading file: " + e.getMessage());
                }

                return usernames.toArray(new String[0]);
        }

        public static int netbalance() {
                int netEarned = 0;
                String filePath = getfilePath();
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                                String[] parts = line.split("\\|\\|");
                                if (parts.length >= 6) {
                                        netEarned += Integer.parseInt(parts[5].trim()); // Assuming balance is stored in index 5
                                }
                        }
                } catch (IOException | NumberFormatException e) {
                        System.err.println("Error reading file: " + e.getMessage());
                }

                return netEarned;
        }



        public static int toalticket() {
                int netTicketsSold = 0;
                String filePath = getfilePath();
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                                String[] parts = line.split("\\|\\|");
                                if (parts.length >= 7) {
                                        netTicketsSold += Integer.parseInt(parts[6].trim()); // Assuming ticket amount is stored in index 6
                                }
                        }
                } catch (IOException | NumberFormatException e) {
                        System.err.println("Error reading file: " + e.getMessage());
                }

                return netTicketsSold;
        }

}

// import template_method.Car;
// import template_method.Plane;
// import template_method.Ship;

// import observer.editor.Editor;
// import observer.listeners.EmailNotificationListener;
// import observer.listeners.LogOpenListener;
// import iterator.profile.Profile;
// import iterator.social_networks.Facebook;
// import iterator.social_networks.LinkedIn;
// import iterator.social_networks.SocialNetwork;
// import iterator.spammer.SocialSpammer;

// import java.util.Scanner;
// import java.util.List;
// import java.util.ArrayList;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.util.HashMap;
// import java.util.Map;

// import strategy.order.Order;
// import strategy.strategies.PayByCreditCard;
// import strategy.strategies.PayByPayPal;
// import strategy.strategies.PayStrategy;

// public class App {

//     private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
//     private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//     private static Order order = new Order();
//     private static PayStrategy strategy;

//     static {
//         priceOnProducts.put(1, 2200);
//         priceOnProducts.put(2, 1850);
//         priceOnProducts.put(3, 1100);
//         priceOnProducts.put(4, 890);
//     }


//     // public static Scanner scanner = new
//     //  Scanner(System.in);
//     public static void main(String[] args) throws Exception {


//         System.out.println("strategyパターン");
//         while (!order.isClosed()) {
//             int cost;

//             String continueChoice;

//             do {
//                 System.out.print("Please, select a product:" + "\n" + 
//                     "1 - Mother board" + "\n" +
//                     "2 - CPU" + "\n" +
//                     "3 - HDD" + "\n" +
//                     "4 - Memory" + "\n"
//                 );
//                 int choice = Integer.parseInt(reader.readLine());
//                 cost = priceOnProducts.get(choice);
//                 System.out.print("Do you wish to continue selectign products? Y/N: ");
//                 continueChoice = reader.readLine();
//             } while (continueChoice.equalsIgnoreCase("Y"));

//             if (strategy == null) {
//                 System.out.println("Please select a payment method:" + "\n" + "1 - PayPal" + "\n" + "2 - Credit Card");
//                 String paymentMethod = reader.readLine();

//                 if (paymentMethod.equals("1")) {
//                     strategy = new PayByPayPal();
//                 } else {
//                     strategy = new PayByCreditCard();
//                 }

//                 order.processOrder(strategy);

//                 System.out.println("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
//                 String process = reader.readLine();
//                 if (process.equalsIgnoreCase("P")) {
//                     if (strategy.pay(order.getTotalCost())) {
//                         System.out.println("Payment has been successful");
//                     } else {
//                         System.out.println("FAIL! Please, check your data.");
//                     }
//                     order.setClosed();
//                 }
//             }
//         }
//     }
// }
    

        // System.out.println("iteratorパターン");
        // System.out.println("Please specifi social network to target spam tool (default:Facebook):");
        // System.out.println("1, Facebook");
        // System.out.println("2, LinkedIn");
        // String choice = scanner.nextLine();

        // SocialNetwork network;
        // if (choice.equals("2")) {
        //     network = new LinkedIn(createTestProfiles());
        // } else {
        //     network = new Facebook(createTestProfiles());
        // }

        // SocialSpammer spammer = new SocialSpammer(network);
        // spammer.sendSpamToFriends        
        // (
        //     "anna.smith@bing.com",
        //     "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?"
        // );
        // spammer.sendSpamToCoworkers
        // (
        //     "anna.smith@bing.com",
        //     "Hey! This is Anna's boss Jason. Anna told me you would be interested in [link]."
        // );
        
        

        // System.out.println("observerパターン");

        // Editor editor = new Editor();
        // editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        // editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        // try {
        //     editor.openFile("text.txt");
        //     editor.saveFile();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        
        // System.out.println("templateMethodパターン");
        // System.out.println();
        // System.out.println("車クラス");
        // Car car = new Car();
        // car.run();
        // car.stop();
        // car.horn();
        
        // System.out.println();
        // System.out.println("船クラス");
        // Ship ship = new Ship();
        // ship.run();
        // ship.stop();
        // ship.horn();
        
        // System.out.println();
        // System.out.println();
        // System.out.println("飛行機クラス");
        // Plane plane = new Plane();
        // plane.run();
        // plane.stop();
        // plane.horn();
        // plane.takeOff();
        // plane.toLand();

    // public static List<Profile> createTestProfiles() {
    //     List<Profile> data = new ArrayList<Profile>();
    //     data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
    //     data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
    //     data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
    //     data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
    //     data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
    //     data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
    //     return data;
    // }
// }

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       

            String menu= """
                Welcome to Nokia Menu 

                 
                1 Phone book
                2 Messages
                3 Chat
                4 Call register
                5 Tones
                6 Settings
                7 Call divert
                8 Music
                9 Games
                10 Calculator
                11 Reminders
                12 Clock
                13 Profiles
                14 Services
                15 Sim sevices
               
                """;

        System.out.println(menu);
        int choice = input.nextInt();   

        switch (choice) {

     
            case 1: System.out.println("Opening Phone book"); 
                    
                    String Phonebook= """
                            Phonebookmenu

                                 
                            1 Search
                            2 Service NOs
                            3 Add name
                            4 Erase
                            5 Edit
                            6 Copy
                            7 Assign tone
                            8 Send b'card
                            9 Options
                            10 Speed dials
                            11 Voice tags
                           
                            """;

                System.out.println(Phonebook);
                int phonebookchoice = input.nextInt();   

                switch(phonebookchoice){
                    case 1: System.out.println("Search"); break;
                    case 2: System.out.println("Service NOs"); break;
                    case 3: System.out.println("Add name"); break;  
                    case 4: System.out.println("Erase"); break;
                    case 5: System.out.println("Edit"); break;
                    case 6: System.out.println("Copy"); break;
                    case 7: System.out.println("Assign tone"); break; 
                    case 8: System.out.println("Send b'card"); break;
                    case 9: System.out.println("Options");
                        String options= """
                                    Options

                                     
                                    1 Memory in use
                                    2 Type of view
                                    3 Memory status
                                    """;

                System.out.println(options);
                int optionschoice = input.nextInt();

                        switch(optionschoice){
                            case 1: System.out.println("Memory in use"); break;
                            case 2: System.out.println("Type of view"); break;
                            case 3: System.out.println("Memory status"); break;    
                            default: System.out.println("Invalid option.......");
                        }
                        break;
                    
                                

                    case 10: System.out.println("Speed dials"); break;
                    case 11: System.out.println("Voice tags"); break; 
                    default: System.out.println("Invalid option.......");
                }
                break;
                
                

            case 2: System.out.println("Opening Messages"); 
                    String messages= """
                            messagesmenu

                                 
                            1 Write messages
                            2 Inbox
                            3 Outbox
                            4 Picture messages
                            5 Templates
                            6 Smileys
                            7 Message settings
                            8 Info service
                            9 Voice mailbox number
                            10 Service command editor
                            """;

                System.out.println(messages);
                int messagechoice = input.nextInt(); 
 
                switch(messagechoice){
                    case 1: System.out.println("Write messages"); break;
                    case 2: System.out.println("Inbox"); break;
                    case 3: System.out.println("Outbox"); break;  
                    case 4: System.out.println("Picture messages"); break;
                    case 5: System.out.println("Templates"); break;
                    case 6: System.out.println("Smileys"); break;
                    case 7: System.out.println("Message settings"); 
                        String messagesettings= """
                                    Messagesettings

                                    1 Set
                                    2 Common
                                    """;
                System.out.println(messagesettings);
                int messagesettingschoice = input.nextInt();
                        switch(messagesettingschoice){
                            case 1: System.out.println("Message Set"); 

                                  String messageset= """
                                    Messageset

                                    1 Message centre number
                                    2 Message sent as
                                    3 Message validity

                                    """;

                System.out.println(messageset);
                int messagesetchoice = input.nextInt();
                        switch(messagesetchoice){
                            case 1: System.out.println("Message centre number"); break;
                            case 2: System.out.println("Message sent as"); break;
                            case 3: System.out.println("Message validity"); break;    
                            default: System.out.println("Invalid option.......");
                        }
                        break;  


                            case 2: System.out.println("Message Common");
                                     String messageCommon= """
                                    MessageCommon

                                    1 Delivery report
                                    2 Reply via same centre
                                    3 Character support
                                                                     
                                    """;

                System.out.println(messageCommon);
                int messagecommonchoice = input.nextInt();
                        switch(messagecommonchoice){
                            case 1: System.out.println("Delivery report"); break;
                            case 2: System.out.println("Reply via same centre"); break;
                            case 3: System.out.println("Character support"); break;    
                            default: System.out.println("Invalid option.......");
                        }
                        break;


                            default: System.out.println("Invalid option.......");
                        }
                        break;




                    case 8: System.out.println("Info service"); break;
                    case 9: System.out.println("Voice mailbox number");break;
                    case 10: System.out.println("Service command editor");break;
                    default: System.out.println("Invalid option.......");
            }
            break;



            case 3: System.out.println("Opening Chat"); break;
            case 4: System.out.println("Opening Call register"); 
                    String callregister= """
                            Callregistermenu

                                 
                            1 Missed calls
                            2 Received calls
                            3 Dialed numbers
                            4 Erase recent call lists
                            5 Show call duration
                            6 Show call costs
                            7 call cost settings
                            8 Prepaid credit
                            """;

                System.out.println(callregister);
                int callregisterchoice = input.nextInt(); 
 
                        switch(callregisterchoice){
                            case 1: System.out.println("Missed calls"); break;
                            case 2: System.out.println("Received calls"); break;
                            case 3: System.out.println("Dialed numbers"); break;  
                            case 4: System.out.println("Erase recent call lists"); break;
                            case 5: System.out.println("Show call duration"); 
                                    String Showcallduration= """
                                            Showcalldurationmenu

                                            1 Last call duration
                                            2 All calls' duration
                                            3 Received calls' duration 
                                            4 Dialed calls' duration
                                            5 clear timers
                                            """;

                System.out.println(Showcallduration);
                int Showcalldurationchoice = input.nextInt(); 
 
                        switch(Showcalldurationchoice){
                            case 1: System.out.println("Last call duration"); break;
                            case 2: System.out.println("All calls' duration"); break;
                            case 3: System.out.println("Received calls' duration"); break;  
                            case 4: System.out.println("Dialed calls' duration"); break;
                            case 5: System.out.println("clear timers"); break;
                            default: System.out.println("Invalid option.......");
                        }
                        break; 


                    case 6: System.out.println("Show call costs"); 
                            String Showcallcosts= """
                                    Showcallcotsmenu

                                    1 Last call cost
                                    2 All calls' cost
                                    3 Clear counters
                                    """;

                System.out.println(Showcallcosts);
                int Showcallcostschoice = input.nextInt(); 
 
                        switch(Showcallcostschoice){
                            case 1: System.out.println("Last call cost"); break;
                            case 2: System.out.println("All calls' cost"); break;
                            case 3: System.out.println("Clear counters"); break;  
                            default: System.out.println("Invalid option.......");
                        }
                        break; 
                            
                    case 7: System.out.println("call cost settings"); 
                            String Callcostsettings= """
                                    Callcostsettingsmenu

                                    1 Call cost limit
                                    2 Show costs in
                                    """;

                System.out.println(Callcostsettings);
                int Callcostsettingschoice = input.nextInt(); 
 
                        switch(Callcostsettingschoice){
                            case 1: System.out.println("Call cost limit"); break;
                            case 2: System.out.println("Show costs in"); break;
                            default: System.out.println("Invalid option.......");
                        }
                        break; 
                    case 8: System.out.println("Message validity"); break;    
                    default: System.out.println("Invalid option.......");
                }
                break;  





            case 5: System.out.println("Opening Tones"); 
                    String Tones= """
                            Tonesmenu

                                 
                            1 Ringing tone
                            2 Ringing volume
                            3 Incoming call alert
                            4 Message alert tone
                            5 Keypad tones
                            6 Warning tones
                            7 Vibrating alert
                            8 Screen saver
                            """;

                System.out.println(Tones);
                int toneschoice = input.nextInt(); 
 
                switch(toneschoice){
                    case 1: System.out.println("Ringing tone"); break;
                    case 2: System.out.println("Ringing volume"); break;
                    case 3: System.out.println("Incoming call alert"); break;  
                    case 4: System.out.println("Message alert tone"); break;
                    case 5: System.out.println("Keypad tones"); break;
                    case 6: System.out.println("Warning tones"); break;
                    case 7: System.out.println("Vibrating alert"); break;
                    case 8: System.out.println("Screen saver"); break;
                    default: System.out.println("Invalid option.......");
                }
                break;







            case 6: System.out.println("Opening Settings"); 
                    String Settings= """
                            Settingsmenu

                                 
                            1 Call settings
                            2 Phone settings
                            3 Security settings
                            """;

                System.out.println(Settings);
                int settingshoice = input.nextInt(); 
 
                switch(settingshoice){
                    case 1: System.out.println("Call settings"); 
                            
                            String Callsettings= """
                                    Callsettingsmenu

                                    1 Automatic redial
                                    2 Speed dialing
                                    3 Call waiting options 
                                    4 Own number sending
                                    5 Phone line in use
                                    6 Automatic answer
                                    """; 
                System.out.println(Callsettings);
                int Callsettingschoice = input.nextInt(); 
 
                        switch(Callsettingschoice){
                            case 1: System.out.println("Automatic redial"); break;
                            case 2: System.out.println("Speed dialing"); break;
                            case 3: System.out.println("Call waiting options "); break;  
                            case 4: System.out.println("Own number sending"); break;
                            case 5: System.out.println("Phone line in use"); break;
                            case 6: System.out.println("Automatic answer"); break;
                            default: System.out.println("Invalid option.......");
                        }
                        break;
 
                    case 2: System.out.println("Phone settings"); 
                            
                            String Phonesettings= """
                                    Phonesettingsmenu

                                    1 Language
                                    2 Cell info display
                                    3 Welcome note
                                    4 Network selection
                                    5 Confirm SIM service actions
                                    """; 
                System.out.println(Phonesettings);
                int Phonesettingschoice = input.nextInt(); 
 
                        switch(Phonesettingschoice){
                            case 1: System.out.println("Language"); break;
                            case 2: System.out.println("Cell info display"); break;
                            case 3: System.out.println("Welcome note"); break;  
                            case 4: System.out.println("Network selection"); break;
                            case 5: System.out.println("Confirm SIM service actions"); break;
                            default: System.out.println("Invalid option.......");
                        }
                        break;
                    case 3: System.out.println("Security settings");
                        
                            String Securitysettings= """
                                    Securitysettingssmenu

                                    1 PIN code request
                                    2 Call barring service
                                    3 Fixed dailing 
                                    4 Closed user group
                                    5 Security level
                                    6 Change access codes
                                    """; 
                System.out.println(Securitysettings);
                int Securitysettingschoice = input.nextInt(); 
 
                        switch(Securitysettingschoice){
                            case 1: System.out.println("PIN code request"); break;
                            case 2: System.out.println("Call barring service"); break;
                            case 3: System.out.println("Fixed dailing  "); break;  
                            case 4: System.out.println("Closed user group"); break;
                            case 5: System.out.println("Security level"); break;
                            case 6: System.out.println("Change access codes"); break;
                            default: System.out.println("Invalid option.......");
                        }
                        break;
                    case 4: System.out.println("Restore factory settings"); break;
                    default: System.out.println("Invalid option......."); 
                }
                break;

            case 7: System.out.println("Opening Call divert"); break;
            case 8: System.out.println("Opening Music"); 
                    String Music= """
                            Musicmenu

                                 
                            1 Music player
                            2 Radio
                            3 Recorder
                            4 Track list
                            """;

                System.out.println(Music);
                int musicchoice = input.nextInt(); 
 
                switch(musicchoice){
                    case 1: System.out.println("Music player"); break;
                    case 2: System.out.println("Radio"); break;
                    case 3: System.out.println("Recorder"); break;  
                    case 4: System.out.println("Track list"); break;
                    default: System.out.println("Invalid option.......");
                }
                break;




            case 9: System.out.println("Opening Games"); break;
            case 10: System.out.println("Opening Calculator"); break;
            case 11: System.out.println("Opening Reminders"); break;
            case 12: System.out.println("Opening Clock"); 
                    String Clock= """
                            Clockmenu

                                 
                            1 Alarm clock
                            2 Clock settings
                            3 Date settings
                            4 Stop watch
                            5 Countdown timer
                            6 Auto update of date and time
                            """;

                System.out.println(Clock);
                int clockchoice = input.nextInt(); 
 
                switch(clockchoice){
                    case 1: System.out.println("Alarm clock"); break;
                    case 2: System.out.println("Clock settings"); break;
                    case 3: System.out.println("Date settings"); break;  
                    case 4: System.out.println("Stop watch"); break;
                    case 5: System.out.println("Countdown timer"); break;
                    case 6: System.out.println("Auto update of date and time"); break;
                    default: System.out.println("Invalid option......."); 
                }
                break;


            case 13: System.out.println("Opening Profiles"); break;
            case 14: System.out.println("Opening Services"); break;
            case 15: System.out.println("Opening Sim services"); break;

            default: System.out.println("Invalid option.......");
        }
       
               
    }
}

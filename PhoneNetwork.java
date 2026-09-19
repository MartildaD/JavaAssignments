import java.util.Scanner;
    public class PhoneNetwork{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);


        String prompt= """
                Welcome to Catalyst Phone Network

                press 
                1 To Listen to English
                2 To Listen to Yoruba
                3 To Listen to Hausa
                4 To Listen to Igbo
                """;
        System.out.println(prompt);
        int menuchoice = input.nextInt();       
        switch(menuchoice){
            
            case 1: System.out.println("listening in English");

                    String englishprompt= """
                                Welcome to Englishmenu
                                press 
                                1 To borrow
                                2 To pay your debt
                                3 To recharge
                                4 To check account balance
                                    """;
                System.out.println(englishprompt);
                int englishmenuchoice = input.nextInt(); 
         
                switch (englishmenuchoice){
                    case 1: System.out.println("you want to borrow again"); break;
                    case 2: System.out.println("you have not paid the last one"); break;
                    case 3: System.out.println("until you pay your debt, nothing for you"); break;
                    case 4: System.out.println("nothing dey your account"); break; 
                    default: System.out.println("GO WORK.......");
                }
                break;


            case 2: {
                System.out.println("listening in Yoruba");

                     String yorubaprompt= """
                                Welcome to Yorubamenu
                                press 
                                1 Yáwó
                                2 San gbèsè rẹ
                                3 Fi owó sí line rẹ
                                4 Ṣàyẹ̀wò ìwọ̀n owó tó wà nínú account rẹ
                                    """;
                System.out.println(yorubaprompt);
                int yorubamenuchoice = input.nextInt(); 
         
                switch (yorubamenuchoice){
                    case 1: System.out.println("O fẹ́ yáwó lẹ́ẹ̀kan sí i"); break;
                    case 2: System.out.println("O kò tíì san èyí tó kọjá"); break;
                    case 3: System.out.println("Títí o fi san gbèsè rẹ, kò sí nǹkan fún ẹ"); break;
                    case 4: System.out.println("Kò sí owó nínú account rẹ"); break; 
                    default: System.out.println("Lọ ṣiṣẹ́ 😂.......");
                }
                break;
           }




            case 3: {
                System.out.println("listening in Hausa");

                    String hausaprompt= """
                                Welcome to Hausamenu
                                press 
                                1 Aron kuɗi
                                2 Biyan bashinka
                                3 Saka kuɗin kati
                                4 Duba ragowar kuɗin account

                                    """;
                System.out.println(hausaprompt);
                int hausamenuchoice = input.nextInt(); 
         
                switch (hausamenuchoice){
                    case 1: System.out.println("Kana son aron kuɗi kuma"); break;
                    case 2: System.out.println("Ba ka biya na baya ba"); break;
                    case 3: System.out.println("Har sai ka biya bashinka, babu komai a gare ka"); break;
                    case 4: System.out.println("Babu kuɗi a account ɗinka"); break; 
                    default: System.out.println("JE KA YI AIKI 😂.......");
                }
                break;

            }



            case 4: System.out.println("listening in Igbo"); 

                   String igboprompt= """
                                Welcome to Hausamenu
                                press 
                                1 Ịrịọ ego nbinye
                                2 Ịkwụ ụgwọ i ji
                                3 Ịgbanye ego n’akara ekwentị
                                4 Ịlele ego dị na akaụntụ gị

                                    """;
                System.out.println(igboprompt);
                int igbomenuchoice = input.nextInt(); 
         
                switch (igbomenuchoice){
                    case 1: System.out.println("Ị chọrọ ịrịọ ego nbinye ọzọ?"); break;
                    case 2: System.out.println("Ị kwụbeghị ụgwọ nke ikpeazụ."); break;
                    case 3: System.out.println("Ruo mgbe ị kwụrụ ụgwọ i ji, ọ dịghị ihe ị ga-enweta."); break;
                    case 4: System.out.println("Ọ dịghị ego dị na akaụntụ gị."); break; 
                    default: System.out.println("GAA RỤỌ ỌRỤ! 😂.......");
                }
                break;
 
            default: System.out.println("how e dey be na");









} 
}
}

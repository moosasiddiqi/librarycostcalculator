/*
Programmer: Moosa
Date: 21st March 2024
Description: Book Tracking Program
 */
package locallibraryassigments;

import java.util.Scanner;

import java.text.DecimalFormat;

public class LocalLibraryAssigments 
{

    
    public static void main(String[] args) 
    {
        //Create a scanner object to obtain user input - NUMERICAL and STRINGS
        Scanner scanS = new Scanner(System.in);
        Scanner scanN = new Scanner(System.in);
        
        //an entry page welcoming the user
        System.out.println("\n\n\t ********************************");
        System.out.println("\t                                     ");
        System.out.println("\t *          WELCOME TO          *");
        System.out.println("\t                                 ");
        System.out.println("\t *         MOOSA'S BOOK         *");
        System.out.println("\t                                 ");
        System.out.println("\t *       TRACKING PROGRAM       *");
        System.out.println("\t                                 ");
        System.out.println("\t ********************************");
        System.out.println("\n┌( ಠ‿ಠ )┘ Welcome to Moosa's Local Library!!");
        
        //educate the user about the program and how it will benefit them
        System.out.println("\nThis program is based on the data recovered "
                + "from the user. \nIt will help the user with their own"
                + " statistics in order to \nset goals in the future.");
        //ask for user info
        System.out.println("\nBefore we begin, Please enter your name in the"
                + " format \"Last Name, First Name\".");
        
        //assign Lastname, Firstname variable
        String userName;
        
        //Use the scanner class for users last name and first name
        userName = scanS.nextLine();
        
        //ask user about their favorite Science-fiction Book
        System.out.println("Out of the books assigned, what was your favorite"
                + " book in the science fiction genre?");
        
        //assign a variable for this book
        String scienceBook;
        
        //ask for user input using scanner class
        scienceBook = scanS.nextLine();
        
        //asking how long it took to read it in weeks
        System.out.println("How many weeks did it take you to read " + "\"" + 
                scienceBook + "\"?");
        
        //declare the variable
        double dur1;
        
        //obtain the value and store it with user input
        dur1 = scanN.nextDouble();
        
        //asking user about their favorite mystery book
        System.out.println("What's your favorite mystery book?");
        String mysteryBook;
        mysteryBook = scanS.nextLine();
        
        //asking how long it took to read it
        System.out.println("How many weeks did it take you to read " + "\"" + 
                mysteryBook + "\"?");
        
        //ask for user input
        double dur2;
        
        //obtain the value and store it with user input
        dur2 = scanN.nextDouble();
        
        //asking user about their favorite historical book
        System.out.println("What's your favorite historical novel?");
        String historyBook;
        historyBook = scanS.nextLine();
        
        //asking how long it took to read it
        System.out.println("How many weeks did it take you to read " + "\"" + 
                historyBook + "\"?");
        
        //ask for user input
        double dur3;
        dur3 = scanN.nextDouble();
        System.out.println("Lastly, what's your favorite"
                + " action/thriller book?");
        String actionBook;
        actionBook = scanS.nextLine();
        System.out.println("How many weeks did it take you to read " + "\"" + 
                actionBook + "\"?" );
        
        //ask for user input
        double dur4;
        dur4 = scanN.nextDouble();
        
        //add decimal format class so that the numbers are easy to read
        DecimalFormat decOne = new DecimalFormat("##.0");
        DecimalFormat decTwo = new DecimalFormat("$###.00");
        DecimalFormat decThree = new DecimalFormat("#0.0");
        
        //add an enter command to enhance users experience
        System.out.println("\nPress \"enter\" to view your reading stats...");
        String enter;
        enter = scanS.nextLine();
        System.out.format("\n%-29s", "_________________________________");
        System.out.format("\n%-19s%-3s%-11s", "Book Title:", "|", 
                "# of weeks:");
        System.out.format("\n%-19s%-3s%-11s", "___________________", "|__", 
                "___________");
        System.out.format("\n%-19s%-3s%-11s", scienceBook, "|", 
                decOne.format(dur1));
        System.out.format("\n%-19s%-3s%-11s", mysteryBook, "|", 
                decOne.format(dur2));
        System.out.format("\n%-19s%-3s%-11s", historyBook, "|", 
                decOne.format(dur3));
        System.out.format("\n%-19s%-3s%-11s", actionBook, "|", 
                decOne.format(dur4));
        System.out.format("\n%-29s", "_________________________________");

        //Message regarding the costs
        System.out.println("\n\nBefore we continue, I would like you to know"
                + " that this program will cost \nyou $5.25 every week you take"
                + " to read all 4 books. If this sounds good to you \nthen"
                + " press \"enter\" to view a summary of your costs.");
        
        //add an enter command to enhance users experience
        String enter2;
        enter2 = scanS.nextLine();
        
        //create variable for book one and how much it will cost
        double bookOne = 5.25*dur1;
        
        //create variable for book two and how much it will cost
        double bookTwo = 5.25*dur2;
        
        //create variable for book three and how much it will cost
        double bookThree = 5.25*dur3;
        
        //create variable for book four and how much it will cost
        double bookFour = 5.25*dur4;
        
        //create a variable for the total cost
        double total = bookOne + bookTwo + bookThree + bookFour;
        
        //lastly create a variable for total cost with tax
        double totalTax = (total*0.13) + total;
        
        //create a table of values regarding cost
        System.out.format("\n%-33s", "__________________________________");
        System.out.format("\n%-17s%-3s%-14s", "Book Title", "|",
                "Total per book");
        System.out.format("\n%-17s%-3s%-14s", "_________________", "|__",
                "______________");
        System.out.format("\n%-17s%-3s%-14s", scienceBook, "|",
                decTwo.format(bookOne));
        System.out.format("\n%-17s%-3s%-14s", mysteryBook, "|",
                decTwo.format(bookTwo));
        System.out.format("\n%-17s%-3s%-14s", historyBook, "|",
                decTwo.format(bookThree));
        System.out.format("\n%-17s%-3s%-14s", actionBook, "|",
                decTwo.format(bookFour));
        System.out.format("\n%-33s", "__________________________________");
        System.out.format("\n%-17s%-3s%-14s", "Total: ", "|", 
                decTwo.format(total));
        System.out.format("\n%-17s%-3s%-14s", "Total with Tax:", "|", 
                decTwo.format(totalTax));
        System.out.format("\n%-33s", "__________________________________");
        
        //ask user to follow steps
        System.out.println("\n\nNext, press \"enter\" to view your weekly and"
                + " yearly reading average.");
        
        //add an enter command to enhance users experience
        String enter3;
        enter3 = scanS.nextLine();
        
        //declare and initialize variables 
        //total weeks needed for all 4 books
        double totalWeeks = dur1+dur2+dur3+dur4;
        
        //average books read per week was found by dividing total weeks by 4
        double weekAvg = 4/totalWeeks;
        
        //total # of weeks in an year
        double weeksYear = 365/7;
        
        //# of books per year
        double yearAvg = weekAvg*weeksYear;
        
        //make a variable to store the value of the comma
        int indexComma = userName.indexOf(',');
        
        //make another variable to store the first name because according to
        //our rules we know that the first name will begin at 2 spaces from the
        //beginning of the comma 
        String firstName = userName.substring(indexComma + 2);
        
        //now that we have thre first name we can use charAt to get the initial
        String firstInitial = firstName.substring(0, 1);
        
        //to be safe we add an upper case class to ensure initial is capital
        String capInitial = firstInitial.toUpperCase();
        
        //now we make a variable for the last name which begins at 0
        String lastName = userName.substring(0, indexComma);
        
        //also add an upper case method for last name
        String capLast = lastName.toUpperCase();
        
        //Thank user for their participation and relay their weekly/yearly stats
        System.out.println("Thank You for using our program Mr/Ms. "
                + capInitial + "." + capLast + ".\nYOU HAVE A THUNDERING"
                + " AVERAGE OF " + decThree.format(weekAvg) + " books per"
                + " week." + " Keep it up! \nAt this rate you will read a"
                + " staggering " + decThree.format(yearAvg) + " books in an"
                        + " year!");
        
        //add a motivational message for yound readers
        System.out.println("\nNow reader, dont forget that every page holds a"
                + " new adventure, \na new friend, and a new lesson waiting"
                + " just for you. Keep reading, \nand let your imagination"
                + " soar! \n\nSincerely, \nyour friendly neighbourhood"
                + " program ｡^‿^｡");  
        
        scanN.close();
        scanS.close();
        
 
    }
    
}

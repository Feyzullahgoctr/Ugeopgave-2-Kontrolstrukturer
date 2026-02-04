
void main(String[] args) {

    // Simple if/else (opg. 1-2)
    // Opgave 1: Shopping discount
    double totalPrice = 990;
    int discountPercent = 20;
    double finalPrice = 0;
    double discount = 0;

    if (totalPrice > 1000) {
        discount = (totalPrice * discountPercent / 100);
    }
    finalPrice = totalPrice - discount;
    System.out.println("Final Price :" + finalPrice + " kr");
    System.out.println( discount == 0 ? "No Discount applied!" : "Discount applied!" );
    System.out.println("Opgave 1 Slut");
    System.out.println();

    // Opgave 2: BMI calculator
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your weight : ");
    double weight = scan.nextDouble();
    System.out.println("Enter your height : ");
    double height = scan.nextDouble();

    double BMI = 0;

    // First, it is checked.
    if (weight <= 0 || height <= 0) {
        System.out.println("invalid value!");
    } else {
        BMI = weight / (height * height);

        if (BMI >= 25) {
            System.out.println("BMI : " + BMI + " You are overweight");
        } else {
            System.out.println("You have a normal weight.");
        }

    }
    System.out.println("Opgave 2 Slut");
    System.out.println();

    // AND-operator (opg. 3-4)
    // Opgave 4: Complete student report
    int score = 65;
    char grade;
    String status;
    String comment;

    if (score > 90) {
        grade = 'A';
        comment = "Excellent";
        status = "PASS";
    } else if (score > 80) {
        grade = 'B';
        comment = "Good";
        status = "PASS";
    } else if (score > 70) {
        grade = 'C';
        comment = "Satisfactory";
        status = "PASS";
    } else if (score > 60) {
        grade = 'D';
        comment = "Needs improvement";
        status = "PASS";
    } else {
        grade = 'F';
        comment = "Failing";
        status = "FAIL";
    }
    System.out.println("=== STUDENT REPORT ===");
    System.out.println("Score : " + score);
    System.out.println("Grade : " + grade);
    System.out.println("Status : " + status);
    System.out.println("Comment : " + comment);
    System.out.println("===================");
    System.out.println("Opgave 4 Slut");
    System.out.println();

    // OR-operator (opg. 5-7)
    // Opgave 6: Movie rating system
    int ageLimit = 15;
    int guestAge = 14;
    boolean hasParentalConsent = true;

    if (guestAge >= ageLimit || (guestAge >= 13 && hasParentalConsent)) {
        System.out.println("Can watch movie");
    } else {
        System.out.println("Cannot watch movie");
    }
    System.out.println("Opgave 6 Slut");
    System.out.println();

    // Kombinerede operatorer (opg. 8-9)
    // Opgave 8: Insurance premium calculator
    boolean hasAccidents = false;
    boolean riskzone = false;
    int premium = 5000;

    Scanner scanRisk = new Scanner(System.in);
    System.out.println("Enter Age : ");
    int age = scanRisk.nextInt();

    System.out.println("Enter accidents : ");
    int accidents = scanRisk.nextInt();

    if (accidents > 0) {
        hasAccidents = true;

        if (accidents > 2) {
            riskzone = true;
        }
    }

    if ((age < 25 || age > 70) || (hasAccidents && accidents > 2) || riskzone) {
        System.out.println("Higher risk category");
        premium += 2000;
    } else {
        System.out.println("Not in the risk category");
    }
    System.out.println("Annual premium: " + premium + " kr");
    System.out.println("Opgave 8 Slut");
    System.out.println();

    // Opgave 9: Complete access control system
    boolean isAdmin = true;
    boolean accountActive = true;
    boolean isSuperUser = false;
    boolean isUser = false;
    boolean suspenderet = false;
    boolean isGuest = true;
    boolean guessTimeValid = false;

    if (accountActive) {
        System.out.println("Active: " + accountActive);

        if (isAdmin || isSuperUser) {
            System.out.println("Admin : "+ isAdmin);
            System.out.println("Result: FULL ACCESS");
        } else if ((isUser && !suspenderet) || (isGuest && guessTimeValid)) {
            System.out.println("User  :" + isUser);
            System.out.println("Guest :" + isGuest);
            System.out.println("Result: LIMITED ACCESS");
        } else {
            System.out.println("Result: DENIED ACCESS");
        }
    } else {
        System.out.println("The account is inactive.");
    }
    System.out.println("Opgave 9 Slut");
    System.out.println();

    // Switch-case (opg. 10-14)
    // Opgave 14: Bestillingssystem
    String item = "coffee";
    String size = "large";
    int quantity = 2;
    double price = 0;
    double totalAmount = 0;

    switch (item) {
        case "coffee":{
            switch (size) {
                case "small":
                    price = 25 * 1;
                    break;
                case "medium":
                    price = 25 * 1.2;
                    break;
                case "large":
                    price = 25 * 1.5;
                    break;
            }
            break;
        }
        case "tea":
            switch (size) {
                case "small":
                    price = 20 * 1;
                    break;
                case "medium":
                    price = 20 * 1.2;
                    break;
                case "large":
                    price = 20 * 1.5;
                    break;
            }
            break;
        case "sandwich":
            price = 45;
            break;
        case "cake":
            price = 35;
            break;
        default:
            price = 0;
            System.out.println("Invalid item");
    }

    totalAmount = quantity * price;

    System.out.println("=== ORDER ===");
    System.out.println("Item : " + item);
    System.out.println( item.equals("coffee") || item.equals("tea") ? "Size : " +  size : "No size" );
    System.out.println("Price : " + price + " kr");
    System.out.println("Quantity : "+ quantity);
    System.out.println("Total Price :" + totalAmount + " kr" );
    System.out.println("Opgave 14 Slut");
    System.out.println();

}

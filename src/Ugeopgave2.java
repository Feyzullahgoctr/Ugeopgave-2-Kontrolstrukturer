
void main() {

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



}

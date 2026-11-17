public class Main {
    public static void main(String[] args) {
        FlightBookingFacade bookingFacade = new FlightBookingFacade();

        System.out.println("--- Test 1: Standard Successful Booking ---");
        String ticket1 = bookingFacade.bookFlight(
                "Amina Suleimenova", "KC101", "14A",
                320.00, 2, 23.0, "EUR", "4532015112830366");
        System.out.println("Result 1: " + ticket1 + "\n");

        System.out.println("--- Test 2: Blocked Crew Seat (Row 13) ---");
        String ticket2 = bookingFacade.bookFlight(
                "Daniyar Kassymov", "KC101", "13C",
                320.00, 1, 15.0, "USD", "4532015112830366");
        System.out.println("Result 2: " + ticket2 + "\n");

        System.out.println("--- Test 3: Payment Failure & Automatic Seat Rollback ---");
        String ticket3 = bookingFacade.bookFlight(
                "Timur Bekov", "KC101", "07D",
                320.00, 1, 18.0, "KZT", "9999");
        System.out.println("Result 3: " + ticket3 + "\n");

        System.out.println("--- Test 4: SILVER Tier (baggage engine skipped + promo) ---");
        String ticket4 = bookingFacade.bookFlight(
                "Aigerim Nurlanovna", "KC101", "09A",
                320.00, 3, 30.0, "EUR", "4532015112830366", "SILVER");
        System.out.println("Result 4: " + ticket4 + "\n");

        System.out.println("--- Test 5: GOLD Tier (baggage engine skipped) ---");
        String ticket5 = bookingFacade.bookFlight(
                "Nurlan Akhmetov", "KC101", "10B",
                320.00, 3, 30.0, "USD", "4532015112830366", "GOLD");
        System.out.println("Result 5: " + ticket5);
    }
}

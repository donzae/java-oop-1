import java.util.Scanner;

class UseHotelRoom {    
    // main
    public static void main(String[] args) {
        
        // scanner object
        Scanner scan = new Scanner(System.in);
        
        int roomNumber;
        System.out.print("Room Number: ");
        roomNumber = scan.nextInt();
        
        System.out.println();
        
        HotelRoom hr0 = new HotelRoom(roomNumber);
        System.out.println("Hotel Room number : " + hr0.getRoomNumber());
        System.out.println("Hotel Room Nightly Rental Rate : " + hr0.getNightlyRentalRate());
        
        System.out.println();
        
        Suite s0 = new Suite(roomNumber);
        System.out.println("Suite Room number : " + s0.getRoomNumber());
        System.out.println("Suite Room Nightly Rental Rate : " + s0.getNightlyRentalRate());
        
    }
}

public class HotelRoom {
    // instance vars
    protected int roomNumber;
    protected double nightlyRentalRate;

    // constructor
    public HotelRoom(int roomNumber) {
        // initialise instance variables
        this.roomNumber = roomNumber;
        
        // compute nightly rate based on room number
        if(this.roomNumber <= 299) {
            this.nightlyRentalRate = 69.95;
        }   else {
            this.nightlyRentalRate = 89.95;
        }
    }

    // getter methods
    public int getRoomNumber() {
        return roomNumber;
    }
    
    public double getNightlyRentalRate() {
        return nightlyRentalRate;
    }   
}

public class Suite extends HotelRoom {
    //constructor
    public Suite(int roomNumber) {
        // call inherited constructor
        super(roomNumber);
        if(this.roomNumber <= 299) {
            nightlyRentalRate += 40;
        }
    }
}

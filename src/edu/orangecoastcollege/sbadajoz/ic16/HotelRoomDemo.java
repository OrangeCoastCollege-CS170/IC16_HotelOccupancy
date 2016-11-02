package edu.orangecoastcollege.sbadajoz.ic16;

public class HotelRoomDemo {
    public static void main(String[] args) {
        HotelRoom room1 = new HotelRoom(101, 3);
        System.out.println(room1);
        room1.addToRoom(1);
        System.out.println(room1);
        room1.removeFromRoom(2);
        System.out.println("Number in room = " + room1.getNumberOfPeople());
        HotelRoom room2 = new HotelRoom(105, 1);
        System.out.println(room2);
        if (room1.equals(room2)) System.out.println(room1 + " equals " + room2);
        else System.out.println(room1 + " does not equal " + room2);

        room2.removeFromRoom(3);
    }
}

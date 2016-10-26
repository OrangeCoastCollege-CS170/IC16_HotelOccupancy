package edu.orangecoastcollege.sbadajoz.ic16;

public class HotelRoom {
    private int mRoomNumber;
    private int mPeopleInRoom;
    private static int mTotalOccupancy;
    
    public HotelRoom(int roomNumber, int numberOfPeople) {
        if(numberOfPeople < 0 || numberOfPeople > 4) throw new IllegalArgumentException("Number of occupants must be between 0 and 4");
        mRoomNumber = roomNumber;
        mPeopleInRoom = numberOfPeople;
    }
    
    public void addToRoom(int numberOfPeople) {
        if(numberOfPeople + mPeopleInRoom < 4) mPeopleInRoom += numberOfPeople;
    }
    
    public void removeFromRoom(int numberOfPeople) {
        if(mPeopleInRoom - numberOfPeople > -1) mPeopleInRoom -= numberOfPeople;
    }
    
    public int getNumberOfPeople() {
        return mPeopleInRoom;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + mPeopleInRoom;
        result = prime * result + mRoomNumber;
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        HotelRoom other = (HotelRoom) obj;
        if (mPeopleInRoom != other.mPeopleInRoom) return false;
        if (mRoomNumber != other.mRoomNumber) return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "HotelRoom [Room Number=" + mRoomNumber + ", Amount Of People In Room=" + mPeopleInRoom + "]";
    }
    
    
}

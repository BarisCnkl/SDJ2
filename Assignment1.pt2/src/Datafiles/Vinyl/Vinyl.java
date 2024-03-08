package Datafiles.Vinyl;

import Datafiles.Vinyl.States.AvailableState;
import Datafiles.Vinyl.States.VinylState;

public class Vinyl
{
    private String title, artist, releaseYear;
    private VinylState currentState;

    public Vinyl(String title, String artist, String releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        currentState = new AvailableState();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public VinylState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(VinylState currentState) {
        this.currentState = currentState;
    }

    public void getBorrowed()
    {
        currentState.borrowed(this);
    }
    public void getReserved()
    {
        currentState.reserved(this);
    }
    public void getBorrowedAndReserved()
    {
        currentState.borrowedAndReserved(this);
    }
    public void getAvailable()
    {
        currentState.available(this);
    }
}

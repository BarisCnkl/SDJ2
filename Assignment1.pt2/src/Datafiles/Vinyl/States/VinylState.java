package Datafiles.Vinyl.States;
import Datafiles.Vinyl.Vinyl;
public interface VinylState {

    public void available(Vinyl vinyl);
    public void reserved(Vinyl vinyl);
    public void borrowed(Vinyl vinyl);
    public void borrowedAndReserved(Vinyl vinyl);
    public String getState();
}

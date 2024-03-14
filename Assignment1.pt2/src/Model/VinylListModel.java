package Model;

import Datafiles.Library;
import Datafiles.User;
import Datafiles.Vinyl.Vinyl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class VinylListModel implements PropertyChangeSubject
{
    private Library library;
    private PropertyChangeSupport propertyChangeSupport;
    private User loggedInUser;
    public VinylListModel()
    {
        library = new Library();
        propertyChangeSupport = new PropertyChangeSupport(this);
    }
    public List<Vinyl> getVinylList() {
        return library.getVinylList();
    }
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public void addPropertyChangeListener(String name, PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(name, listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(String name, PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(name, listener);
    }

    public User getLoggedInUser()
    {
        return loggedInUser;
    }

    public void setLoggedInUser(User loggedInUser)
    {
        this.loggedInUser = loggedInUser;
    }

    public void addVinyl(String titel, String artist, String releaseYear)
    {
        library.addVinyl(new Vinyl(titel,artist,releaseYear));
        propertyChangeSupport.firePropertyChange("vinylUpdate", null, library.getVinylList());
    }
    public void removeVinyl(Vinyl vinyl)
    {
        library.removeVinyl(vinyl);
        propertyChangeSupport.firePropertyChange("vinylUpdate", null, library.getVinylList());
    }

    public synchronized void borrowVinyl(Vinyl vinyl, User user)
    {
        library.BorrowVinyl(vinyl,user);
        propertyChangeSupport.firePropertyChange("vinylUpdate", null, library.getVinylList());
    }
    public synchronized void reserveVinyl(Vinyl vinyl, User user)
    {
        library.ReserveVinyl(vinyl,user);
        propertyChangeSupport.firePropertyChange("vinylUpdate", null, library.getVinylList());
    }
    public synchronized void returnVinyl(Vinyl vinyl, User user)
    {
        library.returnVinyl(vinyl,user);
        propertyChangeSupport.firePropertyChange("vinylUpdate", null, library.getVinylList());
    }
}

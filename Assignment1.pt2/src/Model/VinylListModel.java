package Model;

import Datafiles.Library;
import Datafiles.Vinyl.Vinyl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class VinylListModel implements PropertyChangeSubject
{
    private Library library;
    private PropertyChangeSupport propertyChangeSupport;

    public VinylListModel()
    {
        library = new Library();
        propertyChangeSupport = new PropertyChangeSupport(this);
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

    public void borrowVinyl(Vinyl vinyl)
    {
        library.BorrowVinyl(vinyl);
        propertyChangeSupport.firePropertyChange("vinylUpdate", null, library.getVinylList());
    }
    public void reserveVinyl(Vinyl vinyl)
    {
        library.ReserveVinyl(vinyl);
        propertyChangeSupport.firePropertyChange("vinylUpdate", null, library.getVinylList());
    }
    public void returnVinyl(Vinyl vinyl)
    {
        library.returnVinyl(vinyl);
        propertyChangeSupport.firePropertyChange("vinylUpdate", null, library.getVinylList());
    }
}

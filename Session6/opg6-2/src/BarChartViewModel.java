import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;

import java.beans.PropertyChangeEvent;

public class BarChartViewModel
{
  private DataModel dataModel;
  private Property red,blue,green;

  public BarChartViewModel(DataModel dataModel)
  {
    this.dataModel = dataModel;
    red = new SimpleIntegerProperty();
    blue = new SimpleIntegerProperty();
    green = new SimpleIntegerProperty();
  }
  public Property redProperty()
  {
    return red;
  }


  public Property blueProperty()
  {
    return blue;
  }

  public Property greenProperty()
  {
    return green;
  }

  public void update(PropertyChangeEvent propertyChangeEvent)
  {
    int[] intArray = (int[]) propertyChangeEvent.getNewValue();
    red.setValue(intArray[0]);
    green.setValue(intArray[1]);
    blue.setValue(intArray[2]);
  }
}

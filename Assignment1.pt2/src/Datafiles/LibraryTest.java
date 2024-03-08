package Datafiles;

import Datafiles.Vinyl.Vinyl;

import java.util.List;

public class LibraryTest
{
    public static void main(String[] args)
    {

        Vinyl vinyl1 = new Vinyl("acon", "Zakaria", "2023");
        Vinyl vinyl2 = new Vinyl("maka", "Baris", "3100");
        Vinyl vinyl3 = new Vinyl("mooasd", "Emre", "2021");
        Vinyl vinyl4 = new Vinyl("asdas", "Alperen", "2003");
        Vinyl vinyl5 = new Vinyl("makss", "semicenk", "1989");
        Vinyl vinyl6 = new Vinyl("vivlia", "mikol", "1789");

        Library library = new Library();
        library.addVinyl(vinyl1);
        library.addVinyl(vinyl2);
        library.addVinyl(vinyl3);
        library.addVinyl(vinyl4);
        library.addVinyl(vinyl5);
        library.addVinyl(vinyl6);

        for (int i = 0; i < library.vinylList.size(); i++)
        {
            System.out.println(i + ": " + library.vinylList.get(i).getCurrentState().getState());
        }

        library.BorrowVinyl(vinyl1);
        library.ReserveVinyl(vinyl2);
        library.returnVinyl(vinyl3);

        for (int i = 0; i < library.vinylList.size(); i++)
        {
            System.out.println(i + ": " + library.vinylList.get(i).getCurrentState().getState());
        }

        library.returnVinyl(vinyl2);

        for (int i = 0; i < library.vinylList.size(); i++)
        {
            System.out.println(i + ": " + library.vinylList.get(i).getCurrentState().getState());
        }

        library.ReserveVinyl(vinyl1);
        for (int i = 0; i < library.vinylList.size(); i++)
        {
            System.out.println(i + ": " + library.vinylList.get(i).getCurrentState().getState());
        }
        library.returnVinyl(vinyl1);
        library.BorrowVinyl(vinyl2);
        for (int i = 0; i < library.vinylList.size(); i++)
        {
            System.out.println(i + ": " + library.vinylList.get(i).getCurrentState().getState());
        }
    }
}

package singleton.z1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class z2_BillPugh {
    public static z2_BillPugh instance;
    private static File loggingFile;



    public void logB(Level level, String msg) {
        LocalDate date = LocalDate.now();
        FileWriter fileWriter = null;



    }

}
package singleton.z1;

import java.io.*;
import java.time.LocalDate;

public class LoggerSDALazy {
    public static LoggerSDALazy instance;
    private static File loggingFile;

    private LoggerSDALazy(){loggingFile = new File("Log.txt");}

    public static LoggerSDALazy getInstance() {
        if(instance==null){
            instance= new LoggerSDALazy();
        }
        return instance;
    }

    public void log (Level level, String msg) {
        LocalDate date = LocalDate.now();
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(date + " " + level + ", " + msg);
        printWriter.flush();
        printWriter.close();

    }

}

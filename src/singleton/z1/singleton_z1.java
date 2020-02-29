package singleton.z1;

public class singleton_z1 {
    public static void main(String[] args){

        LoggerSDALazy loggerSDALazy = LoggerSDALazy.getInstance();
        loggerSDALazy.log(Level.ERROR, " xxx");



    }
}

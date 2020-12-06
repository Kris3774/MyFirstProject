package infrastructura.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractLogger{
    private static int counter = 0;

    public String getEntry(String operation){
        counter++;
        Date curDate = new Date();
        curDate.getTime();
        String formattedDatedDate = new SimpleDateFormat("HH:mm:ss.SSS").format(curDate.getTime());
        return counter+ ")" + formattedDatedDate + "[" + Thread.currentThread().getName() + "]: " +
                operation;
    }


    public abstract void log(String msg);
}

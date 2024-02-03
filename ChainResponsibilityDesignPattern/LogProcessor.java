package ChainResponsibilityDesignPattern;

public abstract class LogProcessor {

    // made it static bcs it is used in other classes
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nexLoggerProcessor;

    public LogProcessor(LogProcessor loggerProcessor){

        this.nexLoggerProcessor = loggerProcessor;
    }



    public void log(int logLevel, String message){

        if(nexLoggerProcessor != null){
            nexLoggerProcessor.log(logLevel, message);
        }
    }
}
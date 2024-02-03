package ChainResponsibilityDesignPattern;

public class Main {

    public static void main(String[] args) {

        // Info ke andar Debug bhejre hai and Debug ke andar Error bhejre hai and Error ke baad kuch nahi hai so null
        // And this is known as CHAIN

        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "exception happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this");
        logObject.log(LogProcessor.INFO, "just for info");
    }
}
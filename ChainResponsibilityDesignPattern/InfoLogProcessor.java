package ChainResponsibilityDesignPattern;

public class InfoLogProcessor extends LogProcessor{

    // object bnate hue hi btaenge that who is the nextProcessor
    InfoLogProcessor(LogProcessor nexLogProcessor){

        super(nexLogProcessor);
    }

    public void log(int logLevel, String message){

        if(logLevel == INFO){
            System.out.println("INFO: " +message);
        }
        // parent ko bol denge you go the next
        else {
            super.log(logLevel, message);
        }
    }
}

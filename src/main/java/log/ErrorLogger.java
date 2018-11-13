package log;

public class ErrorLogger extends AbstractLogger {

   public ErrorLogger(Class clazz,int level) {
      this.level = level;
      this.clazz = clazz.getSimpleName();
   }

   @Override
   protected void write(String message) {		
      System.out.println("Error Console::"+clazz+":::Logger: " + message);
   }
}
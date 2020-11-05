import jdk.jfr.internal.tool.Command;
import java.util.ArrayList;

public class CommandWords {

  private ArrayList<String> commandWords;
  
  public CommandWords(){
    commandWords = new ArrayList<>();
  }

  public void showAll(){
    System.out.print("Commands: ");
    commandWords.forEach(command -> System.out.print(command + " "));
  }

}
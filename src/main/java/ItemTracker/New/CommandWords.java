import jdk.jfr.internal.tool.Command;
import java.util.ArrayList;

public class CommandWords {

  private ArrayList<String> commandWords;
  
  public CommandWords(){
    commandWords = new ArrayList<>();
    commandWords.add("add");
    commandWords.add("remove");
    commandWords.add("list");
  }

  public void showAll(){
    System.out.print("Commands: ");
    commandWords.forEach(command -> System.out.print(command + " "));
  }
  public boolean isCommandWord(String command) {
    return commandWords.contains(command);
  }

}
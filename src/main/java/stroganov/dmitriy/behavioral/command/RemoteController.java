package stroganov.dmitriy.behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class RemoteController {

    private TV tv;

    private Map<CommandName,Command> commands;

    public RemoteController(){
        tv = new TV();
        commands = new HashMap<>();
        commands.put(CommandName.ON, new OnCommand(tv));
        commands.put(CommandName.OFF, new OffCommand(tv));
        commands.put(CommandName.NEXT_CHANNEL, new NextChannelCommand(tv));
        commands.put(CommandName.PREVIOUS_CHANNEL, new PreviousChannelCommand(tv));
    }

    public void pushButton(CommandName buttonName){
        Command command = commands.get(buttonName);
        if(command == null){
            System.out.printf("Кнопки %s не существует\n", buttonName);
        } else {
            command.execute();
        }
    }
}

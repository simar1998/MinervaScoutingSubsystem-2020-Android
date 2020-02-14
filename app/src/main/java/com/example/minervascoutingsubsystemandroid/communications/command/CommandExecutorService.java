package com.example.minervascoutingsubsystemandroid.communications.command;

import com.example.minervascoutingsubsystemandroid.communications.tcp.proto.TcpCommunication;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Simarpal Kalsi
 * Live Long and Prosper
 */
public class CommandExecutorService {

    public static AtomicBoolean isBusy = new AtomicBoolean(false);
    public static AtomicInteger concurentTaskNum = new AtomicInteger(0);

    private static ArrayList<Class> classList = new ArrayList<>();

    static {
        classList.add(VibrateCommand.class);
    }


    public static void executeIncomingCommand(TcpCommunication.CommandMessage commandMessage){
        executeIncomingCommand(commandMessage.getMessageDesc(),commandMessage.getCommandExecutableJSON());
    }

    public static void executeIncomingCommand(String commandDesc, String commandStr){
        for (Class c : classList){
            Annotation[] annotations = c.getDeclaredAnnotations();
            for (Annotation annotation : annotations){
              if (annotation instanceof CommandDesc){
                  CommandDesc desc = (CommandDesc) annotation;
                  if (desc.name().equals(commandDesc)){
                      try {
                          Command command = (Command) c.newInstance();
                          if (commandStr != null || !commandStr.equals("")){
                              command.processCommand(commandStr);
                          }
                          command.executeCommand();
                          break;
                      } catch (IllegalAccessException e) {
                          e.printStackTrace();
                      } catch (InstantiationException e) {
                          e.printStackTrace();
                      }
                  }
              }
            }
        }
    }

}

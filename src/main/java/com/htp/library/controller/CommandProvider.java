package com.htp.library.controller;

import com.htp.library.controller.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private Map<CommandName, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(CommandName.REGISTRATION, new RegistrationCommand());
        commands.put(CommandName.AUTHORIZATION, new AuthorizationCommand());
        commands.put(CommandName.ADD_NEW_BOOK, new AddNewBookCommand());
        commands.put(CommandName.CHANGE_PASSWORD, new ChangePasswordCommand());
        commands.put(CommandName.ADMIN_ROLE, new AddAdminRoleCommand());
    }

    public Command getCommand(String strCommandName) {
        CommandName commandName;
        Command command;
        commandName = CommandName.valueOf(strCommandName);
        command = commands.get(commandName);
        return command;
    }

}

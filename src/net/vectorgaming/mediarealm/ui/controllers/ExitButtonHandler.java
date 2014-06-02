package net.vectorgaming.mediarealm.ui.controllers;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;


/*The event handler for the myMusic Button*/
public class ExitButtonHandler implements EventHandler
{
    @Override
    public void handle(Event t)
    {
        Platform.exit();
    }
}

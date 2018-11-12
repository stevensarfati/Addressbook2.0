package com.telran.trello.tests;


import com.telran.trello.model.Board;
import org.testng.annotations.Test;

public class BoardCreationTest extends TestBase {

    @Test
    public void CreationTestUsingPlusButton(){
        app.getBoardHelper().initBoardCreation();
        app.getBoardHelper().fillBoardForm(new Board().setTitle("TEST BOARD"));
        app.getBoardHelper().confirmBoardCreation();
    }
}
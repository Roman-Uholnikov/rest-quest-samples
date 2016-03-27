package org.rest.quest;

import org.rest.quest.service.PuzzleService;
import org.rest.quest.wall.*;

import java.net.UnknownHostException;
import java.util.logging.Logger;

public class RestClientApplication {

    private static final Logger logger = Logger.getLogger(RestClientApplication.class.getSimpleName());
    private static String HOST_URL = "http://localhost:8080/";

    public static void main(String[] args) throws UnknownHostException {

        if (System.getProperty("url") != null) {
            HOST_URL = System.getProperty("url");
            System.out.println("url received: " + System.getProperty("url"));
        }

        //registrationHelper
        RegistrationHelper registrationHelper = new RegistrationHelper();
        registrationHelper.registerTeam(HOST_URL, "automat", null);

        //1st wall
        String keyword = new MottoHelper().getKeyword(HOST_URL, null, <your team id>, 0, 221);
        //2st wall
        int secondPuzzle = new PuzzleHelper().readPuzzleHeader(HOST_URL, keyword, <your team id>,  0);
        keyword = PuzzleService.getPuzzle(4);
        //3rd wall
        new UserResolver().readUser(HOST_URL, "keyword", 0);
        //4st wall
        WinnerResolver.sendWinnerUrl(HOST_URL, keyword, teamId, false);
        logger.info("we are winners");
    }

}

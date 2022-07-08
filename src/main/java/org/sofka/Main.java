package org.sofka;

import okhttp3.Response;
import org.sofka.utilities.Message;

import static org.sofka.utilities.ConsumeApi.*;


import java.io.IOException;
import java.util.Scanner;


public class Main {

    private static final Message MESSAGE = Message.getInstance();
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        String input;
        MESSAGE.showTitle("Insert name Giphy animate");
        input = SCANNER.nextLine();
        Response response = getGif(input);
        if (response.isSuccessful()) {
            assert response.body() != null;
            String body = response.body().string();
            MESSAGE.showTitle("the Giphy of "+input +" are:");
            MESSAGE.printResponse(body);

        }
    }
}
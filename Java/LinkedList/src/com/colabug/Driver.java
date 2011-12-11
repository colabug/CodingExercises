package com.colabug;

import java.lang.*;

public class Driver
{
    static LinkedListManager llm = new LinkedListManager();

    public static void main(String argv[])
    {
        // Greet user
        System.out.println("Hello");

        // Create linked list
        llm.createLinkedListManager(argv);
    }
}

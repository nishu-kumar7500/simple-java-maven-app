package com.example;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        port(8080); // Set port to 8080
        get("/", (req, res) -> "Hello, World!");
    }
}

package com.ing.tech.atm;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class Keypad {
    private final Scanner scanner;

    public Keypad() {
        scanner = new Scanner(System.in);
    }

    public int getInput() {
        return scanner.nextInt();
    }

    public double getAmount() {
        return scanner.nextDouble();
    }
}

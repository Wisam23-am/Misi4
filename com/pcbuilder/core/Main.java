package com.pcbuilder.core;

import com.pcbuilder.components.maincomponents.CPU;
import com.pcbuilder.components.maincomponents.Motherboard;
import com.pcbuilder.components.maincomponents.RAM;
import java.util.Arrays;

import com.pcbuilder.components.storage.SSD;
import com.pcbuilder.components.peripheral.Mouse;
import com.pcbuilder.components.peripheral.Keyboard;


public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel i9");
        Motherboard mb = new Motherboard("ASUS ROG");
        RAM ram1 = new RAM("Corsair 16GB");
        RAM ram2 = new RAM("Corsair 16GB");
        
        SSD storage = new SSD("SSD 1TB");
        Mouse mouse = new Mouse("Logitech Mouse");
        Keyboard keyboard = new Keyboard("Keychron K2"); 

        PC myPC = new PC(cpu, mb, Arrays.asList(ram1, ram2), storage, mouse, keyboard);

        myPC.generateReport();
    }
}
package com.pcbuilder.core;

import com.pcbuilder.components.maincomponents.CPU;
import com.pcbuilder.components.maincomponents.Motherboard;
import com.pcbuilder.components.maincomponents.RAM;
import java.util.List;

import com.pcbuilder.components.storage.SSD;
import com.pcbuilder.components.peripheral.Mouse;
import com.pcbuilder.components.peripheral.Keyboard;

public class PC {
    private CPU cpu;
    private Motherboard motherboard;
    private List<RAM> ramSticks;

    private SSD storage;
    private Mouse mouse;
    private Keyboard keyboard;


    public PC(CPU cpu, Motherboard motherboard, List<RAM> ramSticks, SSD storage, Mouse mouse, Keyboard keyboard) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.ramSticks = ramSticks;
        this.storage = storage; 
        this.mouse = mouse; 
        this.keyboard = keyboard;
    }

    public CPU getCPU() { return cpu; }
    public Motherboard getMotherboard() { return motherboard; }
    public List<RAM> getRamSticks() { return ramSticks; }
    public SSD getStorage() { return storage; }
    public Mouse getMouse() { return mouse; }
    public Keyboard getKeyboard() { return keyboard; }

    public void generateReport() {
        // Mengikuti format dari Misi 4 
        System.out.println("--- PC Build by Mahda & Wisam ---"); 
        System.out.println("CPU: " + this.getCPU().getName());
        System.out.println("Motherboard: " + this.getMotherboard().getName());
        
        if (ramSticks != null && !ramSticks.isEmpty()) {
            System.out.println("RAM: " + this.ramSticks.size() + "x " + this.ramSticks.get(0).getName());
        } else {
            System.out.println("RAM: 0");
        }
        
        System.out.println("Storage: " + this.getStorage().getName());
        System.out.println("Peripheral: " + this.getMouse().getName() + " & " + this.getKeyboard().getName());
        System.out.println("---------------------------------");
        System.out.println("--- Build Successful! ---");
    }
}
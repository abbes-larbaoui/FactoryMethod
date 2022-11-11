package org.example.buttons;

public class WindowsButton implements Button{

    @Override
    public void onClick() {
        System.out.println("Windows button clicked");
    }

    @Override
    public void render() {
        System.out.println("Windows button rendred");
    }
}

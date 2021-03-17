package com.company;

interface Football{
    void disp_Football();
}

interface Cricket{
    void disp_Cricket();
}

public class InterfaceEx implements Football,Cricket{

    @Override
    public void disp_Football() {
        System.out.println("Display Football");
    }

    @Override
    public void disp_Cricket() {
        System.out.println("Display Cricket");
    }

    public static void main(String[] args) {
        InterfaceEx myobj=new InterfaceEx();
        myobj.disp_Football();
        myobj.disp_Cricket();
    }
}

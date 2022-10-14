package com.company;

public class Remote {

    TV tele = new TV();

    public TV getTele() {
        return tele;
    }

    public boolean wlacz(boolean wlacz){
        if (wlacz==true){
            return false;
        }
        else{
            return true;
        }
    }

    public int kanal(boolean wlacz, int channel){
        if (wlacz==true) {
            return 1;
        }
        return 0;
    }

}

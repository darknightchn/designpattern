package com.css.dp.builder.productions;

import com.css.dp.builder.ifs.IFrame;
import com.css.dp.builder.ifs.ISeat;
import com.css.dp.builder.ifs.ITire;

public class Bike {

    private IFrame frame;
    private ISeat seat;
    private ITire tire;

    public IFrame getFrame() {
        return frame;
    }

    public void setFrame(IFrame frame) {
        this.frame = frame;
    }

    public ISeat getSeat() {
        return seat;
    }

    public void setSeat(ISeat seat) {
        this.seat = seat;
    }

    public ITire getTire() {
        return tire;
    }

    public void setTire(ITire tire) {
        this.tire = tire;
    }
}

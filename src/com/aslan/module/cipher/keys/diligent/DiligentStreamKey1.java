package com.aslan.module.cipher.keys.diligent;

import com.aslan.module.cipher.Consts;
import com.aslan.module.cipher.keys.diffusion.DiffusionKey2;

public class DiligentStreamKey1 extends DiffusionKey2 {

    public byte[][] update() {
        return diffusion(K);
    }


    @Override
    public int identity() {
        return Consts.KEYS.STREAM_DILIGENT;
    }

    @Override
    public int version() {
        return 1;
    }
}
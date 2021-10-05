package com.github.vitalliuss.helloci;

import java.io.FileNotFoundException;
import java.io.IOException;

public class F extends C{
    @Override
    public void f() throws FileNotFoundException, InternalError {
        int i = -1;
        assert (i > 0);
        System.out.println(i);
    }
}

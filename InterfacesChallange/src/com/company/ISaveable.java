package com.company;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<Sring> write();
    void read(List<String> savedValues);
}

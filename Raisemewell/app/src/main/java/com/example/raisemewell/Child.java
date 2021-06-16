package com.example.raisemewell;

import java.util.List;

public class Child {

    private String _name;
    private List<BehaviorType> _badBehavior;
    private List<BehaviorType> _goodBehavior;

    public Child (String name, List<BehaviorType> badBehavior, List<BehaviorType> goodBehavior){
        _name = name;
        _badBehavior = badBehavior;
        _goodBehavior = goodBehavior;
    }
}

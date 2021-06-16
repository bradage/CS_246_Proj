package com.example.raisemewell;

public class Behavior {

    private String _behavior;
    private int _behaviorWeight;
    BehaviorType _behaviorType;

    public Behavior (BehaviorType behaviorType, int behaviorWeight, String behavior) {
        _behavior = behavior;
        _behaviorWeight = behaviorWeight;
        _behaviorType = behaviorType;
    }

    public String get_behavior() {
        return _behavior;
    }

    public void set_behavior(String _behavior) {
        this._behavior = _behavior;
    }

    public int get_behaviorWeight() {
        return _behaviorWeight;
    }

    public void set_behaviorWeight(int _behaviorWeight) {
        this._behaviorWeight = _behaviorWeight;
    }

    public BehaviorType get_behaviorType() {
        return _behaviorType;
    }

    public void set_behaviorType(BehaviorType _behaviorType) {
        this._behaviorType = _behaviorType;
    }
}


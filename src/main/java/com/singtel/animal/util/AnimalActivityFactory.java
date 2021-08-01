package com.singtel.animal.util;


import com.singtel.animal.activities.*;

public class AnimalActivityFactory {

    public static Class<? extends AnimalAbility> getActivity(String activity) {
        switch (activity) {
            case "fly":
                return FlyAbility.class;
            case "walk":
                return WalkAbility.class;
            case "swim":
                return SwimAbility.class;
            case "sing":
                return SingAbility.class;
            case "talk":
                return SoundAbility.class;
            default:
                throw new RuntimeException("Invalid animal activity");
        }
    }
}

package com.nameless.smartbuddy.util.generics.casting;

import com.nameless.smartbuddy.activity.dto.ActivityParameter;
import com.nameless.smartbuddy.activity.impl.git.dto.GitActivityParameter;

import java.util.List;

public class SBCast {

    public static <T, K>  List<K> cast(List<T> parameters, Class<K> classType) {

        return parameters.stream()
                .filter(classType::isInstance)
                .map(classType::cast)
                .toList();
    }

}

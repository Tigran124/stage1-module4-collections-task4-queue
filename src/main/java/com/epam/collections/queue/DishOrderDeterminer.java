package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishesToEat = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishesToEat.add(i);
        }
        List<Integer> result = new ArrayList<>();
        int index = 0;
        while (!dishesToEat.isEmpty()) {
            index = (index + everyDishNumberToEat - 1) % dishesToEat.size();
            result.add(dishesToEat.remove(index));
        }
        return result;
    }
}

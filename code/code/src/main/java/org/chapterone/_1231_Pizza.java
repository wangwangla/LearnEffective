package org.chapterone;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class _1231_Pizza {
    public enum Topping{
        HAN,MUSHROOM,ONION,PEPPER,SAUSAGE
    }

    final Set<Topping> toppingSet;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract _1231_Pizza build();

        protected abstract T self();
    }

    _1231_Pizza(Builder<?> builder){
        toppingSet = builder.toppings.clone();
    }

}

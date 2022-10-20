package zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public  class ListCreator<T> {

    private List<T> list;

    public ListCreator(List<T> list) {
        this.list = list;
    }

    static public <T> ListCreator<T> collectFrom(List<T> list) {
        return new ListCreator<T>(list);
    }

    public ListCreator<T> when(Predicate<T> selector){
        list = list.stream()
                .filter(selector::test)
                .collect(Collectors.toList());
        return this;
    }

    public <U> List<U> mapEvery(Function<T, U> map) {

        return list.stream()
                .map(map::apply)
                .collect(Collectors.toList());
    }
}

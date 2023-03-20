package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class BoxWithNumber<T extends Number> {
    private T[] item;

    public BoxWithNumber(T... item) {
        this.item = item;
    }

    public Double average() {
        double sum = 0;
        for (T t : item)
            sum += t.doubleValue();
        return sum / item.length;
    }

//    public boolean compareAverage(BoxWithNumber<T> anotherItems){
//        return Math.abs(this.average() - anotherItems.average())<=0.001;
//    }

    public boolean compareAverage(BoxWithNumber<?> anotherItems) {
        return Math.abs(this.average() - anotherItems.average()) <= 0.001;
    }



}

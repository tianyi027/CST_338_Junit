/**
 * Name: Tianyi Luo
 * Date: Sep.4th 2022
 * Explanation: This class is called Learning, which works as the original file consist of getter
 *              and setter and constructor in order to be tested by the junit.
 */

import java.util.ArrayList;
import java.util.List;

public class Learning {

    private String name;
    private Integer count;
    private List<String> friends;

    public Learning() {
        name = "Tianyi";
        count = 1;
        friends = new ArrayList<>(); //polymorphism: many shaped
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getName(){
        return name;
    }


}

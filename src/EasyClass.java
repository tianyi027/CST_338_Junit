/**
 * Name: Tianyi Luo
 * Date: Sep.4th 2022
 * Explanation: This class is a class called EasyClass, which contains a name variable, a count variable and a score
 *              variable. Also, two constructors with different parameters are made for test purpose
 */
public class EasyClass {
    private String name;
    private Integer count;
    private Double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public EasyClass(String name, Double score) { //??? we dont test for constructor ???
        this.name = name;
        this.score = score;
    }

    public EasyClass(String name, Integer count, Double score) {
        this.name = name;
        this.count = count;
        this.score = score;
    }

//    public short nameTest(){
//
//        return count*score; //??? Can I use getCount() * getScore() ???
//    }

}

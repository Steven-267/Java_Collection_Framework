package a05myset;

/**
 * @author Steven
 * @ClassName Student2.java
 * @Description
 * @createTime 2023-05-21 16:40
 **/
public class Student2 implements Comparable<Student2> {
    private String name;

    private  int age;

    private int Chinese;

    private int math;

    private int English;


    public Student2() {
    }

    public Student2(String name, int age, int Chinese, int math, int English) {
        this.name = name;
        this.age = age;
        this.Chinese = Chinese;
        this.math = math;
        this.English = English;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return Chinese
     */
    public int getChinese() {
        return Chinese;
    }

    /**
     * 设置
     * @param Chinese
     */
    public void setChinese(int Chinese) {
        this.Chinese = Chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return English
     */
    public int getEnglish() {
        return English;
    }

    /**
     * 设置
     * @param English
     */
    public void setEnglish(int English) {
        this.English = English;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", Chinese = " + Chinese + ", math = " + math + ", English = " + English + "}";
    }

    @Override
    public int compareTo(Student2 o) {
        int sum1 = this.getChinese()+this.getMath()+this.English;
        int sum2 = o.getChinese()+this.getMath()+this.getEnglish();
        int i = sum1 - sum2;
         i = i == 0 ? this.getChinese() - o.getChinese() : i;
         i = i == 0 ? this.getMath() - o.getMath() : i;
         i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
         i = i == 0 ?this.name.compareTo(o.name) : i ;
        return i;
    }

}

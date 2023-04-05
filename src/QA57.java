import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class QA57 {
    public static void main(String[] args) {
    List<QA57> ilist = Arrays.asList(new QA57("Hank",45),new QA57("Charlei",40),new QA57("smith",38));

    checkAge(ilist,p ->p.getAge()>40);

}
    String name;
    int age;

    public QA57(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

public static void checkAge(List<QA57> list, Predicate<QA57> predicate){
    for (QA57 p : list){
        if (predicate.test(p)){
            System.out.println(p.name + " ");
        }
    }
}

}
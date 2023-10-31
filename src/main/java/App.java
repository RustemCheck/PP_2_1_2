import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(beanTwo.getMessage());

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCatTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getName());
        System.out.println(beanCatTwo.getName());

        System.out.println("Сравнение бинов Hello World: " + (bean == beanTwo));
        System.out.println("Сравнение бинов Cat: " + (beanCat == beanCatTwo));
    }
}
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 = (HelloWorld)  applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println(bean==bean1);
        Cat cat = applicationContext.getBean(Cat.class);
        System.out.println(cat.getName());
        Cat cats = applicationContext.getBean(Cat.class);
        System.out.println(cat.getName());
        System.out.println(cat==cats);

    }
}
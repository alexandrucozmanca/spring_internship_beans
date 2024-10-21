package ro.cozmanca;

import beans.ComponentBean;
import beans.StandardBean;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args ) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // getting the primary bean config
        StandardBean prim = context.getBean(StandardBean.class);
        System.out.println(prim.getName());


        StandardBean p = context.getBean("bean_2", StandardBean.class);
        System.out.println(p.getName());

        String phrase = context.getBean("phraseString", String.class);
        System.out.println(phrase);

        Integer nine = context.getBean(Integer.class);
        System.out.println(nine);

        // getting the component annotated bean
        ComponentBean cBean = context.getBean(ComponentBean.class);
        System.out.println(cBean);
        System.out.println(cBean.getName());

    }
}
